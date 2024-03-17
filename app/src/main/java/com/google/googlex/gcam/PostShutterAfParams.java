package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PostShutterAfParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PostShutterAfParams() {
        this(GcamModuleJNI.new_PostShutterAfParams(), true);
    }

    public static long getCPtr(PostShutterAfParams postShutterAfParams) {
        if (postShutterAfParams == null) {
            return 0L;
        }
        return postShutterAfParams.swigCPtr;
    }

    public PostShutterAfParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PostShutterAfParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getLens_movement_exposure_time_ms() {
        return GcamModuleJNI.PostShutterAfParams_lens_movement_exposure_time_ms_get(this.swigCPtr, this);
    }

    public float getLog_scene_brightness_threshold() {
        return GcamModuleJNI.PostShutterAfParams_log_scene_brightness_threshold_get(this.swigCPtr, this);
    }

    public float getMax_handheld_exposure_time_ms() {
        return GcamModuleJNI.PostShutterAfParams_max_handheld_exposure_time_ms_get(this.swigCPtr, this);
    }

    public float getMax_pd_motion_blur_pix() {
        return GcamModuleJNI.PostShutterAfParams_max_pd_motion_blur_pix_get(this.swigCPtr, this);
    }

    public float getMax_tripod_exposure_time_ms() {
        return GcamModuleJNI.PostShutterAfParams_max_tripod_exposure_time_ms_get(this.swigCPtr, this);
    }

    public void setLens_movement_exposure_time_ms(float f) {
        GcamModuleJNI.PostShutterAfParams_lens_movement_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setLog_scene_brightness_threshold(float f) {
        GcamModuleJNI.PostShutterAfParams_log_scene_brightness_threshold_set(this.swigCPtr, this, f);
    }

    public void setMax_handheld_exposure_time_ms(float f) {
        GcamModuleJNI.PostShutterAfParams_max_handheld_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setMax_pd_motion_blur_pix(float f) {
        GcamModuleJNI.PostShutterAfParams_max_pd_motion_blur_pix_set(this.swigCPtr, this, f);
    }

    public void setMax_tripod_exposure_time_ms(float f) {
        GcamModuleJNI.PostShutterAfParams_max_tripod_exposure_time_ms_set(this.swigCPtr, this, f);
    }
}
