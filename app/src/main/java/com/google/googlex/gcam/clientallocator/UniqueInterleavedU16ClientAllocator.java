package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientInterleavedU16Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedU16Allocation;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniqueInterleavedU16ClientAllocator extends ClientInterleavedU16Allocator {
    public pjz allocatedImage;
    public final long uniqueAllocationId;

    public UniqueInterleavedU16ClientAllocator() {
        this(0L);
    }

    public pjz getImage() {
        return this.allocatedImage;
    }

    public UniqueInterleavedU16ClientAllocator(long j) {
        this.allocatedImage = pix.a;
        qdu.c(j != GcamModule.getKInvalidAllocationId());
        this.uniqueAllocationId = j;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU16Allocator
    public InterleavedU16Allocation Allocate(int i, int i2, int i3) {
        qdu.b(!this.allocatedImage.a(), "Allocate() should be called at most once.");
        InterleavedU16Allocation interleavedU16Allocation = new InterleavedU16Allocation();
        InterleavedImageU16 interleavedImageU16 = new InterleavedImageU16(i, i2, i3);
        this.allocatedImage = pjz.b(interleavedImageU16);
        interleavedU16Allocation.setId(this.uniqueAllocationId);
        interleavedU16Allocation.setView(interleavedImageU16);
        return interleavedU16Allocation;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU16Allocator
    public void Release(long j) {
        qdu.c(j == this.uniqueAllocationId);
        qdu.b(this.allocatedImage.a(), "Release() was called before Allocate().");
    }
}
