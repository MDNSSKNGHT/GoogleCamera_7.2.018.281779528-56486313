package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NewDeleteYuvAllocator extends ClientYuvAllocator {
    public long swigCPtr;

    public NewDeleteYuvAllocator() {
        this(GcamModuleJNI.new_NewDeleteYuvAllocator(), true);
    }

    public static long getCPtr(NewDeleteYuvAllocator newDeleteYuvAllocator) {
        if (newDeleteYuvAllocator == null) {
            return 0L;
        }
        return newDeleteYuvAllocator.swigCPtr;
    }

    public NewDeleteYuvAllocator(long j, boolean z) {
        super(GcamModuleJNI.NewDeleteYuvAllocator_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public YuvAllocation Allocate(int i, int i2, int i3) {
        return new YuvAllocation(GcamModuleJNI.NewDeleteYuvAllocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public void Release(long j) {
        GcamModuleJNI.NewDeleteYuvAllocator_Release(this.swigCPtr, this, j);
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NewDeleteYuvAllocator(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.ClientYuvAllocator
    protected void finalize() {
        delete();
    }
}
