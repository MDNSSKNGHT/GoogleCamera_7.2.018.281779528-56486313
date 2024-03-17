package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InterleavedImageF extends InterleavedWriteViewF {
    public long swigCPtr;

    public InterleavedImageF() {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_0(), true);
    }

    public static long getCPtr(InterleavedImageF interleavedImageF) {
        if (interleavedImageF == null) {
            return 0L;
        }
        return interleavedImageF.swigCPtr;
    }

    public InterleavedImageF(int i, int i2, int i3) {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_3(i, i2, i3), true);
    }

    public InterleavedImageF(int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_2(i, i2, i3, i4), true);
    }

    public InterleavedImageF(int i, int i2, int i3, int i4, long j) {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_5(i, i2, i3, i4, j), true);
    }

    public InterleavedImageF(int i, int i2, int i3, int i4, long j, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_4(i, i2, i3, i4, j, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public InterleavedImageF(int i, int i2, int i3, int i4, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_1(i, i2, i3, i4, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public InterleavedImageF(long j, boolean z) {
        super(GcamModuleJNI.InterleavedImageF_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public InterleavedImageF(InterleavedImageF interleavedImageF) {
        this(GcamModuleJNI.new_InterleavedImageF__SWIG_6(getCPtr(interleavedImageF), interleavedImageF), true);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedImageF_FastCrop_SWIG_0_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedImageF_FastCrop_SWIG_0_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedImageF_SamplesAreCompact(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__TImageSampleAllocator allocator() {
        long InterleavedImageF_allocator = GcamModuleJNI.InterleavedImageF_allocator(this.swigCPtr, this);
        if (InterleavedImageF_allocator != 0) {
            return new SWIGTYPE_p_gcam__TImageSampleAllocator(InterleavedImageF_allocator, false);
        }
        return null;
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public long c_stride() {
        return GcamModuleJNI.InterleavedImageF_c_stride(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedImageF(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    protected void finalize() {
        delete();
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public int height() {
        return GcamModuleJNI.InterleavedImageF_height(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public int num_channels() {
        return GcamModuleJNI.InterleavedImageF_num_channels(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public int row_padding() {
        return GcamModuleJNI.InterleavedImageF_row_padding(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public long sample_array_size() {
        return GcamModuleJNI.InterleavedImageF_sample_array_size(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedImageF_sizeof_sample_type(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public int width() {
        return GcamModuleJNI.InterleavedImageF_width(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public long x_stride() {
        return GcamModuleJNI.InterleavedImageF_x_stride(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedWriteViewF, com.google.googlex.gcam.InterleavedReadViewF
    public long y_stride() {
        return GcamModuleJNI.InterleavedImageF_y_stride(this.swigCPtr, this);
    }
}
