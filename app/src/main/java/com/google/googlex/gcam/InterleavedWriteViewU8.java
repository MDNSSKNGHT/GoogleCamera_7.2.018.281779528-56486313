package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InterleavedWriteViewU8 extends InterleavedReadViewU8 {
    public long swigCPtr;

    public InterleavedWriteViewU8() {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_3(), true);
    }

    public static long getCPtr(InterleavedWriteViewU8 interleavedWriteViewU8) {
        if (interleavedWriteViewU8 == null) {
            return 0L;
        }
        return interleavedWriteViewU8.swigCPtr;
    }

    public InterleavedWriteViewU8(int i, int i2, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_4(i, i2, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char)), true);
    }

    public InterleavedWriteViewU8(int i, int i2, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, long j) {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_5(i, i2, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), j), true);
    }

    public InterleavedWriteViewU8(long j, boolean z) {
        super(GcamModuleJNI.InterleavedWriteViewU8_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public InterleavedWriteViewU8(InterleavedWriteViewU8 interleavedWriteViewU8) {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_0(getCPtr(interleavedWriteViewU8), interleavedWriteViewU8), true);
    }

    public InterleavedWriteViewU8(InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_2(getCPtr(interleavedWriteViewU8), interleavedWriteViewU8, i, i2, i3, i4), true);
    }

    public InterleavedWriteViewU8(InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4, int i5, int i6) {
        this(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_1(getCPtr(interleavedWriteViewU8), interleavedWriteViewU8, i, i2, i3, i4, i5, i6), true);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedWriteViewU8_FastCrop_SWIG_0_1(this.swigCPtr, this, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public void FastCrop(int i, int i2, int i3, int i4, int i5, int i6) {
        GcamModuleJNI.InterleavedWriteViewU8_FastCrop_SWIG_0_0(this.swigCPtr, this, i, i2, i3, i4, i5, i6);
    }

    public void Fill(short s) {
        GcamModuleJNI.InterleavedWriteViewU8_Fill__SWIG_1(this.swigCPtr, this, s);
    }

    public void Fill(short s, int i, int i2, int i3, int i4) {
        GcamModuleJNI.InterleavedWriteViewU8_Fill__SWIG_0(this.swigCPtr, this, s, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public boolean SamplesAreCompact() {
        return GcamModuleJNI.InterleavedWriteViewU8_SamplesAreCompact(this.swigCPtr, this);
    }

    public SWIGTYPE_p_unsigned_char at_InterleavedWriteViewU8(int i, int i2, int i3) {
        return new SWIGTYPE_p_unsigned_char(GcamModuleJNI.InterleavedWriteViewU8_at_InterleavedWriteViewU8(this.swigCPtr, this, i, i2, i3), false);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public SWIGTYPE_p_unsigned_char base_pointer() {
        long InterleavedWriteViewU8_base_pointer = GcamModuleJNI.InterleavedWriteViewU8_base_pointer(this.swigCPtr, this);
        if (InterleavedWriteViewU8_base_pointer != 0) {
            return new SWIGTYPE_p_unsigned_char(InterleavedWriteViewU8_base_pointer, false);
        }
        return null;
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public long c_stride() {
        return GcamModuleJNI.InterleavedWriteViewU8_c_stride(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedWriteViewU8(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    protected void finalize() {
        delete();
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public int height() {
        return GcamModuleJNI.InterleavedWriteViewU8_height(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public int num_channels() {
        return GcamModuleJNI.InterleavedWriteViewU8_num_channels(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public int row_padding() {
        return GcamModuleJNI.InterleavedWriteViewU8_row_padding(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public long sample_array_size() {
        return GcamModuleJNI.InterleavedWriteViewU8_sample_array_size(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__TImageSampleIteratorT_unsigned_char_gcam__kPixelContiguous_t sample_iterator_InterleavedWriteViewU8() {
        return new SWIGTYPE_p_gcam__TImageSampleIteratorT_unsigned_char_gcam__kPixelContiguous_t(GcamModuleJNI.InterleavedWriteViewU8_sample_iterator_InterleavedWriteViewU8__SWIG_0(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_gcam__TImageSampleIteratorT_unsigned_char_gcam__kPixelContiguous_t sample_iterator_InterleavedWriteViewU8(int i) {
        return new SWIGTYPE_p_gcam__TImageSampleIteratorT_unsigned_char_gcam__kPixelContiguous_t(GcamModuleJNI.InterleavedWriteViewU8_sample_iterator_InterleavedWriteViewU8__SWIG_1(this.swigCPtr, this, i), true);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public long sizeof_sample_type() {
        return GcamModuleJNI.InterleavedWriteViewU8_sizeof_sample_type(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public int width() {
        return GcamModuleJNI.InterleavedWriteViewU8_width(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public long x_stride() {
        return GcamModuleJNI.InterleavedWriteViewU8_x_stride(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.InterleavedReadViewU8
    public long y_stride() {
        return GcamModuleJNI.InterleavedWriteViewU8_y_stride(this.swigCPtr, this);
    }
}
