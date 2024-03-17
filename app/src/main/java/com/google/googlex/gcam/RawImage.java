package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawImage extends RawWriteView {
    public long swigCPtr;

    public RawImage() {
        this(GcamModuleJNI.new_RawImage__SWIG_0(), true);
    }

    public static long getCPtr(RawImage rawImage) {
        if (rawImage == null) {
            return 0L;
        }
        return rawImage.swigCPtr;
    }

    public RawImage(int i, int i2, int i3) {
        this(GcamModuleJNI.new_RawImage__SWIG_3(i, i2, i3), true);
    }

    public RawImage(int i, int i2, int i3, int i4) {
        this(GcamModuleJNI.new_RawImage__SWIG_2(i, i2, i3, i4), true);
    }

    public RawImage(int i, int i2, int i3, int i4, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_RawImage__SWIG_1(i, i2, i3, i4, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public RawImage(int i, int i2, long j, int i3) {
        this(GcamModuleJNI.new_RawImage__SWIG_6(i, i2, j, i3), true);
    }

    public RawImage(int i, int i2, long j, int i3, int i4) {
        this(GcamModuleJNI.new_RawImage__SWIG_5(i, i2, j, i3, i4), true);
    }

    public RawImage(int i, int i2, long j, int i3, int i4, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_RawImage__SWIG_4(i, i2, j, i3, i4, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public RawImage(long j, boolean z) {
        super(GcamModuleJNI.RawImage_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public RawImage(InterleavedImageU16 interleavedImageU16) {
        this(GcamModuleJNI.new_RawImage__SWIG_8(InterleavedImageU16.getCPtr(interleavedImageU16), interleavedImageU16), true);
    }

    public RawImage(PackedImageRaw10 packedImageRaw10) {
        this(GcamModuleJNI.new_RawImage__SWIG_9(PackedImageRaw10.getCPtr(packedImageRaw10), packedImageRaw10), true);
    }

    public RawImage(PackedImageRaw12 packedImageRaw12) {
        this(GcamModuleJNI.new_RawImage__SWIG_10(PackedImageRaw12.getCPtr(packedImageRaw12), packedImageRaw12), true);
    }

    public RawImage(RawImage rawImage) {
        this(GcamModuleJNI.new_RawImage__SWIG_7(getCPtr(rawImage), rawImage), true);
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.RawImage_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawImage(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    protected void finalize() {
        delete();
    }

    public PackedImageRaw10 packed10_image() {
        return new PackedImageRaw10(GcamModuleJNI.RawImage_packed10_image(this.swigCPtr, this), false);
    }

    public PackedImageRaw12 packed12_image() {
        return new PackedImageRaw12(GcamModuleJNI.RawImage_packed12_image(this.swigCPtr, this), false);
    }

    public InterleavedImageU16 unpacked_image() {
        return new InterleavedImageU16(GcamModuleJNI.RawImage_unpacked_image(this.swigCPtr, this), false);
    }
}
