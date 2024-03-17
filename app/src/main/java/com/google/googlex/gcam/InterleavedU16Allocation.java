package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InterleavedU16Allocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedU16Allocation() {
        this(GcamModuleJNI.new_InterleavedU16Allocation(), true);
    }

    public static long getCPtr(InterleavedU16Allocation interleavedU16Allocation) {
        if (interleavedU16Allocation == null) {
            return 0L;
        }
        return interleavedU16Allocation.swigCPtr;
    }

    public InterleavedU16Allocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedU16Allocation(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long getId() {
        return GcamModuleJNI.InterleavedU16Allocation_id_get(this.swigCPtr, this);
    }

    public InterleavedWriteViewU16 getView() {
        long InterleavedU16Allocation_view_get = GcamModuleJNI.InterleavedU16Allocation_view_get(this.swigCPtr, this);
        if (InterleavedU16Allocation_view_get != 0) {
            return new InterleavedWriteViewU16(InterleavedU16Allocation_view_get, false);
        }
        return null;
    }

    public void setId(long j) {
        GcamModuleJNI.InterleavedU16Allocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(InterleavedWriteViewU16 interleavedWriteViewU16) {
        GcamModuleJNI.InterleavedU16Allocation_view_set(this.swigCPtr, this, InterleavedWriteViewU16.getCPtr(interleavedWriteViewU16), interleavedWriteViewU16);
    }
}
