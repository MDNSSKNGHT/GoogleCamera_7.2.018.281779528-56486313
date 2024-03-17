package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InterleavedImageU16 extends InterleavedWriteViewU16 {
    public long swigCPtr;

    public InterleavedImageU16() {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_0(), true);
    }

    public static long getCPtr(InterleavedImageU16 interleavedImageU16) {
        if (interleavedImageU16 == null) {
            return 0L;
        }
        return interleavedImageU16.swigCPtr;
    }

    public InterleavedImageU16(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_3(i, i2, i3), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_2(i, i2, i3, i4), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4, long j) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_5(i, i2, i3, i4, j), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4, long j, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_4(i, i2, i3, i4, j, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public InterleavedImageU16(int i, int i2, int i3, int i4, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_1(i, i2, i3, i4, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public InterleavedImageU16(long j, boolean z) {
        super(GcamModuleJNI.InterleavedImageU16_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public InterleavedImageU16(InterleavedImageU16 interleavedImageU16) {
        this(GcamModuleJNI.new_InterleavedImageU16__SWIG_6(getCPtr(interleavedImageU16), interleavedImageU16), true);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedImageU16_FastCrop_SWIG_0_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedImageU16_FastCrop_SWIG_0_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedImageU16_SamplesAreCompact(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__TImageSampleAllocator allocator() {
        long InterleavedImageU16_allocator = GcamModuleJNI.InterleavedImageU16_allocator(this.swigCPtr, this);
        if (InterleavedImageU16_allocator != 0) {
            return new SWIGTYPE_p_gcam__TImageSampleAllocator(InterleavedImageU16_allocator, false);
        }
        return null;
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public long c_stride() {
        return GcamModuleJNI.InterleavedImageU16_c_stride(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedImageU16(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    protected void finalize() {
        delete();
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public int height() {
        return GcamModuleJNI.InterleavedImageU16_height(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public int num_channels() {
        return GcamModuleJNI.InterleavedImageU16_num_channels(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public int row_padding() {
        return GcamModuleJNI.InterleavedImageU16_row_padding(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public long sample_array_size() {
        return GcamModuleJNI.InterleavedImageU16_sample_array_size(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedImageU16_sizeof_sample_type(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public int width() {
        return GcamModuleJNI.InterleavedImageU16_width(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public long x_stride() {
        return GcamModuleJNI.InterleavedImageU16_x_stride(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewU16, com.google.googlex.gcam.InterleavedReadViewU16
    public long y_stride() {
        return GcamModuleJNI.InterleavedImageU16_y_stride(this.swigCPtr, this);
    }
}
