package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PackedImageRaw12 extends PackedReadWriteViewRaw12 {
    public long swigCPtr;

    public PackedImageRaw12() {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_0(), true);
    }

    public static long getCPtr(PackedImageRaw12 packedImageRaw12) {
        if (packedImageRaw12 == null) {
            return 0L;
        }
        return packedImageRaw12.swigCPtr;
    }

    public PackedImageRaw12(int i, int i2) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_9(i, i2), true);
    }

    public PackedImageRaw12(int i, int i2, int i3) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_8(i, i2, i3), true);
    }

    public PackedImageRaw12(int i, int i2, int i3, long j) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_7(i, i2, i3, j), true);
    }

    public PackedImageRaw12(int i, int i2, int i3, long j, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_6(i, i2, i3, j, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public PackedImageRaw12(long j, boolean z) {
        super(GcamModuleJNI.PackedImageRaw12_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public PackedImageRaw12(InterleavedImageU8 interleavedImageU8) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_1(InterleavedImageU8.getCPtr(interleavedImageU8), interleavedImageU8), true);
    }

    public PackedImageRaw12(InterleavedReadViewU16 interleavedReadViewU16) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_3(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16), true);
    }

    public PackedImageRaw12(InterleavedReadViewU16 interleavedReadViewU16, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_2(InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public PackedImageRaw12(SWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_5(SWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t)), true);
    }

    public PackedImageRaw12(SWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_PackedImageRaw12__SWIG_4(SWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t), SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    @Override // com.google.googlex.gcam.PackedReadWriteViewRaw12, com.google.googlex.gcam.PackedReadViewRaw12
    public boolean FastCrop(int i, int i2, int i3, int i4) {
        return GcamModuleJNI.PackedImageRaw12_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.PackedReadWriteViewRaw12, com.google.googlex.gcam.PackedReadViewRaw12
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PackedImageRaw12(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.PackedReadWriteViewRaw12, com.google.googlex.gcam.PackedReadViewRaw12
    protected void finalize() {
        delete();
    }

    public InterleavedImageU8 packed_image() {
        return new InterleavedImageU8(GcamModuleJNI.PackedImageRaw12_packed_image(this.swigCPtr, this), false);
    }
}
