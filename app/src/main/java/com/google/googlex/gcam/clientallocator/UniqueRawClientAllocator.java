package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientRawAllocator;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.RawAllocation;
import com.google.googlex.gcam.RawImage;

import defpackage.*;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UniqueRawClientAllocator extends ClientRawAllocator {
    public pjz allocatedImage;
    public final long uniqueAllocationId;

    public UniqueRawClientAllocator() {
        this(0L);
    }

    public pjz getImage() {
        return this.allocatedImage;
    }

    public UniqueRawClientAllocator(long j) {
        this.allocatedImage = pix.a;
        qdu.c(j != GcamModule.getKInvalidAllocationId());
        this.uniqueAllocationId = j;
    }

    @Override // com.google.googlex.gcam.ClientRawAllocator
    public RawAllocation Allocate(int i, int i2, int i3) {
        qdu.b(!this.allocatedImage.a(), "Allocate() should be called at most once.");
        RawAllocation rawAllocation = new RawAllocation();
        RawImage rawImage = new RawImage(i, i2, i3);
        this.allocatedImage = pjz.b(rawImage);
        rawAllocation.setId(this.uniqueAllocationId);
        rawAllocation.setView(rawImage);
        return rawAllocation;
    }

    @Override // com.google.googlex.gcam.ClientRawAllocator
    public void Release(long j) {
        qdu.c(j == this.uniqueAllocationId);
        qdu.b(this.allocatedImage.a(), "Release() was called before Allocate().");
    }
}
