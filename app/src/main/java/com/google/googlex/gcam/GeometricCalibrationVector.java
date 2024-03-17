package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GeometricCalibrationVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GeometricCalibrationVector() {
        this(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_0(), true);
    }

    public static long getCPtr(GeometricCalibrationVector geometricCalibrationVector) {
        if (geometricCalibrationVector == null) {
            return 0L;
        }
        return geometricCalibrationVector.swigCPtr;
    }

    public GeometricCalibrationVector(long j) {
        this(GcamModuleJNI.new_GeometricCalibrationVector__SWIG_1(j), true);
    }

    public GeometricCalibrationVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(GeometricCalibration geometricCalibration) {
        GcamModuleJNI.GeometricCalibrationVector_add(this.swigCPtr, this, GeometricCalibration.getCPtr(geometricCalibration), geometricCalibration);
    }

    public long capacity() {
        return GcamModuleJNI.GeometricCalibrationVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.GeometricCalibrationVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GeometricCalibrationVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public GeometricCalibration get(int i) {
        return new GeometricCalibration(GcamModuleJNI.GeometricCalibrationVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.GeometricCalibrationVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.GeometricCalibrationVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, GeometricCalibration geometricCalibration) {
        GcamModuleJNI.GeometricCalibrationVector_set(this.swigCPtr, this, i, GeometricCalibration.getCPtr(geometricCalibration), geometricCalibration);
    }

    public long size() {
        return GcamModuleJNI.GeometricCalibrationVector_size(this.swigCPtr, this);
    }
}
