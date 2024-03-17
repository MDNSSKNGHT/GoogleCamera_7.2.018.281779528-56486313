package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PhysicalStabilityThresholds {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PhysicalStabilityThresholds() {
        this(GcamModuleJNI.new_PhysicalStabilityThresholds(), true);
    }

    public static long getCPtr(PhysicalStabilityThresholds physicalStabilityThresholds) {
        if (physicalStabilityThresholds == null) {
            return 0L;
        }
        return physicalStabilityThresholds.swigCPtr;
    }

    public PhysicalStabilityThresholds(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static PhysicalStabilityThresholds Get(String str) {
        return new PhysicalStabilityThresholds(GcamModuleJNI.PhysicalStabilityThresholds_Get(str), true);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PhysicalStabilityThresholds(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getBraced_speed_rad_per_sec() {
        return GcamModuleJNI.PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(this.swigCPtr, this);
    }

    public float getHandheld_speed_rad_per_sec() {
        return GcamModuleJNI.PhysicalStabilityThresholds_handheld_speed_rad_per_sec_get(this.swigCPtr, this);
    }

    public float getMin_speed_rad_per_sec() {
        return GcamModuleJNI.PhysicalStabilityThresholds_min_speed_rad_per_sec_get(this.swigCPtr, this);
    }

    public float getTripod_speed_rad_per_sec() {
        return GcamModuleJNI.PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(this.swigCPtr, this);
    }

    public void setBraced_speed_rad_per_sec(float f) {
        GcamModuleJNI.PhysicalStabilityThresholds_braced_speed_rad_per_sec_set(this.swigCPtr, this, f);
    }

    public void setHandheld_speed_rad_per_sec(float f) {
        GcamModuleJNI.PhysicalStabilityThresholds_handheld_speed_rad_per_sec_set(this.swigCPtr, this, f);
    }

    public void setMin_speed_rad_per_sec(float f) {
        GcamModuleJNI.PhysicalStabilityThresholds_min_speed_rad_per_sec_set(this.swigCPtr, this, f);
    }

    public void setTripod_speed_rad_per_sec(float f) {
        GcamModuleJNI.PhysicalStabilityThresholds_tripod_speed_rad_per_sec_set(this.swigCPtr, this, f);
    }
}
