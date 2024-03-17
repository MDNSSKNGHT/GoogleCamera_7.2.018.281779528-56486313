package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawMergeParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawMergeParams() {
        this(GcamModuleJNI.new_RawMergeParams(), true);
    }

    public static long getCPtr(RawMergeParams rawMergeParams) {
        if (rawMergeParams == null) {
            return 0L;
        }
        return rawMergeParams.swigCPtr;
    }

    public RawMergeParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawMergeParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t getAlign_tile_size() {
        long RawMergeParams_align_tile_size_get = GcamModuleJNI.RawMergeParams_align_tile_size_get(this.swigCPtr, this);
        if (RawMergeParams_align_tile_size_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t(RawMergeParams_align_tile_size_get, false);
        }
        return null;
    }

    public float getMerge_mismatch_noise_var_scale() {
        return GcamModuleJNI.RawMergeParams_merge_mismatch_noise_var_scale_get(this.swigCPtr, this);
    }

    public float getMerge_mismatch_thr_high() {
        return GcamModuleJNI.RawMergeParams_merge_mismatch_thr_high_get(this.swigCPtr, this);
    }

    public float getMerge_mismatch_thr_low() {
        return GcamModuleJNI.RawMergeParams_merge_mismatch_thr_low_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t getMerge_tile_size() {
        long RawMergeParams_merge_tile_size_get = GcamModuleJNI.RawMergeParams_merge_tile_size_get(this.swigCPtr, this);
        if (RawMergeParams_merge_tile_size_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t(RawMergeParams_merge_tile_size_get, false);
        }
        return null;
    }

    public float getMin_temporal_strength() {
        return GcamModuleJNI.RawMergeParams_min_temporal_strength_get(this.swigCPtr, this);
    }

    public FloatSmoothKeyValueMap getSpatial_strength() {
        long RawMergeParams_spatial_strength_get = GcamModuleJNI.RawMergeParams_spatial_strength_get(this.swigCPtr, this);
        if (RawMergeParams_spatial_strength_get != 0) {
            return new FloatSmoothKeyValueMap(RawMergeParams_spatial_strength_get, false);
        }
        return null;
    }

    public FloatSmoothKeyValueMap getTemporal_strength() {
        long RawMergeParams_temporal_strength_get = GcamModuleJNI.RawMergeParams_temporal_strength_get(this.swigCPtr, this);
        if (RawMergeParams_temporal_strength_get != 0) {
            return new FloatSmoothKeyValueMap(RawMergeParams_temporal_strength_get, false);
        }
        return null;
    }

    public boolean getUse_equal_channel_weights() {
        return GcamModuleJNI.RawMergeParams_use_equal_channel_weights_get(this.swigCPtr, this);
    }

    public void setAlign_tile_size(SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t) {
        GcamModuleJNI.RawMergeParams_align_tile_size_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t));
    }

    public void setMerge_mismatch_noise_var_scale(float f) {
        GcamModuleJNI.RawMergeParams_merge_mismatch_noise_var_scale_set(this.swigCPtr, this, f);
    }

    public void setMerge_mismatch_thr_high(float f) {
        GcamModuleJNI.RawMergeParams_merge_mismatch_thr_high_set(this.swigCPtr, this, f);
    }

    public void setMerge_mismatch_thr_low(float f) {
        GcamModuleJNI.RawMergeParams_merge_mismatch_thr_low_set(this.swigCPtr, this, f);
    }

    public void setMerge_tile_size(SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t) {
        GcamModuleJNI.RawMergeParams_merge_tile_size_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_int_t));
    }

    public void setMin_temporal_strength(float f) {
        GcamModuleJNI.RawMergeParams_min_temporal_strength_set(this.swigCPtr, this, f);
    }

    public void setSpatial_strength(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawMergeParams_spatial_strength_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setTemporal_strength(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawMergeParams_temporal_strength_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setUse_equal_channel_weights(boolean z) {
        GcamModuleJNI.RawMergeParams_use_equal_channel_weights_set(this.swigCPtr, this, z);
    }
}
