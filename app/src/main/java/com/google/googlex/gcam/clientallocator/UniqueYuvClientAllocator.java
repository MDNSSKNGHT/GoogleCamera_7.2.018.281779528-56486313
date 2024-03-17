package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientYuvAllocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.YuvAllocation;
import com.google.googlex.gcam.YuvImage;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniqueYuvClientAllocator extends ClientYuvAllocator {
    public pjz allocatedImage;
    public final long uniqueAllocationId;

    public UniqueYuvClientAllocator() {
        this(0L);
    }

    public pjz getImage() {
        return this.allocatedImage;
    }

    public UniqueYuvClientAllocator(long j) {
        this.allocatedImage = pix.a;
        qdu.c(j != GcamModule.getKInvalidAllocationId());
        this.uniqueAllocationId = j;
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public YuvAllocation Allocate(int i, int i2, int i3) {
        qdu.b(!this.allocatedImage.a(), "Allocate() should be called at most once.");
        YuvAllocation yuvAllocation = new YuvAllocation();
        YuvImage yuvImage = new YuvImage(i, i2, i3);
        this.allocatedImage = pjz.b(yuvImage);
        yuvAllocation.setId(this.uniqueAllocationId);
        yuvAllocation.setView(yuvImage);
        return yuvAllocation;
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public void Release(long j) {
        qdu.c(j == this.uniqueAllocationId);
        qdu.b(this.allocatedImage.a(), "Release() was called before Allocate().");
    }
}
