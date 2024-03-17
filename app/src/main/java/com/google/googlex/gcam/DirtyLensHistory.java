package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DirtyLensHistory {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public DirtyLensHistory() {
        this(GcamModuleJNI.new_DirtyLensHistory(), true);
    }

    public static long getCPtr(DirtyLensHistory dirtyLensHistory) {
        if (dirtyLensHistory == null) {
            return 0L;
        }
        return dirtyLensHistory.swigCPtr;
    }

    public DirtyLensHistory(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean AddRawScore(float f) {
        return GcamModuleJNI.DirtyLensHistory_AddRawScore(this.swigCPtr, this, f);
    }

    public void Reset() {
        GcamModuleJNI.DirtyLensHistory_Reset(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DirtyLensHistory(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getFrame_influence_decay_rate_() {
        return GcamModuleJNI.DirtyLensHistory_frame_influence_decay_rate__get(this.swigCPtr, this);
    }

    public float getInitial_score_() {
        return GcamModuleJNI.DirtyLensHistory_initial_score__get(this.swigCPtr, this);
    }

    public int getMax_photo_count_() {
        return GcamModuleJNI.DirtyLensHistory_max_photo_count__get(this.swigCPtr, this);
    }

    public FloatDeque getRaw_score_history_() {
        long DirtyLensHistory_raw_score_history__get = GcamModuleJNI.DirtyLensHistory_raw_score_history__get(this.swigCPtr, this);
        if (DirtyLensHistory_raw_score_history__get != 0) {
            return new FloatDeque(DirtyLensHistory_raw_score_history__get, false);
        }
        return null;
    }

    public float getWeighted_score_threshold_() {
        return GcamModuleJNI.DirtyLensHistory_weighted_score_threshold__get(this.swigCPtr, this);
    }

    public void setFrame_influence_decay_rate_(float f) {
        GcamModuleJNI.DirtyLensHistory_frame_influence_decay_rate__set(this.swigCPtr, this, f);
    }

    public void setInitial_score_(float f) {
        GcamModuleJNI.DirtyLensHistory_initial_score__set(this.swigCPtr, this, f);
    }

    public void setMax_photo_count_(int i) {
        GcamModuleJNI.DirtyLensHistory_max_photo_count__set(this.swigCPtr, this, i);
    }

    public void setRaw_score_history_(FloatDeque floatDeque) {
        GcamModuleJNI.DirtyLensHistory_raw_score_history__set(this.swigCPtr, this, FloatDeque.getCPtr(floatDeque), floatDeque);
    }

    public void setWeighted_score_threshold_(float f) {
        GcamModuleJNI.DirtyLensHistory_weighted_score_threshold__set(this.swigCPtr, this, f);
    }
}
