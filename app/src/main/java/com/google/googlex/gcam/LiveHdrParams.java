package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LiveHdrParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public LiveHdrParams() {
        this(GcamModuleJNI.new_LiveHdrParams(), true);
    }

    public static long getCPtr(LiveHdrParams liveHdrParams) {
        if (liveHdrParams == null) {
            return 0L;
        }
        return liveHdrParams.swigCPtr;
    }

    public LiveHdrParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_LiveHdrParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getAe_stats_width() {
        return GcamModuleJNI.LiveHdrParams_ae_stats_width_get(this.swigCPtr, this);
    }

    public FloatSmoothKeyValueMap getLowest_trustable_motion_per_log_sb() {
        long LiveHdrParams_lowest_trustable_motion_per_log_sb_get = GcamModuleJNI.LiveHdrParams_lowest_trustable_motion_per_log_sb_get(this.swigCPtr, this);
        if (LiveHdrParams_lowest_trustable_motion_per_log_sb_get != 0) {
            return new FloatSmoothKeyValueMap(LiveHdrParams_lowest_trustable_motion_per_log_sb_get, false);
        }
        return null;
    }

    public void setAe_stats_width(int i) {
        GcamModuleJNI.LiveHdrParams_ae_stats_width_set(this.swigCPtr, this, i);
    }

    public void setLowest_trustable_motion_per_log_sb(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.LiveHdrParams_lowest_trustable_motion_per_log_sb_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }
}
