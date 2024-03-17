package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawSharpenParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Point {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public Point() {
            this(GcamModuleJNI.new_RawSharpenParams_Point(), true);
        }

        public static long getCPtr(Point point) {
            if (point == null) {
                return 0L;
            }
            return point.swigCPtr;
        }

        public Point(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_RawSharpenParams_Point(j);
                }
                this.swigCPtr = 0L;
            }
        }

        protected void finalize() {
            delete();
        }

        public float getX() {
            return GcamModuleJNI.RawSharpenParams_Point_x_get(this.swigCPtr, this);
        }

        public float getY() {
            return GcamModuleJNI.RawSharpenParams_Point_y_get(this.swigCPtr, this);
        }

        public void setX(float f) {
            GcamModuleJNI.RawSharpenParams_Point_x_set(this.swigCPtr, this, f);
        }

        public void setY(float f) {
            GcamModuleJNI.RawSharpenParams_Point_y_set(this.swigCPtr, this, f);
        }
    }

    public RawSharpenParams() {
        this(GcamModuleJNI.new_RawSharpenParams(), true);
    }

    public static long getCPtr(RawSharpenParams rawSharpenParams) {
        if (rawSharpenParams == null) {
            return 0L;
        }
        return rawSharpenParams.swigCPtr;
    }

    public RawSharpenParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawSharpenParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t getCurves() {
        long RawSharpenParams_curves_get = GcamModuleJNI.RawSharpenParams_curves_get(this.swigCPtr, this);
        if (RawSharpenParams_curves_get != 0) {
            return new SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t(RawSharpenParams_curves_get, false);
        }
        return null;
    }

    public void setCurves(SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t sWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t) {
        GcamModuleJNI.RawSharpenParams_curves_set(this.swigCPtr, this, SWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t.getCPtr(sWIGTYPE_p_std__arrayT_gcam__RawSharpenParams__Point_4_t));
    }
}
