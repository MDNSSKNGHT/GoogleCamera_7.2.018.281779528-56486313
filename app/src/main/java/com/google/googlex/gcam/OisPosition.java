package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OisPosition {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public OisPosition() {
        this(GcamModuleJNI.new_OisPosition(), true);
    }

    public static long getCPtr(OisPosition oisPosition) {
        if (oisPosition == null) {
            return 0L;
        }
        return oisPosition.swigCPtr;
    }

    public OisPosition(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(OisPosition oisPosition) {
        return GcamModuleJNI.OisPosition_Equals(this.swigCPtr, this, getCPtr(oisPosition), oisPosition);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_OisPosition(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getShift_pixel_x() {
        return GcamModuleJNI.OisPosition_shift_pixel_x_get(this.swigCPtr, this);
    }

    public float getShift_pixel_y() {
        return GcamModuleJNI.OisPosition_shift_pixel_y_get(this.swigCPtr, this);
    }

    public long getTimestamp_ns() {
        return GcamModuleJNI.OisPosition_timestamp_ns_get(this.swigCPtr, this);
    }

    public void setShift_pixel_x(float f) {
        GcamModuleJNI.OisPosition_shift_pixel_x_set(this.swigCPtr, this, f);
    }

    public void setShift_pixel_y(float f) {
        GcamModuleJNI.OisPosition_shift_pixel_y_set(this.swigCPtr, this, f);
    }

    public void setTimestamp_ns(long j) {
        GcamModuleJNI.OisPosition_timestamp_ns_set(this.swigCPtr, this, j);
    }
}
