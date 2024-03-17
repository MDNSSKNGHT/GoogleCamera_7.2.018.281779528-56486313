package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientYuvAllocator;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;
import com.google.googlex.gcam.YuvAllocation;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;

import defpackage.*;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MapYuvClientAllocator extends ClientYuvAllocator {
    public final ConcurrentMap allocatedImages = new ConcurrentHashMap();

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public YuvAllocation Allocate(int i, int i2, int i3) {
        YuvImage yuvImage = new YuvImage(i, i2, i3);
        long baseAddress = getBaseAddress(yuvImage);
        this.allocatedImages.put(Long.valueOf(baseAddress), yuvImage);
        YuvAllocation yuvAllocation = new YuvAllocation();
        yuvAllocation.setId(baseAddress);
        yuvAllocation.setView(yuvImage);
        return yuvAllocation;
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public void Release(long j) {
        qdu.d(this.allocatedImages.containsKey(Long.valueOf(j)));
    }

    public pjz findImageFromView(YuvReadView yuvReadView) {
        return pjz.c((YuvImage) this.allocatedImages.get(Long.valueOf(getBaseAddress(yuvReadView))));
    }

    private long getBaseAddress(YuvReadView yuvReadView) {
        return SWIGTYPE_p_unsigned_char.getCPtr(yuvReadView.luma_read_view().base_pointer());
    }
}
