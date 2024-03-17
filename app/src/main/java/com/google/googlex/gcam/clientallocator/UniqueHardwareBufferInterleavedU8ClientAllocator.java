package com.google.googlex.gcam.clientallocator;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedU8Allocation;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.LockedHardwareBuffer;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniqueHardwareBufferInterleavedU8ClientAllocator extends ClientInterleavedU8Allocator {
    public static final int FORMAT = 1;
    public static final int NUM_CHANNELS = 4;
    public final long allocateUsage;
    public pjz allocatedBuffer;
    public LockedHardwareBuffer lock;
    public final long lockUsage;
    public final long uniqueAllocationId;

    public UniqueHardwareBufferInterleavedU8ClientAllocator(long j, long j2) {
        this(0L, j, j2);
    }

    public pjz getHardwareBuffer() {
        return this.allocatedBuffer;
    }

    public UniqueHardwareBufferInterleavedU8ClientAllocator(long j, long j2, long j3) {
        this.allocatedBuffer = pix.a;
        qdu.c(j != GcamModule.getKInvalidAllocationId());
        qdu.a((j2 & 32) != 0, "allocateUsage must contain USAGE_CPU_WRITE_RARELY.");
        qdu.a((32 & j3) != 0, "lockUsage must contain USAGE_CPU_WRITE_RARELY.");
        this.uniqueAllocationId = j;
        this.allocateUsage = j2;
        this.lockUsage = j3;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        qdu.a(i3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueHardwareBufferInterleavedU8ClientAllocator only supports %s.", i3, 4);
        qdu.b(!this.allocatedBuffer.a(), "Allocate() should be called at most once.");
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        HardwareBuffer create = HardwareBuffer.create(i, i2, HardwareBuffer.RGBA_8888, 1, this.allocateUsage);
        LockedHardwareBuffer acquire = LockedHardwareBuffer.acquire(create, this.lockUsage);
        this.lock = acquire;
        if (acquire != null) {
            this.allocatedBuffer = pjz.b(create);
            interleavedU8Allocation.setId(this.uniqueAllocationId);
            interleavedU8Allocation.setView(this.lock.getInterleavedWriteViewU8());
        } else {
            create.close();
            interleavedU8Allocation.setId(GcamModule.getKInvalidAllocationId());
            interleavedU8Allocation.setView(new InterleavedWriteViewU8());
        }
        return interleavedU8Allocation;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public void Release(long j) {
        qdu.c(j == this.uniqueAllocationId);
        qdu.b(this.allocatedBuffer.a(), "Release() was called before Allocate().");
        qdu.b(this.lock != null, "Release() was called more than once.");
        if (((HardwareBuffer) this.allocatedBuffer.b()).isClosed()) {
            this.lock.invalidateHardwareBuffer();
        }
        this.lock.close();
        this.lock = null;
    }
}
