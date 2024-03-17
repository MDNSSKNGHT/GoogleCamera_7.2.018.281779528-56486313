package com.google.googlex.gcam;

import android.hardware.HardwareBuffer;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LockedHardwareBuffer implements AutoCloseable {
    public long nativePointer;

    private LockedHardwareBuffer(HardwareBuffer hardwareBuffer, long j) {
        qdu.d(hardwareBuffer);
        long lockHardwareBuffer = lockHardwareBuffer(hardwareBuffer, j);
        this.nativePointer = lockHardwareBuffer;
        qdu.a(lockHardwareBuffer != 0, "Failed to lock HardwareBuffer.");
    }

    private static native long getInterleavedReadViewU8Impl(long j);

    private static native long getInterleavedWriteViewU8Impl(long j);

    private static native void invalidateHardwareBufferImpl(long j);

    private static native long lockHardwareBuffer(HardwareBuffer hardwareBuffer, long j);

    private static native void unlockHardwareBuffer(long j);

    public long nativePointer() {
        return this.nativePointer;
    }

    public static LockedHardwareBuffer acquire(HardwareBuffer hardwareBuffer, long j) {
        return new LockedHardwareBuffer(hardwareBuffer, j);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        long j = this.nativePointer;
        if (j != 0) {
            unlockHardwareBuffer(j);
            this.nativePointer = 0L;
        }
    }

    public InterleavedReadViewU8 getInterleavedReadViewU8() {
        return new InterleavedReadViewU8(getInterleavedReadViewU8Impl(this.nativePointer), true);
    }

    public InterleavedWriteViewU8 getInterleavedWriteViewU8() {
        return new InterleavedWriteViewU8(getInterleavedWriteViewU8Impl(this.nativePointer), true);
    }

    @Deprecated
    public void invalidateHardwareBuffer() {
        long j = this.nativePointer;
        if (j != 0) {
            invalidateHardwareBufferImpl(j);
        }
    }
}
