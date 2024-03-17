package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawVignetteParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawVignetteParams() {
        this(GcamModuleJNI.new_RawVignetteParams(), true);
    }

    public static long getCPtr(RawVignetteParams rawVignetteParams) {
        if (rawVignetteParams == null) {
            return 0L;
        }
        return rawVignetteParams.swigCPtr;
    }

    public RawVignetteParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean IsIdentity() {
        return GcamModuleJNI.RawVignetteParams_IsIdentity(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawVignetteParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getFalloff_exponent() {
        return GcamModuleJNI.RawVignetteParams_falloff_exponent_get(this.swigCPtr, this);
    }

    public float getScale_at_corner() {
        return GcamModuleJNI.RawVignetteParams_scale_at_corner_get(this.swigCPtr, this);
    }

    public void setFalloff_exponent(float f) {
        GcamModuleJNI.RawVignetteParams_falloff_exponent_set(this.swigCPtr, this, f);
    }

    public void setScale_at_corner(float f) {
        GcamModuleJNI.RawVignetteParams_scale_at_corner_set(this.swigCPtr, this, f);
    }
}
