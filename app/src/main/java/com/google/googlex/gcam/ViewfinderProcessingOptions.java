package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewfinderProcessingOptions {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ViewfinderProcessingOptions() {
        this(GcamModuleJNI.new_ViewfinderProcessingOptions(), true);
    }

    public static long getCPtr(ViewfinderProcessingOptions viewfinderProcessingOptions) {
        if (viewfinderProcessingOptions == null) {
            return 0L;
        }
        return viewfinderProcessingOptions.swigCPtr;
    }

    public ViewfinderProcessingOptions(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ViewfinderProcessingOptions(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getProcess_motion() {
        return GcamModuleJNI.ViewfinderProcessingOptions_process_motion_get(this.swigCPtr, this);
    }

    public boolean getSave_motion_trace() {
        return GcamModuleJNI.ViewfinderProcessingOptions_save_motion_trace_get(this.swigCPtr, this);
    }

    public boolean getVerbose() {
        return GcamModuleJNI.ViewfinderProcessingOptions_verbose_get(this.swigCPtr, this);
    }

    public void setProcess_motion(boolean z) {
        GcamModuleJNI.ViewfinderProcessingOptions_process_motion_set(this.swigCPtr, this, z);
    }

    public void setSave_motion_trace(boolean z) {
        GcamModuleJNI.ViewfinderProcessingOptions_save_motion_trace_set(this.swigCPtr, this, z);
    }

    public void setVerbose(boolean z) {
        GcamModuleJNI.ViewfinderProcessingOptions_verbose_set(this.swigCPtr, this, z);
    }
}
