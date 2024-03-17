package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NewDeleteInterleavedU8Allocator extends ClientInterleavedU8Allocator {
    public long swigCPtr;

    public NewDeleteInterleavedU8Allocator() {
        this(GcamModuleJNI.new_NewDeleteInterleavedU8Allocator(), true);
    }

    public static long getCPtr(NewDeleteInterleavedU8Allocator newDeleteInterleavedU8Allocator) {
        if (newDeleteInterleavedU8Allocator == null) {
            return 0L;
        }
        return newDeleteInterleavedU8Allocator.swigCPtr;
    }

    public NewDeleteInterleavedU8Allocator(long j, boolean z) {
        super(GcamModuleJNI.NewDeleteInterleavedU8Allocator_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public InterleavedU8Allocation Allocate(int i, int i2, int i3) {
        return new InterleavedU8Allocation(GcamModuleJNI.NewDeleteInterleavedU8Allocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public void Release(long j) {
        GcamModuleJNI.NewDeleteInterleavedU8Allocator_Release(this.swigCPtr, this, j);
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NewDeleteInterleavedU8Allocator(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU8Allocator
    protected void finalize() {
        delete();
    }
}
