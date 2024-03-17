package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstSampleIteratorPackedRaw10 {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ConstSampleIteratorPackedRaw10(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10) {
        if (constSampleIteratorPackedRaw10 == null) {
            return 0L;
        }
        return constSampleIteratorPackedRaw10.swigCPtr;
    }

    public ConstSampleIteratorPackedRaw10(ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw10__SWIG_1(getCPtr(constSampleIteratorPackedRaw10), constSampleIteratorPackedRaw10), true);
    }

    public ConstSampleIteratorPackedRaw10(PackedReadViewRaw10 packedReadViewRaw10) {
        this(GcamModuleJNI.new_ConstSampleIteratorPackedRaw10__SWIG_0(PackedReadViewRaw10.getCPtr(packedReadViewRaw10), packedReadViewRaw10), true);
    }

    public boolean AtEnd() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_AtEnd(this.swigCPtr, this);
    }

    public void NextSample() {
        GcamModuleJNI.ConstSampleIteratorPackedRaw10_NextSample(this.swigCPtr, this);
    }

    public int __ref__() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10___ref__(this.swigCPtr, this);
    }

    public int c() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_c(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ConstSampleIteratorPackedRaw10(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int x() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_x(this.swigCPtr, this);
    }

    public int y() {
        return GcamModuleJNI.ConstSampleIteratorPackedRaw10_y(this.swigCPtr, this);
    }
}
