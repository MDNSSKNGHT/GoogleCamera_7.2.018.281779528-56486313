package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawFinishParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawFinishParams() {
        this(GcamModuleJNI.new_RawFinishParams(), true);
    }

    public static long getCPtr(RawFinishParams rawFinishParams) {
        if (rawFinishParams == null) {
            return 0L;
        }
        return rawFinishParams.swigCPtr;
    }

    public RawFinishParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawFinishParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public ArcFlareParam getArc_flare() {
        long RawFinishParams_arc_flare_get = GcamModuleJNI.RawFinishParams_arc_flare_get(this.swigCPtr, this);
        if (RawFinishParams_arc_flare_get != 0) {
            return new ArcFlareParam(RawFinishParams_arc_flare_get, false);
        }
        return null;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t getChroma_denoise() {
        long RawFinishParams_chroma_denoise_get = GcamModuleJNI.RawFinishParams_chroma_denoise_get(this.swigCPtr, this);
        if (RawFinishParams_chroma_denoise_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t(RawFinishParams_chroma_denoise_get, false);
        }
        return null;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DehazeParams_t getDehaze_params() {
        long RawFinishParams_dehaze_params_get = GcamModuleJNI.RawFinishParams_dehaze_params_get(this.swigCPtr, this);
        if (RawFinishParams_dehaze_params_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DehazeParams_t(RawFinishParams_dehaze_params_get, false);
        }
        return null;
    }

    public FloatSmoothKeyValueMap getDemosaic_sharpness() {
        long RawFinishParams_demosaic_sharpness_get = GcamModuleJNI.RawFinishParams_demosaic_sharpness_get(this.swigCPtr, this);
        if (RawFinishParams_demosaic_sharpness_get != 0) {
            return new FloatSmoothKeyValueMap(RawFinishParams_demosaic_sharpness_get, false);
        }
        return null;
    }

    public boolean getEnable_sky_optimization() {
        return GcamModuleJNI.RawFinishParams_enable_sky_optimization_get(this.swigCPtr, this);
    }

    public int getIcc_output_profile() {
        return GcamModuleJNI.RawFinishParams_icc_output_profile_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t getLuma_denoise() {
        long RawFinishParams_luma_denoise_get = GcamModuleJNI.RawFinishParams_luma_denoise_get(this.swigCPtr, this);
        if (RawFinishParams_luma_denoise_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t(RawFinishParams_luma_denoise_get, false);
        }
        return null;
    }

    public FloatSmoothKeyValueMap getPost_zoom_sharpen_strength() {
        long RawFinishParams_post_zoom_sharpen_strength_get = GcamModuleJNI.RawFinishParams_post_zoom_sharpen_strength_get(this.swigCPtr, this);
        if (RawFinishParams_post_zoom_sharpen_strength_get != 0) {
            return new FloatSmoothKeyValueMap(RawFinishParams_post_zoom_sharpen_strength_get, false);
        }
        return null;
    }

    public int getResampling_method() {
        return GcamModuleJNI.RawFinishParams_resampling_method_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__functionT_std__arrayT_float_3_t_fstd__arrayT_float_3_t_float_gcam__WhiteBalanceMethodF_t getRgb_map() {
        return new SWIGTYPE_p_std__functionT_std__arrayT_float_3_t_fstd__arrayT_float_3_t_float_gcam__WhiteBalanceMethodF_t(GcamModuleJNI.RawFinishParams_rgb_map_get(this.swigCPtr, this), true);
    }

    public ColorSatParams getSaturation() {
        long RawFinishParams_saturation_get = GcamModuleJNI.RawFinishParams_saturation_get(this.swigCPtr, this);
        if (RawFinishParams_saturation_get != 0) {
            return new ColorSatParams(RawFinishParams_saturation_get, false);
        }
        return null;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t getSharpen_params() {
        long RawFinishParams_sharpen_params_get = GcamModuleJNI.RawFinishParams_sharpen_params_get(this.swigCPtr, this);
        if (RawFinishParams_sharpen_params_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t(RawFinishParams_sharpen_params_get, false);
        }
        return null;
    }

    public SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t getSky_luma_denoise() {
        long RawFinishParams_sky_luma_denoise_get = GcamModuleJNI.RawFinishParams_sky_luma_denoise_get(this.swigCPtr, this);
        if (RawFinishParams_sky_luma_denoise_get != 0) {
            return new SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t(RawFinishParams_sky_luma_denoise_get, false);
        }
        return null;
    }

    public FloatSmoothKeyValueMap getZoom_finest_scale_denoise_attenuation() {
        long RawFinishParams_zoom_finest_scale_denoise_attenuation_get = GcamModuleJNI.RawFinishParams_zoom_finest_scale_denoise_attenuation_get(this.swigCPtr, this);
        if (RawFinishParams_zoom_finest_scale_denoise_attenuation_get != 0) {
            return new FloatSmoothKeyValueMap(RawFinishParams_zoom_finest_scale_denoise_attenuation_get, false);
        }
        return null;
    }

    public FloatSmoothKeyValueMap getZoom_sharpen_attenuation() {
        long RawFinishParams_zoom_sharpen_attenuation_get = GcamModuleJNI.RawFinishParams_zoom_sharpen_attenuation_get(this.swigCPtr, this);
        if (RawFinishParams_zoom_sharpen_attenuation_get != 0) {
            return new FloatSmoothKeyValueMap(RawFinishParams_zoom_sharpen_attenuation_get, false);
        }
        return null;
    }

    public void setArc_flare(ArcFlareParam arcFlareParam) {
        GcamModuleJNI.RawFinishParams_arc_flare_set(this.swigCPtr, this, ArcFlareParam.getCPtr(arcFlareParam), arcFlareParam);
    }

    public void setChroma_denoise(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t) {
        GcamModuleJNI.RawFinishParams_chroma_denoise_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t));
    }

    public void setDehaze_params(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DehazeParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DehazeParams_t) {
        GcamModuleJNI.RawFinishParams_dehaze_params_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DehazeParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DehazeParams_t));
    }

    public void setDemosaic_sharpness(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_demosaic_sharpness_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setEnable_sky_optimization(boolean z) {
        GcamModuleJNI.RawFinishParams_enable_sky_optimization_set(this.swigCPtr, this, z);
    }

    public void setIcc_output_profile(int i) {
        GcamModuleJNI.RawFinishParams_icc_output_profile_set(this.swigCPtr, this, i);
    }

    public void setLuma_denoise(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t) {
        GcamModuleJNI.RawFinishParams_luma_denoise_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t));
    }

    public void setPost_zoom_sharpen_strength(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_post_zoom_sharpen_strength_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setResampling_method(int i) {
        GcamModuleJNI.RawFinishParams_resampling_method_set(this.swigCPtr, this, i);
    }

    public void setRgb_map(SWIGTYPE_p_std__functionT_std__arrayT_float_3_t_fstd__arrayT_float_3_t_float_gcam__WhiteBalanceMethodF_t sWIGTYPE_p_std__functionT_std__arrayT_float_3_t_fstd__arrayT_float_3_t_float_gcam__WhiteBalanceMethodF_t) {
        GcamModuleJNI.RawFinishParams_rgb_map_set(this.swigCPtr, this, SWIGTYPE_p_std__functionT_std__arrayT_float_3_t_fstd__arrayT_float_3_t_float_gcam__WhiteBalanceMethodF_t.getCPtr(sWIGTYPE_p_std__functionT_std__arrayT_float_3_t_fstd__arrayT_float_3_t_float_gcam__WhiteBalanceMethodF_t));
    }

    public void setSaturation(ColorSatParams colorSatParams) {
        GcamModuleJNI.RawFinishParams_saturation_set(this.swigCPtr, this, ColorSatParams.getCPtr(colorSatParams), colorSatParams);
    }

    public void setSharpen_params(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t) {
        GcamModuleJNI.RawFinishParams_sharpen_params_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__RawSharpenParams_t));
    }

    public void setSky_luma_denoise(SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t) {
        GcamModuleJNI.RawFinishParams_sky_luma_denoise_set(this.swigCPtr, this, SWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t.getCPtr(sWIGTYPE_p_gcam__SmoothKeyValueMapT_gcam__DenoiseParams_t));
    }

    public void setZoom_finest_scale_denoise_attenuation(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_zoom_finest_scale_denoise_attenuation_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }

    public void setZoom_sharpen_attenuation(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        GcamModuleJNI.RawFinishParams_zoom_sharpen_attenuation_set(this.swigCPtr, this, FloatSmoothKeyValueMap.getCPtr(floatSmoothKeyValueMap), floatSmoothKeyValueMap);
    }
}
