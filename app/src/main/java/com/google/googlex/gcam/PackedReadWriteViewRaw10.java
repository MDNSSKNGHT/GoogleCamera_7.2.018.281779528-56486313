package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PackedReadWriteViewRaw10 extends PackedReadViewRaw10 {
    public long swigCPtr;

    public PackedReadWriteViewRaw10() {
        this(GcamModuleJNI.new_PackedReadWriteViewRaw10__SWIG_0(), true);
    }

    public static long getCPtr(PackedReadWriteViewRaw10 packedReadWriteViewRaw10) {
        if (packedReadWriteViewRaw10 == null) {
            return 0L;
        }
        return packedReadWriteViewRaw10.swigCPtr;
    }

    public PackedReadWriteViewRaw10(long j, boolean z) {
        super(GcamModuleJNI.PackedReadWriteViewRaw10_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public PackedReadWriteViewRaw10(InterleavedWriteViewU8 interleavedWriteViewU8) {
        this(GcamModuleJNI.new_PackedReadWriteViewRaw10__SWIG_1(InterleavedWriteViewU8.getCPtr(interleavedWriteViewU8), interleavedWriteViewU8), true);
    }

    public PackedReadWriteViewRaw10(PackedReadWriteViewRaw10 packedReadWriteViewRaw10) {
        this(GcamModuleJNI.new_PackedReadWriteViewRaw10__SWIG_2(getCPtr(packedReadWriteViewRaw10), packedReadWriteViewRaw10), true);
    }

    @Override // com.google.googlex.gcam.PackedReadViewRaw10
    public boolean FastCrop(int i, int i2, int i3, int i4) {
        return GcamModuleJNI.PackedReadWriteViewRaw10_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    @Override // com.google.googlex.gcam.PackedReadViewRaw10
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PackedReadWriteViewRaw10(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.PackedReadViewRaw10
    protected void finalize() {
        delete();
    }

    public InterleavedWriteViewU8 packed_write_view() {
        return new InterleavedWriteViewU8(GcamModuleJNI.PackedReadWriteViewRaw10_packed_write_view(this.swigCPtr, this), false);
    }

    public void set_pixel(int i, int i2, int i3) {
        GcamModuleJNI.PackedReadWriteViewRaw10_set_pixel(this.swigCPtr, this, i, i2, i3);
    }

    public void set_row(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadWriteViewRaw10_set_row__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public void set_row(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.PackedReadWriteViewRaw10_set_row__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }
}
