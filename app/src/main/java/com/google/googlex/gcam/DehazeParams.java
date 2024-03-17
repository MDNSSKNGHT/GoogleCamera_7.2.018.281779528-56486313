package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DehazeParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DehazeParams() {
        this(GcamModuleJNI.new_DehazeParams(), true);
    }

    public static long getCPtr(DehazeParams dehazeParams) {
        if (dehazeParams == null) {
            return 0L;
        }
        return dehazeParams.swigCPtr;
    }

    public DehazeParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DehazeParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getRolloff_strength() {
        return GcamModuleJNI.DehazeParams_rolloff_strength_get(this.swigCPtr, this);
    }

    public void setRolloff_strength(float f) {
        GcamModuleJNI.DehazeParams_rolloff_strength_set(this.swigCPtr, this, f);
    }
}
