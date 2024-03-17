package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewfinderResults {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ViewfinderResults() {
        this(GcamModuleJNI.new_ViewfinderResults(), true);
    }

    public static long getCPtr(ViewfinderResults viewfinderResults) {
        if (viewfinderResults == null) {
            return 0L;
        }
        return viewfinderResults.swigCPtr;
    }

    public ViewfinderResults(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ViewfinderResults(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getIs_on_tripod() {
        return GcamModuleJNI.ViewfinderResults_is_on_tripod_get(this.swigCPtr, this);
    }

    public void setIs_on_tripod(boolean z) {
        GcamModuleJNI.ViewfinderResults_is_on_tripod_set(this.swigCPtr, this, z);
    }
}
