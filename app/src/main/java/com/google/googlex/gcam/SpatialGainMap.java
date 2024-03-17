package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SpatialGainMap {
    public static final int kNumCh = 4;
    public boolean swigCMemOwn;
    public long swigCPtr;

    public SpatialGainMap() {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_0(), true);
    }

    public static long getCPtr(SpatialGainMap spatialGainMap) {
        if (spatialGainMap == null) {
            return 0L;
        }
        return spatialGainMap.swigCPtr;
    }

    public SpatialGainMap(int i, int i2, boolean z, boolean z2) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_2(i, i2, z, z2), true);
    }

    public SpatialGainMap(int i, int i2, boolean z, boolean z2, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_1(i, i2, z, z2, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public SpatialGainMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public SpatialGainMap(InterleavedImageF interleavedImageF, boolean z, boolean z2) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_5(InterleavedImageF.getCPtr(interleavedImageF), interleavedImageF, z, z2), true);
    }

    public SpatialGainMap(InterleavedReadViewF interleavedReadViewF, boolean z, boolean z2) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_4(InterleavedReadViewF.getCPtr(interleavedReadViewF), interleavedReadViewF, z, z2), true);
    }

    public SpatialGainMap(InterleavedReadViewF interleavedReadViewF, boolean z, boolean z2, SWIGTYPE_p_gcam__TImageSampleAllocator sWIGTYPE_p_gcam__TImageSampleAllocator) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_3(InterleavedReadViewF.getCPtr(interleavedReadViewF), interleavedReadViewF, z, z2, SWIGTYPE_p_gcam__TImageSampleAllocator.getCPtr(sWIGTYPE_p_gcam__TImageSampleAllocator)), true);
    }

    public SpatialGainMap(SpatialGainMap spatialGainMap) {
        this(GcamModuleJNI.new_SpatialGainMap__SWIG_6(getCPtr(spatialGainMap), spatialGainMap), true);
    }

    public boolean Check(String str) {
        return GcamModuleJNI.SpatialGainMap_Check(this.swigCPtr, this, str);
    }

    public static SpatialGainMap CreateFromBuffer(Uint8Vector uint8Vector) {
        return new SpatialGainMap(GcamModuleJNI.SpatialGainMap_CreateFromBuffer(Uint8Vector.getCPtr(uint8Vector), uint8Vector), true);
    }

    public static SpatialGainMap CreateFromFile(String str) {
        return new SpatialGainMap(GcamModuleJNI.SpatialGainMap_CreateFromFile(str), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.SpatialGainMap_Empty(this.swigCPtr, this);
    }

    public void ForceScaleBy(SpatialGainMap spatialGainMap) {
        GcamModuleJNI.SpatialGainMap_ForceScaleBy(this.swigCPtr, this, getCPtr(spatialGainMap), spatialGainMap);
    }

    public InterleavedImageF GainMapAsRgb() {
        return new InterleavedImageF(GcamModuleJNI.SpatialGainMap_GainMapAsRgb(this.swigCPtr, this), true);
    }

    public float InterpolatedReadRgb(float f, float f2, int i) {
        return GcamModuleJNI.SpatialGainMap_InterpolatedReadRgb(this.swigCPtr, this, f, f2, i);
    }

    public float InterpolatedReadRggb(float f, float f2, int i) {
        return GcamModuleJNI.SpatialGainMap_InterpolatedReadRggb(this.swigCPtr, this, f, f2, i);
    }

    public void Print() {
        GcamModuleJNI.SpatialGainMap_Print(this.swigCPtr, this);
    }

    public float ReadRgb(int i, int i2, int i3) {
        return GcamModuleJNI.SpatialGainMap_ReadRgb(this.swigCPtr, this, i, i2, i3);
    }

    public float ReadRggb(int i, int i2, int i3) {
        return GcamModuleJNI.SpatialGainMap_ReadRggb(this.swigCPtr, this, i, i2, i3);
    }

    public SpatialGainMap ResizeAndCrop(int i, int i2, NormalizedRect normalizedRect) {
        return new SpatialGainMap(GcamModuleJNI.SpatialGainMap_ResizeAndCrop(this.swigCPtr, this, i, i2, NormalizedRect.getCPtr(normalizedRect), normalizedRect), true);
    }

    public void ScaleBy(SpatialGainMap spatialGainMap) {
        GcamModuleJNI.SpatialGainMap_ScaleBy(this.swigCPtr, this, getCPtr(spatialGainMap), spatialGainMap);
    }

    public Uint8Vector SerializeToBuffer() {
        return new Uint8Vector(GcamModuleJNI.SpatialGainMap_SerializeToBuffer(this.swigCPtr, this), true);
    }

    public void WriteRggb(int i, int i2, int i3, float f) {
        GcamModuleJNI.SpatialGainMap_WriteRggb(this.swigCPtr, this, i, i2, i3, f);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_SpatialGainMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public InterleavedImageF gain_map() {
        return new InterleavedImageF(GcamModuleJNI.SpatialGainMap_gain_map(this.swigCPtr, this), false);
    }

    public boolean has_extra_vignetting_applied() {
        return GcamModuleJNI.SpatialGainMap_has_extra_vignetting_applied(this.swigCPtr, this);
    }

    public int height() {
        return GcamModuleJNI.SpatialGainMap_height(this.swigCPtr, this);
    }

    public boolean is_precise() {
        return GcamModuleJNI.SpatialGainMap_is_precise(this.swigCPtr, this);
    }

    public int num_channels() {
        return GcamModuleJNI.SpatialGainMap_num_channels(this.swigCPtr, this);
    }

    public int width() {
        return GcamModuleJNI.SpatialGainMap_width(this.swigCPtr, this);
    }
}
