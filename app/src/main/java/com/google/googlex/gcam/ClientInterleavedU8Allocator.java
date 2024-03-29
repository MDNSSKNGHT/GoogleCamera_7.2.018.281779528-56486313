package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClientInterleavedU8Allocator {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ClientInterleavedU8Allocator() {
        this(GcamModuleJNI.new_ClientInterleavedU8Allocator(), true);
        GcamModuleJNI.ClientInterleavedU8Allocator_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        if (clientInterleavedU8Allocator == null) {
            return 0L;
        }
        return clientInterleavedU8Allocator.swigCPtr;
    }

    public ClientInterleavedU8Allocator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        return new InterleavedU8Allocation(GcamModuleJNI.ClientInterleavedU8Allocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    public void Release(long j) {
        GcamModuleJNI.ClientInterleavedU8Allocator_Release(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ClientInterleavedU8Allocator(j);
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
        GcamModuleJNI.ClientInterleavedU8Allocator_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ClientInterleavedU8Allocator_change_ownership(this, this.swigCPtr, true);
    }
}
