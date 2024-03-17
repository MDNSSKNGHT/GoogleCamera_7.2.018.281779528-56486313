package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class WeightedPixelRectVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public WeightedPixelRectVector() {
        this(GcamModuleJNI.new_WeightedPixelRectVector__SWIG_0(), true);
    }

    public static long getCPtr(WeightedPixelRectVector weightedPixelRectVector) {
        if (weightedPixelRectVector == null) {
            return 0L;
        }
        return weightedPixelRectVector.swigCPtr;
    }

    public WeightedPixelRectVector(long j) {
        this(GcamModuleJNI.new_WeightedPixelRectVector__SWIG_1(j), true);
    }

    public WeightedPixelRectVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(WeightedPixelRect weightedPixelRect) {
        GcamModuleJNI.WeightedPixelRectVector_add(this.swigCPtr, this, WeightedPixelRect.getCPtr(weightedPixelRect), weightedPixelRect);
    }

    public long capacity() {
        return GcamModuleJNI.WeightedPixelRectVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.WeightedPixelRectVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_WeightedPixelRectVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public WeightedPixelRect get(int i) {
        return new WeightedPixelRect(GcamModuleJNI.WeightedPixelRectVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.WeightedPixelRectVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.WeightedPixelRectVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, WeightedPixelRect weightedPixelRect) {
        GcamModuleJNI.WeightedPixelRectVector_set(this.swigCPtr, this, i, WeightedPixelRect.getCPtr(weightedPixelRect), weightedPixelRect);
    }

    public long size() {
        return GcamModuleJNI.WeightedPixelRectVector_size(this.swigCPtr, this);
    }
}
