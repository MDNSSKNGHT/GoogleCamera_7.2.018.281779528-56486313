package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Int64Vector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public Int64Vector() {
        this(GcamModuleJNI.new_Int64Vector__SWIG_0(), true);
    }

    public static long getCPtr(Int64Vector int64Vector) {
        if (int64Vector == null) {
            return 0L;
        }
        return int64Vector.swigCPtr;
    }

    public Int64Vector(long j) {
        this(GcamModuleJNI.new_Int64Vector__SWIG_1(j), true);
    }

    public Int64Vector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(long j) {
        GcamModuleJNI.Int64Vector_add(this.swigCPtr, this, j);
    }

    public long capacity() {
        return GcamModuleJNI.Int64Vector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.Int64Vector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_Int64Vector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public long get(int i) {
        return GcamModuleJNI.Int64Vector_get(this.swigCPtr, this, i);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.Int64Vector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.Int64Vector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, long j) {
        GcamModuleJNI.Int64Vector_set(this.swigCPtr, this, i, j);
    }

    public long size() {
        return GcamModuleJNI.Int64Vector_size(this.swigCPtr, this);
    }
}
