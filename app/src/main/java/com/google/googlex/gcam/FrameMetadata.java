package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FrameMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FrameMetadata() {
        this(GcamModuleJNI.new_FrameMetadata(), true);
    }

    public static long getCPtr(FrameMetadata frameMetadata) {
        if (frameMetadata == null) {
            return 0L;
        }
        return frameMetadata.swigCPtr;
    }

    public FrameMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public float AppliedOverallGain() {
        return GcamModuleJNI.FrameMetadata_AppliedOverallGain(this.swigCPtr, this);
    }

    public void CensorFingerprintable() {
        GcamModuleJNI.FrameMetadata_CensorFingerprintable(this.swigCPtr, this);
    }

    public boolean Check(String str, int i, boolean z, SWIGTYPE_p_gcam__LogSaver sWIGTYPE_p_gcam__LogSaver) {
        return GcamModuleJNI.FrameMetadata_Check(this.swigCPtr, this, str, i, z, SWIGTYPE_p_gcam__LogSaver.getCPtr(sWIGTYPE_p_gcam__LogSaver));
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char, int i) {
        return GcamModuleJNI.FrameMetadata_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char), i);
    }

    public boolean Equals(FrameMetadata frameMetadata) {
        return GcamModuleJNI.FrameMetadata_Equals(this.swigCPtr, this, getCPtr(frameMetadata), frameMetadata);
    }

    public float GetCurrentTet() {
        return GcamModuleJNI.FrameMetadata_GetCurrentTet(this.swigCPtr, this);
    }

    public boolean IsFingerprintable() {
        return GcamModuleJNI.FrameMetadata_IsFingerprintable(this.swigCPtr, this);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.FrameMetadata_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.FrameMetadata_SerializeToString__SWIG_2(this.swigCPtr, this, str, i);
    }

    public void SerializeToString(String str, int i, boolean z) {
        GcamModuleJNI.FrameMetadata_SerializeToString__SWIG_1(this.swigCPtr, this, str, i, z);
    }

    public void SerializeToString(String str, int i, boolean z, boolean z2) {
        GcamModuleJNI.FrameMetadata_SerializeToString__SWIG_0(this.swigCPtr, this, str, i, z, z2);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FrameMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getActual_analog_gain() {
        return GcamModuleJNI.FrameMetadata_actual_analog_gain_get(this.swigCPtr, this);
    }

    public float getActual_exposure_time_ms() {
        return GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_get(this.swigCPtr, this);
    }

    public AeMetadata getAe() {
        long FrameMetadata_ae_get = GcamModuleJNI.FrameMetadata_ae_get(this.swigCPtr, this);
        if (FrameMetadata_ae_get != 0) {
            return new AeMetadata(FrameMetadata_ae_get, false);
        }
        return null;
    }

    public AfMetadata getAf() {
        long FrameMetadata_af_get = GcamModuleJNI.FrameMetadata_af_get(this.swigCPtr, this);
        if (FrameMetadata_af_get != 0) {
            return new AfMetadata(FrameMetadata_af_get, false);
        }
        return null;
    }

    public float getApplied_digital_gain() {
        return GcamModuleJNI.FrameMetadata_applied_digital_gain_get(this.swigCPtr, this);
    }

    public AwbMetadata getAwb() {
        long FrameMetadata_awb_get = GcamModuleJNI.FrameMetadata_awb_get(this.swigCPtr, this);
        if (FrameMetadata_awb_get != 0) {
            return new AwbMetadata(FrameMetadata_awb_get, false);
        }
        return null;
    }

    public float[] getBlack_levels_bayer() {
        return GcamModuleJNI.FrameMetadata_black_levels_bayer_get(this.swigCPtr, this);
    }

    public int getControl_mode() {
        return GcamModuleJNI.FrameMetadata_control_mode_get(this.swigCPtr, this);
    }

    public DngNoiseModel[] getDng_noise_model_bayer() {
        return DngNoiseModel.cArrayWrap(GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_get(this.swigCPtr, this), false);
    }

    public float getExposure_time_boost() {
        return GcamModuleJNI.FrameMetadata_exposure_time_boost_get(this.swigCPtr, this);
    }

    public float getF_number() {
        return GcamModuleJNI.FrameMetadata_f_number_get(this.swigCPtr, this);
    }

    public FaceInfoVector getFaces() {
        long FrameMetadata_faces_get = GcamModuleJNI.FrameMetadata_faces_get(this.swigCPtr, this);
        if (FrameMetadata_faces_get != 0) {
            return new FaceInfoVector(FrameMetadata_faces_get, false);
        }
        return null;
    }

    public int getFlash() {
        return GcamModuleJNI.FrameMetadata_flash_get(this.swigCPtr, this);
    }

    public float getFocal_length_mm() {
        return GcamModuleJNI.FrameMetadata_focal_length_mm_get(this.swigCPtr, this);
    }

    public float getFocus_distance_diopters() {
        return GcamModuleJNI.FrameMetadata_focus_distance_diopters_get(this.swigCPtr, this);
    }

    public GeometricCalibrationVector getGeometric_calibration() {
        long FrameMetadata_geometric_calibration_get = GcamModuleJNI.FrameMetadata_geometric_calibration_get(this.swigCPtr, this);
        if (FrameMetadata_geometric_calibration_get != 0) {
            return new GeometricCalibrationVector(FrameMetadata_geometric_calibration_get, false);
        }
        return null;
    }

    public GyroSampleVector getGyro_samples() {
        long FrameMetadata_gyro_samples_get = GcamModuleJNI.FrameMetadata_gyro_samples_get(this.swigCPtr, this);
        if (FrameMetadata_gyro_samples_get != 0) {
            return new GyroSampleVector(FrameMetadata_gyro_samples_get, false);
        }
        return null;
    }

    public boolean getHas_exposure_gap() {
        return GcamModuleJNI.FrameMetadata_has_exposure_gap_get(this.swigCPtr, this);
    }

    public IspAwbMetadata getIsp_metadata() {
        long FrameMetadata_isp_metadata_get = GcamModuleJNI.FrameMetadata_isp_metadata_get(this.swigCPtr, this);
        if (FrameMetadata_isp_metadata_get != 0) {
            return new IspAwbMetadata(FrameMetadata_isp_metadata_get, false);
        }
        return null;
    }

    public int getLens_state() {
        return GcamModuleJNI.FrameMetadata_lens_state_get(this.swigCPtr, this);
    }

    public LiveHdrMetadata getLive_hdr() {
        long FrameMetadata_live_hdr_get = GcamModuleJNI.FrameMetadata_live_hdr_get(this.swigCPtr, this);
        if (FrameMetadata_live_hdr_get != 0) {
            return new LiveHdrMetadata(FrameMetadata_live_hdr_get, false);
        }
        return null;
    }

    public float getMean_signal_level() {
        return GcamModuleJNI.FrameMetadata_mean_signal_level_get(this.swigCPtr, this);
    }

    public MeshWarp getMesh_warp() {
        long FrameMetadata_mesh_warp_get = GcamModuleJNI.FrameMetadata_mesh_warp_get(this.swigCPtr, this);
        if (FrameMetadata_mesh_warp_get != 0) {
            return new MeshWarp(FrameMetadata_mesh_warp_get, false);
        }
        return null;
    }

    public float[] getNeutral_point() {
        return GcamModuleJNI.FrameMetadata_neutral_point_get(this.swigCPtr, this);
    }

    public OisMetadata getOis_metadata() {
        long FrameMetadata_ois_metadata_get = GcamModuleJNI.FrameMetadata_ois_metadata_get(this.swigCPtr, this);
        if (FrameMetadata_ois_metadata_get != 0) {
            return new OisMetadata(FrameMetadata_ois_metadata_get, false);
        }
        return null;
    }

    public float getPost_raw_digital_gain() {
        return GcamModuleJNI.FrameMetadata_post_raw_digital_gain_get(this.swigCPtr, this);
    }

    public int getScene_flicker() {
        return GcamModuleJNI.FrameMetadata_scene_flicker_get(this.swigCPtr, this);
    }

    public int getSensor_id() {
        return GcamModuleJNI.FrameMetadata_sensor_id_get(this.swigCPtr, this);
    }

    public int getSensor_temp() {
        return GcamModuleJNI.FrameMetadata_sensor_temp_get(this.swigCPtr, this);
    }

    public float getTemporal_binning_ae_exposure_time_ms() {
        return GcamModuleJNI.FrameMetadata_temporal_binning_ae_exposure_time_ms_get(this.swigCPtr, this);
    }

    public int getTemporal_binning_factor() {
        return GcamModuleJNI.FrameMetadata_temporal_binning_factor_get(this.swigCPtr, this);
    }

    public long getTimestamp_ns() {
        return GcamModuleJNI.FrameMetadata_timestamp_ns_get(this.swigCPtr, this);
    }

    public boolean getWas_black_level_locked() {
        return GcamModuleJNI.FrameMetadata_was_black_level_locked_get(this.swigCPtr, this);
    }

    public AwbInfo getWb() {
        long FrameMetadata_wb_get = GcamModuleJNI.FrameMetadata_wb_get(this.swigCPtr, this);
        if (FrameMetadata_wb_get != 0) {
            return new AwbInfo(FrameMetadata_wb_get, false);
        }
        return null;
    }

    public void setActual_analog_gain(float f) {
        GcamModuleJNI.FrameMetadata_actual_analog_gain_set(this.swigCPtr, this, f);
    }

    public void setActual_exposure_time_ms(float f) {
        GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setAe(AeMetadata aeMetadata) {
        GcamModuleJNI.FrameMetadata_ae_set(this.swigCPtr, this, AeMetadata.getCPtr(aeMetadata), aeMetadata);
    }

    public void setAf(AfMetadata afMetadata) {
        GcamModuleJNI.FrameMetadata_af_set(this.swigCPtr, this, AfMetadata.getCPtr(afMetadata), afMetadata);
    }

    public void setApplied_digital_gain(float f) {
        GcamModuleJNI.FrameMetadata_applied_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setAwb(AwbMetadata awbMetadata) {
        GcamModuleJNI.FrameMetadata_awb_set(this.swigCPtr, this, AwbMetadata.getCPtr(awbMetadata), awbMetadata);
    }

    public void setBlack_levels_bayer(float[] fArr) {
        GcamModuleJNI.FrameMetadata_black_levels_bayer_set(this.swigCPtr, this, fArr);
    }

    public void setControl_mode(int i) {
        GcamModuleJNI.FrameMetadata_control_mode_set(this.swigCPtr, this, i);
    }

    public void setDng_noise_model_bayer(DngNoiseModel[] dngNoiseModelArr) {
        GcamModuleJNI.FrameMetadata_dng_noise_model_bayer_set(this.swigCPtr, this, DngNoiseModel.cArrayUnwrap(dngNoiseModelArr));
    }

    public void setExposure_time_boost(float f) {
        GcamModuleJNI.FrameMetadata_exposure_time_boost_set(this.swigCPtr, this, f);
    }

    public void setF_number(float f) {
        GcamModuleJNI.FrameMetadata_f_number_set(this.swigCPtr, this, f);
    }

    public void setFaces(FaceInfoVector faceInfoVector) {
        GcamModuleJNI.FrameMetadata_faces_set(this.swigCPtr, this, FaceInfoVector.getCPtr(faceInfoVector), faceInfoVector);
    }

    public void setFlash(int i) {
        GcamModuleJNI.FrameMetadata_flash_set(this.swigCPtr, this, i);
    }

    public void setFocal_length_mm(float f) {
        GcamModuleJNI.FrameMetadata_focal_length_mm_set(this.swigCPtr, this, f);
    }

    public void setFocus_distance_diopters(float f) {
        GcamModuleJNI.FrameMetadata_focus_distance_diopters_set(this.swigCPtr, this, f);
    }

    public void setGeometric_calibration(GeometricCalibrationVector geometricCalibrationVector) {
        GcamModuleJNI.FrameMetadata_geometric_calibration_set(this.swigCPtr, this, GeometricCalibrationVector.getCPtr(geometricCalibrationVector), geometricCalibrationVector);
    }

    public void setGyro_samples(GyroSampleVector gyroSampleVector) {
        GcamModuleJNI.FrameMetadata_gyro_samples_set(this.swigCPtr, this, GyroSampleVector.getCPtr(gyroSampleVector), gyroSampleVector);
    }

    public void setHas_exposure_gap(boolean z) {
        GcamModuleJNI.FrameMetadata_has_exposure_gap_set(this.swigCPtr, this, z);
    }

    public void setIsp_metadata(IspAwbMetadata ispAwbMetadata) {
        GcamModuleJNI.FrameMetadata_isp_metadata_set(this.swigCPtr, this, IspAwbMetadata.getCPtr(ispAwbMetadata), ispAwbMetadata);
    }

    public void setLens_state(int i) {
        GcamModuleJNI.FrameMetadata_lens_state_set(this.swigCPtr, this, i);
    }

    public void setLive_hdr(LiveHdrMetadata liveHdrMetadata) {
        GcamModuleJNI.FrameMetadata_live_hdr_set(this.swigCPtr, this, LiveHdrMetadata.getCPtr(liveHdrMetadata), liveHdrMetadata);
    }

    public void setMean_signal_level(float f) {
        GcamModuleJNI.FrameMetadata_mean_signal_level_set(this.swigCPtr, this, f);
    }

    public void setMesh_warp(MeshWarp meshWarp) {
        GcamModuleJNI.FrameMetadata_mesh_warp_set(this.swigCPtr, this, MeshWarp.getCPtr(meshWarp), meshWarp);
    }

    public void setNeutral_point(float[] fArr) {
        GcamModuleJNI.FrameMetadata_neutral_point_set(this.swigCPtr, this, fArr);
    }

    public void setOis_metadata(OisMetadata oisMetadata) {
        GcamModuleJNI.FrameMetadata_ois_metadata_set(this.swigCPtr, this, OisMetadata.getCPtr(oisMetadata), oisMetadata);
    }

    public void setPost_raw_digital_gain(float f) {
        GcamModuleJNI.FrameMetadata_post_raw_digital_gain_set(this.swigCPtr, this, f);
    }

    public void setScene_flicker(int i) {
        GcamModuleJNI.FrameMetadata_scene_flicker_set(this.swigCPtr, this, i);
    }

    public void setSensor_id(int i) {
        GcamModuleJNI.FrameMetadata_sensor_id_set(this.swigCPtr, this, i);
    }

    public void setSensor_temp(int i) {
        GcamModuleJNI.FrameMetadata_sensor_temp_set(this.swigCPtr, this, i);
    }

    public void setTemporal_binning_ae_exposure_time_ms(float f) {
        GcamModuleJNI.FrameMetadata_temporal_binning_ae_exposure_time_ms_set(this.swigCPtr, this, f);
    }

    public void setTemporal_binning_factor(int i) {
        GcamModuleJNI.FrameMetadata_temporal_binning_factor_set(this.swigCPtr, this, i);
    }

    public void setTimestamp_ns(long j) {
        GcamModuleJNI.FrameMetadata_timestamp_ns_set(this.swigCPtr, this, j);
    }

    public void setWas_black_level_locked(boolean z) {
        GcamModuleJNI.FrameMetadata_was_black_level_locked_set(this.swigCPtr, this, z);
    }

    public void setWb(AwbInfo awbInfo) {
        GcamModuleJNI.FrameMetadata_wb_set(this.swigCPtr, this, AwbInfo.getCPtr(awbInfo), awbInfo);
    }
}
