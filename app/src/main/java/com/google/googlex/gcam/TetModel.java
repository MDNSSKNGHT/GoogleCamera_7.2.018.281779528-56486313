package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TetModel {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public TetModel() {
        this(GcamModuleJNI.new_TetModel(), true);
    }

    public static long getCPtr(TetModel tetModel) {
        if (tetModel == null) {
            return 0L;
        }
        return tetModel.swigCPtr;
    }

    public TetModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void AddTetWaypoint(float f, float f2) {
        GcamModuleJNI.TetModel_AddTetWaypoint__SWIG_0(this.swigCPtr, this, f, f2);
    }

    public void AddTetWaypoint(TetWaypoint tetWaypoint) {
        GcamModuleJNI.TetModel_AddTetWaypoint__SWIG_1(this.swigCPtr, this, TetWaypoint.getCPtr(tetWaypoint), tetWaypoint);
    }

    public boolean Check() {
        return GcamModuleJNI.TetModel_Check(this.swigCPtr, this);
    }

    public void Clear() {
        GcamModuleJNI.TetModel_Clear(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.TetModel_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(TetModel tetModel) {
        return GcamModuleJNI.TetModel_Equals(this.swigCPtr, this, getCPtr(tetModel), tetModel);
    }

    public static TetWaypoint MaxTetWaypoint(float f, float f2) {
        return new TetWaypoint(GcamModuleJNI.TetModel_MaxTetWaypoint(f, f2), true);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.TetModel_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.TetModel_SerializeToString(this.swigCPtr, this, str, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_TetModel(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getCount() {
        return GcamModuleJNI.TetModel_count_get(this.swigCPtr, this);
    }

    public TetWaypoint getModel() {
        long TetModel_model_get = GcamModuleJNI.TetModel_model_get(this.swigCPtr, this);
        if (TetModel_model_get != 0) {
            return new TetWaypoint(TetModel_model_get, false);
        }
        return null;
    }

    public void setCount(int i) {
        GcamModuleJNI.TetModel_count_set(this.swigCPtr, this, i);
    }

    public void setModel(TetWaypoint tetWaypoint) {
        GcamModuleJNI.TetModel_model_set(this.swigCPtr, this, TetWaypoint.getCPtr(tetWaypoint), tetWaypoint);
    }
}
