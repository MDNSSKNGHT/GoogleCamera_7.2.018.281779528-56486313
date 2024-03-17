package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawAllocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawAllocation() {
        this(GcamModuleJNI.new_RawAllocation(), true);
    }

    public static long getCPtr(RawAllocation rawAllocation) {
        if (rawAllocation == null) {
            return 0L;
        }
        return rawAllocation.swigCPtr;
    }

    public RawAllocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawAllocation(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long getId() {
        return GcamModuleJNI.RawAllocation_id_get(this.swigCPtr, this);
    }

    public RawWriteView getView() {
        long RawAllocation_view_get = GcamModuleJNI.RawAllocation_view_get(this.swigCPtr, this);
        if (RawAllocation_view_get != 0) {
            return new RawWriteView(RawAllocation_view_get, false);
        }
        return null;
    }

    public void setId(long j) {
        GcamModuleJNI.RawAllocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(RawWriteView rawWriteView) {
        GcamModuleJNI.RawAllocation_view_set(this.swigCPtr, this, RawWriteView.getCPtr(rawWriteView), rawWriteView);
    }
}
