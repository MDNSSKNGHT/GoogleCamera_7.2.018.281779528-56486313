package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TetWaypoint {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public TetWaypoint() {
        this(GcamModuleJNI.new_TetWaypoint(), true);
    }

    public static long getCPtr(TetWaypoint tetWaypoint) {
        if (tetWaypoint == null) {
            return 0L;
        }
        return tetWaypoint.swigCPtr;
    }

    public TetWaypoint(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.TetWaypoint_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(TetWaypoint tetWaypoint) {
        return GcamModuleJNI.TetWaypoint_Equals(this.swigCPtr, this, getCPtr(tetWaypoint), tetWaypoint);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.TetWaypoint_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.TetWaypoint_SerializeToString(this.swigCPtr, this, str, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_TetWaypoint(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getExposure_time_ms() {
        return GcamModuleJNI.TetWaypoint_exposure_time_ms_get(this.swigCPtr, this);
    }

    public float getOverall_gain() {
        return GcamModuleJNI.TetWaypoint_overall_gain_get(this.swigCPtr, this);
    }

    public void setExposure_time_ms(float f) {
        GcamModuleJNI.TetWaypoint_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setOverall_gain(float f) {
        GcamModuleJNI.TetWaypoint_overall_gain_set(this.swigCPtr, this, f);
    }
}
