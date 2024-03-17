package com.google.googlex.gcam;

import com.google.googlex.gcam.FaceInfo;
import com.google.googlex.gcam.IspAwbMetadata;
import com.google.googlex.gcam.QcColorCalibration;
import com.google.googlex.gcam.RawSharpenParams;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GcamModuleJNI {
    static {
        swig_module_init();
    }

    public static final native void AdjustRawVignetting(long j, RawVignetteParams rawVignetteParams, long j2, SpatialGainMap spatialGainMap);

    public static final native float AeDebugInfo_exec_time_dual_ae_sec_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_exec_time_dual_ae_sec_set(long j, AeDebugInfo aeDebugInfo, float f);

    public static final native int AeDebugInfo_num_faces_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_num_faces_set(long j, AeDebugInfo aeDebugInfo, int i);

    public static final native long AeDebugInfo_original_result_get(long j, AeDebugInfo aeDebugInfo);

    public static final native void AeDebugInfo_original_result_set(long j, AeDebugInfo aeDebugInfo, long j2, AeModeResult aeModeResult);

    public static final native float AeMetadata_exposure_compensation_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_exposure_compensation_set(long j, AeMetadata aeMetadata, float f);

    public static final native boolean AeMetadata_lock_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_lock_set(long j, AeMetadata aeMetadata, boolean z);

    public static final native long AeMetadata_metering_rectangles_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_metering_rectangles_set(long j, AeMetadata aeMetadata, long j2, WeightedPixelRectVector weightedPixelRectVector);

    public static final native int AeMetadata_mode_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_mode_set(long j, AeMetadata aeMetadata, int i);

    public static final native int AeMetadata_precapture_trigger_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_precapture_trigger_set(long j, AeMetadata aeMetadata, int i);

    public static final native int AeMetadata_state_get(long j, AeMetadata aeMetadata);

    public static final native void AeMetadata_state_set(long j, AeMetadata aeMetadata, int i);

    public static final native float AeModeResult_confidence_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_confidence_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_high_frequency_str_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_high_frequency_str_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_log_scene_brightness_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_log_scene_brightness_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_target_avg_ldr_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_target_avg_ldr_set(long j, AeModeResult aeModeResult, float f);

    public static final native float AeModeResult_tet_get(long j, AeModeResult aeModeResult);

    public static final native void AeModeResult_tet_set(long j, AeModeResult aeModeResult, float f);

    public static final native boolean AeResults_Check(long j, AeResults aeResults);

    public static final native float AeResults_FinalHdrRatio(long j, AeResults aeResults);

    public static final native float AeResults_GetDesiredFinalTet(long j, AeResults aeResults);

    public static final native float AeResults_HighFrequencyStr(long j, AeResults aeResults);

    public static final native float AeResults_IdealHdrRatio(long j, AeResults aeResults);

    public static final native float AeResults_LogSceneBrightness(long j, AeResults aeResults);

    public static final native int AeResults_MeteringFrameCount(long j, AeResults aeResults);

    public static final native boolean AeResults_MotionValid(long j, AeResults aeResults);

    public static final native long AeResults_debug_get(long j, AeResults aeResults);

    public static final native void AeResults_debug_set(long j, AeResults aeResults, long j2, AeDebugInfo aeDebugInfo);

    public static final native float[] AeResults_final_tet_get(long j, AeResults aeResults);

    public static final native void AeResults_final_tet_set(long j, AeResults aeResults, float[] fArr);

    public static final native long AeResults_metering_frame_timestamps_ns_get(long j, AeResults aeResults);

    public static final native void AeResults_metering_frame_timestamps_ns_set(long j, AeResults aeResults, long j2, Int64Vector int64Vector);

    public static final native float AeResults_motion_score_get(long j, AeResults aeResults);

    public static final native void AeResults_motion_score_set(long j, AeResults aeResults, float f);

    public static final native float AeResults_predicted_image_brightness_get(long j, AeResults aeResults);

    public static final native void AeResults_predicted_image_brightness_set(long j, AeResults aeResults, float f);

    public static final native float AeResults_pure_fraction_of_pixels_from_long_exposure_get(long j, AeResults aeResults);

    public static final native void AeResults_pure_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native float AeResults_safe_underexposure_get(long j, AeResults aeResults);

    public static final native void AeResults_safe_underexposure_set(long j, AeResults aeResults, float f);

    public static final native float AeResults_weighted_fraction_of_pixels_from_long_exposure_get(long j, AeResults aeResults);

    public static final native void AeResults_weighted_fraction_of_pixels_from_long_exposure_set(long j, AeResults aeResults, float f);

    public static final native long AeRunnerDeviceTuning_GenericTuning();

    public static final native float AeRunnerDeviceTuning_max_hdr_ratio_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_max_hdr_ratio_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native float AeRunnerDeviceTuning_max_overall_gain_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_max_overall_gain_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native float AeRunnerDeviceTuning_max_post_capture_gain_non_zsl_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_max_post_capture_gain_non_zsl_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native float AeRunnerDeviceTuning_max_post_capture_gain_zsl_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_max_post_capture_gain_zsl_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native float AeRunnerDeviceTuning_max_tet_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_max_tet_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native float AeRunnerDeviceTuning_min_tet_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_min_tet_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native long AeRunnerDeviceTuning_raw_finish_saturation_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_raw_finish_saturation_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, long j2, ColorSatParams colorSatParams);

    public static final native long AeRunnerDeviceTuning_raw_global_vignetting_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_raw_global_vignetting_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, long j2, RawVignetteParams rawVignetteParams);

    public static final native float AeRunnerDeviceTuning_sensitivity_get(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning);

    public static final native void AeRunnerDeviceTuning_sensitivity_set(long j, AeRunnerDeviceTuning aeRunnerDeviceTuning, float f);

    public static final native boolean AeShotParams_Equals(long j, AeShotParams aeShotParams, long j2, AeShotParams aeShotParams2);

    public static final native long AeShotParams_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native boolean AeShotParams_disable_safe_underexposure_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_disable_safe_underexposure_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native float AeShotParams_exposure_compensation_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_exposure_compensation_set(long j, AeShotParams aeShotParams, float f);

    public static final native long AeShotParams_merged_crop_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_merged_crop_set(long j, AeShotParams aeShotParams, long j2, NormalizedRect normalizedRect);

    public static final native boolean AeShotParams_spoofed_touch_rectangle_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_spoofed_touch_rectangle_set(long j, AeShotParams aeShotParams, boolean z);

    public static final native int AeShotParams_target_height_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_target_height_set(long j, AeShotParams aeShotParams, int i);

    public static final native int AeShotParams_target_width_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_target_width_set(long j, AeShotParams aeShotParams, int i);

    public static final native int AeShotParams_ux_mode_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_ux_mode_set(long j, AeShotParams aeShotParams, int i);

    public static final native long AeShotParams_weighted_metering_areas_get(long j, AeShotParams aeShotParams);

    public static final native void AeShotParams_weighted_metering_areas_set(long j, AeShotParams aeShotParams, long j2, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native long AfMetadata_metering_rectangles_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_metering_rectangles_set(long j, AfMetadata afMetadata, long j2, WeightedPixelRectVector weightedPixelRectVector);

    public static final native int AfMetadata_mode_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_mode_set(long j, AfMetadata afMetadata, int i);

    public static final native int AfMetadata_state_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_state_set(long j, AfMetadata afMetadata, int i);

    public static final native int AfMetadata_trigger_get(long j, AfMetadata afMetadata);

    public static final native void AfMetadata_trigger_set(long j, AfMetadata afMetadata, int i);

    public static final native void AffineNoiseModel_ApplyGain(float f, long j, AffineNoiseModel affineNoiseModel);

    public static final native void AffineNoiseModel_ApproxWeightedAverage(long j, FloatVector floatVector, long j2, long j3, FloatVector floatVector2, long j4, AffineNoiseModel affineNoiseModel);

    public static final native void AffineNoiseModel_AverageNumSamples(float f, long j, AffineNoiseModel affineNoiseModel);

    public static final native boolean AffineNoiseModel_Check(long j, AffineNoiseModel affineNoiseModel);

    public static final native boolean AffineNoiseModel_Equals(long j, AffineNoiseModel affineNoiseModel, long j2, AffineNoiseModel affineNoiseModel2);

    public static final native void AffineNoiseModel_WeightedAverage(long j, FloatVector floatVector, long j2, AffineNoiseModel affineNoiseModel);

    public static final native float AffineNoiseModel_offset_get(long j, AffineNoiseModel affineNoiseModel);

    public static final native void AffineNoiseModel_offset_set(long j, AffineNoiseModel affineNoiseModel, float f);

    public static final native float AffineNoiseModel_scale_get(long j, AffineNoiseModel affineNoiseModel);

    public static final native void AffineNoiseModel_scale_set(long j, AffineNoiseModel affineNoiseModel, float f);

    public static final native void ApplyAntibanding(int i, boolean z, float f, float f2, long j, long j2);

    public static final native void ApplyBlsAndSgm(long j, SpatialGainMap spatialGainMap, float[] fArr, int i, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long ApplyColorSaturation(long j, long j2, ColorSatParams colorSatParams);

    public static final native void ApplySensorBinning__SWIG_0(int i, boolean z, boolean z2, long j, FrameMetadata frameMetadata);

    public static final native boolean ApplySensorBinning__SWIG_1(int i, long j, StaticMetadata staticMetadata);

    public static final native float ArcFlareParam_GetMeanRadius(long j, ArcFlareParam arcFlareParam, float f);

    public static final native boolean ArcFlareParam_can_exist_get(long j, ArcFlareParam arcFlareParam);

    public static final native void ArcFlareParam_can_exist_set(long j, ArcFlareParam arcFlareParam, boolean z);

    public static final native double[] ArcFlareParam_radius_param_get(long j, ArcFlareParam arcFlareParam);

    public static final native void ArcFlareParam_radius_param_set(long j, ArcFlareParam arcFlareParam, double[] dArr);

    public static final native boolean AwbInfo_Check(long j, AwbInfo awbInfo);

    public static final native boolean AwbInfo_DeserializeFromString__SWIG_0(long j, AwbInfo awbInfo, long j2, boolean z);

    public static final native boolean AwbInfo_DeserializeFromString__SWIG_1(long j, AwbInfo awbInfo, long j2);

    public static final native boolean AwbInfo_Equals(long j, AwbInfo awbInfo, long j2, AwbInfo awbInfo2);

    public static final native void AwbInfo_GetWbGainsRGB(long j, AwbInfo awbInfo, long j2, long j3, long j4);

    public static final native void AwbInfo_Print(long j, AwbInfo awbInfo, int i, int i2);

    public static final native void AwbInfo_SerializeToString(long j, AwbInfo awbInfo, String str, int i);

    public static final native void AwbInfo_SetIdentityRgbToRgb(long j, AwbInfo awbInfo);

    public static final native int AwbInfo_color_temp_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_color_temp_set(long j, AwbInfo awbInfo, int i);

    public static final native float[] AwbInfo_gains_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_gains_set(long j, AwbInfo awbInfo, float[] fArr);

    public static final native int AwbInfo_method_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_method_set(long j, AwbInfo awbInfo, int i);

    public static final native float[] AwbInfo_rgb2rgb_get(long j, AwbInfo awbInfo);

    public static final native void AwbInfo_rgb2rgb_set(long j, AwbInfo awbInfo, float[] fArr);

    public static final native boolean AwbMetadata_lock_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_lock_set(long j, AwbMetadata awbMetadata, boolean z);

    public static final native long AwbMetadata_metering_rectangles_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_metering_rectangles_set(long j, AwbMetadata awbMetadata, long j2, WeightedPixelRectVector weightedPixelRectVector);

    public static final native int AwbMetadata_mode_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_mode_set(long j, AwbMetadata awbMetadata, int i);

    public static final native int AwbMetadata_state_get(long j, AwbMetadata awbMetadata);

    public static final native void AwbMetadata_state_set(long j, AwbMetadata awbMetadata, int i);

    public static final native int BadPixelPattern_height_get(long j, BadPixelPattern badPixelPattern);

    public static final native void BadPixelPattern_height_set(long j, BadPixelPattern badPixelPattern, int i);

    public static final native long BadPixelPattern_offsets_get(long j, BadPixelPattern badPixelPattern);

    public static final native void BadPixelPattern_offsets_set(long j, BadPixelPattern badPixelPattern, long j2);

    public static final native int BadPixelPattern_width_get(long j, BadPixelPattern badPixelPattern);

    public static final native void BadPixelPattern_width_set(long j, BadPixelPattern badPixelPattern, int i);

    public static final native int BadPixel_c_get(long j, BadPixel badPixel);

    public static final native void BadPixel_c_set(long j, BadPixel badPixel, int i);

    public static final native int BadPixel_x_get(long j, BadPixel badPixel);

    public static final native void BadPixel_x_set(long j, BadPixel badPixel, int i);

    public static final native int BadPixel_y_get(long j, BadPixel badPixel);

    public static final native void BadPixel_y_set(long j, BadPixel badPixel, int i);

    public static final native boolean BayerPatternColors(int i, short[] sArr);

    public static final native int BayerPatternFromColors(short[] sArr);

    public static final native void BoolVector_add(long j, BoolVector boolVector, boolean z);

    public static final native long BoolVector_capacity(long j, BoolVector boolVector);

    public static final native void BoolVector_clear(long j, BoolVector boolVector);

    public static final native boolean BoolVector_get(long j, BoolVector boolVector, int i);

    public static final native boolean BoolVector_isEmpty(long j, BoolVector boolVector);

    public static final native void BoolVector_reserve(long j, BoolVector boolVector, long j2);

    public static final native void BoolVector_set(long j, BoolVector boolVector, int i, boolean z);

    public static final native long BoolVector_size(long j, BoolVector boolVector);

    public static final native void BurstSpec_Clear(long j, BurstSpec burstSpec);

    public static final native boolean BurstSpec_DeserializeFromString(long j, BurstSpec burstSpec, long j2);

    public static final native void BurstSpec_Print(long j, BurstSpec burstSpec, int i);

    public static final native void BurstSpec_SerializeToString(long j, BurstSpec burstSpec, String str);

    public static final native long BurstSpec_frame_requests_get(long j, BurstSpec burstSpec);

    public static final native void BurstSpec_frame_requests_set(long j, BurstSpec burstSpec, long j2, FrameRequestVector frameRequestVector);

    public static final native boolean CaptureParams_Check(long j, CaptureParams captureParams);

    public static final native float CaptureParams_allow_digital_gain_at_sensor_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_allow_digital_gain_at_sensor_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_hdr_ratio_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_hdr_ratio_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_overall_gain_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_overall_gain_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_post_capture_gain_non_zsl_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_post_capture_gain_non_zsl_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_max_post_capture_gain_zsl_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_max_post_capture_gain_zsl_set(long j, CaptureParams captureParams, float f);

    public static final native float CaptureParams_noise_variance_to_payload_frame_count_get(long j, CaptureParams captureParams);

    public static final native void CaptureParams_noise_variance_to_payload_frame_count_set(long j, CaptureParams captureParams, float f);

    public static final native boolean CheckBlackRegions(long j, PixelRectVector pixelRectVector, long j2, StaticMetadata staticMetadata);

    public static final native void CheckHdrGains(float f, float f2, float f3, float f4, long j);

    public static final native long ClientExifMetadata_location_get(long j, ClientExifMetadata clientExifMetadata);

    public static final native void ClientExifMetadata_location_set(long j, ClientExifMetadata clientExifMetadata, long j2, LocationData locationData);

    public static final native long ClientInterleavedU16Allocator_Allocate(long j, ClientInterleavedU16Allocator clientInterleavedU16Allocator, int i, int i2, int i3);

    public static final native void ClientInterleavedU16Allocator_Release(long j, ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j2);

    public static final native void ClientInterleavedU16Allocator_change_ownership(ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j, boolean z);

    public static final native void ClientInterleavedU16Allocator_director_connect(ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j, boolean z, boolean z2);

    public static final native long ClientInterleavedU8Allocator_Allocate(long j, ClientInterleavedU8Allocator clientInterleavedU8Allocator, int i, int i2, int i3);

    public static final native void ClientInterleavedU8Allocator_Release(long j, ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j2);

    public static final native void ClientInterleavedU8Allocator_change_ownership(ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j, boolean z);

    public static final native void ClientInterleavedU8Allocator_director_connect(ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j, boolean z, boolean z2);

    public static final native long ClientRawAllocator_Allocate(long j, ClientRawAllocator clientRawAllocator, int i, int i2, int i3);

    public static final native void ClientRawAllocator_Release(long j, ClientRawAllocator clientRawAllocator, long j2);

    public static final native void ClientRawAllocator_change_ownership(ClientRawAllocator clientRawAllocator, long j, boolean z);

    public static final native void ClientRawAllocator_director_connect(ClientRawAllocator clientRawAllocator, long j, boolean z, boolean z2);

    public static final native long ClientYuvAllocator_Allocate(long j, ClientYuvAllocator clientYuvAllocator, int i, int i2, int i3);

    public static final native void ClientYuvAllocator_Release(long j, ClientYuvAllocator clientYuvAllocator, long j2);

    public static final native void ClientYuvAllocator_change_ownership(ClientYuvAllocator clientYuvAllocator, long j, boolean z);

    public static final native void ClientYuvAllocator_director_connect(ClientYuvAllocator clientYuvAllocator, long j, boolean z, boolean z2);

    public static final native boolean ColorSatParams_IsIdentity(long j, ColorSatParams colorSatParams);

    public static final native float ColorSatParams_highlight_saturation_get(long j, ColorSatParams colorSatParams);

    public static final native void ColorSatParams_highlight_saturation_set(long j, ColorSatParams colorSatParams, float f);

    public static final native float ColorSatParams_shadow_saturation_get(long j, ColorSatParams colorSatParams);

    public static final native void ColorSatParams_shadow_saturation_set(long j, ColorSatParams colorSatParams, float f);

    public static final native boolean ConstSampleIteratorPackedRaw10_AtEnd(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native void ConstSampleIteratorPackedRaw10_NextSample(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10___ref__(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10_c(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10_x(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native int ConstSampleIteratorPackedRaw10_y(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native boolean ConstSampleIteratorPackedRaw12_AtEnd(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native void ConstSampleIteratorPackedRaw12_NextSample(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12___ref__(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12_c(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12_x(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native int ConstSampleIteratorPackedRaw12_y(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native String ConvertBurstMetadataToString__SWIG_0(long j, boolean z, boolean z2);

    public static final native String ConvertBurstMetadataToString__SWIG_1(long j, boolean z);

    public static final native String ConvertBurstMetadataToString__SWIG_2(long j);

    public static final native void ConvertFrameMetadataToRgb(int i, boolean z, long j, FrameMetadata frameMetadata);

    public static final native String ConvertShotParamsToString(long j, ShotParams shotParams);

    public static final native String ConvertStaticMetadataToString__SWIG_0(long j, StaticMetadata staticMetadata, boolean z);

    public static final native String ConvertStaticMetadataToString__SWIG_1(long j, StaticMetadata staticMetadata);

    public static final native long CreateDefaultRequest();

    public static final native long CropFaceInfo__SWIG_0(long j, FaceInfo faceInfo, long j2, PixelRect pixelRect, int i, int i2);

    public static final native long CropFaceInfo__SWIG_1(long j, FaceInfo faceInfo, long j2, NormalizedRect normalizedRect, int i, int i2);

    public static final native boolean CropInDngMetadata(int i);

    public static final native long DebugParams_save_bitmask_get(long j, DebugParams debugParams);

    public static final native void DebugParams_save_bitmask_set(long j, DebugParams debugParams, long j2);

    public static final native int DecodeIccProfileData(long j, long j2);

    public static final native void DecreaseTrackedMemory(long j);

    public static final native float DehazeParams_rolloff_strength_get(long j, DehazeParams dehazeParams);

    public static final native void DehazeParams_rolloff_strength_set(long j, DehazeParams dehazeParams, float f);

    public static final native float[] DenoiseParams_revert_factor_get(long j, DenoiseParams denoiseParams);

    public static final native void DenoiseParams_revert_factor_set(long j, DenoiseParams denoiseParams, float[] fArr);

    public static final native float[] DenoiseParams_strength_get(long j, DenoiseParams denoiseParams);

    public static final native void DenoiseParams_strength_set(long j, DenoiseParams denoiseParams, float[] fArr);

    public static final native boolean DeserializeBurstMetadata(long j, long j2);

    public static final native boolean DeserializeDngMakernoteFromString(String str, long j, InitParams initParams, long j2, StaticMetadata staticMetadata, long j3, ShotParams shotParams, long j4, FrameMetadata frameMetadata);

    public static final native long DeserializeFromBytes(long j, long j2);

    public static final native boolean Deserialize__SWIG_0(long j, long j2, AeResults aeResults);

    public static final native boolean Deserialize__SWIG_1(String str, long j, AeResults aeResults);

    public static final native int DetectHotPixelParams_max_hot_pixels_in_neighborhood_get(long j, DetectHotPixelParams detectHotPixelParams);

    public static final native void DetectHotPixelParams_max_hot_pixels_in_neighborhood_set(long j, DetectHotPixelParams detectHotPixelParams, int i);

    public static final native boolean DetectHotPixelParams_normalize_get(long j, DetectHotPixelParams detectHotPixelParams);

    public static final native void DetectHotPixelParams_normalize_set(long j, DetectHotPixelParams detectHotPixelParams, boolean z);

    public static final native float DetectHotPixelParams_threshold_factor_get(long j, DetectHotPixelParams detectHotPixelParams);

    public static final native void DetectHotPixelParams_threshold_factor_set(long j, DetectHotPixelParams detectHotPixelParams, float f);

    public static final native float DetectHotPixelParams_threshold_offset_get(long j, DetectHotPixelParams detectHotPixelParams);

    public static final native void DetectHotPixelParams_threshold_offset_set(long j, DetectHotPixelParams detectHotPixelParams, float f);

    public static final native boolean DirtyLensHistory_AddRawScore(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DirtyLensHistory_Reset(long j, DirtyLensHistory dirtyLensHistory);

    public static final native float DirtyLensHistory_frame_influence_decay_rate__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_frame_influence_decay_rate__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native float DirtyLensHistory_initial_score__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_initial_score__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native int DirtyLensHistory_max_photo_count__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_max_photo_count__set(long j, DirtyLensHistory dirtyLensHistory, int i);

    public static final native long DirtyLensHistory_raw_score_history__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_raw_score_history__set(long j, DirtyLensHistory dirtyLensHistory, long j2, FloatDeque floatDeque);

    public static final native float DirtyLensHistory_weighted_score_threshold__get(long j, DirtyLensHistory dirtyLensHistory);

    public static final native void DirtyLensHistory_weighted_score_threshold__set(long j, DirtyLensHistory dirtyLensHistory, float f);

    public static final native void DngColorCalibrationVector_add(long j, DngColorCalibrationVector dngColorCalibrationVector, long j2, DngColorCalibration dngColorCalibration);

    public static final native long DngColorCalibrationVector_capacity(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void DngColorCalibrationVector_clear(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native long DngColorCalibrationVector_get(long j, DngColorCalibrationVector dngColorCalibrationVector, int i);

    public static final native boolean DngColorCalibrationVector_isEmpty(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native void DngColorCalibrationVector_reserve(long j, DngColorCalibrationVector dngColorCalibrationVector, long j2);

    public static final native void DngColorCalibrationVector_set(long j, DngColorCalibrationVector dngColorCalibrationVector, int i, long j2, DngColorCalibration dngColorCalibration);

    public static final native long DngColorCalibrationVector_size(long j, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native boolean DngColorCalibration_Equals(long j, DngColorCalibration dngColorCalibration, long j2, DngColorCalibration dngColorCalibration2);

    public static final native int DngColorCalibration_illuminant_get(long j, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_illuminant_set(long j, DngColorCalibration dngColorCalibration, int i);

    public static final native float[] DngColorCalibration_model_rgb_to_device_rgb_get(long j, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_model_rgb_to_device_rgb_set(long j, DngColorCalibration dngColorCalibration, float[] fArr);

    public static final native float[] DngColorCalibration_xyz_to_model_rgb_get(long j, DngColorCalibration dngColorCalibration);

    public static final native void DngColorCalibration_xyz_to_model_rgb_set(long j, DngColorCalibration dngColorCalibration, float[] fArr);

    public static final native long DngNoiseModel_SWIGUpcast(long j);

    public static final native float EstimateSnr__SWIG_0(long j, FrameMetadata frameMetadata, int i, float f);

    public static final native float EstimateSnr__SWIG_1(long j, FrameMetadata frameMetadata, int i);

    public static final native double ExifMetadata_ApertureValue(long j, ExifMetadata exifMetadata);

    public static final native double ExifMetadata_BrightnessValue(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_ClearThumbnail(long j, ExifMetadata exifMetadata);

    public static final native int ExifMetadata_Flash(long j, ExifMetadata exifMetadata);

    public static final native boolean ExifMetadata_HasThumbnail(long j, ExifMetadata exifMetadata);

    public static final native int ExifMetadata_Iso(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_NoiseModelRgb(long j, ExifMetadata exifMetadata, long j2, DngNoiseModel dngNoiseModel);

    public static final native int ExifMetadata_Orientation(long j, ExifMetadata exifMetadata);

    public static final native double ExifMetadata_SensitivityValue(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_SetFlash(long j, ExifMetadata exifMetadata, int i);

    public static final native void ExifMetadata_SetIso(long j, ExifMetadata exifMetadata, int i);

    public static final native void ExifMetadata_SetNoiseModelRgb(long j, ExifMetadata exifMetadata, long[] jArr);

    public static final native void ExifMetadata_SetOrientation(long j, ExifMetadata exifMetadata, int i);

    public static final native void ExifMetadata_SetTimestampCurrent(long j, ExifMetadata exifMetadata);

    public static final native double ExifMetadata_ShutterSpeedValue(long j, ExifMetadata exifMetadata);

    public static final native long ExifMetadata_ae_results_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_ae_results_set(long j, ExifMetadata exifMetadata, long j2, AeResults aeResults);

    public static final native long ExifMetadata_client_exif_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_client_exif_set(long j, ExifMetadata exifMetadata, long j2, ClientExifMetadata clientExifMetadata);

    public static final native long ExifMetadata_dng_user_crop_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_dng_user_crop_set(long j, ExifMetadata exifMetadata, long j2, PixelRect pixelRect);

    public static final native float ExifMetadata_exposure_compensation_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_exposure_compensation_set(long j, ExifMetadata exifMetadata, float f);

    public static final native long ExifMetadata_final_crop_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_final_crop_set(long j, ExifMetadata exifMetadata, long j2, NormalizedRect normalizedRect);

    public static final native int ExifMetadata_flash_mode_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_flash_mode_set(long j, ExifMetadata exifMetadata, int i);

    public static final native long ExifMetadata_frame_metadata_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_frame_metadata_set(long j, ExifMetadata exifMetadata, long j2, FrameMetadata frameMetadata);

    public static final native long ExifMetadata_gain_map_rggb_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_gain_map_rggb_set(long j, ExifMetadata exifMetadata, long j2, InterleavedImageF interleavedImageF);

    public static final native int ExifMetadata_icc_profile_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_icc_profile_set(long j, ExifMetadata exifMetadata, int i);

    public static final native int ExifMetadata_image_rotation_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_image_rotation_set(long j, ExifMetadata exifMetadata, int i);

    public static final native String ExifMetadata_makernote_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_makernote_set(long j, ExifMetadata exifMetadata, String str);

    public static final native long ExifMetadata_raw_crop_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_raw_crop_set(long j, ExifMetadata exifMetadata, long j2, PixelRect pixelRect);

    public static final native String ExifMetadata_software_suffix_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_software_suffix_set(long j, ExifMetadata exifMetadata, String str);

    public static final native long ExifMetadata_static_metadata_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_static_metadata_set(long j, ExifMetadata exifMetadata, long j2, StaticMetadata staticMetadata);

    public static final native int ExifMetadata_thumbnail_height_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_thumbnail_height_set(long j, ExifMetadata exifMetadata, int i);

    public static final native long ExifMetadata_thumbnail_jpg_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_thumbnail_jpg_set(long j, ExifMetadata exifMetadata, long j2, Uint8Vector uint8Vector);

    public static final native int ExifMetadata_thumbnail_width_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_thumbnail_width_set(long j, ExifMetadata exifMetadata, int i);

    public static final native long ExifMetadata_timestamp_unix_us_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_timestamp_unix_us_set(long j, ExifMetadata exifMetadata, long j2);

    public static final native int ExifMetadata_wb_mode_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_wb_mode_set(long j, ExifMetadata exifMetadata, int i);

    public static final native String ExifMetadata_xmp_metadata_extended_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_xmp_metadata_extended_set(long j, ExifMetadata exifMetadata, String str);

    public static final native String ExifMetadata_xmp_metadata_main_get(long j, ExifMetadata exifMetadata);

    public static final native void ExifMetadata_xmp_metadata_main_set(long j, ExifMetadata exifMetadata, String str);

    public static final native long ExtractAeRunnerDeviceTuning(long j, Tuning tuning);

    public static final native long FaceInfoToNormalizedRect__SWIG_0(long j, FaceInfo faceInfo, int i, int i2, boolean z, int i3);

    public static final native long FaceInfoToNormalizedRect__SWIG_1(long j, FaceInfo faceInfo, int i, int i2, boolean z);

    public static final native long FaceInfoToPixelRect__SWIG_0(long j, FaceInfo faceInfo, int i, int i2, boolean z, int i3);

    public static final native long FaceInfoToPixelRect__SWIG_1(long j, FaceInfo faceInfo, int i, int i2, boolean z);

    public static final native void FaceInfoVector_add(long j, FaceInfoVector faceInfoVector, long j2, FaceInfo faceInfo);

    public static final native long FaceInfoVector_capacity(long j, FaceInfoVector faceInfoVector);

    public static final native void FaceInfoVector_clear(long j, FaceInfoVector faceInfoVector);

    public static final native long FaceInfoVector_get(long j, FaceInfoVector faceInfoVector, int i);

    public static final native boolean FaceInfoVector_isEmpty(long j, FaceInfoVector faceInfoVector);

    public static final native void FaceInfoVector_reserve(long j, FaceInfoVector faceInfoVector, long j2);

    public static final native void FaceInfoVector_set(long j, FaceInfoVector faceInfoVector, int i, long j2, FaceInfo faceInfo);

    public static final native long FaceInfoVector_size(long j, FaceInfoVector faceInfoVector);

    public static final native boolean FaceInfo_Equals(long j, FaceInfo faceInfo, long j2, FaceInfo faceInfo2);

    public static final native float FaceInfo_Landmark_x_get(long j, FaceInfo.Landmark landmark);

    public static final native void FaceInfo_Landmark_x_set(long j, FaceInfo.Landmark landmark, float f);

    public static final native float FaceInfo_Landmark_y_get(long j, FaceInfo.Landmark landmark);

    public static final native void FaceInfo_Landmark_y_set(long j, FaceInfo.Landmark landmark, float f);

    public static final native float FaceInfo_confidence_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_confidence_set(long j, FaceInfo faceInfo, float f);

    public static final native long FaceInfo_landmarks_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_landmarks_set(long j, FaceInfo faceInfo, long j2, LandmarkMap landmarkMap);

    public static final native float FaceInfo_pos_x_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_pos_x_set(long j, FaceInfo faceInfo, float f);

    public static final native float FaceInfo_pos_y_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_pos_y_set(long j, FaceInfo faceInfo, float f);

    public static final native float FaceInfo_size_get(long j, FaceInfo faceInfo);

    public static final native void FaceInfo_size_set(long j, FaceInfo faceInfo, float f);

    public static final native boolean FactorizeTetOptions_apply_antibanding_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_apply_antibanding_set(long j, FactorizeTetOptions factorizeTetOptions, boolean z);

    public static final native boolean FactorizeTetOptions_exposure_time_from_long_ae_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_exposure_time_from_long_ae_set(long j, FactorizeTetOptions factorizeTetOptions, boolean z);

    public static final native float FactorizeTetOptions_max_analog_gain_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_max_analog_gain_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native float FactorizeTetOptions_max_exposure_time_ms_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_max_exposure_time_ms_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native float FactorizeTetOptions_max_overall_gain_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_max_overall_gain_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native float FactorizeTetOptions_min_exposure_time_ms_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_min_exposure_time_ms_set(long j, FactorizeTetOptions factorizeTetOptions, float f);

    public static final native boolean FactorizeTetOptions_verbose_get(long j, FactorizeTetOptions factorizeTetOptions);

    public static final native void FactorizeTetOptions_verbose_set(long j, FactorizeTetOptions factorizeTetOptions, boolean z);

    public static final native long FactorizeTet__SWIG_0(long j, TetModel tetModel, float f, float f2, long j2, FactorizeTetOptions factorizeTetOptions, long j3, int i);

    public static final native long FactorizeTet__SWIG_1(long j, TetModel tetModel, float f, float f2, long j2, FactorizeTetOptions factorizeTetOptions, long j3);

    public static final native long FactorizeTet__SWIG_2(long j, TetModel tetModel, float f, float f2, long j2, FactorizeTetOptions factorizeTetOptions);

    public static final native void FinalImageCallback_Rgb16Ready(long j, FinalImageCallback finalImageCallback, int i, long j2, InterleavedReadViewU16 interleavedReadViewU16, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void FinalImageCallback_RgbReady(long j, FinalImageCallback finalImageCallback, int i, long j2, InterleavedReadViewU8 interleavedReadViewU8, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void FinalImageCallback_YuvReady(long j, FinalImageCallback finalImageCallback, int i, long j2, YuvReadView yuvReadView, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void FinalImageCallback_change_ownership(FinalImageCallback finalImageCallback, long j, boolean z);

    public static final native void FinalImageCallback_director_connect(FinalImageCallback finalImageCallback, long j, boolean z, boolean z2);

    public static final native void FixOldWbGains(long j, AwbInfo awbInfo);

    public static final native void FloatDeque_assign(long j, FloatDeque floatDeque, long j2, float f);

    public static final native float FloatDeque_back(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_clear(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_delitem(long j, FloatDeque floatDeque, int i);

    public static final native void FloatDeque_delslice(long j, FloatDeque floatDeque, int i, int i2);

    public static final native boolean FloatDeque_empty(long j, FloatDeque floatDeque);

    public static final native float FloatDeque_front(long j, FloatDeque floatDeque);

    public static final native float FloatDeque_getitem(long j, FloatDeque floatDeque, int i);

    public static final native long FloatDeque_getslice(long j, FloatDeque floatDeque, int i, int i2);

    public static final native long FloatDeque_max_size(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_pop_back(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_pop_front(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_push_back(long j, FloatDeque floatDeque, float f);

    public static final native void FloatDeque_push_front(long j, FloatDeque floatDeque, float f);

    public static final native void FloatDeque_resize__SWIG_0(long j, FloatDeque floatDeque, long j2, float f);

    public static final native void FloatDeque_resize__SWIG_1(long j, FloatDeque floatDeque, long j2);

    public static final native void FloatDeque_setitem(long j, FloatDeque floatDeque, int i, float f);

    public static final native void FloatDeque_setslice(long j, FloatDeque floatDeque, int i, int i2, long j2, FloatDeque floatDeque2);

    public static final native long FloatDeque_size(long j, FloatDeque floatDeque);

    public static final native void FloatDeque_swap(long j, FloatDeque floatDeque, long j2, FloatDeque floatDeque2);

    public static final native float FloatSmoothKeyValueMap_Get(long j, FloatSmoothKeyValueMap floatSmoothKeyValueMap, float f);

    public static final native void FloatVector_add(long j, FloatVector floatVector, float f);

    public static final native long FloatVector_capacity(long j, FloatVector floatVector);

    public static final native void FloatVector_clear(long j, FloatVector floatVector);

    public static final native float FloatVector_get(long j, FloatVector floatVector, int i);

    public static final native boolean FloatVector_isEmpty(long j, FloatVector floatVector);

    public static final native void FloatVector_reserve(long j, FloatVector floatVector, long j2);

    public static final native void FloatVector_set(long j, FloatVector floatVector, int i, float f);

    public static final native long FloatVector_size(long j, FloatVector floatVector);

    public static final native float FrameMetadata_AppliedOverallGain(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_CensorFingerprintable(long j, FrameMetadata frameMetadata);

    public static final native boolean FrameMetadata_Check(long j, FrameMetadata frameMetadata, String str, int i, boolean z, long j2);

    public static final native boolean FrameMetadata_DeserializeFromString(long j, FrameMetadata frameMetadata, long j2, int i);

    public static final native boolean FrameMetadata_Equals(long j, FrameMetadata frameMetadata, long j2, FrameMetadata frameMetadata2);

    public static final native float FrameMetadata_GetCurrentTet(long j, FrameMetadata frameMetadata);

    public static final native boolean FrameMetadata_IsFingerprintable(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_Print(long j, FrameMetadata frameMetadata, int i, int i2);

    public static final native void FrameMetadata_SerializeToString__SWIG_0(long j, FrameMetadata frameMetadata, String str, int i, boolean z, boolean z2);

    public static final native void FrameMetadata_SerializeToString__SWIG_1(long j, FrameMetadata frameMetadata, String str, int i, boolean z);

    public static final native void FrameMetadata_SerializeToString__SWIG_2(long j, FrameMetadata frameMetadata, String str, int i);

    public static final native float FrameMetadata_actual_analog_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_analog_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_actual_exposure_time_ms_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_actual_exposure_time_ms_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_ae_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_ae_set(long j, FrameMetadata frameMetadata, long j2, AeMetadata aeMetadata);

    public static final native long FrameMetadata_af_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_af_set(long j, FrameMetadata frameMetadata, long j2, AfMetadata afMetadata);

    public static final native float FrameMetadata_applied_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_applied_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_awb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_awb_set(long j, FrameMetadata frameMetadata, long j2, AwbMetadata awbMetadata);

    public static final native float[] FrameMetadata_black_levels_bayer_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_black_levels_bayer_set(long j, FrameMetadata frameMetadata, float[] fArr);

    public static final native int FrameMetadata_control_mode_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_control_mode_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long[] FrameMetadata_dng_noise_model_bayer_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_dng_noise_model_bayer_set(long j, FrameMetadata frameMetadata, long[] jArr);

    public static final native float FrameMetadata_exposure_time_boost_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_exposure_time_boost_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_f_number_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_f_number_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_faces_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_faces_set(long j, FrameMetadata frameMetadata, long j2, FaceInfoVector faceInfoVector);

    public static final native int FrameMetadata_flash_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_flash_set(long j, FrameMetadata frameMetadata, int i);

    public static final native float FrameMetadata_focal_length_mm_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_focal_length_mm_set(long j, FrameMetadata frameMetadata, float f);

    public static final native float FrameMetadata_focus_distance_diopters_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_focus_distance_diopters_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_geometric_calibration_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_geometric_calibration_set(long j, FrameMetadata frameMetadata, long j2, GeometricCalibrationVector geometricCalibrationVector);

    public static final native long FrameMetadata_gyro_samples_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_gyro_samples_set(long j, FrameMetadata frameMetadata, long j2, GyroSampleVector gyroSampleVector);

    public static final native boolean FrameMetadata_has_exposure_gap_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_has_exposure_gap_set(long j, FrameMetadata frameMetadata, boolean z);

    public static final native long FrameMetadata_isp_metadata_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_isp_metadata_set(long j, FrameMetadata frameMetadata, long j2, IspAwbMetadata ispAwbMetadata);

    public static final native int FrameMetadata_lens_state_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_lens_state_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_live_hdr_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_live_hdr_set(long j, FrameMetadata frameMetadata, long j2, LiveHdrMetadata liveHdrMetadata);

    public static final native float FrameMetadata_mean_signal_level_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_mean_signal_level_set(long j, FrameMetadata frameMetadata, float f);

    public static final native long FrameMetadata_mesh_warp_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_mesh_warp_set(long j, FrameMetadata frameMetadata, long j2, MeshWarp meshWarp);

    public static final native float[] FrameMetadata_neutral_point_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_neutral_point_set(long j, FrameMetadata frameMetadata, float[] fArr);

    public static final native long FrameMetadata_ois_metadata_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_ois_metadata_set(long j, FrameMetadata frameMetadata, long j2, OisMetadata oisMetadata);

    public static final native float FrameMetadata_post_raw_digital_gain_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_post_raw_digital_gain_set(long j, FrameMetadata frameMetadata, float f);

    public static final native int FrameMetadata_scene_flicker_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_scene_flicker_set(long j, FrameMetadata frameMetadata, int i);

    public static final native int FrameMetadata_sensor_id_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sensor_id_set(long j, FrameMetadata frameMetadata, int i);

    public static final native int FrameMetadata_sensor_temp_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_sensor_temp_set(long j, FrameMetadata frameMetadata, int i);

    public static final native float FrameMetadata_temporal_binning_ae_exposure_time_ms_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_temporal_binning_ae_exposure_time_ms_set(long j, FrameMetadata frameMetadata, float f);

    public static final native int FrameMetadata_temporal_binning_factor_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_temporal_binning_factor_set(long j, FrameMetadata frameMetadata, int i);

    public static final native long FrameMetadata_timestamp_ns_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_timestamp_ns_set(long j, FrameMetadata frameMetadata, long j2);

    public static final native boolean FrameMetadata_was_black_level_locked_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_was_black_level_locked_set(long j, FrameMetadata frameMetadata, boolean z);

    public static final native long FrameMetadata_wb_get(long j, FrameMetadata frameMetadata);

    public static final native void FrameMetadata_wb_set(long j, FrameMetadata frameMetadata, long j2, AwbInfo awbInfo);

    public static final native void FrameRequestVector_add(long j, FrameRequestVector frameRequestVector, long j2, FrameRequest frameRequest);

    public static final native long FrameRequestVector_capacity(long j, FrameRequestVector frameRequestVector);

    public static final native void FrameRequestVector_clear(long j, FrameRequestVector frameRequestVector);

    public static final native long FrameRequestVector_get(long j, FrameRequestVector frameRequestVector, int i);

    public static final native boolean FrameRequestVector_isEmpty(long j, FrameRequestVector frameRequestVector);

    public static final native void FrameRequestVector_reserve(long j, FrameRequestVector frameRequestVector, long j2);

    public static final native void FrameRequestVector_set(long j, FrameRequestVector frameRequestVector, int i, long j2, FrameRequest frameRequest);

    public static final native long FrameRequestVector_size(long j, FrameRequestVector frameRequestVector);

    public static final native void FrameRequest_Clear(long j, FrameRequest frameRequest);

    public static final native boolean FrameRequest_Equals(long j, FrameRequest frameRequest, long j2, FrameRequest frameRequest2);

    public static final native float FrameRequest_GetDesiredTet(long j, FrameRequest frameRequest);

    public static final native long FrameRequest_awb_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_awb_set(long j, FrameRequest frameRequest, long j2, AwbInfo awbInfo);

    public static final native float FrameRequest_desired_analog_gain_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_analog_gain_set(long j, FrameRequest frameRequest, float f);

    public static final native float FrameRequest_desired_digital_gain_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_digital_gain_set(long j, FrameRequest frameRequest, float f);

    public static final native float FrameRequest_desired_exposure_time_ms_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_desired_exposure_time_ms_set(long j, FrameRequest frameRequest, float f);

    public static final native boolean FrameRequest_try_to_lock_black_level_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_try_to_lock_black_level_set(long j, FrameRequest frameRequest, boolean z);

    public static final native int FrameRequest_type_get(long j, FrameRequest frameRequest);

    public static final native void FrameRequest_type_set(long j, FrameRequest frameRequest, int i);

    public static final native long GCAM_SAVE_INPUT_METADATA_get();

    public static final native long GCAM_SAVE_INPUT_METERING_get();

    public static final native long GCAM_SAVE_INPUT_PAYLOAD_get();

    public static final native long GCAM_SAVE_NONE_get();

    public static final native long GCAM_SAVE_OTHER_TEXT_get();

    public static final native long GCAM_SAVE_TEXT_get();

    public static final native boolean Gcam_AbortShot(long j, Gcam gcam, int i);

    public static final native boolean Gcam_AddPayloadFrame__SWIG_0(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8, long j9);

    public static final native boolean Gcam_AddPayloadFrame__SWIG_1(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8);

    public static final native boolean Gcam_AddPayloadFrame__SWIG_2(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native boolean Gcam_AddPayloadFrame__SWIG_3(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6);

    public static final native boolean Gcam_AddPayloadFrame__SWIG_4(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView);

    public static final native void Gcam_AddViewfinderFrame__SWIG_0(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, AeShotParams aeShotParams, long j5, RawWriteView rawWriteView, long j6);

    public static final native void Gcam_AddViewfinderFrame__SWIG_1(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, AeShotParams aeShotParams, long j5, RawWriteView rawWriteView);

    public static final native boolean Gcam_AppendMessageToSummary(long j, Gcam gcam, int i, String str);

    public static final native void Gcam_BeginPayloadFrames(long j, Gcam gcam, int i, long j2, BurstSpec burstSpec);

    public static final native long Gcam_BuildAfBurstSpec(long j, Gcam gcam, int i, long j2, RawReadView rawReadView, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap);

    public static final native long Gcam_BuildPayloadBurstSpec(long j, Gcam gcam, int i, long j2, RawReadView rawReadView, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap);

    public static final native long Gcam_ComputeAeResults__SWIG_0(long j, StaticMetadata staticMetadata, long j2, Tuning tuning, long j3, AeShotParams aeShotParams, long j4, RawReadView rawReadView, long j5, FrameMetadata frameMetadata, long j6, SpatialGainMap spatialGainMap, boolean z, long j7);

    public static final native long Gcam_ComputeAeResults__SWIG_1(long j, StaticMetadata staticMetadata, long j2, Tuning tuning, long j3, AeShotParams aeShotParams, long j4, RawReadView rawReadView, long j5, FrameMetadata frameMetadata, long j6, SpatialGainMap spatialGainMap, boolean z);

    public static final native void Gcam_ConfigureViewfinderProcessing(long j, Gcam gcam, long j2, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native long Gcam_Create__SWIG_0(long j, InitParams initParams, long j2, StaticMetadataVector staticMetadataVector);

    public static final native long Gcam_Create__SWIG_1(long j, InitParams initParams, int i, long j2, StaticMetadata staticMetadata);

    public static final native boolean Gcam_EndPayloadFrames(long j, Gcam gcam, int i, long j2, ClientExifMetadata clientExifMetadata);

    public static final native boolean Gcam_EndShotCapture(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushTemporalBinning(long j, Gcam gcam, int i);

    public static final native void Gcam_FlushViewfinder(long j, Gcam gcam, int i);

    public static final native long Gcam_GenerateRgbImage__SWIG_0(long j, StaticMetadata staticMetadata, long j2, ShotParams shotParams, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap, long j5, RawWriteView rawWriteView, int i, long j6, ThreadPoolConfig threadPoolConfig, long j7, GenerateRgbImageOptions generateRgbImageOptions);

    public static final native long Gcam_GenerateRgbImage__SWIG_1(long j, StaticMetadata staticMetadata, long j2, ShotParams shotParams, long j3, FrameMetadata frameMetadata, long j4, SpatialGainMap spatialGainMap, long j5, RawWriteView rawWriteView, int i, long j6, ThreadPoolConfig threadPoolConfig);

    public static final native long Gcam_GetInitParams(long j, Gcam gcam);

    public static final native long Gcam_GetLatestViewfinderResults(long j, Gcam gcam, int i);

    public static final native void Gcam_GetNewShotMemEstimate(long j, Gcam gcam, long j2);

    public static final native int Gcam_GetNumCameras(long j, Gcam gcam);

    public static final native long Gcam_GetStaticMetadata(long j, Gcam gcam, int i);

    public static final native long Gcam_GetTuning(long j, Gcam gcam, int i);

    public static final native boolean Gcam_IsCapturing(long j, Gcam gcam);

    public static final native boolean Gcam_IsIdle(long j, Gcam gcam);

    public static final native boolean Gcam_LimitShotCpuUsage(long j, Gcam gcam, int i, float f);

    public static final native boolean Gcam_OverrideFrameMetadata(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey, long j3, FrameMetadata frameMetadata);

    public static final native long Gcam_PeakMemoryBytes(long j, Gcam gcam);

    public static final native long Gcam_PeakMemoryWithNewShotBytes(long j, Gcam gcam);

    public static final native void Gcam_PrintStatus(long j, Gcam gcam);

    public static final native boolean Gcam_ProcessedByTemporalBinning(long j, Gcam gcam, long j2, FrameMetadataKey frameMetadataKey);

    public static final native int Gcam_StartShotCapture(long j, Gcam gcam, int i, long j2, ShotParams shotParams, long j3, ShotCallbacks shotCallbacks, int i2, long j4, PostviewParams postviewParams, long j5, DebugParams debugParams, long j6, ImageSaverParams imageSaverParams, long j7);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_0(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8, FrameMetadata frameMetadata2, long j9, long j10, RawWriteView rawWriteView2, boolean z, int i2);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_1(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8, FrameMetadata frameMetadata2, long j9, long j10, RawWriteView rawWriteView2, boolean z);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_2(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8, FrameMetadata frameMetadata2, long j9, long j10, RawWriteView rawWriteView2);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_3(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8, FrameMetadata frameMetadata2, long j9);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_4(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16, long j8, FrameMetadata frameMetadata2);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_5(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6, long j7, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_6(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView, long j6);

    public static final native boolean Gcam_TemporallyBinViewfinderFrame__SWIG_7(long j, Gcam gcam, int i, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, long j5, RawWriteView rawWriteView);

    public static final native int GenerateRgbImageOptions_actual_number_of_frames_get(long j, GenerateRgbImageOptions generateRgbImageOptions);

    public static final native void GenerateRgbImageOptions_actual_number_of_frames_set(long j, GenerateRgbImageOptions generateRgbImageOptions, int i);

    public static final native int GenerateRgbImageOptions_expected_number_of_frames_get(long j, GenerateRgbImageOptions generateRgbImageOptions);

    public static final native void GenerateRgbImageOptions_expected_number_of_frames_set(long j, GenerateRgbImageOptions generateRgbImageOptions, int i);

    public static final native boolean GenerateRgbImageOptions_verbose_get(long j, GenerateRgbImageOptions generateRgbImageOptions);

    public static final native void GenerateRgbImageOptions_verbose_set(long j, GenerateRgbImageOptions generateRgbImageOptions, boolean z);

    public static final native void GeometricCalibrationVector_add(long j, GeometricCalibrationVector geometricCalibrationVector, long j2, GeometricCalibration geometricCalibration);

    public static final native long GeometricCalibrationVector_capacity(long j, GeometricCalibrationVector geometricCalibrationVector);

    public static final native void GeometricCalibrationVector_clear(long j, GeometricCalibrationVector geometricCalibrationVector);

    public static final native long GeometricCalibrationVector_get(long j, GeometricCalibrationVector geometricCalibrationVector, int i);

    public static final native boolean GeometricCalibrationVector_isEmpty(long j, GeometricCalibrationVector geometricCalibrationVector);

    public static final native void GeometricCalibrationVector_reserve(long j, GeometricCalibrationVector geometricCalibrationVector, long j2);

    public static final native void GeometricCalibrationVector_set(long j, GeometricCalibrationVector geometricCalibrationVector, int i, long j2, GeometricCalibration geometricCalibration);

    public static final native long GeometricCalibrationVector_size(long j, GeometricCalibrationVector geometricCalibrationVector);

    public static final native boolean GeometricCalibration_Check(long j, GeometricCalibration geometricCalibration);

    public static final native boolean GeometricCalibration_DeserializeFromString(long j, GeometricCalibration geometricCalibration, long j2, int i);

    public static final native boolean GeometricCalibration_Equals(long j, GeometricCalibration geometricCalibration, long j2, GeometricCalibration geometricCalibration2);

    public static final native long GeometricCalibration_GetRandomGeometricCalibration();

    public static final native void GeometricCalibration_SerializeToString(long j, GeometricCalibration geometricCalibration, String str, int i);

    public static final native int GeometricCalibration_TextToGeometricCalibrationQuality(String str);

    public static final native String GeometricCalibration_ToText(int i);

    public static final native int[] GeometricCalibration_active_rectangle_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_active_rectangle_set(long j, GeometricCalibration geometricCalibration, int[] iArr);

    public static final native float[] GeometricCalibration_lens_distortion_extended_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_distortion_extended_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_distortion_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_distortion_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_intrinsic_calibration_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_intrinsic_calibration_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_pose_rotation_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_pose_rotation_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native float[] GeometricCalibration_lens_pose_translation_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_lens_pose_translation_set(long j, GeometricCalibration geometricCalibration, float[] fArr);

    public static final native int GeometricCalibration_quality_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_quality_set(long j, GeometricCalibration geometricCalibration, int i);

    public static final native int[] GeometricCalibration_valid_rectangle_get(long j, GeometricCalibration geometricCalibration);

    public static final native void GeometricCalibration_valid_rectangle_set(long j, GeometricCalibration geometricCalibration, int[] iArr);

    public static final native int GetBitsPerChannel(int i);

    public static final native int GetBitsPerPixel(int i);

    public static final native long GetCustomFileSaver();

    public static final native long GetFactorizeTetOptions(long j, Tuning tuning, long j2, StaticMetadata staticMetadata);

    public static final native long GetFlatSpatialGainMap();

    public static final native boolean GetIccProfileData(int i, long j, long j2);

    public static final native long GetN5N6SpatialGainMap();

    public static final native int GetNumChannels(int i);

    public static final native int GetRandomBayerPattern();

    public static final native long GetRandomFaceInfo();

    public static final native long GetRandomFrameMetadata();

    public static final native long GetRandomInitParams();

    public static final native long GetRandomIspAwbMetadata();

    public static final native long GetRandomMeshWarp();

    public static final native int GetRandomPixelFormat();

    public static final native long GetRandomShotParams();

    public static final native long GetRandomStaticMetadata();

    public static final native long GetRandomWhiteBalance();

    public static final native int GetRawCropping(long j, ShotParams shotParams, long j2, ShotCallbacks shotCallbacks);

    public static final native void GetRotatedImageSize(int i, int i2, int i3, long j, long j2);

    public static final native long GetTrackedMemoryCurrent();

    public static final native long GetTrackedMemoryPeak();

    public static final native boolean GetTuning__SWIG_0(String str, String str2, int i, boolean z, long j, Tuning tuning);

    public static final native boolean GetTuning__SWIG_1(long j, StaticMetadata staticMetadata, boolean z, long j2, Tuning tuning);

    public static final native long GetTypicalSpatialGainMap();

    public static final native long GetUncalibratedStaticMetadata();

    public static final native String GetVersion();

    public static final native void GyroSampleVector_add(long j, GyroSampleVector gyroSampleVector, long j2, GyroSample gyroSample);

    public static final native long GyroSampleVector_capacity(long j, GyroSampleVector gyroSampleVector);

    public static final native void GyroSampleVector_clear(long j, GyroSampleVector gyroSampleVector);

    public static final native long GyroSampleVector_get(long j, GyroSampleVector gyroSampleVector, int i);

    public static final native boolean GyroSampleVector_isEmpty(long j, GyroSampleVector gyroSampleVector);

    public static final native void GyroSampleVector_reserve(long j, GyroSampleVector gyroSampleVector, long j2);

    public static final native void GyroSampleVector_set(long j, GyroSampleVector gyroSampleVector, int i, long j2, GyroSample gyroSample);

    public static final native long GyroSampleVector_size(long j, GyroSampleVector gyroSampleVector);

    public static final native boolean GyroSample_Equals(long j, GyroSample gyroSample, long j2, GyroSample gyroSample2);

    public static final native long GyroSample_timestamp_ns_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_timestamp_ns_set(long j, GyroSample gyroSample, long j2);

    public static final native float GyroSample_x_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_x_set(long j, GyroSample gyroSample, float f);

    public static final native float GyroSample_y_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_y_set(long j, GyroSample gyroSample, float f);

    public static final native float GyroSample_z_get(long j, GyroSample gyroSample);

    public static final native void GyroSample_z_set(long j, GyroSample gyroSample, float f);

    public static final native void ImageReleaseCallback_Run(long j, ImageReleaseCallback imageReleaseCallback, long j2);

    public static final native void ImageReleaseCallback_change_ownership(ImageReleaseCallback imageReleaseCallback, long j, boolean z);

    public static final native void ImageReleaseCallback_director_connect(ImageReleaseCallback imageReleaseCallback, long j, boolean z, boolean z2);

    public static final native void ImageSaverParams_Print(long j, ImageSaverParams imageSaverParams);

    public static final native String ImageSaverParams_dest_folder_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_dest_folder_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native String ImageSaverParams_filename_prefix_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_filename_prefix_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native String ImageSaverParams_filename_suffix_get(long j, ImageSaverParams imageSaverParams);

    public static final native void ImageSaverParams_filename_suffix_set(long j, ImageSaverParams imageSaverParams, String str);

    public static final native String ImageSaver_GetPath(long j, ImageSaver imageSaver, String str);

    public static final native String ImageSaver_GetUniquePath(long j, ImageSaver imageSaver, String str);

    public static final native String ImageSaver_Save__SWIG_0(long j, ImageSaver imageSaver, long j2, InterleavedReadViewU8 interleavedReadViewU8, String str);

    public static final native String ImageSaver_Save__SWIG_1(long j, ImageSaver imageSaver, long j2, InterleavedReadViewU16 interleavedReadViewU16, String str);

    public static final native String ImageSaver_Save__SWIG_2(long j, ImageSaver imageSaver, long j2, String str);

    public static final native String ImageSaver_dest_folder(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_filename_prefix(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_filename_suffix(long j, ImageSaver imageSaver);

    public static final native String ImageSaver_gcam_version(long j, ImageSaver imageSaver);

    public static final native void IncreaseTrackedMemory(long j);

    public static final native void InitCustomFileSaver(long j, FileSaver fileSaver);

    public static final native boolean InitParams_DeserializeFromString__SWIG_0(long j, InitParams initParams, long j2);

    public static final native boolean InitParams_DeserializeFromString__SWIG_1(long j, InitParams initParams, String str);

    public static final native boolean InitParams_Equals(long j, InitParams initParams, long j2, InitParams initParams2);

    public static final native void InitParams_Print(long j, InitParams initParams, int i);

    public static final native void InitParams_SerializeToString(long j, InitParams initParams, String str);

    public static final native boolean InitParams_allow_unknown_devices_get(long j, InitParams initParams);

    public static final native void InitParams_allow_unknown_devices_set(long j, InitParams initParams, boolean z);

    public static final native long InitParams_capture_threads_get(long j, InitParams initParams);

    public static final native void InitParams_capture_threads_set(long j, InitParams initParams, long j2, ThreadPoolConfig threadPoolConfig);

    public static final native long InitParams_custom_file_saver_get(long j, InitParams initParams);

    public static final native void InitParams_custom_file_saver_set(long j, InitParams initParams, long j2, FileSaver fileSaver);

    public static final native int InitParams_execute_finish_on_get(long j, InitParams initParams);

    public static final native void InitParams_execute_finish_on_set(long j, InitParams initParams, int i);

    public static final native long InitParams_finish_queue_empty_callback_get(long j, InitParams initParams);

    public static final native void InitParams_finish_queue_empty_callback_set(long j, InitParams initParams, long j2);

    public static final native long InitParams_finish_threads_get(long j, InitParams initParams);

    public static final native void InitParams_finish_threads_set(long j, InitParams initParams, long j2, ThreadPoolConfig threadPoolConfig);

    public static final native long InitParams_image_release_callback_get(long j, InitParams initParams);

    public static final native void InitParams_image_release_callback_set(long j, InitParams initParams, long j2, ImageReleaseCallback imageReleaseCallback);

    public static final native int InitParams_max_payload_frames_get(long j, InitParams initParams);

    public static final native void InitParams_max_payload_frames_set(long j, InitParams initParams, int i);

    public static final native long InitParams_memory_callback_get(long j, InitParams initParams);

    public static final native void InitParams_memory_callback_set(long j, InitParams initParams, long j2);

    public static final native long InitParams_merge_queue_empty_callback_get(long j, InitParams initParams);

    public static final native void InitParams_merge_queue_empty_callback_set(long j, InitParams initParams, long j2);

    public static final native long InitParams_merge_threads_get(long j, InitParams initParams);

    public static final native void InitParams_merge_threads_set(long j, InitParams initParams, long j2, ThreadPoolConfig threadPoolConfig);

    public static final native String InitParams_serialized_cache_dir_get(long j, InitParams initParams);

    public static final native void InitParams_serialized_cache_dir_set(long j, InitParams initParams, String str);

    public static final native boolean InitParams_simultaneous_merge_and_finish_get(long j, InitParams initParams);

    public static final native void InitParams_simultaneous_merge_and_finish_set(long j, InitParams initParams, boolean z);

    public static final native boolean InitParams_verbose_get(long j, InitParams initParams);

    public static final native void InitParams_verbose_set(long j, InitParams initParams, boolean z);

    public static final native void Int64Vector_add(long j, Int64Vector int64Vector, long j2);

    public static final native long Int64Vector_capacity(long j, Int64Vector int64Vector);

    public static final native void Int64Vector_clear(long j, Int64Vector int64Vector);

    public static final native long Int64Vector_get(long j, Int64Vector int64Vector, int i);

    public static final native boolean Int64Vector_isEmpty(long j, Int64Vector int64Vector);

    public static final native void Int64Vector_reserve(long j, Int64Vector int64Vector, long j2);

    public static final native void Int64Vector_set(long j, Int64Vector int64Vector, int i, long j2);

    public static final native long Int64Vector_size(long j, Int64Vector int64Vector);

    public static final native void InterleavedImageF_FastCrop_SWIG_0_0(long j, InterleavedImageF interleavedImageF, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedImageF_FastCrop_SWIG_0_1(long j, InterleavedImageF interleavedImageF, int i, int i2, int i3, int i4);

    public static final native long InterleavedImageF_SWIGUpcast(long j);

    public static final native boolean InterleavedImageF_SamplesAreCompact(long j, InterleavedImageF interleavedImageF);

    public static final native long InterleavedImageF_allocator(long j, InterleavedImageF interleavedImageF);

    public static final native long InterleavedImageF_c_stride(long j, InterleavedImageF interleavedImageF);

    public static final native int InterleavedImageF_height(long j, InterleavedImageF interleavedImageF);

    public static final native int InterleavedImageF_num_channels(long j, InterleavedImageF interleavedImageF);

    public static final native int InterleavedImageF_row_padding(long j, InterleavedImageF interleavedImageF);

    public static final native long InterleavedImageF_sample_array_size(long j, InterleavedImageF interleavedImageF);

    public static final native long InterleavedImageF_sizeof_sample_type(long j, InterleavedImageF interleavedImageF);

    public static final native int InterleavedImageF_width(long j, InterleavedImageF interleavedImageF);

    public static final native long InterleavedImageF_x_stride(long j, InterleavedImageF interleavedImageF);

    public static final native long InterleavedImageF_y_stride(long j, InterleavedImageF interleavedImageF);

    public static final native void InterleavedImageU16_FastCrop_SWIG_0_0(long j, InterleavedImageU16 interleavedImageU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedImageU16_FastCrop_SWIG_0_1(long j, InterleavedImageU16 interleavedImageU16, int i, int i2, int i3, int i4);

    public static final native long InterleavedImageU16_SWIGUpcast(long j);

    public static final native boolean InterleavedImageU16_SamplesAreCompact(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_allocator(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_c_stride(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_height(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_num_channels(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_row_padding(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_sample_array_size(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_sizeof_sample_type(long j, InterleavedImageU16 interleavedImageU16);

    public static final native int InterleavedImageU16_width(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_x_stride(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long InterleavedImageU16_y_stride(long j, InterleavedImageU16 interleavedImageU16);

    public static final native void InterleavedImageU8_FastCrop_SWIG_0_0(long j, InterleavedImageU8 interleavedImageU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedImageU8_FastCrop_SWIG_0_1(long j, InterleavedImageU8 interleavedImageU8, int i, int i2, int i3, int i4);

    public static final native long InterleavedImageU8_SWIGUpcast(long j);

    public static final native boolean InterleavedImageU8_SamplesAreCompact(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_allocator(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_c_stride(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_height(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_num_channels(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_row_padding(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_sample_array_size(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_sizeof_sample_type(long j, InterleavedImageU8 interleavedImageU8);

    public static final native int InterleavedImageU8_width(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_x_stride(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long InterleavedImageU8_y_stride(long j, InterleavedImageU8 interleavedImageU8);

    public static final native boolean InterleavedReadViewF_Empty(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native void InterleavedReadViewF_FastCrop__SWIG_0(long j, InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedReadViewF_FastCrop__SWIG_1(long j, InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3, int i4);

    public static final native boolean InterleavedReadViewF_SamplesAreCompact(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native float InterleavedReadViewF_at(long j, InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3);

    public static final native long InterleavedReadViewF_base_pointer(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long InterleavedReadViewF_c_stride(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native int InterleavedReadViewF_height(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native int InterleavedReadViewF_num_channels(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native int InterleavedReadViewF_row_padding(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long InterleavedReadViewF_sample_array_size(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long InterleavedReadViewF_sample_iterator__SWIG_0(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long InterleavedReadViewF_sample_iterator__SWIG_1(long j, InterleavedReadViewF interleavedReadViewF, int i);

    public static final native int InterleavedReadViewF_sample_layout();

    public static final native long InterleavedReadViewF_sizeof_sample_type(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native int InterleavedReadViewF_width(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long InterleavedReadViewF_x_stride(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long InterleavedReadViewF_y_stride(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native boolean InterleavedReadViewU16_Empty(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native void InterleavedReadViewU16_FastCrop__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedReadViewU16_FastCrop__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4);

    public static final native boolean InterleavedReadViewU16_SamplesAreCompact(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_at(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3);

    public static final native long InterleavedReadViewU16_base_pointer(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_c_stride(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_height(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_num_channels(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_row_padding(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_sample_array_size(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_sample_iterator__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_sample_iterator__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, int i);

    public static final native int InterleavedReadViewU16_sample_layout();

    public static final native long InterleavedReadViewU16_sizeof_sample_type(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native int InterleavedReadViewU16_width(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_x_stride(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long InterleavedReadViewU16_y_stride(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native boolean InterleavedReadViewU8_Empty(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native void InterleavedReadViewU8_FastCrop__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedReadViewU8_FastCrop__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4);

    public static final native boolean InterleavedReadViewU8_SamplesAreCompact(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native short InterleavedReadViewU8_at(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3);

    public static final native long InterleavedReadViewU8_base_pointer(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_c_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_height(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_num_channels(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_row_padding(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_sample_array_size(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_sample_iterator__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_sample_iterator__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8, int i);

    public static final native int InterleavedReadViewU8_sample_layout();

    public static final native long InterleavedReadViewU8_sizeof_sample_type(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native int InterleavedReadViewU8_width(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_x_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedReadViewU8_y_stride(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long InterleavedU16Allocation_id_get(long j, InterleavedU16Allocation interleavedU16Allocation);

    public static final native void InterleavedU16Allocation_id_set(long j, InterleavedU16Allocation interleavedU16Allocation, long j2);

    public static final native long InterleavedU16Allocation_view_get(long j, InterleavedU16Allocation interleavedU16Allocation);

    public static final native void InterleavedU16Allocation_view_set(long j, InterleavedU16Allocation interleavedU16Allocation, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedU8Allocation_id_get(long j, InterleavedU8Allocation interleavedU8Allocation);

    public static final native void InterleavedU8Allocation_id_set(long j, InterleavedU8Allocation interleavedU8Allocation, long j2);

    public static final native long InterleavedU8Allocation_view_get(long j, InterleavedU8Allocation interleavedU8Allocation);

    public static final native void InterleavedU8Allocation_view_set(long j, InterleavedU8Allocation interleavedU8Allocation, long j2, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native void InterleavedWriteViewF_FastCrop_SWIG_0_0(long j, InterleavedWriteViewF interleavedWriteViewF, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedWriteViewF_FastCrop_SWIG_0_1(long j, InterleavedWriteViewF interleavedWriteViewF, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewF_Fill__SWIG_0(long j, InterleavedWriteViewF interleavedWriteViewF, float f, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewF_Fill__SWIG_1(long j, InterleavedWriteViewF interleavedWriteViewF, float f);

    public static final native long InterleavedWriteViewF_SWIGUpcast(long j);

    public static final native boolean InterleavedWriteViewF_SamplesAreCompact(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_at_InterleavedWriteViewF(long j, InterleavedWriteViewF interleavedWriteViewF, int i, int i2, int i3);

    public static final native long InterleavedWriteViewF_base_pointer(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_c_stride(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native int InterleavedWriteViewF_height(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native int InterleavedWriteViewF_num_channels(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native int InterleavedWriteViewF_row_padding(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_sample_array_size(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_sample_iterator_InterleavedWriteViewF__SWIG_0(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_sample_iterator_InterleavedWriteViewF__SWIG_1(long j, InterleavedWriteViewF interleavedWriteViewF, int i);

    public static final native long InterleavedWriteViewF_sizeof_sample_type(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native int InterleavedWriteViewF_width(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_x_stride(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long InterleavedWriteViewF_y_stride(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native void InterleavedWriteViewU16_FastCrop_SWIG_0_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedWriteViewU16_FastCrop_SWIG_0_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewU16_Fill__SWIG_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5);

    public static final native void InterleavedWriteViewU16_Fill__SWIG_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i);

    public static final native long InterleavedWriteViewU16_SWIGUpcast(long j);

    public static final native boolean InterleavedWriteViewU16_SamplesAreCompact(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_at_InterleavedWriteViewU16(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3);

    public static final native long InterleavedWriteViewU16_base_pointer(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_c_stride(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_height(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_num_channels(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_row_padding(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_sample_array_size(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_sample_iterator_InterleavedWriteViewU16__SWIG_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_sample_iterator_InterleavedWriteViewU16__SWIG_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i);

    public static final native long InterleavedWriteViewU16_sizeof_sample_type(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native int InterleavedWriteViewU16_width(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_x_stride(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long InterleavedWriteViewU16_y_stride(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native void InterleavedWriteViewU8_FastCrop_SWIG_0_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native void InterleavedWriteViewU8_FastCrop_SWIG_0_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewU8_Fill__SWIG_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8, short s, int i, int i2, int i3, int i4);

    public static final native void InterleavedWriteViewU8_Fill__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, short s);

    public static final native long InterleavedWriteViewU8_SWIGUpcast(long j);

    public static final native boolean InterleavedWriteViewU8_SamplesAreCompact(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_at_InterleavedWriteViewU8(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3);

    public static final native long InterleavedWriteViewU8_base_pointer(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_c_stride(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_height(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_num_channels(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_row_padding(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_sample_array_size(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_sample_iterator_InterleavedWriteViewU8__SWIG_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_sample_iterator_InterleavedWriteViewU8__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i);

    public static final native long InterleavedWriteViewU8_sizeof_sample_type(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native int InterleavedWriteViewU8_width(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_x_stride(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long InterleavedWriteViewU8_y_stride(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long Intersect__SWIG_0(long j, PixelRect pixelRect, long j2, PixelRect pixelRect2);

    public static final native long Intersect__SWIG_1(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native boolean IsIpuOffload(int i);

    public static final native boolean IsLogical(int i);

    public static final native boolean IsMergedRawFullSized(int i);

    public static final native boolean IsPlanar(int i);

    public static final native boolean IsRgb16(int i);

    public static final native boolean IsRgb8(int i);

    public static final native boolean IsValidSensorId(int i);

    public static final native boolean IsYuv(int i);

    public static final native boolean IspAwbMetadata_DeserializeFromString(long j, IspAwbMetadata ispAwbMetadata, long j2);

    public static final native boolean IspAwbMetadata_Equals(long j, IspAwbMetadata ispAwbMetadata, long j2, IspAwbMetadata ispAwbMetadata2);

    public static final native long IspAwbMetadata_SerializeToBytes(long j, IspAwbMetadata ispAwbMetadata);

    public static final native String IspAwbMetadata_SerializeToString(long j, IspAwbMetadata ispAwbMetadata, int i);

    public static final native long IspAwbMetadata_Statistics_count_rggb_get(long j, IspAwbMetadata.Statistics statistics);

    public static final native void IspAwbMetadata_Statistics_count_rggb_set(long j, IspAwbMetadata.Statistics statistics, long j2);

    public static final native long IspAwbMetadata_Statistics_count_sat_rggb_get(long j, IspAwbMetadata.Statistics statistics);

    public static final native void IspAwbMetadata_Statistics_count_sat_rggb_set(long j, IspAwbMetadata.Statistics statistics, long j2);

    public static final native long IspAwbMetadata_Statistics_sum_rggb_get(long j, IspAwbMetadata.Statistics statistics);

    public static final native void IspAwbMetadata_Statistics_sum_rggb_set(long j, IspAwbMetadata.Statistics statistics, long j2);

    public static final native long IspAwbMetadata_Statistics_sum_sat_rggb_get(long j, IspAwbMetadata.Statistics statistics);

    public static final native void IspAwbMetadata_Statistics_sum_sat_rggb_set(long j, IspAwbMetadata.Statistics statistics, long j2);

    public static final native int IspAwbMetadata_bit_depth_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_bit_depth_set(long j, IspAwbMetadata ispAwbMetadata, int i);

    public static final native int IspAwbMetadata_max_intensity_b_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_max_intensity_b_set(long j, IspAwbMetadata ispAwbMetadata, int i);

    public static final native int IspAwbMetadata_max_intensity_gb_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_max_intensity_gb_set(long j, IspAwbMetadata ispAwbMetadata, int i);

    public static final native int IspAwbMetadata_max_intensity_gr_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_max_intensity_gr_set(long j, IspAwbMetadata ispAwbMetadata, int i);

    public static final native int IspAwbMetadata_max_intensity_r_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_max_intensity_r_set(long j, IspAwbMetadata ispAwbMetadata, int i);

    public static final native long IspAwbMetadata_number_of_region_x_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_number_of_region_x_set(long j, IspAwbMetadata ispAwbMetadata, long j2);

    public static final native long IspAwbMetadata_number_of_region_y_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_number_of_region_y_set(long j, IspAwbMetadata ispAwbMetadata, long j2);

    public static final native long IspAwbMetadata_region_height_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_region_height_set(long j, IspAwbMetadata ispAwbMetadata, long j2);

    public static final native long IspAwbMetadata_region_width_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_region_width_set(long j, IspAwbMetadata ispAwbMetadata, long j2);

    public static final native long IspAwbMetadata_stats_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_stats_set(long j, IspAwbMetadata ispAwbMetadata, long j2, IspAwbMetadata.Statistics statistics);

    public static final native boolean IspAwbMetadata_valid_saturation_data_get(long j, IspAwbMetadata ispAwbMetadata);

    public static final native void IspAwbMetadata_valid_saturation_data_set(long j, IspAwbMetadata ispAwbMetadata, boolean z);

    public static final native long JpgEncodeOptions_exif_data_get(long j, JpgEncodeOptions jpgEncodeOptions);

    public static final native void JpgEncodeOptions_exif_data_set(long j, JpgEncodeOptions jpgEncodeOptions, long j2, ExifMetadata exifMetadata);

    public static final native int JpgEncodeOptions_pixel_format_get(long j, JpgEncodeOptions jpgEncodeOptions);

    public static final native void JpgEncodeOptions_pixel_format_set(long j, JpgEncodeOptions jpgEncodeOptions, int i);

    public static final native int JpgEncodeOptions_quality_get(long j, JpgEncodeOptions jpgEncodeOptions);

    public static final native void JpgEncodeOptions_quality_set(long j, JpgEncodeOptions jpgEncodeOptions, int i);

    public static final native void LandmarkMap_clear(long j, LandmarkMap landmarkMap);

    public static final native void LandmarkMap_del(long j, LandmarkMap landmarkMap, int i);

    public static final native boolean LandmarkMap_empty(long j, LandmarkMap landmarkMap);

    public static final native long LandmarkMap_get(long j, LandmarkMap landmarkMap, int i);

    public static final native boolean LandmarkMap_has_key(long j, LandmarkMap landmarkMap, int i);

    public static final native void LandmarkMap_set(long j, LandmarkMap landmarkMap, int i, long j2, FaceInfo.Landmark landmark);

    public static final native long LandmarkMap_size(long j, LandmarkMap landmarkMap);

    public static final native long Lerp(long j, RawVignetteParams rawVignetteParams, long j2, RawVignetteParams rawVignetteParams2, float f);

    public static final native boolean LiveHdrMetadata_DeserializeFromString(long j, LiveHdrMetadata liveHdrMetadata, long j2, int i);

    public static final native boolean LiveHdrMetadata_Equals(long j, LiveHdrMetadata liveHdrMetadata, long j2, LiveHdrMetadata liveHdrMetadata2);

    public static final native void LiveHdrMetadata_SerializeToString(long j, LiveHdrMetadata liveHdrMetadata, String str, int i);

    public static final native float LiveHdrMetadata_filtered_motion_speed_pix_per_ms_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_filtered_motion_speed_pix_per_ms_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_final_long_tet_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_final_long_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_final_short_tet_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_final_short_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_gcam_ae_touch_weight_scale_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_gcam_ae_touch_weight_scale_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_ideal_long_tet_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_ideal_long_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_ideal_short_tet_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_ideal_short_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_log_scene_brightness_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_log_scene_brightness_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_ec_long_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_ec_long_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_ec_short_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_ec_short_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_long_tet_override_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_long_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_manual_short_tet_override_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_manual_short_tet_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_max_hdr_ratio_override_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_max_hdr_ratio_override_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_metering_interval_ms_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_metering_interval_ms_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_motion_magnitude_pix_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_motion_magnitude_pix_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_predicted_image_brightness_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_predicted_image_brightness_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_pure_fraction_of_pixels_from_long_exposure_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_pure_fraction_of_pixels_from_long_exposure_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_safe_underexposure_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_safe_underexposure_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_viewfinder_long_tet_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_viewfinder_long_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_viewfinder_short_tet_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_viewfinder_short_tet_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native float LiveHdrMetadata_weighted_fraction_of_pixels_from_long_exposure_get(long j, LiveHdrMetadata liveHdrMetadata);

    public static final native void LiveHdrMetadata_weighted_fraction_of_pixels_from_long_exposure_set(long j, LiveHdrMetadata liveHdrMetadata, float f);

    public static final native int LiveHdrParams_ae_stats_width_get(long j, LiveHdrParams liveHdrParams);

    public static final native void LiveHdrParams_ae_stats_width_set(long j, LiveHdrParams liveHdrParams, int i);

    public static final native long LiveHdrParams_lowest_trustable_motion_per_log_sb_get(long j, LiveHdrParams liveHdrParams);

    public static final native void LiveHdrParams_lowest_trustable_motion_per_log_sb_set(long j, LiveHdrParams liveHdrParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native boolean LocationData_Check(long j, LocationData locationData);

    public static final native void LocationData_Clear(long j, LocationData locationData);

    public static final native boolean LocationData_Equals(long j, LocationData locationData, long j2, LocationData locationData2);

    public static final native double LocationData_altitude_get(long j, LocationData locationData);

    public static final native void LocationData_altitude_set(long j, LocationData locationData, double d);

    public static final native double LocationData_degree_of_precision_get(long j, LocationData locationData);

    public static final native void LocationData_degree_of_precision_set(long j, LocationData locationData, double d);

    public static final native double LocationData_latitude_get(long j, LocationData locationData);

    public static final native void LocationData_latitude_set(long j, LocationData locationData, double d);

    public static final native double LocationData_longitude_get(long j, LocationData locationData);

    public static final native void LocationData_longitude_set(long j, LocationData locationData, double d);

    public static final native String LocationData_processing_method_get(long j, LocationData locationData);

    public static final native void LocationData_processing_method_set(long j, LocationData locationData, String str);

    public static final native long LocationData_timestamp_unix_get(long j, LocationData locationData);

    public static final native void LocationData_timestamp_unix_set(long j, LocationData locationData, long j2);

    public static final native long MakeRandomDehazeParams();

    public static final native long MakeRandomDenoiseParams();

    public static final native long MakeRandomSharpenParams();

    public static final native long MakeSharpenCurve(float f, float f2, float f3);

    public static final native long MakeTetWaypoint(float f, float f2);

    public static final native int MeshTranslation_x_get(long j, MeshTranslation meshTranslation);

    public static final native void MeshTranslation_x_set(long j, MeshTranslation meshTranslation, int i);

    public static final native int MeshTranslation_y_get(long j, MeshTranslation meshTranslation);

    public static final native void MeshTranslation_y_set(long j, MeshTranslation meshTranslation, int i);

    public static final native boolean MeshWarp_Check(long j, MeshWarp meshWarp);

    public static final native boolean MeshWarp_DeserializeFromString(long j, MeshWarp meshWarp, long j2, int i);

    public static final native boolean MeshWarp_Equals(long j, MeshWarp meshWarp, long j2, MeshWarp meshWarp2);

    public static final native void MeshWarp_SerializeToString(long j, MeshWarp meshWarp, String str, int i);

    public static final native long MeshWarp_TranslationHint(long j, MeshWarp meshWarp);

    public static final native int MeshWarp_grid_cols_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_grid_cols_set(long j, MeshWarp meshWarp, int i);

    public static final native int MeshWarp_grid_rows_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_grid_rows_set(long j, MeshWarp meshWarp, int i);

    public static final native long MeshWarp_mesh_warp_crop_region_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_mesh_warp_crop_region_set(long j, MeshWarp meshWarp, long j2, PixelRect pixelRect);

    public static final native long MeshWarp_mesh_warp_data_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_mesh_warp_data_set(long j, MeshWarp meshWarp, long j2, FloatVector floatVector);

    public static final native long MeshWarp_mesh_warp_dst_region_get(long j, MeshWarp meshWarp);

    public static final native void MeshWarp_mesh_warp_dst_region_set(long j, MeshWarp meshWarp, long j2, PixelRect pixelRect);

    public static final native long NewDeleteInterleavedU16Allocator_Allocate(long j, NewDeleteInterleavedU16Allocator newDeleteInterleavedU16Allocator, int i, int i2, int i3);

    public static final native void NewDeleteInterleavedU16Allocator_Release(long j, NewDeleteInterleavedU16Allocator newDeleteInterleavedU16Allocator, long j2);

    public static final native long NewDeleteInterleavedU16Allocator_SWIGUpcast(long j);

    public static final native long NewDeleteInterleavedU8Allocator_Allocate(long j, NewDeleteInterleavedU8Allocator newDeleteInterleavedU8Allocator, int i, int i2, int i3);

    public static final native void NewDeleteInterleavedU8Allocator_Release(long j, NewDeleteInterleavedU8Allocator newDeleteInterleavedU8Allocator, long j2);

    public static final native long NewDeleteInterleavedU8Allocator_SWIGUpcast(long j);

    public static final native long NewDeleteRawAllocator_Allocate(long j, NewDeleteRawAllocator newDeleteRawAllocator, int i, int i2, int i3);

    public static final native void NewDeleteRawAllocator_Release(long j, NewDeleteRawAllocator newDeleteRawAllocator, long j2);

    public static final native long NewDeleteRawAllocator_SWIGUpcast(long j);

    public static final native long NewDeleteYuvAllocator_Allocate(long j, NewDeleteYuvAllocator newDeleteYuvAllocator, int i, int i2, int i3);

    public static final native void NewDeleteYuvAllocator_Release(long j, NewDeleteYuvAllocator newDeleteYuvAllocator, long j2);

    public static final native long NewDeleteYuvAllocator_SWIGUpcast(long j);

    public static final native float NormalizedRect_AspectRatio(long j, NormalizedRect normalizedRect);

    public static final native boolean NormalizedRect_Check(long j, NormalizedRect normalizedRect);

    public static final native boolean NormalizedRect_Contains(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native boolean NormalizedRect_DeserializeFromString(long j, NormalizedRect normalizedRect, long j2);

    public static final native boolean NormalizedRect_Equals(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native long NormalizedRect_FromPixelRect(long j, PixelRect pixelRect, int i, int i2);

    public static final native float NormalizedRect_InverseAspectRatio(long j, NormalizedRect normalizedRect);

    public static final native boolean NormalizedRect_IsEmpty(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_Print(long j, NormalizedRect normalizedRect, int i, int i2);

    public static final native void NormalizedRect_SerializeToString(long j, NormalizedRect normalizedRect, String str, int i);

    public static final native float NormalizedRect_height(long j, NormalizedRect normalizedRect);

    public static final native float NormalizedRect_width(long j, NormalizedRect normalizedRect);

    public static final native float NormalizedRect_x0_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_x0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native float NormalizedRect_x1_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_x1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native float NormalizedRect_y0_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_y0_set(long j, NormalizedRect normalizedRect, float f);

    public static final native float NormalizedRect_y1_get(long j, NormalizedRect normalizedRect);

    public static final native void NormalizedRect_y1_set(long j, NormalizedRect normalizedRect, float f);

    public static final native boolean OisMetadata_Equals(long j, OisMetadata oisMetadata, long j2, OisMetadata oisMetadata2);

    public static final native int OisMetadata_lens_optical_stabilization_mode_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_lens_optical_stabilization_mode_set(long j, OisMetadata oisMetadata, int i);

    public static final native long OisMetadata_ois_positions_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_ois_positions_set(long j, OisMetadata oisMetadata, long j2, OisPositionVector oisPositionVector);

    public static final native long OisMetadata_timestamp_ois_clock_ns_get(long j, OisMetadata oisMetadata);

    public static final native void OisMetadata_timestamp_ois_clock_ns_set(long j, OisMetadata oisMetadata, long j2);

    public static final native void OisPositionVector_add(long j, OisPositionVector oisPositionVector, long j2, OisPosition oisPosition);

    public static final native long OisPositionVector_capacity(long j, OisPositionVector oisPositionVector);

    public static final native void OisPositionVector_clear(long j, OisPositionVector oisPositionVector);

    public static final native long OisPositionVector_get(long j, OisPositionVector oisPositionVector, int i);

    public static final native boolean OisPositionVector_isEmpty(long j, OisPositionVector oisPositionVector);

    public static final native void OisPositionVector_reserve(long j, OisPositionVector oisPositionVector, long j2);

    public static final native void OisPositionVector_set(long j, OisPositionVector oisPositionVector, int i, long j2, OisPosition oisPosition);

    public static final native long OisPositionVector_size(long j, OisPositionVector oisPositionVector);

    public static final native boolean OisPosition_Equals(long j, OisPosition oisPosition, long j2, OisPosition oisPosition2);

    public static final native float OisPosition_shift_pixel_x_get(long j, OisPosition oisPosition);

    public static final native void OisPosition_shift_pixel_x_set(long j, OisPosition oisPosition, float f);

    public static final native float OisPosition_shift_pixel_y_get(long j, OisPosition oisPosition);

    public static final native void OisPosition_shift_pixel_y_set(long j, OisPosition oisPosition, float f);

    public static final native long OisPosition_timestamp_ns_get(long j, OisPosition oisPosition);

    public static final native void OisPosition_timestamp_ns_set(long j, OisPosition oisPosition, long j2);

    public static final native boolean OpaqueHandleWrapper_Empty(long j, OpaqueHandleWrapper opaqueHandleWrapper);

    public static final native long OpaqueHandleWrapper_opaque_handle_get(long j, OpaqueHandleWrapper opaqueHandleWrapper);

    public static final native void OpaqueHandleWrapper_opaque_handle_set(long j, OpaqueHandleWrapper opaqueHandleWrapper, long j2);

    public static final native boolean PackedImageRaw10_FastCrop(long j, PackedImageRaw10 packedImageRaw10, int i, int i2, int i3, int i4);

    public static final native long PackedImageRaw10_SWIGUpcast(long j);

    public static final native long PackedImageRaw10_packed_image(long j, PackedImageRaw10 packedImageRaw10);

    public static final native boolean PackedImageRaw12_FastCrop(long j, PackedImageRaw12 packedImageRaw12, int i, int i2, int i3, int i4);

    public static final native long PackedImageRaw12_SWIGUpcast(long j);

    public static final native long PackedImageRaw12_packed_image(long j, PackedImageRaw12 packedImageRaw12);

    public static final native boolean PackedReadViewRaw10_Empty(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native boolean PackedReadViewRaw10_FastCrop(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2, int i3, int i4);

    public static final native void PackedReadViewRaw10_Unpack(long j, PackedReadViewRaw10 packedReadViewRaw10, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native void PackedReadViewRaw10_UnpackRow__SWIG_0(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2, int i3, long j2);

    public static final native void PackedReadViewRaw10_UnpackRow__SWIG_1(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, long j2);

    public static final native int PackedReadViewRaw10_at__SWIG_0(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2);

    public static final native int PackedReadViewRaw10_at__SWIG_1(long j, PackedReadViewRaw10 packedReadViewRaw10, int i, int i2, int i3);

    public static final native int PackedReadViewRaw10_height(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native int PackedReadViewRaw10_num_channels(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long PackedReadViewRaw10_packed_read_view(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long PackedReadViewRaw10_sample_array_size(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long PackedReadViewRaw10_sample_iterator(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native int PackedReadViewRaw10_width(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native boolean PackedReadViewRaw12_Empty(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native boolean PackedReadViewRaw12_FastCrop(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2, int i3, int i4);

    public static final native void PackedReadViewRaw12_Unpack(long j, PackedReadViewRaw12 packedReadViewRaw12, long j2, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native void PackedReadViewRaw12_UnpackRow__SWIG_0(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2, int i3, long j2);

    public static final native void PackedReadViewRaw12_UnpackRow__SWIG_1(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, long j2);

    public static final native int PackedReadViewRaw12_at__SWIG_0(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2);

    public static final native int PackedReadViewRaw12_at__SWIG_1(long j, PackedReadViewRaw12 packedReadViewRaw12, int i, int i2, int i3);

    public static final native int PackedReadViewRaw12_height(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native int PackedReadViewRaw12_num_channels(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long PackedReadViewRaw12_packed_read_view(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long PackedReadViewRaw12_sample_array_size(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long PackedReadViewRaw12_sample_iterator(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native int PackedReadViewRaw12_width(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native boolean PackedReadWriteViewRaw10_FastCrop(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, int i2, int i3, int i4);

    public static final native long PackedReadWriteViewRaw10_SWIGUpcast(long j);

    public static final native long PackedReadWriteViewRaw10_packed_write_view(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10);

    public static final native void PackedReadWriteViewRaw10_set_pixel(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, int i2, int i3);

    public static final native void PackedReadWriteViewRaw10_set_row__SWIG_0(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, int i2, int i3, long j2);

    public static final native void PackedReadWriteViewRaw10_set_row__SWIG_1(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10, int i, long j2);

    public static final native boolean PackedReadWriteViewRaw12_FastCrop(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, int i2, int i3, int i4);

    public static final native long PackedReadWriteViewRaw12_SWIGUpcast(long j);

    public static final native long PackedReadWriteViewRaw12_packed_write_view(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12);

    public static final native void PackedReadWriteViewRaw12_set_pixel(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, int i2, int i3);

    public static final native void PackedReadWriteViewRaw12_set_row__SWIG_0(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, int i2, int i3, long j2);

    public static final native void PackedReadWriteViewRaw12_set_row__SWIG_1(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12, int i, long j2);

    public static final native long ParameterizedSpatialGainMap(int i, int i2, float f, float f2, float f3);

    public static final native void PdImageCallback_ImageReady(long j, PdImageCallback pdImageCallback, int i, long j2, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native void PdImageCallback_MergePdFailed(long j, PdImageCallback pdImageCallback, int i);

    public static final native void PdImageCallback_change_ownership(PdImageCallback pdImageCallback, long j, boolean z);

    public static final native void PdImageCallback_director_connect(PdImageCallback pdImageCallback, long j, boolean z, boolean z2);

    public static final native float PhysicalStabilityParams_max_handheld_shot_capture_time_ms_get(long j, PhysicalStabilityParams physicalStabilityParams);

    public static final native void PhysicalStabilityParams_max_handheld_shot_capture_time_ms_set(long j, PhysicalStabilityParams physicalStabilityParams, float f);

    public static final native long PhysicalStabilityParams_thresholds_get(long j, PhysicalStabilityParams physicalStabilityParams);

    public static final native void PhysicalStabilityParams_thresholds_set(long j, PhysicalStabilityParams physicalStabilityParams, long j2, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native float PhysicalStabilityParams_tripod_max_exposure_time_ms_get(long j, PhysicalStabilityParams physicalStabilityParams);

    public static final native void PhysicalStabilityParams_tripod_max_exposure_time_ms_set(long j, PhysicalStabilityParams physicalStabilityParams, float f);

    public static final native long PhysicalStabilityThresholds_Get(String str);

    public static final native float PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native void PhysicalStabilityThresholds_braced_speed_rad_per_sec_set(long j, PhysicalStabilityThresholds physicalStabilityThresholds, float f);

    public static final native float PhysicalStabilityThresholds_handheld_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native void PhysicalStabilityThresholds_handheld_speed_rad_per_sec_set(long j, PhysicalStabilityThresholds physicalStabilityThresholds, float f);

    public static final native float PhysicalStabilityThresholds_min_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native void PhysicalStabilityThresholds_min_speed_rad_per_sec_set(long j, PhysicalStabilityThresholds physicalStabilityThresholds, float f);

    public static final native float PhysicalStabilityThresholds_tripod_speed_rad_per_sec_get(long j, PhysicalStabilityThresholds physicalStabilityThresholds);

    public static final native void PhysicalStabilityThresholds_tripod_speed_rad_per_sec_set(long j, PhysicalStabilityThresholds physicalStabilityThresholds, float f);

    public static final native long PixelRectToFaceInfo__SWIG_0(long j, PixelRect pixelRect, float f, int i, int i2, int i3);

    public static final native long PixelRectToFaceInfo__SWIG_1(long j, PixelRect pixelRect, float f, int i, int i2);

    public static final native void PixelRectVector_add(long j, PixelRectVector pixelRectVector, long j2, PixelRect pixelRect);

    public static final native long PixelRectVector_capacity(long j, PixelRectVector pixelRectVector);

    public static final native void PixelRectVector_clear(long j, PixelRectVector pixelRectVector);

    public static final native long PixelRectVector_get(long j, PixelRectVector pixelRectVector, int i);

    public static final native boolean PixelRectVector_isEmpty(long j, PixelRectVector pixelRectVector);

    public static final native void PixelRectVector_reserve(long j, PixelRectVector pixelRectVector, long j2);

    public static final native void PixelRectVector_set(long j, PixelRectVector pixelRectVector, int i, long j2, PixelRect pixelRect);

    public static final native long PixelRectVector_size(long j, PixelRectVector pixelRectVector);

    public static final native int PixelRect_Area(long j, PixelRect pixelRect);

    public static final native float PixelRect_AspectRatio(long j, PixelRect pixelRect);

    public static final native boolean PixelRect_Check(long j, PixelRect pixelRect);

    public static final native boolean PixelRect_Contains(long j, PixelRect pixelRect, long j2, PixelRect pixelRect2);

    public static final native boolean PixelRect_DeserializeFromString(long j, PixelRect pixelRect, long j2);

    public static final native boolean PixelRect_Equals(long j, PixelRect pixelRect, long j2, PixelRect pixelRect2);

    public static final native void PixelRect_Inflate(long j, PixelRect pixelRect, int i, int i2);

    public static final native long PixelRect_Inflated(long j, PixelRect pixelRect, int i, int i2);

    public static final native float PixelRect_InverseAspectRatio(long j, PixelRect pixelRect);

    public static final native boolean PixelRect_IsEmpty(long j, PixelRect pixelRect);

    public static final native void PixelRect_Print(long j, PixelRect pixelRect, int i, int i2);

    public static final native void PixelRect_ScaleBy(long j, PixelRect pixelRect, float f);

    public static final native void PixelRect_SerializeToString(long j, PixelRect pixelRect, String str, int i);

    public static final native void PixelRect_ShiftBy(long j, PixelRect pixelRect, int i, int i2);

    public static final native long PixelRect_ShiftedBy(long j, PixelRect pixelRect, int i, int i2);

    public static final native int PixelRect_height(long j, PixelRect pixelRect);

    public static final native int PixelRect_width(long j, PixelRect pixelRect);

    public static final native int PixelRect_x0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_x1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_x1_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y0_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y0_set(long j, PixelRect pixelRect, int i);

    public static final native int PixelRect_y1_get(long j, PixelRect pixelRect);

    public static final native void PixelRect_y1_set(long j, PixelRect pixelRect, int i);

    public static final native void PlanarRawImageCallback_ImageReady(long j, PlanarRawImageCallback planarRawImageCallback, int i, long j2, ExifMetadata exifMetadata, long j3);

    public static final native void PlanarRawImageCallback_change_ownership(PlanarRawImageCallback planarRawImageCallback, long j, boolean z);

    public static final native void PlanarRawImageCallback_director_connect(PlanarRawImageCallback planarRawImageCallback, long j, boolean z, boolean z2);

    public static final native void PortraitBlobCallback_BlobReady(long j, PortraitBlobCallback portraitBlobCallback, long j2, String str, String str2, String str3);

    public static final native void PortraitBlobCallback_change_ownership(PortraitBlobCallback portraitBlobCallback, long j, boolean z);

    public static final native void PortraitBlobCallback_director_connect(PortraitBlobCallback portraitBlobCallback, long j, boolean z, boolean z2);

    public static final native List PortraitDepthArguments_MultiCamNames(long j, PortraitDepthArguments portraitDepthArguments);

    public static final native long PortraitDepthArguments_MultiCamRaw(long j, PortraitDepthArguments portraitDepthArguments, String str);

    public static final native long PortraitDepthArguments_PdInput(long j, PortraitDepthArguments portraitDepthArguments);

    public static final native long PortraitDepthArguments_PrecomputedSmoothDisparity(long j, PortraitDepthArguments portraitDepthArguments);

    public static final native String PortraitDepthBlurConfigToText(int i);

    public static final native void PortraitImageCallback_RgbReady(long j, PortraitImageCallback portraitImageCallback, long j2, long j3, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3);

    public static final native void PortraitImageCallback_YuvReady(long j, PortraitImageCallback portraitImageCallback, long j2, long j3, YuvReadView yuvReadView, int i, String str, String str2, String str3);

    public static final native void PortraitImageCallback_change_ownership(PortraitImageCallback portraitImageCallback, long j, boolean z);

    public static final native void PortraitImageCallback_director_connect(PortraitImageCallback portraitImageCallback, long j, boolean z, boolean z2);

    public static final native void PortraitOutputFeaturesCallback_AddFeature(long j, PortraitOutputFeaturesCallback portraitOutputFeaturesCallback, long j2, String str, double d);

    public static final native long PortraitOutputs_blob_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_blob_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitBlobCallback portraitBlobCallback);

    public static final native long PortraitOutputs_complete_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_complete_callback_set(long j, PortraitOutputs portraitOutputs, long j2);

    public static final native long PortraitOutputs_debug_image_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_debug_image_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitImageCallback portraitImageCallback);

    public static final native long PortraitOutputs_debug_rgb_allocator_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_debug_rgb_allocator_set(long j, PortraitOutputs portraitOutputs, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long PortraitOutputs_dynamic_depth_result_ptr_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_dynamic_depth_result_ptr_set(long j, PortraitOutputs portraitOutputs, long j2);

    public static final native long PortraitOutputs_features_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_features_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitOutputFeaturesCallback portraitOutputFeaturesCallback);

    public static final native long PortraitOutputs_image_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_image_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitImageCallback portraitImageCallback);

    public static final native long PortraitOutputs_portrait_logs_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_portrait_logs_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitBlobCallback portraitBlobCallback);

    public static final native long PortraitOutputs_progress_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_progress_callback_set(long j, PortraitOutputs portraitOutputs, long j2);

    public static final native long PortraitOutputs_rgb_allocator_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_rgb_allocator_set(long j, PortraitOutputs portraitOutputs, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long PortraitOutputs_secondary_image_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_secondary_image_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitImageCallback portraitImageCallback);

    public static final native long PortraitOutputs_upsampled_input_image_callback_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_upsampled_input_image_callback_set(long j, PortraitOutputs portraitOutputs, long j2, PortraitImageCallback portraitImageCallback);

    public static final native long PortraitOutputs_yuv_allocator_get(long j, PortraitOutputs portraitOutputs);

    public static final native void PortraitOutputs_yuv_allocator_set(long j, PortraitOutputs portraitOutputs, long j2, ClientYuvAllocator clientYuvAllocator);

    public static final native long PortraitRequest_ae_results_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_ae_results_set(long j, PortraitRequest portraitRequest, long j2, StringAeResultsMap stringAeResultsMap);

    public static final native boolean PortraitRequest_allow_raw_blur_front_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_allow_raw_blur_front_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native boolean PortraitRequest_allow_raw_blur_rear_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_allow_raw_blur_rear_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native boolean PortraitRequest_colorize_debug_images_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_colorize_debug_images_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native int PortraitRequest_debug_images_verbosity_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_debug_images_verbosity_set(long j, PortraitRequest portraitRequest, int i);

    public static final native int PortraitRequest_depth_blur_config_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_depth_blur_config_set(long j, PortraitRequest portraitRequest, int i);

    public static final native int PortraitRequest_depth_blur_layers_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_depth_blur_layers_set(long j, PortraitRequest portraitRequest, int i);

    public static final native int PortraitRequest_depth_processing_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_depth_processing_set(long j, PortraitRequest portraitRequest, int i);

    public static final native boolean PortraitRequest_do_sff_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_do_sff_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native boolean PortraitRequest_embed_gdepth_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_embed_gdepth_metadata_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native boolean PortraitRequest_enable_cpu_fallback_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_enable_cpu_fallback_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native long PortraitRequest_faces_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_faces_set(long j, PortraitRequest portraitRequest, long j2, PixelRectVector pixelRectVector);

    public static final native long PortraitRequest_frame_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_frame_metadata_set(long j, PortraitRequest portraitRequest, long j2, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native long PortraitRequest_gain_map_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_gain_map_set(long j, PortraitRequest portraitRequest, long j2, StringSpatialGainMap stringSpatialGainMap);

    public static final native String PortraitRequest_hdrp_makernote_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_hdrp_makernote_set(long j, PortraitRequest portraitRequest, String str);

    public static final native boolean PortraitRequest_horizontal_flip_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_horizontal_flip_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native long PortraitRequest_id_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_id_set(long j, PortraitRequest portraitRequest, long j2);

    public static final native int PortraitRequest_image_rotation_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_image_rotation_set(long j, PortraitRequest portraitRequest, int i);

    public static final native String PortraitRequest_opencl_cache_directory_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_opencl_cache_directory_set(long j, PortraitRequest portraitRequest, String str);

    public static final native int PortraitRequest_output_format_primary_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_output_format_primary_set(long j, PortraitRequest portraitRequest, int i);

    public static final native int PortraitRequest_output_height_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_output_height_set(long j, PortraitRequest portraitRequest, int i);

    public static final native int PortraitRequest_output_width_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_output_width_set(long j, PortraitRequest portraitRequest, int i);

    public static final native int PortraitRequest_pd_version_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_pd_version_set(long j, PortraitRequest portraitRequest, int i);

    public static final native String PortraitRequest_portrait_raw_path_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_portrait_raw_path_set(long j, PortraitRequest portraitRequest, String str);

    public static final native float PortraitRequest_post_resample_sharpening_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_post_resample_sharpening_set(long j, PortraitRequest portraitRequest, float f);

    public static final native String PortraitRequest_shot_prefix_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_shot_prefix_set(long j, PortraitRequest portraitRequest, String str);

    public static final native long PortraitRequest_static_metadata_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_static_metadata_set(long j, PortraitRequest portraitRequest, long j2, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native boolean PortraitRequest_use_internal_rectiface_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_use_internal_rectiface_set(long j, PortraitRequest portraitRequest, boolean z);

    public static final native long PortraitRequest_warpfield_get(long j, PortraitRequest portraitRequest);

    public static final native void PortraitRequest_warpfield_set(long j, PortraitRequest portraitRequest, long j2);

    public static final native boolean PortraitSegmenterSwigWrapper_DummyImageProducesReasonableMask(long j, PortraitSegmenterSwigWrapper portraitSegmenterSwigWrapper);

    public static final native long PortraitSegmenterSwigWrapper_GetSegmenterHandle(long j, PortraitSegmenterSwigWrapper portraitSegmenterSwigWrapper);

    public static final native boolean PortraitSegmenterSwigWrapper_Init(long j, PortraitSegmenterSwigWrapper portraitSegmenterSwigWrapper, long j2, long j3, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4);

    public static final native void PortraitSegmenterSwigWrapper_Release(long j, PortraitSegmenterSwigWrapper portraitSegmenterSwigWrapper);

    public static final native boolean PortraitSwigWrapper_Init(long j, PortraitSwigWrapper portraitSwigWrapper, long j2);

    public static final native boolean PortraitSwigWrapper_Process(long j, PortraitSwigWrapper portraitSwigWrapper, long j2, long j3, PortraitOutputs portraitOutputs, long j4, InterleavedReadViewU8 interleavedReadViewU8, long j5, PortraitDepthArguments portraitDepthArguments, long j6, long j7, PortraitRequest portraitRequest);

    public static final native void PortraitSwigWrapper_Release(long j, PortraitSwigWrapper portraitSwigWrapper);

    public static final native float PostShutterAfParams_lens_movement_exposure_time_ms_get(long j, PostShutterAfParams postShutterAfParams);

    public static final native void PostShutterAfParams_lens_movement_exposure_time_ms_set(long j, PostShutterAfParams postShutterAfParams, float f);

    public static final native float PostShutterAfParams_log_scene_brightness_threshold_get(long j, PostShutterAfParams postShutterAfParams);

    public static final native void PostShutterAfParams_log_scene_brightness_threshold_set(long j, PostShutterAfParams postShutterAfParams, float f);

    public static final native float PostShutterAfParams_max_handheld_exposure_time_ms_get(long j, PostShutterAfParams postShutterAfParams);

    public static final native void PostShutterAfParams_max_handheld_exposure_time_ms_set(long j, PostShutterAfParams postShutterAfParams, float f);

    public static final native float PostShutterAfParams_max_pd_motion_blur_pix_get(long j, PostShutterAfParams postShutterAfParams);

    public static final native void PostShutterAfParams_max_pd_motion_blur_pix_set(long j, PostShutterAfParams postShutterAfParams, float f);

    public static final native float PostShutterAfParams_max_tripod_exposure_time_ms_get(long j, PostShutterAfParams postShutterAfParams);

    public static final native void PostShutterAfParams_max_tripod_exposure_time_ms_set(long j, PostShutterAfParams postShutterAfParams, float f);

    public static final native void PostviewCallback_RgbReady(long j, PostviewCallback postviewCallback, int i, long j2, InterleavedReadViewU8 interleavedReadViewU8, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void PostviewCallback_YuvReady(long j, PostviewCallback postviewCallback, int i, long j2, YuvReadView yuvReadView, long j3, ExifMetadata exifMetadata, int i2);

    public static final native void PostviewCallback_change_ownership(PostviewCallback postviewCallback, long j, boolean z);

    public static final native void PostviewCallback_director_connect(PostviewCallback postviewCallback, long j, boolean z, boolean z2);

    public static final native int PostviewParams_pixel_format_get(long j, PostviewParams postviewParams);

    public static final native void PostviewParams_pixel_format_set(long j, PostviewParams postviewParams, int i);

    public static final native int PostviewParams_target_height_get(long j, PostviewParams postviewParams);

    public static final native void PostviewParams_target_height_set(long j, PostviewParams postviewParams, int i);

    public static final native int PostviewParams_target_width_get(long j, PostviewParams postviewParams);

    public static final native void PostviewParams_target_width_set(long j, PostviewParams postviewParams, int i);

    public static final native void PrintColorTemps(long j);

    public static final native boolean QcColorCalibration_DeserializeFromString(long j, QcColorCalibration qcColorCalibration, long j2);

    public static final native boolean QcColorCalibration_Equals(long j, QcColorCalibration qcColorCalibration, long j2, QcColorCalibration qcColorCalibration2);

    public static final native float QcColorCalibration_IlluminantData_bg_ratio_get(long j, QcColorCalibration.IlluminantData illuminantData);

    public static final native void QcColorCalibration_IlluminantData_bg_ratio_set(long j, QcColorCalibration.IlluminantData illuminantData, float f);

    public static final native float QcColorCalibration_IlluminantData_rg_ratio_get(long j, QcColorCalibration.IlluminantData illuminantData);

    public static final native void QcColorCalibration_IlluminantData_rg_ratio_set(long j, QcColorCalibration.IlluminantData illuminantData, float f);

    public static final native boolean QcColorCalibration_IsNull(long j, QcColorCalibration qcColorCalibration);

    public static final native boolean QcColorCalibration_IsValid(long j, QcColorCalibration qcColorCalibration);

    public static final native void QcColorCalibration_SerializeToString__SWIG_0(long j, QcColorCalibration qcColorCalibration, String str, int i, boolean z);

    public static final native void QcColorCalibration_SerializeToString__SWIG_1(long j, QcColorCalibration qcColorCalibration, String str, int i);

    public static final native float QcColorCalibration_grgb_ratio_get(long j, QcColorCalibration qcColorCalibration);

    public static final native void QcColorCalibration_grgb_ratio_set(long j, QcColorCalibration qcColorCalibration, float f);

    public static final native long QcColorCalibration_illuminant_data_get(long j, QcColorCalibration qcColorCalibration);

    public static final native void QcColorCalibration_illuminant_data_set(long j, QcColorCalibration qcColorCalibration, long j2, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_add(long j, QcIlluminantVector qcIlluminantVector, long j2, QcColorCalibration.IlluminantData illuminantData);

    public static final native long QcIlluminantVector_capacity(long j, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_clear(long j, QcIlluminantVector qcIlluminantVector);

    public static final native long QcIlluminantVector_get(long j, QcIlluminantVector qcIlluminantVector, int i);

    public static final native boolean QcIlluminantVector_isEmpty(long j, QcIlluminantVector qcIlluminantVector);

    public static final native void QcIlluminantVector_reserve(long j, QcIlluminantVector qcIlluminantVector, long j2);

    public static final native void QcIlluminantVector_set(long j, QcIlluminantVector qcIlluminantVector, int i, long j2, QcColorCalibration.IlluminantData illuminantData);

    public static final native long QcIlluminantVector_size(long j, QcIlluminantVector qcIlluminantVector);

    public static final native long RawAllocation_id_get(long j, RawAllocation rawAllocation);

    public static final native void RawAllocation_id_set(long j, RawAllocation rawAllocation, long j2);

    public static final native long RawAllocation_view_get(long j, RawAllocation rawAllocation);

    public static final native void RawAllocation_view_set(long j, RawAllocation rawAllocation, long j2, RawWriteView rawWriteView);

    public static final native long RawFinishParams_arc_flare_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_arc_flare_set(long j, RawFinishParams rawFinishParams, long j2, ArcFlareParam arcFlareParam);

    public static final native long RawFinishParams_chroma_denoise_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_chroma_denoise_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_dehaze_params_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_dehaze_params_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_demosaic_sharpness_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_demosaic_sharpness_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native boolean RawFinishParams_enable_sky_optimization_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_enable_sky_optimization_set(long j, RawFinishParams rawFinishParams, boolean z);

    public static final native int RawFinishParams_icc_output_profile_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_icc_output_profile_set(long j, RawFinishParams rawFinishParams, int i);

    public static final native long RawFinishParams_luma_denoise_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_luma_denoise_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_post_zoom_sharpen_strength_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_post_zoom_sharpen_strength_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native int RawFinishParams_resampling_method_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_resampling_method_set(long j, RawFinishParams rawFinishParams, int i);

    public static final native long RawFinishParams_rgb_map_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_rgb_map_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_saturation_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_saturation_set(long j, RawFinishParams rawFinishParams, long j2, ColorSatParams colorSatParams);

    public static final native long RawFinishParams_sharpen_params_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_sharpen_params_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_sky_luma_denoise_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_sky_luma_denoise_set(long j, RawFinishParams rawFinishParams, long j2);

    public static final native long RawFinishParams_zoom_finest_scale_denoise_attenuation_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_zoom_finest_scale_denoise_attenuation_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native long RawFinishParams_zoom_sharpen_attenuation_get(long j, RawFinishParams rawFinishParams);

    public static final native void RawFinishParams_zoom_sharpen_attenuation_set(long j, RawFinishParams rawFinishParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native long RawFinishPreview(String str, long j, RawReadView rawReadView, long j2, FrameMetadata frameMetadata, long j3, SpatialGainMap spatialGainMap, long j4, StaticMetadata staticMetadata, long j5, NormalizedRect normalizedRect, int i, int i2, int i3, long j6, AeResults aeResults, long j7, Tuning tuning, int i4, long j8, long j9, long j10, FrameMetadata frameMetadata2);

    public static final native void RawImageCallback_ImageReady(long j, RawImageCallback rawImageCallback, int i, long j2, ExifMetadata exifMetadata, long j3, RawReadView rawReadView);

    public static final native void RawImageCallback_MergeRawFailed(long j, RawImageCallback rawImageCallback, int i);

    public static final native void RawImageCallback_change_ownership(RawImageCallback rawImageCallback, long j, boolean z);

    public static final native void RawImageCallback_director_connect(RawImageCallback rawImageCallback, long j, boolean z, boolean z2);

    public static final native void RawImage_FastCrop(long j, RawImage rawImage, int i, int i2, int i3, int i4);

    public static final native long RawImage_SWIGUpcast(long j);

    public static final native long RawImage_packed10_image(long j, RawImage rawImage);

    public static final native long RawImage_packed12_image(long j, RawImage rawImage);

    public static final native long RawImage_unpacked_image(long j, RawImage rawImage);

    public static final native long RawMergeParams_align_tile_size_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_align_tile_size_set(long j, RawMergeParams rawMergeParams, long j2);

    public static final native float RawMergeParams_merge_mismatch_noise_var_scale_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_merge_mismatch_noise_var_scale_set(long j, RawMergeParams rawMergeParams, float f);

    public static final native float RawMergeParams_merge_mismatch_thr_high_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_merge_mismatch_thr_high_set(long j, RawMergeParams rawMergeParams, float f);

    public static final native float RawMergeParams_merge_mismatch_thr_low_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_merge_mismatch_thr_low_set(long j, RawMergeParams rawMergeParams, float f);

    public static final native long RawMergeParams_merge_tile_size_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_merge_tile_size_set(long j, RawMergeParams rawMergeParams, long j2);

    public static final native float RawMergeParams_min_temporal_strength_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_min_temporal_strength_set(long j, RawMergeParams rawMergeParams, float f);

    public static final native long RawMergeParams_spatial_strength_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_spatial_strength_set(long j, RawMergeParams rawMergeParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native long RawMergeParams_temporal_strength_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_temporal_strength_set(long j, RawMergeParams rawMergeParams, long j2, FloatSmoothKeyValueMap floatSmoothKeyValueMap);

    public static final native boolean RawMergeParams_use_equal_channel_weights_get(long j, RawMergeParams rawMergeParams);

    public static final native void RawMergeParams_use_equal_channel_weights_set(long j, RawMergeParams rawMergeParams, boolean z);

    public static final native int RawReadView_BitsPerPixel(long j, RawReadView rawReadView);

    public static final native boolean RawReadView_Empty(long j, RawReadView rawReadView);

    public static final native void RawReadView_FastCrop(long j, RawReadView rawReadView, int i, int i2, int i3, int i4);

    public static final native long RawReadView_GetRow__SWIG_0(long j, RawReadView rawReadView, int i, int i2, int i3, long j2);

    public static final native long RawReadView_GetRow__SWIG_1(long j, RawReadView rawReadView, int i, long j2);

    public static final native int RawReadView_at(long j, RawReadView rawReadView, int i, int i2);

    public static final native int RawReadView_height(long j, RawReadView rawReadView);

    public static final native int RawReadView_layout(long j, RawReadView rawReadView);

    public static final native int RawReadView_num_channels(long j, RawReadView rawReadView);

    public static final native long RawReadView_packed10_read_view(long j, RawReadView rawReadView);

    public static final native long RawReadView_packed12_read_view(long j, RawReadView rawReadView);

    public static final native long RawReadView_sample_array_size(long j, RawReadView rawReadView);

    public static final native long RawReadView_unpacked_read_view(long j, RawReadView rawReadView);

    public static final native int RawReadView_width(long j, RawReadView rawReadView);

    public static final native float RawSharpenParams_Point_x_get(long j, RawSharpenParams.Point point);

    public static final native void RawSharpenParams_Point_x_set(long j, RawSharpenParams.Point point, float f);

    public static final native float RawSharpenParams_Point_y_get(long j, RawSharpenParams.Point point);

    public static final native void RawSharpenParams_Point_y_set(long j, RawSharpenParams.Point point, float f);

    public static final native long RawSharpenParams_curves_get(long j, RawSharpenParams rawSharpenParams);

    public static final native void RawSharpenParams_curves_set(long j, RawSharpenParams rawSharpenParams, long j2);

    public static final native boolean RawVignetteParams_IsIdentity(long j, RawVignetteParams rawVignetteParams);

    public static final native float RawVignetteParams_falloff_exponent_get(long j, RawVignetteParams rawVignetteParams);

    public static final native void RawVignetteParams_falloff_exponent_set(long j, RawVignetteParams rawVignetteParams, float f);

    public static final native float RawVignetteParams_scale_at_corner_get(long j, RawVignetteParams rawVignetteParams);

    public static final native void RawVignetteParams_scale_at_corner_set(long j, RawVignetteParams rawVignetteParams, float f);

    public static final native void RawWriteView_FastCrop(long j, RawWriteView rawWriteView, int i, int i2, int i3, int i4);

    public static final native long RawWriteView_SWIGUpcast(long j);

    public static final native void RawWriteView_SetRow__SWIG_0(long j, RawWriteView rawWriteView, int i, int i2, int i3, long j2);

    public static final native void RawWriteView_SetRow__SWIG_1(long j, RawWriteView rawWriteView, int i, long j2);

    public static final native long RawWriteView_packed10_write_view(long j, RawWriteView rawWriteView);

    public static final native long RawWriteView_packed12_write_view(long j, RawWriteView rawWriteView);

    public static final native long RawWriteView_unpacked_write_view(long j, RawWriteView rawWriteView);

    public static final native void ResetTrackedMemoryPeak();

    public static final native int ReverseRotation(int i);

    public static final native void RggbPositions(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8);

    public static final native long RggbToRgb(long j, boolean z);

    public static final native void RotateCoordinates(int i, int i2, int i3, int i4, int i5, long j, long j2);

    public static final native void RotateNormalizedCoordinates(float f, float f2, int i, long j, long j2);

    public static final native float RowPattern_amplitude_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_amplitude_set(long j, RowPattern rowPattern, float f);

    public static final native long RowPattern_filter_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_filter_set(long j, RowPattern rowPattern, long j2);

    public static final native float RowPattern_gain_at_period_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_gain_at_period_set(long j, RowPattern rowPattern, float f);

    public static final native float RowPattern_period_get(long j, RowPattern rowPattern);

    public static final native void RowPattern_period_set(long j, RowPattern rowPattern, float f);

    public static final native long ScaleParams__SWIG_0(long j, DenoiseParams denoiseParams, float f);

    public static final native long ScaleParams__SWIG_1(long j, RawSharpenParams rawSharpenParams, float f);

    public static final native float SecondOrderFilter_a1_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_a1_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_a2_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_a2_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_b0_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_b0_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_b1_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_b1_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native float SecondOrderFilter_b2_get(long j, SecondOrderFilter secondOrderFilter);

    public static final native void SecondOrderFilter_b2_set(long j, SecondOrderFilter secondOrderFilter, float f);

    public static final native int SensorIdToLensFacing(int i);

    public static final native boolean SensorNoiseModel_Check(long j, SensorNoiseModel sensorNoiseModel);

    public static final native long SensorNoiseModel_DngNoiseModelForGain(long j, SensorNoiseModel sensorNoiseModel, float f, float f2);

    public static final native float SensorNoiseModel_offset_a_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_offset_a_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native float SensorNoiseModel_offset_b_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_offset_b_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native float SensorNoiseModel_scale_a_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_scale_a_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native float SensorNoiseModel_scale_b_get(long j, SensorNoiseModel sensorNoiseModel);

    public static final native void SensorNoiseModel_scale_b_set(long j, SensorNoiseModel sensorNoiseModel, float f);

    public static final native boolean SensorRowArtifacts_IsEmpty(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native long SensorRowArtifacts_NoiseVariancesForGain(long j, SensorRowArtifacts sensorRowArtifacts, float f, float f2, float f3, float f4);

    public static final native long SensorRowArtifacts_PatternsForGain(long j, SensorRowArtifacts sensorRowArtifacts, float f, float f2, float f3, float f4);

    public static final native long SensorRowArtifacts_noise_offset_get(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native void SensorRowArtifacts_noise_offset_set(long j, SensorRowArtifacts sensorRowArtifacts, long j2, FloatVector floatVector);

    public static final native long SensorRowArtifacts_patterns_post_analog_gain_get(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native void SensorRowArtifacts_patterns_post_analog_gain_set(long j, SensorRowArtifacts sensorRowArtifacts, long j2);

    public static final native long SensorRowArtifacts_patterns_pre_analog_gain_get(long j, SensorRowArtifacts sensorRowArtifacts);

    public static final native void SensorRowArtifacts_patterns_pre_analog_gain_set(long j, SensorRowArtifacts sensorRowArtifacts, long j2);

    public static final native void SerializeBurstMetadata__SWIG_0(long j, String str, int i, boolean z, boolean z2);

    public static final native void SerializeBurstMetadata__SWIG_1(long j, String str, int i, boolean z);

    public static final native void SerializeBurstMetadata__SWIG_2(long j, String str, int i);

    public static final native String SerializeDngMakernoteToString__SWIG_0(long j, InitParams initParams, long j2, StaticMetadata staticMetadata, long j3, ShotParams shotParams, long j4, FrameMetadata frameMetadata, boolean z);

    public static final native String SerializeDngMakernoteToString__SWIG_1(long j, InitParams initParams, long j2, StaticMetadata staticMetadata, long j3, ShotParams shotParams, long j4, FrameMetadata frameMetadata);

    public static final native void SerializeDngMakernoteToString__SWIG_2(long j, InitParams initParams, long j2, StaticMetadata staticMetadata, long j3, ShotParams shotParams, long j4, FrameMetadata frameMetadata, String str, boolean z);

    public static final native void SerializeDngMakernoteToString__SWIG_3(long j, InitParams initParams, long j2, StaticMetadata staticMetadata, long j3, ShotParams shotParams, long j4, FrameMetadata frameMetadata, String str);

    public static final native String SerializeToString(long j, AeResults aeResults, int i);

    public static final native long ShotCallbacks_base_frame_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_base_frame_callback_set(long j, ShotCallbacks shotCallbacks, long j2);

    public static final native long ShotCallbacks_final_image_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_callback_set(long j, ShotCallbacks shotCallbacks, long j2, FinalImageCallback finalImageCallback);

    public static final native long ShotCallbacks_final_image_rgb16_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_rgb16_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU16Allocator clientInterleavedU16Allocator);

    public static final native long ShotCallbacks_final_image_rgb_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_rgb_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long ShotCallbacks_final_image_yuv_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_final_image_yuv_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientYuvAllocator clientYuvAllocator);

    public static final native long ShotCallbacks_merged_pd_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_pd_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU16Allocator clientInterleavedU16Allocator);

    public static final native long ShotCallbacks_merged_pd_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_pd_callback_set(long j, ShotCallbacks shotCallbacks, long j2, PdImageCallback pdImageCallback);

    public static final native long ShotCallbacks_merged_raw_image_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_raw_image_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientRawAllocator clientRawAllocator);

    public static final native long ShotCallbacks_merged_raw_image_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_merged_raw_image_callback_set(long j, ShotCallbacks shotCallbacks, long j2, RawImageCallback rawImageCallback);

    public static final native long ShotCallbacks_mutable_merged_raw_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_mutable_merged_raw_callback_set(long j, ShotCallbacks shotCallbacks, long j2, PlanarRawImageCallback planarRawImageCallback);

    public static final native long ShotCallbacks_postview_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_postview_callback_set(long j, ShotCallbacks shotCallbacks, long j2, PostviewCallback postviewCallback);

    public static final native long ShotCallbacks_postview_rgb_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_postview_rgb_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientInterleavedU8Allocator clientInterleavedU8Allocator);

    public static final native long ShotCallbacks_postview_yuv_allocator_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_postview_yuv_allocator_set(long j, ShotCallbacks shotCallbacks, long j2, ClientYuvAllocator clientYuvAllocator);

    public static final native long ShotCallbacks_progress_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_progress_callback_set(long j, ShotCallbacks shotCallbacks, long j2);

    public static final native long ShotCallbacks_status_callback_get(long j, ShotCallbacks shotCallbacks);

    public static final native void ShotCallbacks_status_callback_set(long j, ShotCallbacks shotCallbacks, long j2, ShotStatusCallback shotStatusCallback);

    public static final native boolean ShotLogData_Check(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_Print(long j, ShotLogData shotLogData, int i);

    public static final native void ShotLogData_SerializeToString(long j, ShotLogData shotLogData, String str);

    public static final native boolean ShotLogData_aborted_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_aborted_set(long j, ShotLogData shotLogData, boolean z);

    public static final native float ShotLogData_actual_range_compression_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_actual_range_compression_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ae_confidence_long_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ae_confidence_long_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ae_confidence_short_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ae_confidence_short_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_ae_confidence_single_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ae_confidence_single_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_angular_speed_rad_per_sec_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_angular_speed_rad_per_sec_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_base_frame_index_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_base_frame_index_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_base_frame_snr_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_base_frame_snr_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_base_frame_temporal_binning_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_base_frame_temporal_binning_factor_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_capture_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_capture_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_cpu_usage_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_cpu_usage_factor_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_executed_finish_on_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_executed_finish_on_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_final_image_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_final_image_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native long ShotLogData_final_payload_frame_sharpness_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_final_payload_frame_sharpness_set(long j, ShotLogData shotLogData, long j2, FloatVector floatVector);

    public static final native float ShotLogData_finish_process_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_finish_process_time_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_hot_pixels_in_base_frame_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_hot_pixels_in_base_frame_set(long j, ShotLogData shotLogData, int i);

    public static final native int ShotLogData_hot_pixels_in_total_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_hot_pixels_in_total_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_ideal_range_compression_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ideal_range_compression_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_jpeg_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_jpeg_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_jpeg_encode_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_jpeg_encode_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_log_scene_brightness_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_log_scene_brightness_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_long_exp_adjustment_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_long_exp_adjustment_factor_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_max_exposure_time_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_max_exposure_time_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_merge_process_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_merge_process_time_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_merged_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_merged_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_merged_raw_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_merged_raw_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_metering_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_metering_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native int ShotLogData_number_gyro_samples_used_for_metering_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_number_gyro_samples_used_for_metering_set(long j, ShotLogData shotLogData, int i);

    public static final native int ShotLogData_original_payload_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_original_payload_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_payload_focus_distance_diopters_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_payload_focus_distance_diopters_set(long j, ShotLogData shotLogData, float f);

    public static final native long ShotLogData_payload_frame_scene_motion_pix_per_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_payload_frame_scene_motion_pix_per_ms_set(long j, ShotLogData shotLogData, long j2, FloatVector floatVector);

    public static final native float ShotLogData_percentage_valid_gyro_samples_used_for_metering_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_percentage_valid_gyro_samples_used_for_metering_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_percentage_valid_motion_samples_in_10_samples_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_percentage_valid_motion_samples_in_10_samples_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_percentage_valid_motion_samples_in_20_samples_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_percentage_valid_motion_samples_in_20_samples_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_postview_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_postview_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_preview_focus_distance_diopters_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_preview_focus_distance_diopters_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_psaf_frame_count_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_psaf_frame_count_set(long j, ShotLogData shotLogData, int i);

    public static final native float ShotLogData_pure_fraction_of_pixels_from_long_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_pure_fraction_of_pixels_from_long_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_scene_motion_10_sample_std_pix_per_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_scene_motion_10_sample_std_pix_per_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_scene_motion_20_sample_std_pix_per_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_scene_motion_20_sample_std_pix_per_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_scene_motion_pix_per_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_scene_motion_pix_per_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_short_exp_adjustment_factor_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_short_exp_adjustment_factor_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_sky_darkening_strength_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_sky_darkening_strength_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_sky_denoise_strength_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_sky_denoise_strength_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_sky_mask_ratio_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_sky_mask_ratio_set(long j, ShotLogData shotLogData, float f);

    public static final native boolean ShotLogData_sky_segmentation_failed_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_sky_segmentation_failed_set(long j, ShotLogData shotLogData, boolean z);

    public static final native int ShotLogData_sky_segmentation_total_time_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_sky_segmentation_total_time_ms_set(long j, ShotLogData shotLogData, int i);

    public static final native boolean ShotLogData_sky_segmentation_used_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_sky_segmentation_used_set(long j, ShotLogData shotLogData, boolean z);

    public static final native float ShotLogData_std_angular_speed_rad_per_sec_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_std_angular_speed_rad_per_sec_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_max_run_time_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_max_run_time_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_mean_ego_motion_pix_per_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_mean_ego_motion_pix_per_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_mean_run_time_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_mean_run_time_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_mean_visual_motion_pix_per_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_mean_visual_motion_pix_per_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_min_run_time_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_min_run_time_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_target_exposure_time_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_target_exposure_time_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_temporal_binning_target_tet_ms_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_temporal_binning_target_tet_ms_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_time_to_postview_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_time_to_postview_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_time_to_shot_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_time_to_shot_set(long j, ShotLogData shotLogData, float f);

    public static final native float ShotLogData_total_callback_time_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_total_callback_time_set(long j, ShotLogData shotLogData, float f);

    public static final native int ShotLogData_ux_mode_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_ux_mode_set(long j, ShotLogData shotLogData, int i);

    public static final native long ShotLogData_was_payload_frame_merged_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_was_payload_frame_merged_set(long j, ShotLogData shotLogData, long j2, BoolVector boolVector);

    public static final native float ShotLogData_weighted_fraction_of_pixels_from_long_exposure_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_weighted_fraction_of_pixels_from_long_exposure_set(long j, ShotLogData shotLogData, float f);

    public static final native boolean ShotLogData_zsl_get(long j, ShotLogData shotLogData);

    public static final native void ShotLogData_zsl_set(long j, ShotLogData shotLogData, boolean z);

    public static final native boolean ShotParams_Check(long j, ShotParams shotParams, long j2, StaticMetadata staticMetadata);

    public static final native boolean ShotParams_DeserializeFromString__SWIG_0(long j, ShotParams shotParams, long j2);

    public static final native boolean ShotParams_DeserializeFromString__SWIG_1(long j, ShotParams shotParams, String str);

    public static final native boolean ShotParams_Equals(long j, ShotParams shotParams, long j2, ShotParams shotParams2);

    public static final native boolean ShotParams_GcamAwbDesired(long j, ShotParams shotParams);

    public static final native void ShotParams_Print(long j, ShotParams shotParams, int i);

    public static final native void ShotParams_SerializeToString(long j, ShotParams shotParams, String str);

    public static final native long ShotParams_ae_get(long j, ShotParams shotParams);

    public static final native void ShotParams_ae_set(long j, ShotParams shotParams, long j2, AeShotParams aeShotParams);

    public static final native boolean ShotParams_allow_base_frame_reuse_get(long j, ShotParams shotParams);

    public static final native void ShotParams_allow_base_frame_reuse_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_allow_sabre_get(long j, ShotParams shotParams);

    public static final native void ShotParams_allow_sabre_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_allow_temporal_binning_get(long j, ShotParams shotParams);

    public static final native void ShotParams_allow_temporal_binning_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_base_frame_override_index_get(long j, ShotParams shotParams);

    public static final native void ShotParams_base_frame_override_index_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_compress_merged_dng_get(long j, ShotParams shotParams);

    public static final native void ShotParams_compress_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_device_is_on_tripod_get(long j, ShotParams shotParams);

    public static final native void ShotParams_device_is_on_tripod_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_disable_align_get(long j, ShotParams shotParams);

    public static final native void ShotParams_disable_align_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_final_jpg_quality_get(long j, ShotParams shotParams);

    public static final native void ShotParams_final_jpg_quality_set(long j, ShotParams shotParams, int i);

    public static final native int ShotParams_flash_mode_get(long j, ShotParams shotParams);

    public static final native void ShotParams_flash_mode_set(long j, ShotParams shotParams, int i);

    public static final native long ShotParams_force_wb_get(long j, ShotParams shotParams);

    public static final native void ShotParams_force_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native boolean ShotParams_generate_final_thumbnail_get(long j, ShotParams shotParams);

    public static final native void ShotParams_generate_final_thumbnail_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_icc_output_profile_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_icc_output_profile_override_set(long j, ShotParams shotParams, int i);

    public static final native int ShotParams_image_rotation_get(long j, ShotParams shotParams);

    public static final native void ShotParams_image_rotation_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_manually_rotate_final_jpg_get(long j, ShotParams shotParams);

    public static final native void ShotParams_manually_rotate_final_jpg_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_merge_method_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_merge_method_override_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_nonzsl_extended_base_frame_selection_get(long j, ShotParams shotParams);

    public static final native void ShotParams_nonzsl_extended_base_frame_selection_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_nonzsl_frame_count_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_nonzsl_frame_count_override_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_nonzsl_motion_ef_enabled_get(long j, ShotParams shotParams);

    public static final native void ShotParams_nonzsl_motion_ef_enabled_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_optimize_sky_get(long j, ShotParams shotParams);

    public static final native void ShotParams_optimize_sky_set(long j, ShotParams shotParams, boolean z);

    public static final native float ShotParams_previous_viewfinder_tet_get(long j, ShotParams shotParams);

    public static final native void ShotParams_previous_viewfinder_tet_set(long j, ShotParams shotParams, float f);

    public static final native long ShotParams_previous_viewfinder_wb_get(long j, ShotParams shotParams);

    public static final native void ShotParams_previous_viewfinder_wb_set(long j, ShotParams shotParams, long j2, AwbInfo awbInfo);

    public static final native int ShotParams_psaf_frame_count_get(long j, ShotParams shotParams);

    public static final native void ShotParams_psaf_frame_count_set(long j, ShotParams shotParams, int i);

    public static final native float ShotParams_psaf_log_scene_brightness_threshold_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_psaf_log_scene_brightness_threshold_override_set(long j, ShotParams shotParams, float f);

    public static final native int ShotParams_raw_cropping_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_raw_cropping_override_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_recompute_wb_on_base_frame_get(long j, ShotParams shotParams);

    public static final native void ShotParams_recompute_wb_on_base_frame_set(long j, ShotParams shotParams, boolean z);

    public static final native boolean ShotParams_remosaic_merged_output_get(long j, ShotParams shotParams);

    public static final native void ShotParams_remosaic_merged_output_set(long j, ShotParams shotParams, boolean z);

    public static final native int ShotParams_resampling_method_override_get(long j, ShotParams shotParams);

    public static final native void ShotParams_resampling_method_override_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_save_merged_dng_get(long j, ShotParams shotParams);

    public static final native void ShotParams_save_merged_dng_set(long j, ShotParams shotParams, boolean z);

    public static final native String ShotParams_software_suffix_get(long j, ShotParams shotParams);

    public static final native void ShotParams_software_suffix_set(long j, ShotParams shotParams, String str);

    public static final native float ShotParams_tripod_max_exposure_time_ms_get(long j, ShotParams shotParams);

    public static final native void ShotParams_tripod_max_exposure_time_ms_set(long j, ShotParams shotParams, float f);

    public static final native float ShotParams_tripod_max_total_capture_time_ms_get(long j, ShotParams shotParams);

    public static final native void ShotParams_tripod_max_total_capture_time_ms_set(long j, ShotParams shotParams, float f);

    public static final native int ShotParams_wb_mode_get(long j, ShotParams shotParams);

    public static final native void ShotParams_wb_mode_set(long j, ShotParams shotParams, int i);

    public static final native int ShotParams_zsl_base_frame_index_hint_get(long j, ShotParams shotParams);

    public static final native void ShotParams_zsl_base_frame_index_hint_set(long j, ShotParams shotParams, int i);

    public static final native boolean ShotParams_zsl_get(long j, ShotParams shotParams);

    public static final native void ShotParams_zsl_set(long j, ShotParams shotParams, boolean z);

    public static final native void ShotStatusCallback_OnAbort(long j, ShotStatusCallback shotStatusCallback, int i);

    public static final native void ShotStatusCallback_OnComplete(long j, ShotStatusCallback shotStatusCallback, int i, long j2, ShotLogData shotLogData);

    public static final native void ShotStatusCallback_OnError(long j, ShotStatusCallback shotStatusCallback, int i, String str);

    public static final native void ShotStatusCallback_change_ownership(ShotStatusCallback shotStatusCallback, long j, boolean z);

    public static final native void ShotStatusCallback_director_connect(ShotStatusCallback shotStatusCallback, long j, boolean z, boolean z2);

    public static final native boolean ShouldCropBeforeMerge(int i);

    public static final native boolean SpatialGainMap_Check(long j, SpatialGainMap spatialGainMap, String str);

    public static final native long SpatialGainMap_CreateFromBuffer(long j, Uint8Vector uint8Vector);

    public static final native long SpatialGainMap_CreateFromFile(String str);

    public static final native boolean SpatialGainMap_Empty(long j, SpatialGainMap spatialGainMap);

    public static final native void SpatialGainMap_ForceScaleBy(long j, SpatialGainMap spatialGainMap, long j2, SpatialGainMap spatialGainMap2);

    public static final native long SpatialGainMap_GainMapAsRgb(long j, SpatialGainMap spatialGainMap);

    public static final native float SpatialGainMap_InterpolatedReadRgb(long j, SpatialGainMap spatialGainMap, float f, float f2, int i);

    public static final native float SpatialGainMap_InterpolatedReadRggb(long j, SpatialGainMap spatialGainMap, float f, float f2, int i);

    public static final native void SpatialGainMap_Print(long j, SpatialGainMap spatialGainMap);

    public static final native float SpatialGainMap_ReadRgb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3);

    public static final native float SpatialGainMap_ReadRggb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3);

    public static final native long SpatialGainMap_ResizeAndCrop(long j, SpatialGainMap spatialGainMap, int i, int i2, long j2, NormalizedRect normalizedRect);

    public static final native void SpatialGainMap_ScaleBy(long j, SpatialGainMap spatialGainMap, long j2, SpatialGainMap spatialGainMap2);

    public static final native long SpatialGainMap_SerializeToBuffer(long j, SpatialGainMap spatialGainMap);

    public static final native void SpatialGainMap_WriteRggb(long j, SpatialGainMap spatialGainMap, int i, int i2, int i3, float f);

    public static final native long SpatialGainMap_gain_map(long j, SpatialGainMap spatialGainMap);

    public static final native boolean SpatialGainMap_has_extra_vignetting_applied(long j, SpatialGainMap spatialGainMap);

    public static final native int SpatialGainMap_height(long j, SpatialGainMap spatialGainMap);

    public static final native boolean SpatialGainMap_is_precise(long j, SpatialGainMap spatialGainMap);

    public static final native int SpatialGainMap_num_channels(long j, SpatialGainMap spatialGainMap);

    public static final native int SpatialGainMap_width(long j, SpatialGainMap spatialGainMap);

    public static final native void StaticMetadataVector_add(long j, StaticMetadataVector staticMetadataVector, long j2, StaticMetadata staticMetadata);

    public static final native long StaticMetadataVector_capacity(long j, StaticMetadataVector staticMetadataVector);

    public static final native void StaticMetadataVector_clear(long j, StaticMetadataVector staticMetadataVector);

    public static final native long StaticMetadataVector_get(long j, StaticMetadataVector staticMetadataVector, int i);

    public static final native boolean StaticMetadataVector_isEmpty(long j, StaticMetadataVector staticMetadataVector);

    public static final native void StaticMetadataVector_reserve(long j, StaticMetadataVector staticMetadataVector, long j2);

    public static final native void StaticMetadataVector_set(long j, StaticMetadataVector staticMetadataVector, int i, long j2, StaticMetadata staticMetadata);

    public static final native long StaticMetadataVector_size(long j, StaticMetadataVector staticMetadataVector);

    public static final native void StaticMetadata_CensorFingerprintable(long j, StaticMetadata staticMetadata);

    public static final native boolean StaticMetadata_Check(long j, StaticMetadata staticMetadata, boolean z, long j2);

    public static final native boolean StaticMetadata_DeserializeFromString__SWIG_0(long j, StaticMetadata staticMetadata, long j2);

    public static final native boolean StaticMetadata_DeserializeFromString__SWIG_1(long j, StaticMetadata staticMetadata, String str);

    public static final native boolean StaticMetadata_Equals(long j, StaticMetadata staticMetadata, long j2, StaticMetadata staticMetadata2);

    public static final native float StaticMetadata_FocalLength35mm__SWIG_0(long j, StaticMetadata staticMetadata, float f);

    public static final native float StaticMetadata_FocalLength35mm__SWIG_1(long j, StaticMetadata staticMetadata);

    public static final native float StaticMetadata_GetMaxAnalogGain(long j, StaticMetadata staticMetadata);

    public static final native boolean StaticMetadata_IsFingerprintable(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_Print(long j, StaticMetadata staticMetadata, int i, int i2);

    public static final native void StaticMetadata_SerializeToString__SWIG_0(long j, StaticMetadata staticMetadata, String str, int i, boolean z);

    public static final native void StaticMetadata_SerializeToString__SWIG_1(long j, StaticMetadata staticMetadata, String str, int i);

    public static final native long StaticMetadata_active_area_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_active_area_set(long j, StaticMetadata staticMetadata, long j2, PixelRect pixelRect);

    public static final native long StaticMetadata_available_f_numbers_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_available_f_numbers_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native long StaticMetadata_available_focal_lengths_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_available_focal_lengths_mm_set(long j, StaticMetadata staticMetadata, long j2, FloatVector floatVector);

    public static final native int StaticMetadata_bayer_pattern_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_bayer_pattern_set(long j, StaticMetadata staticMetadata, int i);

    public static final native String StaticMetadata_device_get(long j, StaticMetadata staticMetadata);

    public static final native String StaticMetadata_device_os_version_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_device_os_version_set(long j, StaticMetadata staticMetadata, String str);

    public static final native void StaticMetadata_device_set(long j, StaticMetadata staticMetadata, String str);

    public static final native long StaticMetadata_dng_color_calibration_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_dng_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, DngColorCalibrationVector dngColorCalibrationVector);

    public static final native float[] StaticMetadata_exposure_time_range_ms_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_exposure_time_range_ms_set(long j, StaticMetadata staticMetadata, float[] fArr);

    public static final native int StaticMetadata_frame_raw_max_height_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_raw_max_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_frame_raw_max_width_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_raw_max_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native float StaticMetadata_frame_readout_time_ms_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_frame_readout_time_ms_set(long j, StaticMetadata staticMetadata, float f);

    public static final native String StaticMetadata_hardware_revision_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_hardware_revision_set(long j, StaticMetadata staticMetadata, String str);

    public static final native boolean StaticMetadata_has_flash_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_has_flash_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native boolean StaticMetadata_has_ois_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_has_ois_set(long j, StaticMetadata staticMetadata, boolean z);

    public static final native int[] StaticMetadata_iso_range_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_iso_range_set(long j, StaticMetadata staticMetadata, int[] iArr);

    public static final native int StaticMetadata_lens_facing_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_lens_facing_set(long j, StaticMetadata staticMetadata, int i);

    public static final native String StaticMetadata_make_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_make_set(long j, StaticMetadata staticMetadata, String str);

    public static final native int StaticMetadata_max_analog_iso_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_max_analog_iso_set(long j, StaticMetadata staticMetadata, int i);

    public static final native String StaticMetadata_model_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_model_set(long j, StaticMetadata staticMetadata, String str);

    public static final native long StaticMetadata_optically_black_regions_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_optically_black_regions_set(long j, StaticMetadata staticMetadata, long j2, PixelRectVector pixelRectVector);

    public static final native int StaticMetadata_pixel_array_height_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_pixel_array_height_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_pixel_array_width_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_pixel_array_width_set(long j, StaticMetadata staticMetadata, int i);

    public static final native long StaticMetadata_qc_color_calibration_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_qc_color_calibration_set(long j, StaticMetadata staticMetadata, long j2, QcColorCalibration qcColorCalibration);

    public static final native int StaticMetadata_raw_bits_per_pixel_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_raw_bits_per_pixel_set(long j, StaticMetadata staticMetadata, int i);

    public static final native int StaticMetadata_sensor_id_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_id_set(long j, StaticMetadata staticMetadata, int i);

    public static final native float StaticMetadata_sensor_physical_height_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_physical_height_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native float StaticMetadata_sensor_physical_width_mm_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_sensor_physical_width_mm_set(long j, StaticMetadata staticMetadata, float f);

    public static final native String StaticMetadata_software_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_software_set(long j, StaticMetadata staticMetadata, String str);

    public static final native int StaticMetadata_white_level_get(long j, StaticMetadata staticMetadata);

    public static final native void StaticMetadata_white_level_set(long j, StaticMetadata staticMetadata, int i);

    public static final native void StringAeResultsMap_clear(long j, StringAeResultsMap stringAeResultsMap);

    public static final native void StringAeResultsMap_del(long j, StringAeResultsMap stringAeResultsMap, String str);

    public static final native boolean StringAeResultsMap_empty(long j, StringAeResultsMap stringAeResultsMap);

    public static final native long StringAeResultsMap_get(long j, StringAeResultsMap stringAeResultsMap, String str);

    public static final native boolean StringAeResultsMap_has_key(long j, StringAeResultsMap stringAeResultsMap, String str);

    public static final native void StringAeResultsMap_set(long j, StringAeResultsMap stringAeResultsMap, String str, long j2, AeResults aeResults);

    public static final native long StringAeResultsMap_size(long j, StringAeResultsMap stringAeResultsMap);

    public static final native void StringFrameMetadataMap_clear(long j, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native void StringFrameMetadataMap_del(long j, StringFrameMetadataMap stringFrameMetadataMap, String str);

    public static final native boolean StringFrameMetadataMap_empty(long j, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native long StringFrameMetadataMap_get(long j, StringFrameMetadataMap stringFrameMetadataMap, String str);

    public static final native boolean StringFrameMetadataMap_has_key(long j, StringFrameMetadataMap stringFrameMetadataMap, String str);

    public static final native void StringFrameMetadataMap_set(long j, StringFrameMetadataMap stringFrameMetadataMap, String str, long j2, FrameMetadata frameMetadata);

    public static final native long StringFrameMetadataMap_size(long j, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native void StringRawReadViewMap_clear(long j, StringRawReadViewMap stringRawReadViewMap);

    public static final native void StringRawReadViewMap_del(long j, StringRawReadViewMap stringRawReadViewMap, String str);

    public static final native boolean StringRawReadViewMap_empty(long j, StringRawReadViewMap stringRawReadViewMap);

    public static final native long StringRawReadViewMap_get(long j, StringRawReadViewMap stringRawReadViewMap, String str);

    public static final native boolean StringRawReadViewMap_has_key(long j, StringRawReadViewMap stringRawReadViewMap, String str);

    public static final native void StringRawReadViewMap_set(long j, StringRawReadViewMap stringRawReadViewMap, String str, long j2, RawReadView rawReadView);

    public static final native long StringRawReadViewMap_size(long j, StringRawReadViewMap stringRawReadViewMap);

    public static final native void StringSpatialGainMap_clear(long j, StringSpatialGainMap stringSpatialGainMap);

    public static final native void StringSpatialGainMap_del(long j, StringSpatialGainMap stringSpatialGainMap, String str);

    public static final native boolean StringSpatialGainMap_empty(long j, StringSpatialGainMap stringSpatialGainMap);

    public static final native long StringSpatialGainMap_get(long j, StringSpatialGainMap stringSpatialGainMap, String str);

    public static final native boolean StringSpatialGainMap_has_key(long j, StringSpatialGainMap stringSpatialGainMap, String str);

    public static final native void StringSpatialGainMap_set(long j, StringSpatialGainMap stringSpatialGainMap, String str, long j2, SpatialGainMap spatialGainMap);

    public static final native long StringSpatialGainMap_size(long j, StringSpatialGainMap stringSpatialGainMap);

    public static final native void StringStaticMetadataMap_clear(long j, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native void StringStaticMetadataMap_del(long j, StringStaticMetadataMap stringStaticMetadataMap, String str);

    public static final native boolean StringStaticMetadataMap_empty(long j, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native long StringStaticMetadataMap_get(long j, StringStaticMetadataMap stringStaticMetadataMap, String str);

    public static final native boolean StringStaticMetadataMap_has_key(long j, StringStaticMetadataMap stringStaticMetadataMap, String str);

    public static final native void StringStaticMetadataMap_set(long j, StringStaticMetadataMap stringStaticMetadataMap, String str, long j2, StaticMetadata staticMetadata);

    public static final native long StringStaticMetadataMap_size(long j, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native void SuppressRowArtifacts__SWIG_0(long j, FloatVector floatVector, long j2, int i, long j3, long j4, long j5, RawWriteView rawWriteView);

    public static final native void SuppressRowArtifacts__SWIG_1(long j, FloatVector floatVector, int i, long j2, long j3, long j4, RawWriteView rawWriteView);

    public static final native void SuppressRowArtifacts__SWIG_2(long j, int i, long j2, long j3, long j4, RawWriteView rawWriteView);

    public static final native float TetFactorization_analog_gain_get(long j, TetFactorization tetFactorization);

    public static final native void TetFactorization_analog_gain_set(long j, TetFactorization tetFactorization, float f);

    public static final native float TetFactorization_digital_gain_get(long j, TetFactorization tetFactorization);

    public static final native void TetFactorization_digital_gain_set(long j, TetFactorization tetFactorization, float f);

    public static final native float TetFactorization_exposure_time_ms_get(long j, TetFactorization tetFactorization);

    public static final native void TetFactorization_exposure_time_ms_set(long j, TetFactorization tetFactorization, float f);

    public static final native void TetModel_AddTetWaypoint__SWIG_0(long j, TetModel tetModel, float f, float f2);

    public static final native void TetModel_AddTetWaypoint__SWIG_1(long j, TetModel tetModel, long j2, TetWaypoint tetWaypoint);

    public static final native boolean TetModel_Check(long j, TetModel tetModel);

    public static final native void TetModel_Clear(long j, TetModel tetModel);

    public static final native boolean TetModel_DeserializeFromString(long j, TetModel tetModel, long j2);

    public static final native boolean TetModel_Equals(long j, TetModel tetModel, long j2, TetModel tetModel2);

    public static final native long TetModel_MaxTetWaypoint(float f, float f2);

    public static final native void TetModel_Print(long j, TetModel tetModel, int i, int i2);

    public static final native void TetModel_SerializeToString(long j, TetModel tetModel, String str, int i);

    public static final native int TetModel_count_get(long j, TetModel tetModel);

    public static final native void TetModel_count_set(long j, TetModel tetModel, int i);

    public static final native long TetModel_model_get(long j, TetModel tetModel);

    public static final native void TetModel_model_set(long j, TetModel tetModel, long j2, TetWaypoint tetWaypoint);

    public static final native boolean TetWaypoint_DeserializeFromString(long j, TetWaypoint tetWaypoint, long j2);

    public static final native boolean TetWaypoint_Equals(long j, TetWaypoint tetWaypoint, long j2, TetWaypoint tetWaypoint2);

    public static final native void TetWaypoint_Print(long j, TetWaypoint tetWaypoint, int i, int i2);

    public static final native void TetWaypoint_SerializeToString(long j, TetWaypoint tetWaypoint, String str, int i);

    public static final native float TetWaypoint_exposure_time_ms_get(long j, TetWaypoint tetWaypoint);

    public static final native void TetWaypoint_exposure_time_ms_set(long j, TetWaypoint tetWaypoint, float f);

    public static final native float TetWaypoint_overall_gain_get(long j, TetWaypoint tetWaypoint);

    public static final native void TetWaypoint_overall_gain_set(long j, TetWaypoint tetWaypoint, float f);

    public static final native int TextToAeState(String str);

    public static final native int TextToAeType(String str);

    public static final native int TextToAfState(String str);

    public static final native int TextToBayerPattern(String str);

    public static final native int TextToBurstFrameType(String str);

    public static final native int TextToExecuteOn(String str);

    public static final native int TextToFlashMetadata(String str);

    public static final native int TextToFlashMode(String str);

    public static final native int TextToGcamPixelFormat(String str);

    public static final native int TextToIccProfile(String str);

    public static final native int TextToImageRotation(String str);

    public static final native int TextToInputFrameType(String str);

    public static final native int TextToLensFacing(String str);

    public static final native int TextToLensOpticalStabilizationMode(String str);

    public static final native int TextToLensState(String str);

    public static final native int TextToMergeMethod(String str);

    public static final native int TextToPortraitDepthBlurConfig(String str);

    public static final native int TextToRawCropping(String str);

    public static final native int TextToResamplingMethod(String str);

    public static final native int TextToSceneFlicker(String str);

    public static final native int TextToUxMode(String str);

    public static final native int TextToWhiteBalanceMethod(String str);

    public static final native int TextToWhiteBalanceMode(String str);

    public static final native int TextToYuvFormat(String str);

    public static final native boolean ThreadPoolConfig_Equals(long j, ThreadPoolConfig threadPoolConfig, long j2, ThreadPoolConfig threadPoolConfig2);

    public static final native long ThreadPoolConfig_affinity_mask_get(long j, ThreadPoolConfig threadPoolConfig);

    public static final native void ThreadPoolConfig_affinity_mask_set(long j, ThreadPoolConfig threadPoolConfig, long j2);

    public static final native int ThreadPoolConfig_count_get(long j, ThreadPoolConfig threadPoolConfig);

    public static final native void ThreadPoolConfig_count_set(long j, ThreadPoolConfig threadPoolConfig, int i);

    public static final native long ThreadPoolConfig_priority_get(long j, ThreadPoolConfig threadPoolConfig);

    public static final native void ThreadPoolConfig_priority_set(long j, ThreadPoolConfig threadPoolConfig, long j2, ThreadPriority threadPriority);

    public static final native boolean ThreadPriority_Equals(long j, ThreadPriority threadPriority, long j2, ThreadPriority threadPriority2);

    public static final native boolean ThreadPriority_explicitly_set_get(long j, ThreadPriority threadPriority);

    public static final native void ThreadPriority_explicitly_set_set(long j, ThreadPriority threadPriority, boolean z);

    public static final native int ThreadPriority_value_get(long j, ThreadPriority threadPriority);

    public static final native void ThreadPriority_value_set(long j, ThreadPriority threadPriority, int i);

    public static final native String ToText__SWIG_0(int i);

    public static final native int ToYuvFormat(int i);

    public static final native long TrackedMemoryAllocate(long j);

    public static final native void TrackedMemoryDeallocate(long j);

    public static final native boolean Tuning_Check(long j, Tuning tuning);

    public static final native boolean Tuning_DeviceIsOnTripod(long j, Tuning tuning, float f);

    public static final native long Tuning_GetAfBurstTetModel__SWIG_0(long j, Tuning tuning, int i, float f, boolean z);

    public static final native long Tuning_GetAfBurstTetModel__SWIG_1(long j, Tuning tuning, int i, float f);

    public static final native long Tuning_GetAfBurstTetModel__SWIG_2(long j, Tuning tuning, int i);

    public static final native long Tuning_GetCaptureParams(long j, Tuning tuning);

    public static final native long Tuning_GetColorSatAdj(long j, Tuning tuning);

    public static final native long Tuning_GetExtraFinishVignetting(long j, Tuning tuning, int i, float f, float f2);

    public static final native long Tuning_GetLongExposureTripodTetModel(long j, Tuning tuning);

    public static final native float Tuning_GetMaxOverallGain(long j, Tuning tuning);

    public static final native float Tuning_GetMaxTet(long j, Tuning tuning);

    public static final native float Tuning_GetMinExposureTimeMs(long j, Tuning tuning);

    public static final native float Tuning_GetMinTet(long j, Tuning tuning);

    public static final native long Tuning_GetPayloadBurstTetModel__SWIG_0(long j, Tuning tuning, int i, float f, boolean z);

    public static final native long Tuning_GetPayloadBurstTetModel__SWIG_1(long j, Tuning tuning, int i, float f);

    public static final native long Tuning_GetPayloadBurstTetModel__SWIG_2(long j, Tuning tuning, int i);

    public static final native void Tuning_UpdateMaxExposureTimeAssumingHandheld(long j, Tuning tuning, boolean z);

    public static final native void Tuning_UpdateMaxExposureTimeAssumingTripod(long j, Tuning tuning, float f, boolean z);

    public static final native void Tuning_UpdateMaxExposureTimeBasedOnGyro(long j, Tuning tuning, float f, float f2, boolean z);

    public static final native boolean Tuning_apply_antibanding_get(long j, Tuning tuning);

    public static final native void Tuning_apply_antibanding_set(long j, Tuning tuning, boolean z);

    public static final native long Tuning_black_pixel_area_override_get(long j, Tuning tuning);

    public static final native void Tuning_black_pixel_area_override_set(long j, Tuning tuning, long j2, PixelRect pixelRect);

    public static final native boolean Tuning_ignore_black_pixels_get(long j, Tuning tuning);

    public static final native void Tuning_ignore_black_pixels_set(long j, Tuning tuning, boolean z);

    public static final native boolean Tuning_ignore_pd_for_moving_lens_get(long j, Tuning tuning);

    public static final native void Tuning_ignore_pd_for_moving_lens_set(long j, Tuning tuning, boolean z);

    public static final native boolean Tuning_is_logical_get(long j, Tuning tuning);

    public static final native void Tuning_is_logical_set(long j, Tuning tuning, boolean z);

    public static final native boolean Tuning_is_rgb_get(long j, Tuning tuning);

    public static final native void Tuning_is_rgb_set(long j, Tuning tuning, boolean z);

    public static final native int Tuning_lens_facing_get(long j, Tuning tuning);

    public static final native void Tuning_lens_facing_set(long j, Tuning tuning, int i);

    public static final native long Tuning_live_hdr_params_get(long j, Tuning tuning);

    public static final native void Tuning_live_hdr_params_set(long j, Tuning tuning, long j2, LiveHdrParams liveHdrParams);

    public static final native float Tuning_max_black_level_offset_get(long j, Tuning tuning);

    public static final native void Tuning_max_black_level_offset_set(long j, Tuning tuning, float f);

    public static final native float Tuning_max_exposure_time_ms_get(long j, Tuning tuning);

    public static final native void Tuning_max_exposure_time_ms_set(long j, Tuning tuning, float f);

    public static final native int Tuning_num_base_frame_candidates_get(long j, Tuning tuning);

    public static final native void Tuning_num_base_frame_candidates_set(long j, Tuning tuning, int i);

    public static final native long Tuning_physical_stability_params_get(long j, Tuning tuning);

    public static final native void Tuning_physical_stability_params_set(long j, Tuning tuning, long j2, PhysicalStabilityParams physicalStabilityParams);

    public static final native long Tuning_post_shutter_af_params_get(long j, Tuning tuning);

    public static final native void Tuning_post_shutter_af_params_set(long j, Tuning tuning, long j2, PostShutterAfParams postShutterAfParams);

    public static final native long Tuning_raw_finish_params_get(long j, Tuning tuning);

    public static final native void Tuning_raw_finish_params_set(long j, Tuning tuning, long j2, RawFinishParams rawFinishParams);

    public static final native long Tuning_raw_global_vignetting_get(long j, Tuning tuning);

    public static final native void Tuning_raw_global_vignetting_set(long j, Tuning tuning, long j2, RawVignetteParams rawVignetteParams);

    public static final native long Tuning_raw_merge_params_get(long j, Tuning tuning);

    public static final native void Tuning_raw_merge_params_set(long j, Tuning tuning, long j2, RawMergeParams rawMergeParams);

    public static final native long Tuning_raw_payload_capture_params_get(long j, Tuning tuning);

    public static final native void Tuning_raw_payload_capture_params_set(long j, Tuning tuning, long j2, CaptureParams captureParams);

    public static final native float Tuning_sensitivity_get(long j, Tuning tuning);

    public static final native void Tuning_sensitivity_set(long j, Tuning tuning, float f);

    public static final native long Tuning_sensor_noise_model_override_bayer_get(long j, Tuning tuning);

    public static final native void Tuning_sensor_noise_model_override_bayer_set(long j, Tuning tuning, long j2);

    public static final native long Tuning_sensor_row_artifacts_get(long j, Tuning tuning);

    public static final native void Tuning_sensor_row_artifacts_set(long j, Tuning tuning, long j2, SensorRowArtifacts sensorRowArtifacts);

    public static final native long Tuning_sparse_pd_pixel_pattern_get(long j, Tuning tuning);

    public static final native void Tuning_sparse_pd_pixel_pattern_set(long j, Tuning tuning, long j2, BadPixelPattern badPixelPattern);

    public static final native boolean Tuning_suppress_hot_pixels_get(long j, Tuning tuning);

    public static final native void Tuning_suppress_hot_pixels_set(long j, Tuning tuning, boolean z);

    public static final native void Uint8Vector_add(long j, Uint8Vector uint8Vector, short s);

    public static final native long Uint8Vector_capacity(long j, Uint8Vector uint8Vector);

    public static final native void Uint8Vector_clear(long j, Uint8Vector uint8Vector);

    public static final native short Uint8Vector_get(long j, Uint8Vector uint8Vector, int i);

    public static final native boolean Uint8Vector_isEmpty(long j, Uint8Vector uint8Vector);

    public static final native void Uint8Vector_reserve(long j, Uint8Vector uint8Vector, long j2);

    public static final native void Uint8Vector_set(long j, Uint8Vector uint8Vector, int i, short s);

    public static final native long Uint8Vector_size(long j, Uint8Vector uint8Vector);

    public static final native long Union__SWIG_0(long j, PixelRect pixelRect, long j2, PixelRect pixelRect2);

    public static final native long Union__SWIG_1(long j, NormalizedRect normalizedRect, long j2, NormalizedRect normalizedRect2);

    public static final native boolean ViewfinderProcessingOptions_process_motion_get(long j, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native void ViewfinderProcessingOptions_process_motion_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native boolean ViewfinderProcessingOptions_save_motion_trace_get(long j, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native void ViewfinderProcessingOptions_save_motion_trace_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native boolean ViewfinderProcessingOptions_verbose_get(long j, ViewfinderProcessingOptions viewfinderProcessingOptions);

    public static final native void ViewfinderProcessingOptions_verbose_set(long j, ViewfinderProcessingOptions viewfinderProcessingOptions, boolean z);

    public static final native boolean ViewfinderResults_is_on_tripod_get(long j, ViewfinderResults viewfinderResults);

    public static final native void ViewfinderResults_is_on_tripod_set(long j, ViewfinderResults viewfinderResults, boolean z);

    public static final native void WeightedNormalizedRectVector_add(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, long j2, WeightedNormalizedRect weightedNormalizedRect);

    public static final native long WeightedNormalizedRectVector_capacity(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native void WeightedNormalizedRectVector_clear(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native long WeightedNormalizedRectVector_get(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, int i);

    public static final native boolean WeightedNormalizedRectVector_isEmpty(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native void WeightedNormalizedRectVector_reserve(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, long j2);

    public static final native void WeightedNormalizedRectVector_set(long j, WeightedNormalizedRectVector weightedNormalizedRectVector, int i, long j2, WeightedNormalizedRect weightedNormalizedRect);

    public static final native long WeightedNormalizedRectVector_size(long j, WeightedNormalizedRectVector weightedNormalizedRectVector);

    public static final native boolean WeightedNormalizedRect_DeserializeFromString(long j, WeightedNormalizedRect weightedNormalizedRect, long j2);

    public static final native boolean WeightedNormalizedRect_Equals(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, WeightedNormalizedRect weightedNormalizedRect2);

    public static final native void WeightedNormalizedRect_Print(long j, WeightedNormalizedRect weightedNormalizedRect, int i, int i2);

    public static final native void WeightedNormalizedRect_SerializeToString(long j, WeightedNormalizedRect weightedNormalizedRect, String str, int i);

    public static final native long WeightedNormalizedRect_rect_get(long j, WeightedNormalizedRect weightedNormalizedRect);

    public static final native void WeightedNormalizedRect_rect_set(long j, WeightedNormalizedRect weightedNormalizedRect, long j2, NormalizedRect normalizedRect);

    public static final native float WeightedNormalizedRect_weight_get(long j, WeightedNormalizedRect weightedNormalizedRect);

    public static final native void WeightedNormalizedRect_weight_set(long j, WeightedNormalizedRect weightedNormalizedRect, float f);

    public static final native void WeightedPixelRectVector_add(long j, WeightedPixelRectVector weightedPixelRectVector, long j2, WeightedPixelRect weightedPixelRect);

    public static final native long WeightedPixelRectVector_capacity(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native void WeightedPixelRectVector_clear(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native long WeightedPixelRectVector_get(long j, WeightedPixelRectVector weightedPixelRectVector, int i);

    public static final native boolean WeightedPixelRectVector_isEmpty(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native void WeightedPixelRectVector_reserve(long j, WeightedPixelRectVector weightedPixelRectVector, long j2);

    public static final native void WeightedPixelRectVector_set(long j, WeightedPixelRectVector weightedPixelRectVector, int i, long j2, WeightedPixelRect weightedPixelRect);

    public static final native long WeightedPixelRectVector_size(long j, WeightedPixelRectVector weightedPixelRectVector);

    public static final native boolean WeightedPixelRect_DeserializeFromString(long j, WeightedPixelRect weightedPixelRect, long j2);

    public static final native boolean WeightedPixelRect_Equals(long j, WeightedPixelRect weightedPixelRect, long j2, WeightedPixelRect weightedPixelRect2);

    public static final native void WeightedPixelRect_Print(long j, WeightedPixelRect weightedPixelRect, int i, int i2);

    public static final native void WeightedPixelRect_SerializeToString(long j, WeightedPixelRect weightedPixelRect, String str, int i);

    public static final native long WeightedPixelRect_rect_get(long j, WeightedPixelRect weightedPixelRect);

    public static final native void WeightedPixelRect_rect_set(long j, WeightedPixelRect weightedPixelRect, long j2, PixelRect pixelRect);

    public static final native float WeightedPixelRect_weight_get(long j, WeightedPixelRect weightedPixelRect);

    public static final native void WeightedPixelRect_weight_set(long j, WeightedPixelRect weightedPixelRect, float f);

    public static final native void WriteAeToShotLogData(long j, AeResults aeResults, long j2, ShotLogData shotLogData);

    public static final native boolean WriteEmptyFile(String str);

    public static final native boolean WriteMemoryToFile(long j, long j2, String str);

    public static final native boolean WriteStringToFile(String str, String str2);

    public static final native long YuvAllocation_id_get(long j, YuvAllocation yuvAllocation);

    public static final native void YuvAllocation_id_set(long j, YuvAllocation yuvAllocation, long j2);

    public static final native long YuvAllocation_view_get(long j, YuvAllocation yuvAllocation);

    public static final native void YuvAllocation_view_set(long j, YuvAllocation yuvAllocation, long j2, YuvWriteView yuvWriteView);

    public static final native boolean YuvFormatsHaveUvSwapped(int i, int i2);

    public static final native long YuvImage_SWIGUpcast(long j);

    public static final native long YuvImage_buffer(long j, YuvImage yuvImage);

    public static final native int YuvImage_chroma_rows(long j, YuvImage yuvImage);

    public static final native int YuvImage_luma_rows(long j, YuvImage yuvImage);

    public static final native long YuvImage_mutable_buffer(long j, YuvImage yuvImage);

    public static final native boolean YuvReadView_Empty(long j, YuvReadView yuvReadView);

    public static final native void YuvReadView_FastCrop(long j, YuvReadView yuvReadView, int i, int i2, int i3, int i4);

    public static final native boolean YuvReadView_IsOneLeanChunk(long j, YuvReadView yuvReadView);

    public static final native long YuvReadView_chroma_read_view(long j, YuvReadView yuvReadView);

    public static final native int YuvReadView_height(long j, YuvReadView yuvReadView);

    public static final native long YuvReadView_luma_read_view(long j, YuvReadView yuvReadView);

    public static final native short YuvReadView_uv_at(long j, YuvReadView yuvReadView, int i, int i2, int i3);

    public static final native int YuvReadView_width(long j, YuvReadView yuvReadView);

    public static final native short YuvReadView_y_at(long j, YuvReadView yuvReadView, int i, int i2);

    public static final native int YuvReadView_yuv_format(long j, YuvReadView yuvReadView);

    public static final native void YuvWriteView_FastCrop(long j, YuvWriteView yuvWriteView, int i, int i2, int i3, int i4);

    public static final native long YuvWriteView_SWIGUpcast(long j);

    public static final native void YuvWriteView_SetYuvFormat(long j, YuvWriteView yuvWriteView, int i);

    public static final native long YuvWriteView_chroma_write_view(long j, YuvWriteView yuvWriteView);

    public static final native long YuvWriteView_luma_write_view(long j, YuvWriteView yuvWriteView);

    public static final native long YuvWriteView_uv_at_YuvWriteView(long j, YuvWriteView yuvWriteView, int i, int i2, int i3);

    public static final native long YuvWriteView_y_at_YuvWriteView(long j, YuvWriteView yuvWriteView, int i, int i2);

    public static final native void delete_AeDebugInfo(long j);

    public static final native void delete_AeMetadata(long j);

    public static final native void delete_AeModeResult(long j);

    public static final native void delete_AeResults(long j);

    public static final native void delete_AeRunnerDeviceTuning(long j);

    public static final native void delete_AeShotParams(long j);

    public static final native void delete_AfMetadata(long j);

    public static final native void delete_AffineNoiseModel(long j);

    public static final native void delete_ArcFlareParam(long j);

    public static final native void delete_AwbInfo(long j);

    public static final native void delete_AwbMetadata(long j);

    public static final native void delete_BadPixel(long j);

    public static final native void delete_BadPixelPattern(long j);

    public static final native void delete_BoolVector(long j);

    public static final native void delete_BurstSpec(long j);

    public static final native void delete_CaptureParams(long j);

    public static final native void delete_ClientExifMetadata(long j);

    public static final native void delete_ClientInterleavedU16Allocator(long j);

    public static final native void delete_ClientInterleavedU8Allocator(long j);

    public static final native void delete_ClientRawAllocator(long j);

    public static final native void delete_ClientYuvAllocator(long j);

    public static final native void delete_ColorSatParams(long j);

    public static final native void delete_ConstSampleIteratorPackedRaw10(long j);

    public static final native void delete_ConstSampleIteratorPackedRaw12(long j);

    public static final native void delete_DebugParams(long j);

    public static final native void delete_DehazeParams(long j);

    public static final native void delete_DenoiseParams(long j);

    public static final native void delete_DetectHotPixelParams(long j);

    public static final native void delete_DirtyLensHistory(long j);

    public static final native void delete_DngColorCalibration(long j);

    public static final native void delete_DngColorCalibrationVector(long j);

    public static final native void delete_DngNoiseModel(long j);

    public static final native void delete_ExifMetadata(long j);

    public static final native void delete_FaceInfo(long j);

    public static final native void delete_FaceInfoVector(long j);

    public static final native void delete_FaceInfo_Landmark(long j);

    public static final native void delete_FactorizeTetOptions(long j);

    public static final native void delete_FileSaver(long j);

    public static final native void delete_FinalImageCallback(long j);

    public static final native void delete_FloatDeque(long j);

    public static final native void delete_FloatSmoothKeyValueMap(long j);

    public static final native void delete_FloatVector(long j);

    public static final native void delete_FrameMetadata(long j);

    public static final native void delete_FrameMetadataKey(long j);

    public static final native void delete_FrameMetadataKey_Compare(long j);

    public static final native void delete_FrameMetadataKey_Hasher(long j);

    public static final native void delete_FrameRequest(long j);

    public static final native void delete_FrameRequestVector(long j);

    public static final native void delete_Gcam(long j);

    public static final native void delete_GenerateRgbImageOptions(long j);

    public static final native void delete_GeometricCalibration(long j);

    public static final native void delete_GeometricCalibrationVector(long j);

    public static final native void delete_GyroSample(long j);

    public static final native void delete_GyroSampleVector(long j);

    public static final native void delete_ImageReleaseCallback(long j);

    public static final native void delete_ImageSaver(long j);

    public static final native void delete_ImageSaverParams(long j);

    public static final native void delete_InitParams(long j);

    public static final native void delete_Int64Vector(long j);

    public static final native void delete_InterleavedImageF(long j);

    public static final native void delete_InterleavedImageU16(long j);

    public static final native void delete_InterleavedImageU8(long j);

    public static final native void delete_InterleavedReadViewF(long j);

    public static final native void delete_InterleavedReadViewU16(long j);

    public static final native void delete_InterleavedReadViewU8(long j);

    public static final native void delete_InterleavedU16Allocation(long j);

    public static final native void delete_InterleavedU8Allocation(long j);

    public static final native void delete_InterleavedWriteViewF(long j);

    public static final native void delete_InterleavedWriteViewU16(long j);

    public static final native void delete_InterleavedWriteViewU8(long j);

    public static final native void delete_IspAwbMetadata(long j);

    public static final native void delete_IspAwbMetadata_Statistics(long j);

    public static final native void delete_JpgEncodeOptions(long j);

    public static final native void delete_LandmarkMap(long j);

    public static final native void delete_LiveHdrMetadata(long j);

    public static final native void delete_LiveHdrParams(long j);

    public static final native void delete_LocationData(long j);

    public static final native void delete_MeshTranslation(long j);

    public static final native void delete_MeshWarp(long j);

    public static final native void delete_NewDeleteInterleavedU16Allocator(long j);

    public static final native void delete_NewDeleteInterleavedU8Allocator(long j);

    public static final native void delete_NewDeleteRawAllocator(long j);

    public static final native void delete_NewDeleteYuvAllocator(long j);

    public static final native void delete_NormalizedRect(long j);

    public static final native void delete_OisMetadata(long j);

    public static final native void delete_OisPosition(long j);

    public static final native void delete_OisPositionVector(long j);

    public static final native void delete_OpaqueHandleWrapper(long j);

    public static final native void delete_PackedImageRaw10(long j);

    public static final native void delete_PackedImageRaw12(long j);

    public static final native void delete_PackedReadViewRaw10(long j);

    public static final native void delete_PackedReadViewRaw12(long j);

    public static final native void delete_PackedReadWriteViewRaw10(long j);

    public static final native void delete_PackedReadWriteViewRaw12(long j);

    public static final native void delete_PdImageCallback(long j);

    public static final native void delete_PhysicalStabilityParams(long j);

    public static final native void delete_PhysicalStabilityThresholds(long j);

    public static final native void delete_PixelRect(long j);

    public static final native void delete_PixelRectVector(long j);

    public static final native void delete_PlanarRawImageCallback(long j);

    public static final native void delete_PortraitBlobCallback(long j);

    public static final native void delete_PortraitDepthArguments(long j);

    public static final native void delete_PortraitImageCallback(long j);

    public static final native void delete_PortraitOutputFeaturesCallback(long j);

    public static final native void delete_PortraitOutputs(long j);

    public static final native void delete_PortraitRequest(long j);

    public static final native void delete_PortraitSegmenterSwigWrapper(long j);

    public static final native void delete_PortraitSwigWrapper(long j);

    public static final native void delete_PostShutterAfParams(long j);

    public static final native void delete_PostviewCallback(long j);

    public static final native void delete_PostviewParams(long j);

    public static final native void delete_QcColorCalibration(long j);

    public static final native void delete_QcColorCalibration_IlluminantData(long j);

    public static final native void delete_QcIlluminantVector(long j);

    public static final native void delete_RawAllocation(long j);

    public static final native void delete_RawFinishParams(long j);

    public static final native void delete_RawImage(long j);

    public static final native void delete_RawImageCallback(long j);

    public static final native void delete_RawMergeParams(long j);

    public static final native void delete_RawReadView(long j);

    public static final native void delete_RawSharpenParams(long j);

    public static final native void delete_RawSharpenParams_Point(long j);

    public static final native void delete_RawVignetteParams(long j);

    public static final native void delete_RawWriteView(long j);

    public static final native void delete_RowPattern(long j);

    public static final native void delete_SecondOrderFilter(long j);

    public static final native void delete_SensorNoiseModel(long j);

    public static final native void delete_SensorRowArtifacts(long j);

    public static final native void delete_ShotCallbacks(long j);

    public static final native void delete_ShotLogData(long j);

    public static final native void delete_ShotParams(long j);

    public static final native void delete_ShotStatusCallback(long j);

    public static final native void delete_SpatialGainMap(long j);

    public static final native void delete_StaticMetadata(long j);

    public static final native void delete_StaticMetadataVector(long j);

    public static final native void delete_StringAeResultsMap(long j);

    public static final native void delete_StringFrameMetadataMap(long j);

    public static final native void delete_StringRawReadViewMap(long j);

    public static final native void delete_StringSpatialGainMap(long j);

    public static final native void delete_StringStaticMetadataMap(long j);

    public static final native void delete_TetFactorization(long j);

    public static final native void delete_TetModel(long j);

    public static final native void delete_TetWaypoint(long j);

    public static final native void delete_ThreadPoolConfig(long j);

    public static final native void delete_ThreadPriority(long j);

    public static final native void delete_Tuning(long j);

    public static final native void delete_Uint8Vector(long j);

    public static final native void delete_ViewfinderProcessingOptions(long j);

    public static final native void delete_ViewfinderResults(long j);

    public static final native void delete_WeightedNormalizedRect(long j);

    public static final native void delete_WeightedNormalizedRectVector(long j);

    public static final native void delete_WeightedPixelRect(long j);

    public static final native void delete_WeightedPixelRectVector(long j);

    public static final native void delete_YuvAllocation(long j);

    public static final native void delete_YuvImage(long j);

    public static final native void delete_YuvReadView(long j);

    public static final native void delete_YuvWriteView(long j);

    public static final native int kColorLutSize_get();

    public static final native int kColorTempUnknown_get();

    public static final native int kDefaultPostviewLongestEdge_get();

    public static final native float kDefaultTripodMaxTotalCaptureTimeMs_get();

    public static final native int kDenoiseFreqCount_get();

    public static final native int kDenoiseStrengthMapDecimation_get();

    public static final native String kDroppedFrameSuffix_get();

    public static final native void kDroppedFrameSuffix_set(String str);

    public static final native String kInitParamsFilename_get();

    public static final native long kInvalidAllocationId_get();

    public static final native long kInvalidImageId_get();

    public static final native float kInvalidMotionScore_get();

    public static final native int kInvalidShotId_get();

    public static final native int[] kLandmarkType_get();

    public static final native int kLinearClampLevel_get();

    public static final native int kLinearFullRangePrecision_get();

    public static final native int kLinearPrecision_get();

    public static final native int kLinearWhiteLevel_get();

    public static final native int kLog2ColorLutSize_get();

    public static final native int kLog2DenoiseStrengthMapDecimation_get();

    public static final native float kLogSceneBrightnessUnknown_get();

    public static final native float kMaxMotionScore_get();

    public static final native float kMaxOverallGainSlopFactor_get();

    public static final native int kMaxTetWaypoints_get();

    public static final native int kMaxValidColorTemp_get();

    public static final native String kMeteringBurstFrameMetadataFilename_get();

    public static final native void kMeteringBurstFrameMetadataFilename_set(String str);

    public static final native String kMeteringBurstSpecFilename_get();

    public static final native void kMeteringBurstSpecFilename_set(String str);

    public static final native float kMinDigitalZoomRatio_get();

    public static final native float kMinMotionScore_get();

    public static final native int kMinValidColorTemp_get();

    public static final native String kPayloadBurstFrameMetadataFilename_get();

    public static final native void kPayloadBurstFrameMetadataFilename_set(String str);

    public static final native String kPayloadBurstSpecFilename_get();

    public static final native void kPayloadBurstSpecFilename_set(String str);

    public static final native int kPdCurrentVersion_get();

    public static final native int kRawFinishAlignmentX_get();

    public static final native int kRawFinishAlignmentY_get();

    public static final native int kRawPixelMaxValue_get();

    public static final native int kRawSharpenCurveSize_get();

    public static final native int kRawSharpenFreqCount_get();

    public static final native String kRequestCameraPrimary_get();

    public static final native String kRequestCameraTele_get();

    public static final native int kSensorTempUnknown_get();

    public static final native String kShotParamsFilename_get();

    public static final native String kStaticMetadataFilename_get();

    public static final native int kThrowOutOneInNBlurryImages_get();

    public static final native int kTonemappedPrecision_get();

    public static final native int kTonemappedWhiteLevel_get();

    public static final native long new_AeDebugInfo();

    public static final native long new_AeMetadata();

    public static final native long new_AeModeResult();

    public static final native long new_AeResults__SWIG_0();

    public static final native long new_AeResults__SWIG_1(long j, AeResults aeResults);

    public static final native long new_AeRunnerDeviceTuning();

    public static final native long new_AeShotParams();

    public static final native long new_AfMetadata();

    public static final native long new_AffineNoiseModel();

    public static final native long new_ArcFlareParam();

    public static final native long new_AwbInfo();

    public static final native long new_AwbMetadata();

    public static final native long new_BadPixel();

    public static final native long new_BadPixelPattern();

    public static final native long new_BoolVector__SWIG_0();

    public static final native long new_BoolVector__SWIG_1(long j);

    public static final native long new_BurstSpec();

    public static final native long new_CaptureParams();

    public static final native long new_ClientExifMetadata();

    public static final native long new_ClientInterleavedU16Allocator();

    public static final native long new_ClientInterleavedU8Allocator();

    public static final native long new_ClientRawAllocator();

    public static final native long new_ClientYuvAllocator();

    public static final native long new_ColorSatParams();

    public static final native long new_ConstSampleIteratorPackedRaw10__SWIG_0(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long new_ConstSampleIteratorPackedRaw10__SWIG_1(long j, ConstSampleIteratorPackedRaw10 constSampleIteratorPackedRaw10);

    public static final native long new_ConstSampleIteratorPackedRaw12__SWIG_0(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long new_ConstSampleIteratorPackedRaw12__SWIG_1(long j, ConstSampleIteratorPackedRaw12 constSampleIteratorPackedRaw12);

    public static final native long new_DebugParams();

    public static final native long new_DehazeParams();

    public static final native long new_DenoiseParams();

    public static final native long new_DetectHotPixelParams();

    public static final native long new_DirtyLensHistory();

    public static final native long new_DngColorCalibration();

    public static final native long new_DngColorCalibrationVector__SWIG_0();

    public static final native long new_DngColorCalibrationVector__SWIG_1(long j);

    public static final native long new_DngNoiseModel();

    public static final native long new_ExifMetadata__SWIG_0();

    public static final native long new_ExifMetadata__SWIG_1(long j, ExifMetadata exifMetadata);

    public static final native long new_FaceInfo();

    public static final native long new_FaceInfoVector__SWIG_0();

    public static final native long new_FaceInfoVector__SWIG_1(long j);

    public static final native long new_FaceInfo_Landmark();

    public static final native long new_FactorizeTetOptions();

    public static final native long new_FinalImageCallback();

    public static final native long new_FloatDeque__SWIG_0();

    public static final native long new_FloatDeque__SWIG_1(long j, float f);

    public static final native long new_FloatDeque__SWIG_2(long j);

    public static final native long new_FloatDeque__SWIG_3(long j, FloatDeque floatDeque);

    public static final native long new_FloatSmoothKeyValueMap();

    public static final native long new_FloatVector__SWIG_0();

    public static final native long new_FloatVector__SWIG_1(long j);

    public static final native long new_FrameMetadata();

    public static final native long new_FrameMetadataKey_Compare();

    public static final native long new_FrameMetadataKey_Hasher();

    public static final native long new_FrameMetadataKey__SWIG_0(long j, FrameMetadata frameMetadata);

    public static final native long new_FrameMetadataKey__SWIG_1(long j, int i);

    public static final native long new_FrameMetadataKey__SWIG_2();

    public static final native long new_FrameMetadataKey__SWIG_3(long j, FrameMetadataKey frameMetadataKey);

    public static final native long new_FrameRequest();

    public static final native long new_FrameRequestVector__SWIG_0();

    public static final native long new_FrameRequestVector__SWIG_1(long j);

    public static final native long new_GenerateRgbImageOptions();

    public static final native long new_GeometricCalibration();

    public static final native long new_GeometricCalibrationVector__SWIG_0();

    public static final native long new_GeometricCalibrationVector__SWIG_1(long j);

    public static final native long new_GyroSample();

    public static final native long new_GyroSampleVector__SWIG_0();

    public static final native long new_GyroSampleVector__SWIG_1(long j);

    public static final native long new_ImageReleaseCallback();

    public static final native long new_ImageSaverParams();

    public static final native long new_ImageSaver__SWIG_0(String str, String str2, String str3, String str4);

    public static final native long new_ImageSaver__SWIG_1(long j, ImageSaverParams imageSaverParams, String str);

    public static final native long new_InitParams();

    public static final native long new_Int64Vector__SWIG_0();

    public static final native long new_Int64Vector__SWIG_1(long j);

    public static final native long new_InterleavedImageF__SWIG_0();

    public static final native long new_InterleavedImageF__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageF__SWIG_2(int i, int i2, int i3, int i4);

    public static final native long new_InterleavedImageF__SWIG_3(int i, int i2, int i3);

    public static final native long new_InterleavedImageF__SWIG_4(int i, int i2, int i3, int i4, long j, long j2);

    public static final native long new_InterleavedImageF__SWIG_5(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageF__SWIG_6(long j, InterleavedImageF interleavedImageF);

    public static final native long new_InterleavedImageU16__SWIG_0();

    public static final native long new_InterleavedImageU16__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU16__SWIG_2(int i, int i2, int i3, int i4);

    public static final native long new_InterleavedImageU16__SWIG_3(int i, int i2, int i3);

    public static final native long new_InterleavedImageU16__SWIG_4(int i, int i2, int i3, int i4, long j, long j2);

    public static final native long new_InterleavedImageU16__SWIG_5(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU16__SWIG_6(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long new_InterleavedImageU8__SWIG_0();

    public static final native long new_InterleavedImageU8__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU8__SWIG_2(int i, int i2, int i3, int i4);

    public static final native long new_InterleavedImageU8__SWIG_3(int i, int i2, int i3);

    public static final native long new_InterleavedImageU8__SWIG_4(int i, int i2, int i3, int i4, long j, long j2);

    public static final native long new_InterleavedImageU8__SWIG_5(int i, int i2, int i3, int i4, long j);

    public static final native long new_InterleavedImageU8__SWIG_6(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long new_InterleavedReadViewF__SWIG_0(long j, InterleavedReadViewF interleavedReadViewF);

    public static final native long new_InterleavedReadViewF__SWIG_1(long j, InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedReadViewF__SWIG_2(long j, InterleavedReadViewF interleavedReadViewF, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedReadViewF__SWIG_3();

    public static final native long new_InterleavedReadViewF__SWIG_4(int i, int i2, int i3, long j);

    public static final native long new_InterleavedReadViewF__SWIG_5(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedReadViewU16__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_InterleavedReadViewU16__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedReadViewU16__SWIG_2(long j, InterleavedReadViewU16 interleavedReadViewU16, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedReadViewU16__SWIG_3();

    public static final native long new_InterleavedReadViewU16__SWIG_4(int i, int i2, int i3, long j);

    public static final native long new_InterleavedReadViewU16__SWIG_5(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedReadViewU8__SWIG_0(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_InterleavedReadViewU8__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedReadViewU8__SWIG_2(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedReadViewU8__SWIG_3();

    public static final native long new_InterleavedReadViewU8__SWIG_4(int i, int i2, int i3, long j);

    public static final native long new_InterleavedReadViewU8__SWIG_5(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedU16Allocation();

    public static final native long new_InterleavedU8Allocation();

    public static final native long new_InterleavedWriteViewF__SWIG_0(long j, InterleavedWriteViewF interleavedWriteViewF);

    public static final native long new_InterleavedWriteViewF__SWIG_1(long j, InterleavedWriteViewF interleavedWriteViewF, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedWriteViewF__SWIG_2(long j, InterleavedWriteViewF interleavedWriteViewF, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedWriteViewF__SWIG_3();

    public static final native long new_InterleavedWriteViewF__SWIG_4(int i, int i2, int i3, long j);

    public static final native long new_InterleavedWriteViewF__SWIG_5(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedWriteViewU16__SWIG_0(long j, InterleavedWriteViewU16 interleavedWriteViewU16);

    public static final native long new_InterleavedWriteViewU16__SWIG_1(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedWriteViewU16__SWIG_2(long j, InterleavedWriteViewU16 interleavedWriteViewU16, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedWriteViewU16__SWIG_3();

    public static final native long new_InterleavedWriteViewU16__SWIG_4(int i, int i2, int i3, long j);

    public static final native long new_InterleavedWriteViewU16__SWIG_5(int i, int i2, int i3, long j, long j2);

    public static final native long new_InterleavedWriteViewU8__SWIG_0(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long new_InterleavedWriteViewU8__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_InterleavedWriteViewU8__SWIG_2(long j, InterleavedWriteViewU8 interleavedWriteViewU8, int i, int i2, int i3, int i4);

    public static final native long new_InterleavedWriteViewU8__SWIG_3();

    public static final native long new_InterleavedWriteViewU8__SWIG_4(int i, int i2, int i3, long j);

    public static final native long new_InterleavedWriteViewU8__SWIG_5(int i, int i2, int i3, long j, long j2);

    public static final native long new_IspAwbMetadata();

    public static final native long new_IspAwbMetadata_Statistics();

    public static final native long new_JpgEncodeOptions();

    public static final native long new_LandmarkMap__SWIG_0();

    public static final native long new_LandmarkMap__SWIG_1(long j, LandmarkMap landmarkMap);

    public static final native long new_LiveHdrMetadata();

    public static final native long new_LiveHdrParams();

    public static final native long new_LocationData();

    public static final native long new_MeshTranslation();

    public static final native long new_MeshWarp();

    public static final native long new_NewDeleteInterleavedU16Allocator();

    public static final native long new_NewDeleteInterleavedU8Allocator();

    public static final native long new_NewDeleteRawAllocator();

    public static final native long new_NewDeleteYuvAllocator();

    public static final native long new_NormalizedRect__SWIG_0();

    public static final native long new_NormalizedRect__SWIG_1(float f, float f2, float f3, float f4);

    public static final native long new_OisMetadata();

    public static final native long new_OisPosition();

    public static final native long new_OisPositionVector__SWIG_0();

    public static final native long new_OisPositionVector__SWIG_1(long j);

    public static final native long new_OpaqueHandleWrapper__SWIG_0();

    public static final native long new_OpaqueHandleWrapper__SWIG_1(long j);

    public static final native long new_PackedImageRaw10__SWIG_0();

    public static final native long new_PackedImageRaw10__SWIG_1(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long new_PackedImageRaw10__SWIG_2(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2);

    public static final native long new_PackedImageRaw10__SWIG_3(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_PackedImageRaw10__SWIG_4(long j, long j2);

    public static final native long new_PackedImageRaw10__SWIG_5(long j);

    public static final native long new_PackedImageRaw10__SWIG_6(int i, int i2, int i3, long j, long j2);

    public static final native long new_PackedImageRaw10__SWIG_7(int i, int i2, int i3, long j);

    public static final native long new_PackedImageRaw10__SWIG_8(int i, int i2, int i3);

    public static final native long new_PackedImageRaw10__SWIG_9(int i, int i2);

    public static final native long new_PackedImageRaw12__SWIG_0();

    public static final native long new_PackedImageRaw12__SWIG_1(long j, InterleavedImageU8 interleavedImageU8);

    public static final native long new_PackedImageRaw12__SWIG_2(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2);

    public static final native long new_PackedImageRaw12__SWIG_3(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_PackedImageRaw12__SWIG_4(long j, long j2);

    public static final native long new_PackedImageRaw12__SWIG_5(long j);

    public static final native long new_PackedImageRaw12__SWIG_6(int i, int i2, int i3, long j, long j2);

    public static final native long new_PackedImageRaw12__SWIG_7(int i, int i2, int i3, long j);

    public static final native long new_PackedImageRaw12__SWIG_8(int i, int i2, int i3);

    public static final native long new_PackedImageRaw12__SWIG_9(int i, int i2);

    public static final native long new_PackedReadViewRaw10__SWIG_0();

    public static final native long new_PackedReadViewRaw10__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_PackedReadViewRaw10__SWIG_2(long j, PackedReadViewRaw10 packedReadViewRaw10);

    public static final native long new_PackedReadViewRaw12__SWIG_0();

    public static final native long new_PackedReadViewRaw12__SWIG_1(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_PackedReadViewRaw12__SWIG_2(long j, PackedReadViewRaw12 packedReadViewRaw12);

    public static final native long new_PackedReadWriteViewRaw10__SWIG_0();

    public static final native long new_PackedReadWriteViewRaw10__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long new_PackedReadWriteViewRaw10__SWIG_2(long j, PackedReadWriteViewRaw10 packedReadWriteViewRaw10);

    public static final native long new_PackedReadWriteViewRaw12__SWIG_0();

    public static final native long new_PackedReadWriteViewRaw12__SWIG_1(long j, InterleavedWriteViewU8 interleavedWriteViewU8);

    public static final native long new_PackedReadWriteViewRaw12__SWIG_2(long j, PackedReadWriteViewRaw12 packedReadWriteViewRaw12);

    public static final native long new_PdImageCallback();

    public static final native long new_PhysicalStabilityParams();

    public static final native long new_PhysicalStabilityThresholds();

    public static final native long new_PixelRect();

    public static final native long new_PixelRectVector__SWIG_0();

    public static final native long new_PixelRectVector__SWIG_1(long j);

    public static final native long new_PlanarRawImageCallback();

    public static final native long new_PortraitBlobCallback();

    public static final native long new_PortraitDepthArguments__SWIG_0(long j, InterleavedReadViewU16 interleavedReadViewU16);

    public static final native long new_PortraitDepthArguments__SWIG_1(long j, InterleavedReadViewU16 interleavedReadViewU16, long j2, StringRawReadViewMap stringRawReadViewMap);

    public static final native long new_PortraitDepthArguments__SWIG_2(long j, InterleavedReadViewU8 interleavedReadViewU8);

    public static final native long new_PortraitDepthArguments__SWIG_3();

    public static final native long new_PortraitDepthArguments__SWIG_4(long j, PortraitDepthArguments portraitDepthArguments);

    public static final native long new_PortraitImageCallback();

    public static final native long new_PortraitOutputs();

    public static final native long new_PortraitRequest();

    public static final native long new_PortraitSegmenterSwigWrapper();

    public static final native long new_PortraitSwigWrapper();

    public static final native long new_PostShutterAfParams();

    public static final native long new_PostviewCallback();

    public static final native long new_PostviewParams();

    public static final native long new_QcColorCalibration();

    public static final native long new_QcColorCalibration_IlluminantData();

    public static final native long new_QcIlluminantVector__SWIG_0();

    public static final native long new_QcIlluminantVector__SWIG_1(long j);

    public static final native long new_RawAllocation();

    public static final native long new_RawFinishParams();

    public static final native long new_RawImageCallback();

    public static final native long new_RawImage__SWIG_0();

    public static final native long new_RawImage__SWIG_1(int i, int i2, int i3, int i4, long j);

    public static final native long new_RawImage__SWIG_10(long j, PackedImageRaw12 packedImageRaw12);

    public static final native long new_RawImage__SWIG_2(int i, int i2, int i3, int i4);

    public static final native long new_RawImage__SWIG_3(int i, int i2, int i3);

    public static final native long new_RawImage__SWIG_4(int i, int i2, long j, int i3, int i4, long j2);

    public static final native long new_RawImage__SWIG_5(int i, int i2, long j, int i3, int i4);

    public static final native long new_RawImage__SWIG_6(int i, int i2, long j, int i3);

    public static final native long new_RawImage__SWIG_7(long j, RawImage rawImage);

    public static final native long new_RawImage__SWIG_8(long j, InterleavedImageU16 interleavedImageU16);

    public static final native long new_RawImage__SWIG_9(long j, PackedImageRaw10 packedImageRaw10);

    public static final native long new_RawMergeParams();

    public static final native long new_RawReadView__SWIG_0();

    public static final native long new_RawReadView__SWIG_1(long j, RawReadView rawReadView);

    public static final native long new_RawReadView__SWIG_2(int i, int i2, long j, int i3, long j2);

    public static final native long new_RawSharpenParams();

    public static final native long new_RawSharpenParams_Point();

    public static final native long new_RawVignetteParams();

    public static final native long new_RawWriteView__SWIG_0();

    public static final native long new_RawWriteView__SWIG_1(long j, RawWriteView rawWriteView);

    public static final native long new_RawWriteView__SWIG_2(int i, int i2, long j, int i3, long j2);

    public static final native long new_RowPattern();

    public static final native long new_SecondOrderFilter();

    public static final native long new_SensorNoiseModel();

    public static final native long new_SensorRowArtifacts();

    public static final native long new_ShotCallbacks();

    public static final native long new_ShotLogData();

    public static final native long new_ShotParams();

    public static final native long new_ShotStatusCallback();

    public static final native long new_SpatialGainMap__SWIG_0();

    public static final native long new_SpatialGainMap__SWIG_1(int i, int i2, boolean z, boolean z2, long j);

    public static final native long new_SpatialGainMap__SWIG_2(int i, int i2, boolean z, boolean z2);

    public static final native long new_SpatialGainMap__SWIG_3(long j, InterleavedReadViewF interleavedReadViewF, boolean z, boolean z2, long j2);

    public static final native long new_SpatialGainMap__SWIG_4(long j, InterleavedReadViewF interleavedReadViewF, boolean z, boolean z2);

    public static final native long new_SpatialGainMap__SWIG_5(long j, InterleavedImageF interleavedImageF, boolean z, boolean z2);

    public static final native long new_SpatialGainMap__SWIG_6(long j, SpatialGainMap spatialGainMap);

    public static final native long new_StaticMetadataVector__SWIG_0();

    public static final native long new_StaticMetadataVector__SWIG_1(long j);

    public static final native long new_StaticMetadata__SWIG_0();

    public static final native long new_StaticMetadata__SWIG_1(long j, StaticMetadata staticMetadata);

    public static final native long new_StringAeResultsMap__SWIG_0();

    public static final native long new_StringAeResultsMap__SWIG_1(long j, StringAeResultsMap stringAeResultsMap);

    public static final native long new_StringFrameMetadataMap__SWIG_0();

    public static final native long new_StringFrameMetadataMap__SWIG_1(long j, StringFrameMetadataMap stringFrameMetadataMap);

    public static final native long new_StringRawReadViewMap__SWIG_0();

    public static final native long new_StringRawReadViewMap__SWIG_1(long j, StringRawReadViewMap stringRawReadViewMap);

    public static final native long new_StringSpatialGainMap__SWIG_0();

    public static final native long new_StringSpatialGainMap__SWIG_1(long j, StringSpatialGainMap stringSpatialGainMap);

    public static final native long new_StringStaticMetadataMap__SWIG_0();

    public static final native long new_StringStaticMetadataMap__SWIG_1(long j, StringStaticMetadataMap stringStaticMetadataMap);

    public static final native long new_TetFactorization();

    public static final native long new_TetModel();

    public static final native long new_TetWaypoint();

    public static final native long new_ThreadPoolConfig();

    public static final native long new_ThreadPriority();

    public static final native long new_Tuning();

    public static final native long new_Uint8Vector__SWIG_0();

    public static final native long new_Uint8Vector__SWIG_1(long j);

    public static final native long new_ViewfinderProcessingOptions();

    public static final native long new_ViewfinderResults();

    public static final native long new_WeightedNormalizedRect();

    public static final native long new_WeightedNormalizedRectVector__SWIG_0();

    public static final native long new_WeightedNormalizedRectVector__SWIG_1(long j);

    public static final native long new_WeightedPixelRect();

    public static final native long new_WeightedPixelRectVector__SWIG_0();

    public static final native long new_WeightedPixelRectVector__SWIG_1(long j);

    public static final native long new_YuvAllocation();

    public static final native long new_YuvImage__SWIG_0();

    public static final native long new_YuvImage__SWIG_1(int i, int i2, int i3, long j);

    public static final native long new_YuvImage__SWIG_2(int i, int i2, int i3);

    public static final native long new_YuvImage__SWIG_3(int i, int i2, int i3, int i4, int i5, int i6, long j);

    public static final native long new_YuvImage__SWIG_4(int i, int i2, int i3, int i4, int i5, int i6);

    public static final native long new_YuvImage__SWIG_5(long j, YuvImage yuvImage);

    public static final native long new_YuvReadView__SWIG_0(long j, YuvReadView yuvReadView);

    public static final native long new_YuvReadView__SWIG_1(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    public static final native long new_YuvReadView__SWIG_2();

    public static final native long new_YuvWriteView__SWIG_0();

    public static final native long new_YuvWriteView__SWIG_1(long j, YuvWriteView yuvWriteView);

    public static final native long new_YuvWriteView__SWIG_2(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2, int i7);

    private static final native void swig_module_init();

    public static long SwigDirector_ClientInterleavedU16Allocator_Allocate(ClientInterleavedU16Allocator clientInterleavedU16Allocator, int i, int i2, int i3) {
        return InterleavedU16Allocation.getCPtr(clientInterleavedU16Allocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientInterleavedU16Allocator_Release(ClientInterleavedU16Allocator clientInterleavedU16Allocator, long j) {
        clientInterleavedU16Allocator.Release(j);
    }

    public static long SwigDirector_ClientInterleavedU8Allocator_Allocate(ClientInterleavedU8Allocator clientInterleavedU8Allocator, int i, int i2, int i3) {
        return InterleavedU8Allocation.getCPtr(clientInterleavedU8Allocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientInterleavedU8Allocator_Release(ClientInterleavedU8Allocator clientInterleavedU8Allocator, long j) {
        clientInterleavedU8Allocator.Release(j);
    }

    public static long SwigDirector_ClientRawAllocator_Allocate(ClientRawAllocator clientRawAllocator, int i, int i2, int i3) {
        return RawAllocation.getCPtr(clientRawAllocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientRawAllocator_Release(ClientRawAllocator clientRawAllocator, long j) {
        clientRawAllocator.Release(j);
    }

    public static long SwigDirector_ClientYuvAllocator_Allocate(ClientYuvAllocator clientYuvAllocator, int i, int i2, int i3) {
        return YuvAllocation.getCPtr(clientYuvAllocator.Allocate(i, i2, i3));
    }

    public static void SwigDirector_ClientYuvAllocator_Release(ClientYuvAllocator clientYuvAllocator, long j) {
        clientYuvAllocator.Release(j);
    }

    public static void SwigDirector_FinalImageCallback_Rgb16Ready(FinalImageCallback finalImageCallback, int i, long j, long j2, int i2) {
        finalImageCallback.Rgb16Ready(i, new InterleavedReadViewU16(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_FinalImageCallback_RgbReady(FinalImageCallback finalImageCallback, int i, long j, long j2, int i2) {
        finalImageCallback.RgbReady(i, new InterleavedReadViewU8(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_FinalImageCallback_YuvReady(FinalImageCallback finalImageCallback, int i, long j, long j2, int i2) {
        finalImageCallback.YuvReady(i, new YuvReadView(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_ImageReleaseCallback_Run(ImageReleaseCallback imageReleaseCallback, long j) {
        imageReleaseCallback.Run(j);
    }

    public static void SwigDirector_PdImageCallback_ImageReady(PdImageCallback pdImageCallback, int i, long j) {
        pdImageCallback.ImageReady(i, new InterleavedReadViewU16(j, false));
    }

    public static void SwigDirector_PdImageCallback_MergePdFailed(PdImageCallback pdImageCallback, int i) {
        pdImageCallback.MergePdFailed(i);
    }

    public static void SwigDirector_PlanarRawImageCallback_ImageReady(PlanarRawImageCallback planarRawImageCallback, int i, long j, long j2) {
        planarRawImageCallback.ImageReady(i, new ExifMetadata(j, false), new SWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t(j2, false));
    }

    public static void SwigDirector_PortraitBlobCallback_BlobReady(PortraitBlobCallback portraitBlobCallback, long j, String str, String str2, String str3) {
        portraitBlobCallback.BlobReady(j, str, str2, str3);
    }

    public static void SwigDirector_PortraitImageCallback_RgbReady(PortraitImageCallback portraitImageCallback, long j, long j2, int i, String str, String str2, String str3) {
        portraitImageCallback.RgbReady(j, new InterleavedReadViewU8(j2, false), i, str, str2, str3);
    }

    public static void SwigDirector_PortraitImageCallback_YuvReady(PortraitImageCallback portraitImageCallback, long j, long j2, int i, String str, String str2, String str3) {
        portraitImageCallback.YuvReady(j, new YuvReadView(j2, false), i, str, str2, str3);
    }

    public static void SwigDirector_PostviewCallback_RgbReady(PostviewCallback postviewCallback, int i, long j, long j2, int i2) {
        postviewCallback.RgbReady(i, new InterleavedReadViewU8(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_PostviewCallback_YuvReady(PostviewCallback postviewCallback, int i, long j, long j2, int i2) {
        postviewCallback.YuvReady(i, new YuvReadView(j, false), new ExifMetadata(j2, false), i2);
    }

    public static void SwigDirector_RawImageCallback_ImageReady(RawImageCallback rawImageCallback, int i, long j, long j2) {
        rawImageCallback.ImageReady(i, new ExifMetadata(j, false), new RawReadView(j2, false));
    }

    public static void SwigDirector_RawImageCallback_MergeRawFailed(RawImageCallback rawImageCallback, int i) {
        rawImageCallback.MergeRawFailed(i);
    }

    public static void SwigDirector_ShotStatusCallback_OnAbort(ShotStatusCallback shotStatusCallback, int i) {
        shotStatusCallback.OnAbort(i);
    }

    public static void SwigDirector_ShotStatusCallback_OnComplete(ShotStatusCallback shotStatusCallback, int i, long j) {
        shotStatusCallback.OnComplete(i, new ShotLogData(j, false));
    }

    public static void SwigDirector_ShotStatusCallback_OnError(ShotStatusCallback shotStatusCallback, int i, String str) {
        shotStatusCallback.OnError(i, str);
    }
}
