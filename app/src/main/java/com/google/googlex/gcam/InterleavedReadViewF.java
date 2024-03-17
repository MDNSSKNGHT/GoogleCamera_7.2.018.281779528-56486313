package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InterleavedReadViewF {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedReadViewF() {
        this(GcamModuleJNI.new_InterleavedReadViewF__SWIG_3(), true);
    }

    public static long getCPtr(InterleavedReadViewF interleavedReadViewF) {
        if (interleavedReadViewF == null) {
            return 0L;
        }
        return interleavedReadViewF.swigCPtr;
    }

    public InterleavedReadViewF(int i, int i2, int i3, SWIGTYPE_p_float sWIGTYPE_p_float) {
        this(GcamModuleJNI.new_InterleavedReadViewF__SWIG_4(i, i2, i3, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float)), true);
    }

    public InterleavedReadViewF(int i, int i2, int i3, SWIGTYPE_p_float sWIGTYPE_p_float, long j) {
        this(GcamModuleJNI.new_InterleavedReadViewF__SWIG_5(i, i2, i3, SWIGTYPE_p_float.getCPtr(sWIGTYPE_p_float), j), true);
    }

    public InterleavedReadViewF(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public InterleavedReadViewF(InterleavedReadViewF interleavedReadViewF) {
        this(GcamModuleJNI.new_InterleavedReadViewF__SWIG_0(getCPtr(interleavedReadViewF), interleavedReadViewF), true);
    }

    public InterleavedReadViewF(InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedReadViewF__SWIG_2(getCPtr(interleavedReadViewF), interleavedReadViewF, i, i2, i3, i4), true);
    }

    public InterleavedReadViewF(InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3, int i4, int i5, int i6) {
        this(GcamModuleJNI.new_InterleavedReadViewF__SWIG_1(getCPtr(interleavedReadViewF), interleavedReadViewF, i, i2, i3, i4, i5, i6), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.InterleavedReadViewF_Empty(this.swigCPtr, this);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedReadViewF_FastCrop__SWIG_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedReadViewF_FastCrop__SWIG_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedReadViewF_SamplesAreCompact(this.swigCPtr, this);
    }

    public float at(int i, int i2, int i3) {
        return GcamModuleJNI.InterleavedReadViewF_at(this.swigCPtr, this, i, i2, i3);
    }

    public SWIGTYPE_p_float base_pointer() {
        long InterleavedReadViewF_base_pointer = GcamModuleJNI.InterleavedReadViewF_base_pointer(this.swigCPtr, this);
        if (InterleavedReadViewF_base_pointer != 0) {
            return new SWIGTYPE_p_float(InterleavedReadViewF_base_pointer, false);
        }
        return null;
    }

    public long c_stride() {
        return GcamModuleJNI.InterleavedReadViewF_c_stride(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedReadViewF(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int height() {
        return GcamModuleJNI.InterleavedReadViewF_height(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.InterleavedReadViewF_num_channels(this.swigCPtr, this);
    }

    public int row_padding() {
        return GcamModuleJNI.InterleavedReadViewF_row_padding(this.swigCPtr, this);
    }

    public long sample_array_size() {
        return GcamModuleJNI.InterleavedReadViewF_sample_array_size(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__TImageSampleIteratorT_float_const_gcam__kPixelContiguous_t sample_iterator() {
        return new SWIGTYPE_p_gcam__TImageSampleIteratorT_float_const_gcam__kPixelContiguous_t(GcamModuleJNI.InterleavedReadViewF_sample_iterator__SWIG_0(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_gcam__TImageSampleIteratorT_float_const_gcam__kPixelContiguous_t sample_iterator(int i) {
        return new SWIGTYPE_p_gcam__TImageSampleIteratorT_float_const_gcam__kPixelContiguous_t(GcamModuleJNI.InterleavedReadViewF_sample_iterator__SWIG_1(this.swigCPtr, this, i), true);
    }

    public static int sample_layout() {
        return GcamModuleJNI.InterleavedReadViewF_sample_layout();
    }

    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedReadViewF_sizeof_sample_type(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.InterleavedReadViewF_width(this.swigCPtr, this);
    }

    public long x_stride() {
        return GcamModuleJNI.InterleavedReadViewF_x_stride(this.swigCPtr, this);
    }

    public long y_stride() {
        return GcamModuleJNI.InterleavedReadViewF_y_stride(this.swigCPtr, this);
    }
}
