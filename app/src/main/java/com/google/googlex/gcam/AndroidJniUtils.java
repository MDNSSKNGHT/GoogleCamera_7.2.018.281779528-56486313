package com.google.googlex.gcam;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidJniUtils {
    private AndroidJniUtils() {
    }

    public static native long getAHardwareBufferPtr(HardwareBuffer hardwareBuffer);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long lockBitmap(Bitmap bitmap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long lockSurface(Surface surface);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void unlockBitmap(Bitmap bitmap);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void unlockSurface(long j);
}
