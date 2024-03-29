package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ArcFlareParam {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ArcFlareParam() {
        this(GcamModuleJNI.new_ArcFlareParam(), true);
    }

    public static long getCPtr(ArcFlareParam arcFlareParam) {
        if (arcFlareParam == null) {
            return 0L;
        }
        return arcFlareParam.swigCPtr;
    }

    public ArcFlareParam(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public float GetMeanRadius(float f) {
        return GcamModuleJNI.ArcFlareParam_GetMeanRadius(this.swigCPtr, this, f);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ArcFlareParam(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getCan_exist() {
        return GcamModuleJNI.ArcFlareParam_can_exist_get(this.swigCPtr, this);
    }

    public double[] getRadius_param() {
        return GcamModuleJNI.ArcFlareParam_radius_param_get(this.swigCPtr, this);
    }

    public void setCan_exist(boolean z) {
        GcamModuleJNI.ArcFlareParam_can_exist_set(this.swigCPtr, this, z);
    }

    public void setRadius_param(double[] dArr) {
        GcamModuleJNI.ArcFlareParam_radius_param_set(this.swigCPtr, this, dArr);
    }
}
