package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SecondOrderFilter {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public SecondOrderFilter() {
        this(GcamModuleJNI.new_SecondOrderFilter(), true);
    }

    public static long getCPtr(SecondOrderFilter secondOrderFilter) {
        if (secondOrderFilter == null) {
            return 0L;
        }
        return secondOrderFilter.swigCPtr;
    }

    public SecondOrderFilter(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_SecondOrderFilter(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getA1() {
        return GcamModuleJNI.SecondOrderFilter_a1_get(this.swigCPtr, this);
    }

    public float getA2() {
        return GcamModuleJNI.SecondOrderFilter_a2_get(this.swigCPtr, this);
    }

    public float getB0() {
        return GcamModuleJNI.SecondOrderFilter_b0_get(this.swigCPtr, this);
    }

    public float getB1() {
        return GcamModuleJNI.SecondOrderFilter_b1_get(this.swigCPtr, this);
    }

    public float getB2() {
        return GcamModuleJNI.SecondOrderFilter_b2_get(this.swigCPtr, this);
    }

    public void setA1(float f) {
        GcamModuleJNI.SecondOrderFilter_a1_set(this.swigCPtr, this, f);
    }

    public void setA2(float f) {
        GcamModuleJNI.SecondOrderFilter_a2_set(this.swigCPtr, this, f);
    }

    public void setB0(float f) {
        GcamModuleJNI.SecondOrderFilter_b0_set(this.swigCPtr, this, f);
    }

    public void setB1(float f) {
        GcamModuleJNI.SecondOrderFilter_b1_set(this.swigCPtr, this, f);
    }

    public void setB2(float f) {
        GcamModuleJNI.SecondOrderFilter_b2_set(this.swigCPtr, this, f);
    }
}
