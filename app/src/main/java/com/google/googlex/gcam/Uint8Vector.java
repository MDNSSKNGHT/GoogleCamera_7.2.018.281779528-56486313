package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Uint8Vector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public Uint8Vector() {
        this(GcamModuleJNI.new_Uint8Vector__SWIG_0(), true);
    }

    public static long getCPtr(Uint8Vector uint8Vector) {
        if (uint8Vector == null) {
            return 0L;
        }
        return uint8Vector.swigCPtr;
    }

    public Uint8Vector(long j) {
        this(GcamModuleJNI.new_Uint8Vector__SWIG_1(j), true);
    }

    public Uint8Vector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(short s) {
        GcamModuleJNI.Uint8Vector_add(this.swigCPtr, this, s);
    }

    public long capacity() {
        return GcamModuleJNI.Uint8Vector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.Uint8Vector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_Uint8Vector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public short get(int i) {
        return GcamModuleJNI.Uint8Vector_get(this.swigCPtr, this, i);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.Uint8Vector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.Uint8Vector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, short s) {
        GcamModuleJNI.Uint8Vector_set(this.swigCPtr, this, i, s);
    }

    public long size() {
        return GcamModuleJNI.Uint8Vector_size(this.swigCPtr, this);
    }
}
