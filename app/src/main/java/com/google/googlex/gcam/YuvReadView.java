package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class YuvReadView {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public YuvReadView() {
        this(GcamModuleJNI.new_YuvReadView__SWIG_2(), true);
    }

    public static long getCPtr(YuvReadView yuvReadView) {
        if (yuvReadView == null) {
            return 0L;
        }
        return yuvReadView.swigCPtr;
    }

    public YuvReadView(int i, int i2, int i3, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char, int i4, int i5, int i6, SWIGTYPE_p_unsigned_char sWIGTYPE_p_unsigned_char2, int i7) {
        this(GcamModuleJNI.new_YuvReadView__SWIG_1(i, i2, i3, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char), i4, i5, i6, SWIGTYPE_p_unsigned_char.getCPtr(sWIGTYPE_p_unsigned_char2), i7), true);
    }

    public YuvReadView(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public YuvReadView(YuvReadView yuvReadView) {
        this(GcamModuleJNI.new_YuvReadView__SWIG_0(getCPtr(yuvReadView), yuvReadView), true);
    }

    public boolean Empty() {
        return GcamModuleJNI.YuvReadView_Empty(this.swigCPtr, this);
    }

    public void FastCrop(int i, int i2, int i3, int i4) {
        GcamModuleJNI.YuvReadView_FastCrop(this.swigCPtr, this, i, i2, i3, i4);
    }

    public boolean IsOneLeanChunk() {
        return GcamModuleJNI.YuvReadView_IsOneLeanChunk(this.swigCPtr, this);
    }

    public InterleavedReadViewU8 chroma_read_view() {
        return new InterleavedReadViewU8(GcamModuleJNI.YuvReadView_chroma_read_view(this.swigCPtr, this), false);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_YuvReadView(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int height() {
        return GcamModuleJNI.YuvReadView_height(this.swigCPtr, this);
    }

    public InterleavedReadViewU8 luma_read_view() {
        return new InterleavedReadViewU8(GcamModuleJNI.YuvReadView_luma_read_view(this.swigCPtr, this), false);
    }

    public short uv_at(int i, int i2, int i3) {
        return GcamModuleJNI.YuvReadView_uv_at(this.swigCPtr, this, i, i2, i3);
    }

    public int width() {
        return GcamModuleJNI.YuvReadView_width(this.swigCPtr, this);
    }

    public short y_at(int i, int i2) {
        return GcamModuleJNI.YuvReadView_y_at(this.swigCPtr, this, i, i2);
    }

    public int yuv_format() {
        return GcamModuleJNI.YuvReadView_yuv_format(this.swigCPtr, this);
    }
}
