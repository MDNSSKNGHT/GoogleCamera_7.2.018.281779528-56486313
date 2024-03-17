package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DetectHotPixelParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DetectHotPixelParams() {
        this(GcamModuleJNI.new_DetectHotPixelParams(), true);
    }

    public static long getCPtr(DetectHotPixelParams detectHotPixelParams) {
        if (detectHotPixelParams == null) {
            return 0L;
        }
        return detectHotPixelParams.swigCPtr;
    }

    public DetectHotPixelParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DetectHotPixelParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getMax_hot_pixels_in_neighborhood() {
        return GcamModuleJNI.DetectHotPixelParams_max_hot_pixels_in_neighborhood_get(this.swigCPtr, this);
    }

    public boolean getNormalize() {
        return GcamModuleJNI.DetectHotPixelParams_normalize_get(this.swigCPtr, this);
    }

    public float getThreshold_factor() {
        return GcamModuleJNI.DetectHotPixelParams_threshold_factor_get(this.swigCPtr, this);
    }

    public float getThreshold_offset() {
        return GcamModuleJNI.DetectHotPixelParams_threshold_offset_get(this.swigCPtr, this);
    }

    public void setMax_hot_pixels_in_neighborhood(int i) {
        GcamModuleJNI.DetectHotPixelParams_max_hot_pixels_in_neighborhood_set(this.swigCPtr, this, i);
    }

    public void setNormalize(boolean z) {
        GcamModuleJNI.DetectHotPixelParams_normalize_set(this.swigCPtr, this, z);
    }

    public void setThreshold_factor(float f) {
        GcamModuleJNI.DetectHotPixelParams_threshold_factor_set(this.swigCPtr, this, f);
    }

    public void setThreshold_offset(float f) {
        GcamModuleJNI.DetectHotPixelParams_threshold_offset_set(this.swigCPtr, this, f);
    }
}
