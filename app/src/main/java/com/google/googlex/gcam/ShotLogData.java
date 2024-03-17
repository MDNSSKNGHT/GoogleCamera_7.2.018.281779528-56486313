package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShotLogData {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ShotLogData() {
        this(GcamModuleJNI.new_ShotLogData(), true);
    }

    public static long getCPtr(ShotLogData shotLogData) {
        if (shotLogData == null) {
            return 0L;
        }
        return shotLogData.swigCPtr;
    }

    public ShotLogData(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Check() {
        return GcamModuleJNI.ShotLogData_Check(this.swigCPtr, this);
    }

    public void Print(int i) {
        GcamModuleJNI.ShotLogData_Print(this.swigCPtr, this, i);
    }

    public void SerializeToString(String str) {
        GcamModuleJNI.ShotLogData_SerializeToString(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ShotLogData(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getAborted() {
        return GcamModuleJNI.ShotLogData_aborted_get(this.swigCPtr, this);
    }

    public float getActual_range_compression() {
        return GcamModuleJNI.ShotLogData_actual_range_compression_get(this.swigCPtr, this);
    }

    public float getAe_confidence_long_exposure() {
        return GcamModuleJNI.ShotLogData_ae_confidence_long_exposure_get(this.swigCPtr, this);
    }

    public float getAe_confidence_short_exposure() {
        return GcamModuleJNI.ShotLogData_ae_confidence_short_exposure_get(this.swigCPtr, this);
    }

    public float getAe_confidence_single_exposure() {
        return GcamModuleJNI.ShotLogData_ae_confidence_single_exposure_get(this.swigCPtr, this);
    }

    public float getAngular_speed_rad_per_sec() {
        return GcamModuleJNI.ShotLogData_angular_speed_rad_per_sec_get(this.swigCPtr, this);
    }

    public int getBase_frame_index() {
        return GcamModuleJNI.ShotLogData_base_frame_index_get(this.swigCPtr, this);
    }

    public float getBase_frame_snr() {
        return GcamModuleJNI.ShotLogData_base_frame_snr_get(this.swigCPtr, this);
    }

    public int getBase_frame_temporal_binning_factor() {
        return GcamModuleJNI.ShotLogData_base_frame_temporal_binning_factor_get(this.swigCPtr, this);
    }

    public float getCapture_time() {
        return GcamModuleJNI.ShotLogData_capture_time_get(this.swigCPtr, this);
    }

    public float getCpu_usage_factor() {
        return GcamModuleJNI.ShotLogData_cpu_usage_factor_get(this.swigCPtr, this);
    }

    public int getExecuted_finish_on() {
        return GcamModuleJNI.ShotLogData_executed_finish_on_get(this.swigCPtr, this);
    }

    public float getFinal_image_callback_time() {
        return GcamModuleJNI.ShotLogData_final_image_callback_time_get(this.swigCPtr, this);
    }

    public FloatVector getFinal_payload_frame_sharpness() {
        long ShotLogData_final_payload_frame_sharpness_get = GcamModuleJNI.ShotLogData_final_payload_frame_sharpness_get(this.swigCPtr, this);
        if (ShotLogData_final_payload_frame_sharpness_get != 0) {
            return new FloatVector(ShotLogData_final_payload_frame_sharpness_get, false);
        }
        return null;
    }

    public float getFinish_process_time() {
        return GcamModuleJNI.ShotLogData_finish_process_time_get(this.swigCPtr, this);
    }

    public int getHot_pixels_in_base_frame() {
        return GcamModuleJNI.ShotLogData_hot_pixels_in_base_frame_get(this.swigCPtr, this);
    }

    public int getHot_pixels_in_total() {
        return GcamModuleJNI.ShotLogData_hot_pixels_in_total_get(this.swigCPtr, this);
    }

    public float getIdeal_range_compression() {
        return GcamModuleJNI.ShotLogData_ideal_range_compression_get(this.swigCPtr, this);
    }

    public float getJpeg_callback_time() {
        return GcamModuleJNI.ShotLogData_jpeg_callback_time_get(this.swigCPtr, this);
    }

    public float getJpeg_encode_time() {
        return GcamModuleJNI.ShotLogData_jpeg_encode_time_get(this.swigCPtr, this);
    }

    public float getLog_scene_brightness() {
        return GcamModuleJNI.ShotLogData_log_scene_brightness_get(this.swigCPtr, this);
    }

    public float getLong_exp_adjustment_factor() {
        return GcamModuleJNI.ShotLogData_long_exp_adjustment_factor_get(this.swigCPtr, this);
    }

    public float getMax_exposure_time_ms() {
        return GcamModuleJNI.ShotLogData_max_exposure_time_ms_get(this.swigCPtr, this);
    }

    public float getMerge_process_time() {
        return GcamModuleJNI.ShotLogData_merge_process_time_get(this.swigCPtr, this);
    }

    public int getMerged_frame_count() {
        return GcamModuleJNI.ShotLogData_merged_frame_count_get(this.swigCPtr, this);
    }

    public float getMerged_raw_callback_time() {
        return GcamModuleJNI.ShotLogData_merged_raw_callback_time_get(this.swigCPtr, this);
    }

    public int getMetering_frame_count() {
        return GcamModuleJNI.ShotLogData_metering_frame_count_get(this.swigCPtr, this);
    }

    public int getNumber_gyro_samples_used_for_metering() {
        return GcamModuleJNI.ShotLogData_number_gyro_samples_used_for_metering_get(this.swigCPtr, this);
    }

    public int getOriginal_payload_frame_count() {
        return GcamModuleJNI.ShotLogData_original_payload_frame_count_get(this.swigCPtr, this);
    }

    public float getPayload_focus_distance_diopters() {
        return GcamModuleJNI.ShotLogData_payload_focus_distance_diopters_get(this.swigCPtr, this);
    }

    public FloatVector getPayload_frame_scene_motion_pix_per_ms() {
        long ShotLogData_payload_frame_scene_motion_pix_per_ms_get = GcamModuleJNI.ShotLogData_payload_frame_scene_motion_pix_per_ms_get(this.swigCPtr, this);
        if (ShotLogData_payload_frame_scene_motion_pix_per_ms_get != 0) {
            return new FloatVector(ShotLogData_payload_frame_scene_motion_pix_per_ms_get, false);
        }
        return null;
    }

    public float getPercentage_valid_gyro_samples_used_for_metering() {
        return GcamModuleJNI.ShotLogData_percentage_valid_gyro_samples_used_for_metering_get(this.swigCPtr, this);
    }

    public float getPercentage_valid_motion_samples_in_10_samples() {
        return GcamModuleJNI.ShotLogData_percentage_valid_motion_samples_in_10_samples_get(this.swigCPtr, this);
    }

    public float getPercentage_valid_motion_samples_in_20_samples() {
        return GcamModuleJNI.ShotLogData_percentage_valid_motion_samples_in_20_samples_get(this.swigCPtr, this);
    }

    public float getPostview_callback_time() {
        return GcamModuleJNI.ShotLogData_postview_callback_time_get(this.swigCPtr, this);
    }

    public float getPreview_focus_distance_diopters() {
        return GcamModuleJNI.ShotLogData_preview_focus_distance_diopters_get(this.swigCPtr, this);
    }

    public int getPsaf_frame_count() {
        return GcamModuleJNI.ShotLogData_psaf_frame_count_get(this.swigCPtr, this);
    }

    public float getPure_fraction_of_pixels_from_long_exposure() {
        return GcamModuleJNI.ShotLogData_pure_fraction_of_pixels_from_long_exposure_get(this.swigCPtr, this);
    }

    public float getScene_motion_10_sample_std_pix_per_ms() {
        return GcamModuleJNI.ShotLogData_scene_motion_10_sample_std_pix_per_ms_get(this.swigCPtr, this);
    }

    public float getScene_motion_20_sample_std_pix_per_ms() {
        return GcamModuleJNI.ShotLogData_scene_motion_20_sample_std_pix_per_ms_get(this.swigCPtr, this);
    }

    public float getScene_motion_pix_per_ms() {
        return GcamModuleJNI.ShotLogData_scene_motion_pix_per_ms_get(this.swigCPtr, this);
    }

    public float getShort_exp_adjustment_factor() {
        return GcamModuleJNI.ShotLogData_short_exp_adjustment_factor_get(this.swigCPtr, this);
    }

    public float getSky_darkening_strength() {
        return GcamModuleJNI.ShotLogData_sky_darkening_strength_get(this.swigCPtr, this);
    }

    public float getSky_denoise_strength() {
        return GcamModuleJNI.ShotLogData_sky_denoise_strength_get(this.swigCPtr, this);
    }

    public float getSky_mask_ratio() {
        return GcamModuleJNI.ShotLogData_sky_mask_ratio_get(this.swigCPtr, this);
    }

    public boolean getSky_segmentation_failed() {
        return GcamModuleJNI.ShotLogData_sky_segmentation_failed_get(this.swigCPtr, this);
    }

    public int getSky_segmentation_total_time_ms() {
        return GcamModuleJNI.ShotLogData_sky_segmentation_total_time_ms_get(this.swigCPtr, this);
    }

    public boolean getSky_segmentation_used() {
        return GcamModuleJNI.ShotLogData_sky_segmentation_used_get(this.swigCPtr, this);
    }

    public float getStd_angular_speed_rad_per_sec() {
        return GcamModuleJNI.ShotLogData_std_angular_speed_rad_per_sec_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_max_run_time_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_max_run_time_ms_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_mean_ego_motion_pix_per_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_mean_ego_motion_pix_per_ms_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_mean_run_time_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_mean_run_time_ms_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_mean_visual_motion_pix_per_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_mean_visual_motion_pix_per_ms_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_min_run_time_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_min_run_time_ms_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_target_exposure_time_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_target_exposure_time_ms_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_target_tet_ms() {
        return GcamModuleJNI.ShotLogData_temporal_binning_target_tet_ms_get(this.swigCPtr, this);
    }

    public float getTime_to_postview() {
        return GcamModuleJNI.ShotLogData_time_to_postview_get(this.swigCPtr, this);
    }

    public float getTime_to_shot() {
        return GcamModuleJNI.ShotLogData_time_to_shot_get(this.swigCPtr, this);
    }

    public float getTotal_callback_time() {
        return GcamModuleJNI.ShotLogData_total_callback_time_get(this.swigCPtr, this);
    }

    public int getUx_mode() {
        return GcamModuleJNI.ShotLogData_ux_mode_get(this.swigCPtr, this);
    }

    public BoolVector getWas_payload_frame_merged() {
        long ShotLogData_was_payload_frame_merged_get = GcamModuleJNI.ShotLogData_was_payload_frame_merged_get(this.swigCPtr, this);
        if (ShotLogData_was_payload_frame_merged_get != 0) {
            return new BoolVector(ShotLogData_was_payload_frame_merged_get, false);
        }
        return null;
    }

    public float getWeighted_fraction_of_pixels_from_long_exposure() {
        return GcamModuleJNI.ShotLogData_weighted_fraction_of_pixels_from_long_exposure_get(this.swigCPtr, this);
    }

    public boolean getZsl() {
        return GcamModuleJNI.ShotLogData_zsl_get(this.swigCPtr, this);
    }

    public void setAborted(boolean z) {
        GcamModuleJNI.ShotLogData_aborted_set(this.swigCPtr, this, z);
    }

    public void setActual_range_compression(float f) {
        GcamModuleJNI.ShotLogData_actual_range_compression_set(this.swigCPtr, this, f);
    }

    public void setAe_confidence_long_exposure(float f) {
        GcamModuleJNI.ShotLogData_ae_confidence_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setAe_confidence_short_exposure(float f) {
        GcamModuleJNI.ShotLogData_ae_confidence_short_exposure_set(this.swigCPtr, this, f);
    }

    public void setAe_confidence_single_exposure(float f) {
        GcamModuleJNI.ShotLogData_ae_confidence_single_exposure_set(this.swigCPtr, this, f);
    }

    public void setAngular_speed_rad_per_sec(float f) {
        GcamModuleJNI.ShotLogData_angular_speed_rad_per_sec_set(this.swigCPtr, this, f);
    }

    public void setBase_frame_index(int i) {
        GcamModuleJNI.ShotLogData_base_frame_index_set(this.swigCPtr, this, i);
    }

    public void setBase_frame_snr(float f) {
        GcamModuleJNI.ShotLogData_base_frame_snr_set(this.swigCPtr, this, f);
    }

    public void setBase_frame_temporal_binning_factor(int i) {
        GcamModuleJNI.ShotLogData_base_frame_temporal_binning_factor_set(this.swigCPtr, this, i);
    }

    public void setCapture_time(float f) {
        GcamModuleJNI.ShotLogData_capture_time_set(this.swigCPtr, this, f);
    }

    public void setCpu_usage_factor(float f) {
        GcamModuleJNI.ShotLogData_cpu_usage_factor_set(this.swigCPtr, this, f);
    }

    public void setExecuted_finish_on(int i) {
        GcamModuleJNI.ShotLogData_executed_finish_on_set(this.swigCPtr, this, i);
    }

    public void setFinal_image_callback_time(float f) {
        GcamModuleJNI.ShotLogData_final_image_callback_time_set(this.swigCPtr, this, f);
    }

    public void setFinal_payload_frame_sharpness(FloatVector floatVector) {
        GcamModuleJNI.ShotLogData_final_payload_frame_sharpness_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setFinish_process_time(float f) {
        GcamModuleJNI.ShotLogData_finish_process_time_set(this.swigCPtr, this, f);
    }

    public void setHot_pixels_in_base_frame(int i) {
        GcamModuleJNI.ShotLogData_hot_pixels_in_base_frame_set(this.swigCPtr, this, i);
    }

    public void setHot_pixels_in_total(int i) {
        GcamModuleJNI.ShotLogData_hot_pixels_in_total_set(this.swigCPtr, this, i);
    }

    public void setIdeal_range_compression(float f) {
        GcamModuleJNI.ShotLogData_ideal_range_compression_set(this.swigCPtr, this, f);
    }

    public void setJpeg_callback_time(float f) {
        GcamModuleJNI.ShotLogData_jpeg_callback_time_set(this.swigCPtr, this, f);
    }

    public void setJpeg_encode_time(float f) {
        GcamModuleJNI.ShotLogData_jpeg_encode_time_set(this.swigCPtr, this, f);
    }

    public void setLog_scene_brightness(float f) {
        GcamModuleJNI.ShotLogData_log_scene_brightness_set(this.swigCPtr, this, f);
    }

    public void setLong_exp_adjustment_factor(float f) {
        GcamModuleJNI.ShotLogData_long_exp_adjustment_factor_set(this.swigCPtr, this, f);
    }

    public void setMax_exposure_time_ms(float f) {
        GcamModuleJNI.ShotLogData_max_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setMerge_process_time(float f) {
        GcamModuleJNI.ShotLogData_merge_process_time_set(this.swigCPtr, this, f);
    }

    public void setMerged_frame_count(int i) {
        GcamModuleJNI.ShotLogData_merged_frame_count_set(this.swigCPtr, this, i);
    }

    public void setMerged_raw_callback_time(float f) {
        GcamModuleJNI.ShotLogData_merged_raw_callback_time_set(this.swigCPtr, this, f);
    }

    public void setMetering_frame_count(int i) {
        GcamModuleJNI.ShotLogData_metering_frame_count_set(this.swigCPtr, this, i);
    }

    public void setNumber_gyro_samples_used_for_metering(int i) {
        GcamModuleJNI.ShotLogData_number_gyro_samples_used_for_metering_set(this.swigCPtr, this, i);
    }

    public void setOriginal_payload_frame_count(int i) {
        GcamModuleJNI.ShotLogData_original_payload_frame_count_set(this.swigCPtr, this, i);
    }

    public void setPayload_focus_distance_diopters(float f) {
        GcamModuleJNI.ShotLogData_payload_focus_distance_diopters_set(this.swigCPtr, this, f);
    }

    public void setPayload_frame_scene_motion_pix_per_ms(FloatVector floatVector) {
        GcamModuleJNI.ShotLogData_payload_frame_scene_motion_pix_per_ms_set(this.swigCPtr, this, FloatVector.getCPtr(floatVector), floatVector);
    }

    public void setPercentage_valid_gyro_samples_used_for_metering(float f) {
        GcamModuleJNI.ShotLogData_percentage_valid_gyro_samples_used_for_metering_set(this.swigCPtr, this, f);
    }

    public void setPercentage_valid_motion_samples_in_10_samples(float f) {
        GcamModuleJNI.ShotLogData_percentage_valid_motion_samples_in_10_samples_set(this.swigCPtr, this, f);
    }

    public void setPercentage_valid_motion_samples_in_20_samples(float f) {
        GcamModuleJNI.ShotLogData_percentage_valid_motion_samples_in_20_samples_set(this.swigCPtr, this, f);
    }

    public void setPostview_callback_time(float f) {
        GcamModuleJNI.ShotLogData_postview_callback_time_set(this.swigCPtr, this, f);
    }

    public void setPreview_focus_distance_diopters(float f) {
        GcamModuleJNI.ShotLogData_preview_focus_distance_diopters_set(this.swigCPtr, this, f);
    }

    public void setPsaf_frame_count(int i) {
        GcamModuleJNI.ShotLogData_psaf_frame_count_set(this.swigCPtr, this, i);
    }

    public void setPure_fraction_of_pixels_from_long_exposure(float f) {
        GcamModuleJNI.ShotLogData_pure_fraction_of_pixels_from_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setScene_motion_10_sample_std_pix_per_ms(float f) {
        GcamModuleJNI.ShotLogData_scene_motion_10_sample_std_pix_per_ms_set(this.swigCPtr, this, f);
    }

    public void setScene_motion_20_sample_std_pix_per_ms(float f) {
        GcamModuleJNI.ShotLogData_scene_motion_20_sample_std_pix_per_ms_set(this.swigCPtr, this, f);
    }

    public void setScene_motion_pix_per_ms(float f) {
        GcamModuleJNI.ShotLogData_scene_motion_pix_per_ms_set(this.swigCPtr, this, f);
    }

    public void setShort_exp_adjustment_factor(float f) {
        GcamModuleJNI.ShotLogData_short_exp_adjustment_factor_set(this.swigCPtr, this, f);
    }

    public void setSky_darkening_strength(float f) {
        GcamModuleJNI.ShotLogData_sky_darkening_strength_set(this.swigCPtr, this, f);
    }

    public void setSky_denoise_strength(float f) {
        GcamModuleJNI.ShotLogData_sky_denoise_strength_set(this.swigCPtr, this, f);
    }

    public void setSky_mask_ratio(float f) {
        GcamModuleJNI.ShotLogData_sky_mask_ratio_set(this.swigCPtr, this, f);
    }

    public void setSky_segmentation_failed(boolean z) {
        GcamModuleJNI.ShotLogData_sky_segmentation_failed_set(this.swigCPtr, this, z);
    }

    public void setSky_segmentation_total_time_ms(int i) {
        GcamModuleJNI.ShotLogData_sky_segmentation_total_time_ms_set(this.swigCPtr, this, i);
    }

    public void setSky_segmentation_used(boolean z) {
        GcamModuleJNI.ShotLogData_sky_segmentation_used_set(this.swigCPtr, this, z);
    }

    public void setStd_angular_speed_rad_per_sec(float f) {
        GcamModuleJNI.ShotLogData_std_angular_speed_rad_per_sec_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_max_run_time_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_max_run_time_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_mean_ego_motion_pix_per_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_mean_ego_motion_pix_per_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_mean_run_time_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_mean_run_time_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_mean_visual_motion_pix_per_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_mean_visual_motion_pix_per_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_min_run_time_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_min_run_time_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_target_exposure_time_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_target_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_target_tet_ms(float f) {
        GcamModuleJNI.ShotLogData_temporal_binning_target_tet_ms_set(this.swigCPtr, this, f);
    }

    public void setTime_to_postview(float f) {
        GcamModuleJNI.ShotLogData_time_to_postview_set(this.swigCPtr, this, f);
    }

    public void setTime_to_shot(float f) {
        GcamModuleJNI.ShotLogData_time_to_shot_set(this.swigCPtr, this, f);
    }

    public void setTotal_callback_time(float f) {
        GcamModuleJNI.ShotLogData_total_callback_time_set(this.swigCPtr, this, f);
    }

    public void setUx_mode(int i) {
        GcamModuleJNI.ShotLogData_ux_mode_set(this.swigCPtr, this, i);
    }

    public void setWas_payload_frame_merged(BoolVector boolVector) {
        GcamModuleJNI.ShotLogData_was_payload_frame_merged_set(this.swigCPtr, this, BoolVector.getCPtr(boolVector), boolVector);
    }

    public void setWeighted_fraction_of_pixels_from_long_exposure(float f) {
        GcamModuleJNI.ShotLogData_weighted_fraction_of_pixels_from_long_exposure_set(this.swigCPtr, this, f);
    }

    public void setZsl(boolean z) {
        GcamModuleJNI.ShotLogData_zsl_set(this.swigCPtr, this, z);
    }
}
