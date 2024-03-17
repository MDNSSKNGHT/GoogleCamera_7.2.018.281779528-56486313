package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class WeightedNormalizedRectVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public WeightedNormalizedRectVector() {
        this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_0(), true);
    }

    public static long getCPtr(WeightedNormalizedRectVector weightedNormalizedRectVector) {
        if (weightedNormalizedRectVector == null) {
            return 0L;
        }
        return weightedNormalizedRectVector.swigCPtr;
    }

    public WeightedNormalizedRectVector(long j) {
        this(GcamModuleJNI.new_WeightedNormalizedRectVector__SWIG_1(j), true);
    }

    public WeightedNormalizedRectVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(WeightedNormalizedRect weightedNormalizedRect) {
        GcamModuleJNI.WeightedNormalizedRectVector_add(this.swigCPtr, this, WeightedNormalizedRect.getCPtr(weightedNormalizedRect), weightedNormalizedRect);
    }

    public long capacity() {
        return GcamModuleJNI.WeightedNormalizedRectVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.WeightedNormalizedRectVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_WeightedNormalizedRectVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public WeightedNormalizedRect get(int i) {
        return new WeightedNormalizedRect(GcamModuleJNI.WeightedNormalizedRectVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.WeightedNormalizedRectVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.WeightedNormalizedRectVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, WeightedNormalizedRect weightedNormalizedRect) {
        GcamModuleJNI.WeightedNormalizedRectVector_set(this.swigCPtr, this, i, WeightedNormalizedRect.getCPtr(weightedNormalizedRect), weightedNormalizedRect);
    }

    public long size() {
        return GcamModuleJNI.WeightedNormalizedRectVector_size(this.swigCPtr, this);
    }
}
