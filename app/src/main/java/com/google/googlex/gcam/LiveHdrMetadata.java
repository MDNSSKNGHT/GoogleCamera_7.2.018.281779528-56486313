package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LiveHdrMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public LiveHdrMetadata() {
        this(GcamModuleJNI.new_LiveHdrMetadata(), true);
    }

    public static long getCPtr(LiveHdrMetadata liveHdrMetadata) {
        if (liveHdrMetadata == null) {
            return 0L;
        }
        return liveHdrMetadata.swigCPtr;
    }

    public LiveHdrMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, int i) {
        return GcamModuleJNI.LiveHdrMetadata_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), i);
    }

    public boolean Equals(LiveHdrMetadata liveHdrMetadata) {
        return GcamModuleJNI.LiveHdrMetadata_Equals(this.swigCPtr, this, getCPtr(liveHdrMetadata), liveHdrMetadata);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.LiveHdrMetadata_SerializeToString(this.swigCPtr, this, str, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_LiveHdrMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getFiltered_motion_speed_pix_per_ms() {
        return GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_get(this.swigCPtr, this);
    }

    public float getFinal_long_tet() {
        return GcamModuleJNI.LiveHdrMetadata_final_long_tet_get(this.swigCPtr, this);
    }

    public float getFinal_short_tet() {
        return GcamModuleJNI.LiveHdrMetadata_final_short_tet_get(this.swigCPtr, this);
    }

    public float getGcam_ae_touch_weight_scale() {
        return GcamModuleJNI.LiveHdrMetadata_gcam_ae_touch_weight_scale_get(this.swigCPtr, this);
    }

    public float getIdeal_long_tet() {
        return GcamModuleJNI.LiveHdrMetadata_ideal_long_tet_get(this.swigCPtr, this);
    }

    public float getIdeal_short_tet() {
        return GcamModuleJNI.LiveHdrMetadata_ideal_short_tet_get(this.swigCPtr, this);
    }

    public float getLog_scene_brightness() {
        return GcamModuleJNI.LiveHdrMetadata_log_scene_brightness_get(this.swigCPtr, this);
    }

    public float getManual_ec_long() {
        return GcamModuleJNI.LiveHdrMetadata_manual_ec_long_get(this.swigCPtr, this);
    }

    public float getManual_ec_short() {
        return GcamModuleJNI.LiveHdrMetadata_manual_ec_short_get(this.swigCPtr, this);
    }

    public float getManual_long_tet_override() {
        return GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_get(this.swigCPtr, this);
    }

    public float getManual_short_tet_override() {
        return GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_get(this.swigCPtr, this);
    }

    public float getMax_hdr_ratio_override() {
        return GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_get(this.swigCPtr, this);
    }

    public float getMetering_interval_ms() {
        return GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_get(this.swigCPtr, this);
    }

    public float getMotion_magnitude_pix() {
        return GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_get(this.swigCPtr, this);
    }

    public float getPredicted_image_brightness() {
        return GcamModuleJNI.LiveHdrMetadata_predicted_image_brightness_get(this.swigCPtr, this);
    }

    public float getPure_fraction_of_pixels_from_long_exposure() {
        return GcamModuleJNI.LiveHdrMetadata_pure_fraction_of_pixels_from_long_exposure_get(this.swigCPtr, this);
    }

    public float getSafe_underexposure() {
        return GcamModuleJNI.LiveHdrMetadata_safe_underexposure_get(this.swigCPtr, this);
    }

    public float getViewfinder_long_tet() {
        return GcamModuleJNI.LiveHdrMetadata_viewfinder_long_tet_get(this.swigCPtr, this);
    }

    public float getViewfinder_short_tet() {
        return GcamModuleJNI.LiveHdrMetadata_viewfinder_short_tet_get(this.swigCPtr, this);
    }

    public float getWeighted_fraction_of_pixels_from_long_exposure() {
        return GcamModuleJNI.LiveHdrMetadata_weighted_fraction_of_pixels_from_long_exposure_get(this.swigCPtr, this);
    }

    public void setFiltered_motion_speed_pix_per_ms(float f) {
        GcamModuleJNI.LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(this.swigCPtr, this, f);
    }

    public void setFinal_long_tet(float f) {
        GcamModuleJNI.LiveHdrMetadata_final_long_tet_set(this.swigCPtr, this, f);
    }

    public void setFinal_short_tet(float f) {
        GcamModuleJNI.LiveHdrMetadata_final_short_tet_set(this.swigCPtr, this, f);
    }

    public void setGcam_ae_touch_weight_scale(float f) {
        GcamModuleJNI.LiveHdrMetadata_gcam_ae_touch_weight_scale_set(this.swigCPtr, this, f);
    }

    public void setIdeal_long_tet(float f) {
        GcamModuleJNI.LiveHdrMetadata_ideal_long_tet_set(this.swigCPtr, this, f);
    }

    public void setIdeal_short_tet(float f) {
        GcamModuleJNI.LiveHdrMetadata_ideal_short_tet_set(this.swigCPtr, this, f);
    }

    public void setLog_scene_brightness(float f) {
        GcamModuleJNI.LiveHdrMetadata_log_scene_brightness_set(this.swigCPtr, this, f);
    }

    public void setManual_ec_long(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_ec_long_set(this.swigCPtr, this, f);
    }

    public void setManual_ec_short(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_ec_short_set(this.swigCPtr, this, f);
    }

    public void setManual_long_tet_override(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_set(this.swigCPtr, this, f);
    }

    public void setManual_short_tet_override(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_set(this.swigCPtr, this, f);
    }

    public void setMax_hdr_ratio_override(float f) {
        GcamModuleJNI.LiveHdrMetadata_max_hdr_ratio_override_set(this.swigCPtr, this, f);
    }

    public void setMetering_interval_ms(float f) {
        GcamModuleJNI.LiveHdrMetadata_metering_interval_ms_set(this.swigCPtr, this, f);
    }

    public void setMotion_magnitude_pix(float f) {
        GcamModuleJNI.LiveHdrMetadata_motion_magnitude_pix_set(this.swigCPtr, this, f);
    }

    public void setPredicted_image_brightness(float f) {
        GcamModuleJNI.LiveHdrMetadata_predicted_image_brightness_set(this.swigCPtr, this, f);
    }

    public void setPure_fraction_of_pixels_from_long_exposure(float f) {
        GcamModuleJNI.LiveHdrMetadata_pure_fraction_of_pixels_from_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setSafe_underexposure(float f) {
        GcamModuleJNI.LiveHdrMetadata_safe_underexposure_set(this.swigCPtr, this, f);
    }

    public void setViewfinder_long_tet(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_long_tet_set(this.swigCPtr, this, f);
    }

    public void setViewfinder_short_tet(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_short_tet_set(this.swigCPtr, this, f);
    }

    public void setWeighted_fraction_of_pixels_from_long_exposure(float f) {
        GcamModuleJNI.LiveHdrMetadata_weighted_fraction_of_pixels_from_long_exposure_set(this.swigCPtr, this, f);
    }
}
