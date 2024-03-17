package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeRunnerDeviceTuning {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AeRunnerDeviceTuning() {
        this(GcamModuleJNI.new_AeRunnerDeviceTuning(), true);
    }

    public static long getCPtr(AeRunnerDeviceTuning aeRunnerDeviceTuning) {
        if (aeRunnerDeviceTuning == null) {
            return 0L;
        }
        return aeRunnerDeviceTuning.swigCPtr;
    }

    public AeRunnerDeviceTuning(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static AeRunnerDeviceTuning GenericTuning() {
        return new AeRunnerDeviceTuning(GcamModuleJNI.AeRunnerDeviceTuning_GenericTuning(), true);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AeRunnerDeviceTuning(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getMax_hdr_ratio() {
        return GcamModuleJNI.AeRunnerDeviceTuning_max_hdr_ratio_get(this.swigCPtr, this);
    }

    public float getMax_overall_gain() {
        return GcamModuleJNI.AeRunnerDeviceTuning_max_overall_gain_get(this.swigCPtr, this);
    }

    public float getMax_post_capture_gain_non_zsl() {
        return GcamModuleJNI.AeRunnerDeviceTuning_max_post_capture_gain_non_zsl_get(this.swigCPtr, this);
    }

    public float getMax_post_capture_gain_zsl() {
        return GcamModuleJNI.AeRunnerDeviceTuning_max_post_capture_gain_zsl_get(this.swigCPtr, this);
    }

    public float getMax_tet() {
        return GcamModuleJNI.AeRunnerDeviceTuning_max_tet_get(this.swigCPtr, this);
    }

    public float getMin_tet() {
        return GcamModuleJNI.AeRunnerDeviceTuning_min_tet_get(this.swigCPtr, this);
    }

    public ColorSatParams getRaw_finish_saturation() {
        long AeRunnerDeviceTuning_raw_finish_saturation_get = GcamModuleJNI.AeRunnerDeviceTuning_raw_finish_saturation_get(this.swigCPtr, this);
        if (AeRunnerDeviceTuning_raw_finish_saturation_get != 0) {
            return new ColorSatParams(AeRunnerDeviceTuning_raw_finish_saturation_get, false);
        }
        return null;
    }

    public RawVignetteParams getRaw_global_vignetting() {
        long AeRunnerDeviceTuning_raw_global_vignetting_get = GcamModuleJNI.AeRunnerDeviceTuning_raw_global_vignetting_get(this.swigCPtr, this);
        if (AeRunnerDeviceTuning_raw_global_vignetting_get != 0) {
            return new RawVignetteParams(AeRunnerDeviceTuning_raw_global_vignetting_get, false);
        }
        return null;
    }

    public float getSensitivity() {
        return GcamModuleJNI.AeRunnerDeviceTuning_sensitivity_get(this.swigCPtr, this);
    }

    public void setMax_hdr_ratio(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_max_hdr_ratio_set(this.swigCPtr, this, f);
    }

    public void setMax_overall_gain(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_max_overall_gain_set(this.swigCPtr, this, f);
    }

    public void setMax_post_capture_gain_non_zsl(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_max_post_capture_gain_non_zsl_set(this.swigCPtr, this, f);
    }

    public void setMax_post_capture_gain_zsl(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_max_post_capture_gain_zsl_set(this.swigCPtr, this, f);
    }

    public void setMax_tet(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_max_tet_set(this.swigCPtr, this, f);
    }

    public void setMin_tet(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_min_tet_set(this.swigCPtr, this, f);
    }

    public void setRaw_finish_saturation(ColorSatParams colorSatParams) {
        GcamModuleJNI.AeRunnerDeviceTuning_raw_finish_saturation_set(this.swigCPtr, this, ColorSatParams.getCPtr(colorSatParams), colorSatParams);
    }

    public void setRaw_global_vignetting(RawVignetteParams rawVignetteParams) {
        GcamModuleJNI.AeRunnerDeviceTuning_raw_global_vignetting_set(this.swigCPtr, this, RawVignetteParams.getCPtr(rawVignetteParams), rawVignetteParams);
    }

    public void setSensitivity(float f) {
        GcamModuleJNI.AeRunnerDeviceTuning_sensitivity_set(this.swigCPtr, this, f);
    }
}
