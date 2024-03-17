package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NewDeleteInterleavedU16Allocator extends ClientInterleavedU16Allocator {
    public long swigCPtr;

    public NewDeleteInterleavedU16Allocator() {
        this(GcamModuleJNI.new_NewDeleteInterleavedU16Allocator(), true);
    }

    public static long getCPtr(NewDeleteInterleavedU16Allocator newDeleteInterleavedU16Allocator) {
        if (newDeleteInterleavedU16Allocator == null) {
            return 0L;
        }
        return newDeleteInterleavedU16Allocator.swigCPtr;
    }

    public NewDeleteInterleavedU16Allocator(long j, boolean z) {
        super(GcamModuleJNI.NewDeleteInterleavedU16Allocator_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU16Allocator
    public InterleavedU16Allocation Allocate(int i, int i2, int i3) {
        return new InterleavedU16Allocation(GcamModuleJNI.NewDeleteInterleavedU16Allocator_Allocate(this.swigCPtr, this, i, i2, i3), true);
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU16Allocator
    public void Release(long j) {
        GcamModuleJNI.NewDeleteInterleavedU16Allocator_Release(this.swigCPtr, this, j);
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU16Allocator
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_NewDeleteInterleavedU16Allocator(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.ClientInterleavedU16Allocator
    protected void finalize() {
        delete();
    }
}
