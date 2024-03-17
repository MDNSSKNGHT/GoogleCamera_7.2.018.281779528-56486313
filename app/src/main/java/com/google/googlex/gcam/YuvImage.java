package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class YuvImage extends YuvWriteView {
    public long swigCPtr;

    public YuvImage() {
        this(GcamModuleJNI.new_YuvImage__SWIG_0(), true);
    }

    public static long getCPtr(YuvImage yuvImage) {
        if (yuvImage == null) {
            return 0L;
        }
        return yuvImage.swigCPtr;
    }

    public YuvImage(int i, int i2, int i3) {
        this(GcamModuleJNI.new_YuvImage__SWIG_2(i, i2, i3), true);
    }

    public YuvImage(int i, int i2, int i3, int i4, int i5, int i6) {
        this(GcamModuleJNI.new_YuvImage__SWIG_4(i, i2, i3, i4, i5, i6), true);
    }

    public YuvImage(int i, int i2, int i3, int i4, int i5, int i6, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_YuvImage__SWIG_3(i, i2, i3, i4, i5, i6, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public YuvImage(int i, int i2, int i3, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_YuvImage__SWIG_1(i, i2, i3, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public YuvImage(long j, boolean z) {
        super(GcamModuleJNI.YuvImage_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public YuvImage(YuvImage yuvImage) {
        this(GcamModuleJNI.new_YuvImage__SWIG_5(getCPtr(yuvImage), yuvImage), true);
    }

    public InterleavedImageU8 buffer() {
        return new InterleavedImageU8(GcamModuleJNI.YuvImage_buffer(this.swigCPtr, this), false);
    }

    public int chroma_rows() {
        return GcamModuleJNI.YuvImage_chroma_rows(this.swigCPtr, this);
    }

    @Override // com.google.googlex.gcam.YuvWriteView, com.google.googlex.gcam.YuvReadView
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_YuvImage(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.YuvWriteView, com.google.googlex.gcam.YuvReadView
    protected void finalize() {
        delete();
    }

    public int luma_rows() {
        return GcamModuleJNI.YuvImage_luma_rows(this.swigCPtr, this);
    }

    public InterleavedImageU8 mutable_buffer() {
        return new InterleavedImageU8(GcamModuleJNI.YuvImage_mutable_buffer(this.swigCPtr, this), false);
    }
}
