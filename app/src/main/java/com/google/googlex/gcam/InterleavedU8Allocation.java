package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InterleavedU8Allocation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InterleavedU8Allocation() {
        this(GcamModuleJNI.new_InterleavedU8Allocation(), true);
    }

    public static long getCPtr(InterleavedU8Allocation interleavedU8Allocation) {
        if (interleavedU8Allocation == null) {
            return 0L;
        }
        return interleavedU8Allocation.swigCPtr;
    }

    public InterleavedU8Allocation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InterleavedU8Allocation(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long getId() {
        return GcamModuleJNI.InterleavedU8Allocation_id_get(this.swigCPtr, this);
    }

    public InterleavedWriteViewU8 getView() {
        long InterleavedU8Allocation_view_get = GcamModuleJNI.InterleavedU8Allocation_view_get(this.swigCPtr, this);
        if (InterleavedU8Allocation_view_get != 0) {
            return new InterleavedWriteViewU8(InterleavedU8Allocation_view_get, false);
        }
        return null;
    }

    public void setId(long j) {
        GcamModuleJNI.InterleavedU8Allocation_id_set(this.swigCPtr, this, j);
    }

    public void setView(InterleavedWriteViewU8 interleavedWriteViewU8) {
        GcamModuleJNI.InterleavedU8Allocation_view_set(this.swigCPtr, this, InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8), interleavedWriteViewU8);
    }
}
