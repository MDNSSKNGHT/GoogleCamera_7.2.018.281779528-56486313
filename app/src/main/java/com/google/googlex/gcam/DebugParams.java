package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DebugParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DebugParams() {
        this(GcamModuleJNI.new_DebugParams(), true);
    }

    public static long getCPtr(DebugParams debugParams) {
        if (debugParams == null) {
            return 0L;
        }
        return debugParams.swigCPtr;
    }

    public DebugParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DebugParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long getSave_bitmask() {
        return GcamModuleJNI.DebugParams_save_bitmask_get(this.swigCPtr, this);
    }

    public void setSave_bitmask(long j) {
        GcamModuleJNI.DebugParams_save_bitmask_set(this.swigCPtr, this, j);
    }
}
