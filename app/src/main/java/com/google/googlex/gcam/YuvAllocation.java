package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class YuvAllocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public YuvAllocation() {
        this(GcamModuleJNI.new_YuvAllocation(), true);
    }

    public static long getCPtr(YuvAllocation yuvAllocation) {
        if (yuvAllocation == null) {
            return 0L;
        }
        return yuvAllocation.swigCPtr;
    }

    public YuvAllocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_YuvAllocation(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long getId() {
        return GcamModuleJNI.YuvAllocation_id_get(this.swigCPtr, this);
    }

    public YuvWriteView getView() {
        long YuvAllocation_view_get = GcamModuleJNI.YuvAllocation_view_get(this.swigCPtr, this);
        if (YuvAllocation_view_get != 0) {
            return new YuvWriteView(YuvAllocation_view_get, false);
        }
        return null;
    }

    public void setId(long j) {
        GcamModuleJNI.YuvAllocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(YuvWriteView yuvWriteView) {
        GcamModuleJNI.YuvAllocation_view_set(this.swigCPtr, this, YuvWriteView.getCPtr(yuvWriteView), yuvWriteView);
    }
}
