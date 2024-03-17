package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DenoiseParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DenoiseParams() {
        this(GcamModuleJNI.new_DenoiseParams(), true);
    }

    public static long getCPtr(DenoiseParams denoiseParams) {
        if (denoiseParams == null) {
            return 0L;
        }
        return denoiseParams.swigCPtr;
    }

    public DenoiseParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DenoiseParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float[] getRevert_factor() {
        return GcamModuleJNI.DenoiseParams_revert_factor_get(this.swigCPtr, this);
    }

    public float[] getStrength() {
        return GcamModuleJNI.DenoiseParams_strength_get(this.swigCPtr, this);
    }

    public void setRevert_factor(float[] fArr) {
        GcamModuleJNI.DenoiseParams_revert_factor_set(this.swigCPtr, this, fArr);
    }

    public void setStrength(float[] fArr) {
        GcamModuleJNI.DenoiseParams_strength_set(this.swigCPtr, this, fArr);
    }
}
