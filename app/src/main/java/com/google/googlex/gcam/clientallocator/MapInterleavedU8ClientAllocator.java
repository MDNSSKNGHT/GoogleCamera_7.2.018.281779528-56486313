package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.ClientInterleavedU8Allocator;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedU8Allocation;
import com.google.googlex.gcam.SWIGTYPE_p_unsigned_char;

import defpackage.*;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MapInterleavedU8ClientAllocator extends ClientInterleavedU8Allocator {
    public final ConcurrentMap allocatedImages = new ConcurrentHashMap();

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        long baseAddress = getBaseAddress(interleavedImageU8);
        this.allocatedImages.put(Long.valueOf(baseAddress), interleavedImageU8);
        InterleavedU8Allocation interleavedU8Allocation = new InterleavedU8Allocation();
        interleavedU8Allocation.setId(baseAddress);
        interleavedU8Allocation.setView(interleavedImageU8);
        return interleavedU8Allocation;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public void Release(long j) {
        qdu.d(this.allocatedImages.containsKey(Long.valueOf(j)));
    }

    public pjz findImageFromView(InterleavedReadViewU8 interleavedReadViewU8) {
        return pjz.c((InterleavedImageU8) this.allocatedImages.get(Long.valueOf(getBaseAddress(interleavedReadViewU8))));
    }

    private long getBaseAddress(InterleavedReadViewU8 interleavedReadViewU8) {
        return SWIGTYPE_p_unsigned_char.getCPtr(interleavedReadViewU8.base_pointer());
    }
}
