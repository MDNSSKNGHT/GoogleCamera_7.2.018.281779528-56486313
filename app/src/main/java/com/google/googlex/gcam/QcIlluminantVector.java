package com.google.googlex.gcam;

import com.google.googlex.gcam.QcColorCalibration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class QcIlluminantVector {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public QcIlluminantVector() {
        this(GcamModuleJNI.new_QcIlluminantVector__SWIG_0(), true);
    }

    public static long getCPtr(QcIlluminantVector qcIlluminantVector) {
        if (qcIlluminantVector == null) {
            return 0L;
        }
        return qcIlluminantVector.swigCPtr;
    }

    public QcIlluminantVector(long j) {
        this(GcamModuleJNI.new_QcIlluminantVector__SWIG_1(j), true);
    }

    public QcIlluminantVector(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void add(QcColorCalibration.IlluminantData illuminantData) {
        GcamModuleJNI.QcIlluminantVector_add(this.swigCPtr, this, QcColorCalibration.IlluminantData.getCPtr(illuminantData), illuminantData);
    }

    public long capacity() {
        return GcamModuleJNI.QcIlluminantVector_capacity(this.swigCPtr, this);
    }

    public void clear() {
        GcamModuleJNI.QcIlluminantVector_clear(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_QcIlluminantVector(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public QcColorCalibration.IlluminantData get(int i) {
        return new QcColorCalibration.IlluminantData(GcamModuleJNI.QcIlluminantVector_get(this.swigCPtr, this, i), false);
    }

    public boolean isEmpty() {
        return GcamModuleJNI.QcIlluminantVector_isEmpty(this.swigCPtr, this);
    }

    public void reserve(long j) {
        GcamModuleJNI.QcIlluminantVector_reserve(this.swigCPtr, this, j);
    }

    public void set(int i, QcColorCalibration.IlluminantData illuminantData) {
        GcamModuleJNI.QcIlluminantVector_set(this.swigCPtr, this, i, QcColorCalibration.IlluminantData.getCPtr(illuminantData), illuminantData);
    }

    public long size() {
        return GcamModuleJNI.QcIlluminantVector_size(this.swigCPtr, this);
    }
}
