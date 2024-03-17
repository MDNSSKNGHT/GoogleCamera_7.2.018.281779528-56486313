package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawWriteView extends RawReadView {
    public long swigCPtr;

    public RawWriteView() {
        this(GcamModuleJNI.new_RawWriteView__SWIG_0(), true);
    }

    public static long getCPtr(RawWriteView rawWriteView) {
        if (rawWriteView == null) {
            return 0L;
        }
        return rawWriteView.swigCPtr;
    }

    public RawWriteView(int i, int i2, long j, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_2(i, i2, j, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char)), true);
    }

    public RawWriteView(long j, boolean z) {
        super(GcamModuleJNI.RawWriteView_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    public RawWriteView(RawWriteView rawWriteView) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_1(getCPtr(rawWriteView), rawWriteView), true);
    }

    @Override // com.google.googlex.gcam.RawReadView
    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.RawWriteView_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public void SetRow(int i, int i2, int i3, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.RawWriteView_SetRow__SWIG_0(this.swigCPtr, this, i, i2, i3, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    public void SetRow(int i, SWIGTYPE_p_unsigned_short sWIGTYPE_p_unsigned_short) {
        GcamModuleJNI.RawWriteView_SetRow__SWIG_1(this.swigCPtr, this, i, SWIGTYPE_p_unsigned_short.getCPtr(sWIGTYPE_p_unsigned_short));
    }

    @Override // com.google.googlex.gcam.RawReadView
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawWriteView(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.RawReadView
    protected void finalize() {
        delete();
    }

    public PackedReadWriteViewRaw10 packed10_write_view() {
        return new PackedReadWriteViewRaw10(GcamModuleJNI.RawWriteView_packed10_write_view(this.swigCPtr, this), false);
    }

    public PackedReadWriteViewRaw12 packed12_write_view() {
        return new PackedReadWriteViewRaw12(GcamModuleJNI.RawWriteView_packed12_write_view(this.swigCPtr, this), false);
    }

    public InterleavedWriteViewU16 unpacked_write_view() {
        return new InterleavedWriteViewU16(GcamModuleJNI.RawWriteView_unpacked_write_view(this.swigCPtr, this), false);
    }
}
