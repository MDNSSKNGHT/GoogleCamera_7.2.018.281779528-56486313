package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GeometricCalibration {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class Quality {
        public static final int kHigh = 1;
        public static final int kStandard = 0;
    }

    public GeometricCalibration() {
        this(GcamModuleJNI.new_GeometricCalibration(), true);
    }

    public static long getCPtr(GeometricCalibration geometricCalibration) {
        if (geometricCalibration == null) {
            return 0L;
        }
        return geometricCalibration.swigCPtr;
    }

    public GeometricCalibration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.GeometricCalibration_Check(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, int i) {
        return GcamModuleJNI.GeometricCalibration_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), i);
    }

    public boolean Equals(GeometricCalibration geometricCalibration) {
        return GcamModuleJNI.GeometricCalibration_Equals(this.swigCPtr, this, getCPtr(geometricCalibration), geometricCalibration);
    }

    public static GeometricCalibration GetRandomGeometricCalibration() {
        return new GeometricCalibration(GcamModuleJNI.GeometricCalibration_GetRandomGeometricCalibration(), true);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.GeometricCalibration_SerializeToString(this.swigCPtr, this, str, i);
    }

    public static int TextToGeometricCalibrationQuality(String str) {
        return GcamModuleJNI.GeometricCalibration_TextToGeometricCalibrationQuality(str);
    }

    public static String ToText(int i) {
        return GcamModuleJNI.GeometricCalibration_ToText(i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GeometricCalibration(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int[] getActive_rectangle() {
        return GcamModuleJNI.GeometricCalibration_active_rectangle_get(this.swigCPtr, this);
    }

    public float[] getLens_distortion() {
        return GcamModuleJNI.GeometricCalibration_lens_distortion_get(this.swigCPtr, this);
    }

    public float[] getLens_distortion_extended() {
        return GcamModuleJNI.GeometricCalibration_lens_distortion_extended_get(this.swigCPtr, this);
    }

    public float[] getLens_intrinsic_calibration() {
        return GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_get(this.swigCPtr, this);
    }

    public float[] getLens_pose_rotation() {
        return GcamModuleJNI.GeometricCalibration_lens_pose_rotation_get(this.swigCPtr, this);
    }

    public float[] getLens_pose_translation() {
        return GcamModuleJNI.GeometricCalibration_lens_pose_translation_get(this.swigCPtr, this);
    }

    public int getQuality() {
        return GcamModuleJNI.GeometricCalibration_quality_get(this.swigCPtr, this);
    }

    public int[] getValid_rectangle() {
        return GcamModuleJNI.GeometricCalibration_valid_rectangle_get(this.swigCPtr, this);
    }

    public void setActive_rectangle(int[] iArr) {
        GcamModuleJNI.GeometricCalibration_active_rectangle_set(this.swigCPtr, this, iArr);
    }

    public void setLens_distortion(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_set(this.swigCPtr, this, fArr);
    }

    public void setLens_distortion_extended(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_distortion_extended_set(this.swigCPtr, this, fArr);
    }

    public void setLens_intrinsic_calibration(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_intrinsic_calibration_set(this.swigCPtr, this, fArr);
    }

    public void setLens_pose_rotation(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_pose_rotation_set(this.swigCPtr, this, fArr);
    }

    public void setLens_pose_translation(float[] fArr) {
        GcamModuleJNI.GeometricCalibration_lens_pose_translation_set(this.swigCPtr, this, fArr);
    }

    public void setQuality(int i) {
        GcamModuleJNI.GeometricCalibration_quality_set(this.swigCPtr, this, i);
    }

    public void setValid_rectangle(int[] iArr) {
        GcamModuleJNI.GeometricCalibration_valid_rectangle_set(this.swigCPtr, this, iArr);
    }
}
