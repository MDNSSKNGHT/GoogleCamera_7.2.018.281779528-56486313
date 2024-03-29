package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FloatVector() {
        this(GcamModuleJNI.new_FloatVector__SWIG_0(), true);
    }

    public static long getCPtr(FloatVector floatVector) {
        if (floatVector == null) {
            return 0L;
        }
        return floatVector.swigCPtr;
    }

    public FloatVector(long j) {
        this(GcamModuleJNI.new_FloatVector__SWIG_1(j), true);
    }

    public FloatVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(float f) {
        GcamModuleJNI.FloatVector_add(this.swigCPtr, this, f);
    }

    public long capacity() {
        return GcamModuleJNI.FloatVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.FloatVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FloatVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float get(int i) {
        return GcamModuleJNI.FloatVector_get(this.swigCPtr, this, i);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.FloatVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.FloatVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, float f) {
        GcamModuleJNI.FloatVector_set(this.swigCPtr, this, i, f);
    }

    public long size() {
        return GcamModuleJNI.FloatVector_size(this.swigCPtr, this);
    }
}
