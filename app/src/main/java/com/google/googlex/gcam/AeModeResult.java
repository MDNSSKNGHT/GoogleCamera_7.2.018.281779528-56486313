package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeModeResult {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AeModeResult() {
        this(GcamModuleJNI.new_AeModeResult(), true);
    }

    public static long getCPtr(AeModeResult aeModeResult) {
        if (aeModeResult == null) {
            return 0L;
        }
        return aeModeResult.swigCPtr;
    }

    public AeModeResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AeModeResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getConfidence() {
        return GcamModuleJNI.AeModeResult_confidence_get(this.swigCPtr, this);
    }

    public float getHigh_frequency_str() {
        return GcamModuleJNI.AeModeResult_high_frequency_str_get(this.swigCPtr, this);
    }

    public float getLog_scene_brightness() {
        return GcamModuleJNI.AeModeResult_log_scene_brightness_get(this.swigCPtr, this);
    }

    public float getTarget_avg_ldr() {
        return GcamModuleJNI.AeModeResult_target_avg_ldr_get(this.swigCPtr, this);
    }

    public float getTet() {
        return GcamModuleJNI.AeModeResult_tet_get(this.swigCPtr, this);
    }

    public void setConfidence(float f) {
        GcamModuleJNI.AeModeResult_confidence_set(this.swigCPtr, this, f);
    }

    public void setHigh_frequency_str(float f) {
        GcamModuleJNI.AeModeResult_high_frequency_str_set(this.swigCPtr, this, f);
    }

    public void setLog_scene_brightness(float f) {
        GcamModuleJNI.AeModeResult_log_scene_brightness_set(this.swigCPtr, this, f);
    }

    public void setTarget_avg_ldr(float f) {
        GcamModuleJNI.AeModeResult_target_avg_ldr_set(this.swigCPtr, this, f);
    }

    public void setTet(float f) {
        GcamModuleJNI.AeModeResult_tet_set(this.swigCPtr, this, f);
    }
}
