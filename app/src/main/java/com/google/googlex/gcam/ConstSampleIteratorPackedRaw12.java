package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstSampleIteratorPackedRaw12 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ConstSampleIteratorPackedRaw12(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12) {
        if (constSampleIteratorPackedRaw12 == null) {
            return 0L;
        }
        return constSampleIteratorPackedRaw12.swigCPtr;
    }

    public ConstSampleIteratorPackedRaw12(ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw12__SWIG_1(getCPtr(constSampleIteratorPackedRaw12), constSampleIteratorPackedRaw12), true);
    }

    public ConstSampleIteratorPackedRaw12(PackedReadViewRaw12 packedReadViewRaw12) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw12__SWIG_0(PackedReadViewRaw12.getCPtr(packedReadViewRaw12), packedReadViewRaw12), true);
    }

    public boolean AtEnd() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_AtEnd(this.swigCPtr, this);
    }

    public void NextSample() {
        GcamModuleJNI.ConstSampleIteratorPackedRaw12_NextSample(this.swigCPtr, this);
    }

    public int __ref__() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12___ref__(this.swigCPtr, this);
    }

    public int c() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_c(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ConstSampleIteratorPackedRaw12(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int x() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_x(this.swigCPtr, this);
    }

    public int y() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw12_y(this.swigCPtr, this);
    }
}
