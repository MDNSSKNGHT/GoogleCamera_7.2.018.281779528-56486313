package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedU8Allocation;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniqueInterleavedU8ClientAllocator extends ClientInterleavedU8Allocator {
    public pjz allocatedImage;
    public final long uniqueAllocationId;

    public UniqueInterleavedU8ClientAllocator() {
        this(0L);
    }

    public pjz getImage() {
        return this.allocatedImage;
    }

    public UniqueInterleavedU8ClientAllocator(long j) {
        this.allocatedImage = pix.a;
        qdu.c(j != GcamModule.getKInvalidAllocationId());
        this.uniqueAllocationId = j;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        qdu.b(!this.allocatedImage.a(), "Allocate() should be called at most once.");
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        this.allocatedImage = pjz.b(interleavedImageU8);
        interleavedU8Allocation.setId(this.uniqueAllocationId);
        interleavedU8Allocation.setView(interleavedImageU8);
        return interleavedU8Allocation;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public void Release(long j) {
        qdu.c(j == this.uniqueAllocationId);
        qdu.b(this.allocatedImage.a(), "Release() was called before Allocate().");
    }
}
