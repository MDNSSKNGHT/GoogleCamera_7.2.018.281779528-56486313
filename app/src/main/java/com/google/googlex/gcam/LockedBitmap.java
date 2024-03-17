package com.google.googlex.gcam;

import android.graphics.Bitmap;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LockedBitmap implements AutoCloseable {
    public final Bitmap bitmap;
    public long nativePointer;
    public final InterleavedWriteViewU8 view;

    private LockedBitmap(Bitmap bitmap) {
        this.bitmap = (Bitmap) qdu.d(bitmap);
        qdu.a(bitmap.getConfig().equals(Bitmap.Config.ARGB_8888), "Bitmap Config must be ARGB_8888", bitmap.getConfig());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int rowBytes = bitmap.getRowBytes() - (width << 2);
        int i = rowBytes / 4;
        qdu.a(rowBytes % 4 == 0, "Bitmap's row padding in bytes (%s) must evenly divide the number of channels (%s)", rowBytes, 4);
        long lockBitmap = AndroidJniUtils.lockBitmap(bitmap);
        this.nativePointer = lockBitmap;
        if (lockBitmap != 0) {
            this.view = new InterleavedWriteViewU8(width, height, 4, new SWIGTYPE_p_unsigned_char(lockBitmap, false), i);
            return;
        }
        throw new IllegalArgumentException("Failed to lock bitmap.");
    }

    public InterleavedWriteViewU8 view() {
        return this.view;
    }

    public static LockedBitmap acquire(Bitmap bitmap) {
        return new LockedBitmap(bitmap);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.nativePointer != 0) {
            AndroidJniUtils.unlockBitmap(this.bitmap);
            this.nativePointer = 0L;
        }
    }

    protected void finalize() {
        close();
    }
}
