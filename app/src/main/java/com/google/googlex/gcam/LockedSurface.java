package com.google.googlex.gcam;

import android.view.Surface;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LockedSurface implements AutoCloseable {
    public long nativePointer;

    private LockedSurface(Surface surface) {
        qdu.d(surface);
        long lockSurface = AndroidJniUtils.lockSurface(surface);
        this.nativePointer = lockSurface;
        if (lockSurface == 0) {
            throw new IllegalArgumentException("Failed to lock Surface.");
        }
    }

    public long nativePointer() {
        return this.nativePointer;
    }

    public static LockedSurface acquire(Surface surface) {
        return new LockedSurface(surface);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        long j = this.nativePointer;
        if (j != 0) {
            AndroidJniUtils.unlockSurface(j);
            this.nativePointer = 0L;
        }
    }
}
