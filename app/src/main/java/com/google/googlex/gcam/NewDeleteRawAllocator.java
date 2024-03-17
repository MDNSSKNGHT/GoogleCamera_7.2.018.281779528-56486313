package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NewDeleteRawAllocator extends ClientRawAllocator {
    public long swigCPtr;

    public NewDeleteRawAllocator() {
        this(GcamModuleJNI.new_NewDeleteRawAllocator(), true);
    }

    public static long getCPtr(NewDeleteRawAllocator newDeleteRawAllocator) {
        if (newDeleteRawAllocator == null) {
            return 0L;
        }
        return newDeleteRawAllocator.swigCPtr;
    }

    public NewDeleteRawAllocator(long j, boolean z) {
        super(GcamModuleJNI.NewDeleteRawAllocator_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    @Override // com.google.googlex.gcam.ClientRawAllocator
    public RawAllocation Allocate(int i, int i2, int i3) {
        return new RawAllocation(GcamModuleJNI.NewDeleteRawAllocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    @Override // com.google.googlex.gcam.ClientRawAllocator
    public void Release(long j) {
        GcamModuleJNI.NewDeleteRawAllocator_Release(this.swigCPtr, this, j);
    }

    @Override // com.google.googlex.gcam.ClientRawAllocator
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NewDeleteRawAllocator(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.ClientRawAllocator
    protected void finalize() {
        delete();
    }
}
