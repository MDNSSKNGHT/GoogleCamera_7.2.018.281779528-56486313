package com.google.googlex.gcam.clientallocator;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedU8Allocation;
import com.google.googlex.gcam.LockedBitmap;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniqueBitmapClientAllocator extends ClientInterleavedU8Allocator {
    public static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
    public static final int NUM_CHANNELS = 4;
    public pjz allocatedBitmap;
    public final DisplayMetrics displayMetrics;
    public LockedBitmap lock;
    public final long uniqueAllocationId;

    public pjz getBitmap() {
        return this.allocatedBitmap;
    }

    public UniqueBitmapClientAllocator(DisplayMetrics displayMetrics) {
        this(displayMetrics, 0L);
    }

    public UniqueBitmapClientAllocator(DisplayMetrics displayMetrics, long j) {
        this.allocatedBitmap = pix.a;
        qdu.c(j != GcamModule.getKInvalidAllocationId());
        this.displayMetrics = displayMetrics;
        this.uniqueAllocationId = j;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        qdu.a(i3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueBitmapClientAllocator only supports %s.", i3, 4);
        qdu.b(!this.allocatedBitmap.a(), "Allocate() should be called at most once.");
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        Bitmap createBitmap = Bitmap.createBitmap(this.displayMetrics, i, i2, BITMAP_CONFIG);
        this.allocatedBitmap = pjz.b(createBitmap);
        this.lock = LockedBitmap.acquire(createBitmap);
        interleavedU8Allocation.setId(this.uniqueAllocationId);
        interleavedU8Allocation.setView(this.lock.view());
        return interleavedU8Allocation;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public void Release(long j) {
        qdu.c(j == this.uniqueAllocationId);
        qdu.b(this.allocatedBitmap.a(), "Release() was called before Allocate().");
        qdu.b(this.lock != null, "Release() was called more than once.");
        this.lock.close();
        this.lock = null;
    }
}
