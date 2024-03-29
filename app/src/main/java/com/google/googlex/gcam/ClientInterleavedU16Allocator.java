package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClientInterleavedU16Allocator {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ClientInterleavedU16Allocator() {
        this(GcamModuleJNI.new_ClientInterleavedU16Allocator(), true);
        GcamModuleJNI.ClientInterleavedU16Allocator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(ClientInterleavedU16Allocator clientInterleavedU16Allocator) {
        if (clientInterleavedU16Allocator == null) {
            return 0L;
        }
        return clientInterleavedU16Allocator.swigCPtr;
    }

    public ClientInterleavedU16Allocator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public InterleavedU16Allocation Allocate(int i, int i2, int i3) {
        return new InterleavedU16Allocation(GcamModuleJNI.ClientInterleavedU16Allocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    public void Release(long j) {
        GcamModuleJNI.ClientInterleavedU16Allocator_Release(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ClientInterleavedU16Allocator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.ClientInterleavedU16Allocator_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ClientInterleavedU16Allocator_change_ownership(this, this.swigCPtr, true);
    }
}
