package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhysicalStabilityParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PhysicalStabilityParams() {
        this(GcamModuleJNI.new_PhysicalStabilityParams(), true);
    }

    public static long getCPtr(PhysicalStabilityParams physicalStabilityParams) {
        if (physicalStabilityParams == null) {
            return 0L;
        }
        return physicalStabilityParams.swigCPtr;
    }

    public PhysicalStabilityParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PhysicalStabilityParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getMax_handheld_shot_capture_time_ms() {
        return GcamModuleJNI.PhysicalStabilityParams_max_handheld_shot_capture_time_ms_get(this.swigCPtr, this);
    }

    public PhysicalStabilityThresholds getThresholds() {
        long PhysicalStabilityParams_thresholds_get = GcamModuleJNI.PhysicalStabilityParams_thresholds_get(this.swigCPtr, this);
        if (PhysicalStabilityParams_thresholds_get != 0) {
            return new PhysicalStabilityThresholds(PhysicalStabilityParams_thresholds_get, false);
        }
        return null;
    }

    public float getTripod_max_exposure_time_ms() {
        return GcamModuleJNI.PhysicalStabilityParams_tripod_max_exposure_time_ms_get(this.swigCPtr, this);
    }

    public void setMax_handheld_shot_capture_time_ms(float f) {
        GcamModuleJNI.PhysicalStabilityParams_max_handheld_shot_capture_time_ms_set(this.swigCPtr, this, f);
    }

    public void setThresholds(PhysicalStabilityThresholds physicalStabilityThresholds) {
        GcamModuleJNI.PhysicalStabilityParams_thresholds_set(this.swigCPtr, this, PhysicalStabilityThresholds.getCPtr(physicalStabilityThresholds), physicalStabilityThresholds);
    }

    public void setTripod_max_exposure_time_ms(float f) {
        GcamModuleJNI.PhysicalStabilityParams_tripod_max_exposure_time_ms_set(this.swigCPtr, this, f);
    }
}
