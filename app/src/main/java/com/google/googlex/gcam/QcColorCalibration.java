package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class QcColorCalibration {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class IlluminantData {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public IlluminantData() {
            this(GcamModuleJNI.new_QcColorCalibration_IlluminantData(), true);
        }

        public static long getCPtr(IlluminantData illuminantData) {
            if (illuminantData == null) {
                return 0L;
            }
            return illuminantData.swigCPtr;
        }

        public IlluminantData(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_QcColorCalibration_IlluminantData(j);
                }
                this.swigCPtr = 0L;
            }
        }

        protected void finalize() {
            delete();
        }

        public float getBg_ratio() {
            return GcamModuleJNI.QcColorCalibration_IlluminantData_bg_ratio_get(this.swigCPtr, this);
        }

        public float getRg_ratio() {
            return GcamModuleJNI.QcColorCalibration_IlluminantData_rg_ratio_get(this.swigCPtr, this);
        }

        public void setBg_ratio(float f) {
            GcamModuleJNI.QcColorCalibration_IlluminantData_bg_ratio_set(this.swigCPtr, this, f);
        }

        public void setRg_ratio(float f) {
            GcamModuleJNI.QcColorCalibration_IlluminantData_rg_ratio_set(this.swigCPtr, this, f);
        }
    }

    public QcColorCalibration() {
        this(GcamModuleJNI.new_QcColorCalibration(), true);
    }

    public static long getCPtr(QcColorCalibration qcColorCalibration) {
        if (qcColorCalibration == null) {
            return 0L;
        }
        return qcColorCalibration.swigCPtr;
    }

    public QcColorCalibration(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.QcColorCalibration_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(QcColorCalibration qcColorCalibration) {
        return GcamModuleJNI.QcColorCalibration_Equals(this.swigCPtr, this, getCPtr(qcColorCalibration), qcColorCalibration);
    }

    public boolean IsNull() {
        return GcamModuleJNI.QcColorCalibration_IsNull(this.swigCPtr, this);
    }

    public boolean IsValid() {
        return GcamModuleJNI.QcColorCalibration_IsValid(this.swigCPtr, this);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.QcColorCalibration_SerializeToString__SWIG_1(this.swigCPtr, this, str, i);
    }

    public void SerializeToString(String str, int i, boolean z) {
        GcamModuleJNI.QcColorCalibration_SerializeToString__SWIG_0(this.swigCPtr, this, str, i, z);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_QcColorCalibration(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getGrgb_ratio() {
        return GcamModuleJNI.QcColorCalibration_grgb_ratio_get(this.swigCPtr, this);
    }

    public QcIlluminantVector getIlluminant_data() {
        long QcColorCalibration_illuminant_data_get = GcamModuleJNI.QcColorCalibration_illuminant_data_get(this.swigCPtr, this);
        if (QcColorCalibration_illuminant_data_get != 0) {
            return new QcIlluminantVector(QcColorCalibration_illuminant_data_get, false);
        }
        return null;
    }

    public void setGrgb_ratio(float f) {
        GcamModuleJNI.QcColorCalibration_grgb_ratio_set(this.swigCPtr, this, f);
    }

    public void setIlluminant_data(QcIlluminantVector qcIlluminantVector) {
        GcamModuleJNI.QcColorCalibration_illuminant_data_set(this.swigCPtr, this, QcIlluminantVector.getCPtr(qcIlluminantVector), qcIlluminantVector);
    }
}
