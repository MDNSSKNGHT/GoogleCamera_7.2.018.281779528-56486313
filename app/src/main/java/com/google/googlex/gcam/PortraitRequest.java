package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitRequest {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitRequest() {
        this(GcamModuleJNI.new_PortraitRequest(), true);
    }

    public static long getCPtr(PortraitRequest portraitRequest) {
        if (portraitRequest == null) {
            return 0L;
        }
        return portraitRequest.swigCPtr;
    }

    public PortraitRequest(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitRequest(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public StringAeResultsMap getAe_results() {
        long PortraitRequest_ae_results_get = GcamModuleJNI.PortraitRequest_ae_results_get(this.swigCPtr, this);
        if (PortraitRequest_ae_results_get != 0) {
            return new StringAeResultsMap(PortraitRequest_ae_results_get, false);
        }
        return null;
    }

    public boolean getAllow_raw_blur_front() {
        return GcamModuleJNI.PortraitRequest_allow_raw_blur_front_get(this.swigCPtr, this);
    }

    public boolean getAllow_raw_blur_rear() {
        return GcamModuleJNI.PortraitRequest_allow_raw_blur_rear_get(this.swigCPtr, this);
    }

    public boolean getColorize_debug_images() {
        return GcamModuleJNI.PortraitRequest_colorize_debug_images_get(this.swigCPtr, this);
    }

    public int getDebug_images_verbosity() {
        return GcamModuleJNI.PortraitRequest_debug_images_verbosity_get(this.swigCPtr, this);
    }

    public int getDepth_blur_config() {
        return GcamModuleJNI.PortraitRequest_depth_blur_config_get(this.swigCPtr, this);
    }

    public int getDepth_blur_layers() {
        return GcamModuleJNI.PortraitRequest_depth_blur_layers_get(this.swigCPtr, this);
    }

    public int getDepth_processing() {
        return GcamModuleJNI.PortraitRequest_depth_processing_get(this.swigCPtr, this);
    }

    public boolean getDo_sff() {
        return GcamModuleJNI.PortraitRequest_do_sff_get(this.swigCPtr, this);
    }

    public boolean getEmbed_gdepth_metadata() {
        return GcamModuleJNI.PortraitRequest_embed_gdepth_metadata_get(this.swigCPtr, this);
    }

    public boolean getEnable_cpu_fallback() {
        return GcamModuleJNI.PortraitRequest_enable_cpu_fallback_get(this.swigCPtr, this);
    }

    public PixelRectVector getFaces() {
        long PortraitRequest_faces_get = GcamModuleJNI.PortraitRequest_faces_get(this.swigCPtr, this);
        if (PortraitRequest_faces_get != 0) {
            return new PixelRectVector(PortraitRequest_faces_get, false);
        }
        return null;
    }

    public StringFrameMetadataMap getFrame_metadata() {
        long PortraitRequest_frame_metadata_get = GcamModuleJNI.PortraitRequest_frame_metadata_get(this.swigCPtr, this);
        if (PortraitRequest_frame_metadata_get != 0) {
            return new StringFrameMetadataMap(PortraitRequest_frame_metadata_get, false);
        }
        return null;
    }

    public StringSpatialGainMap getGain_map() {
        long PortraitRequest_gain_map_get = GcamModuleJNI.PortraitRequest_gain_map_get(this.swigCPtr, this);
        if (PortraitRequest_gain_map_get != 0) {
            return new StringSpatialGainMap(PortraitRequest_gain_map_get, false);
        }
        return null;
    }

    public String getHdrp_makernote() {
        return GcamModuleJNI.PortraitRequest_hdrp_makernote_get(this.swigCPtr, this);
    }

    public boolean getHorizontal_flip() {
        return GcamModuleJNI.PortraitRequest_horizontal_flip_get(this.swigCPtr, this);
    }

    public long getId() {
        return GcamModuleJNI.PortraitRequest_id_get(this.swigCPtr, this);
    }

    public int getImage_rotation() {
        return GcamModuleJNI.PortraitRequest_image_rotation_get(this.swigCPtr, this);
    }

    public String getOpencl_cache_directory() {
        return GcamModuleJNI.PortraitRequest_opencl_cache_directory_get(this.swigCPtr, this);
    }

    public int getOutput_format_primary() {
        return GcamModuleJNI.PortraitRequest_output_format_primary_get(this.swigCPtr, this);
    }

    public int getOutput_height() {
        return GcamModuleJNI.PortraitRequest_output_height_get(this.swigCPtr, this);
    }

    public int getOutput_width() {
        return GcamModuleJNI.PortraitRequest_output_width_get(this.swigCPtr, this);
    }

    public int getPd_version() {
        return GcamModuleJNI.PortraitRequest_pd_version_get(this.swigCPtr, this);
    }

    public String getPortrait_raw_path() {
        return GcamModuleJNI.PortraitRequest_portrait_raw_path_get(this.swigCPtr, this);
    }

    public float getPost_resample_sharpening() {
        return GcamModuleJNI.PortraitRequest_post_resample_sharpening_get(this.swigCPtr, this);
    }

    public String getShot_prefix() {
        return GcamModuleJNI.PortraitRequest_shot_prefix_get(this.swigCPtr, this);
    }

    public StringStaticMetadataMap getStatic_metadata() {
        long PortraitRequest_static_metadata_get = GcamModuleJNI.PortraitRequest_static_metadata_get(this.swigCPtr, this);
        if (PortraitRequest_static_metadata_get != 0) {
            return new StringStaticMetadataMap(PortraitRequest_static_metadata_get, false);
        }
        return null;
    }

    public boolean getUse_internal_rectiface() {
        return GcamModuleJNI.PortraitRequest_use_internal_rectiface_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_wireless_android_camera__warp__MeshWarpfield getWarpfield() {
        long PortraitRequest_warpfield_get = GcamModuleJNI.PortraitRequest_warpfield_get(this.swigCPtr, this);
        if (PortraitRequest_warpfield_get != 0) {
            return new SWIGTYPE_p_wireless_android_camera__warp__MeshWarpfield(PortraitRequest_warpfield_get, false);
        }
        return null;
    }

    public void setAe_results(StringAeResultsMap stringAeResultsMap) {
        GcamModuleJNI.PortraitRequest_ae_results_set(this.swigCPtr, this, StringAeResultsMap.getCPtr(stringAeResultsMap), stringAeResultsMap);
    }

    public void setAllow_raw_blur_front(boolean z) {
        GcamModuleJNI.PortraitRequest_allow_raw_blur_front_set(this.swigCPtr, this, z);
    }

    public void setAllow_raw_blur_rear(boolean z) {
        GcamModuleJNI.PortraitRequest_allow_raw_blur_rear_set(this.swigCPtr, this, z);
    }

    public void setColorize_debug_images(boolean z) {
        GcamModuleJNI.PortraitRequest_colorize_debug_images_set(this.swigCPtr, this, z);
    }

    public void setDebug_images_verbosity(int i) {
        GcamModuleJNI.PortraitRequest_debug_images_verbosity_set(this.swigCPtr, this, i);
    }

    public void setDepth_blur_config(int i) {
        GcamModuleJNI.PortraitRequest_depth_blur_config_set(this.swigCPtr, this, i);
    }

    public void setDepth_blur_layers(int i) {
        GcamModuleJNI.PortraitRequest_depth_blur_layers_set(this.swigCPtr, this, i);
    }

    public void setDepth_processing(int i) {
        GcamModuleJNI.PortraitRequest_depth_processing_set(this.swigCPtr, this, i);
    }

    public void setDo_sff(boolean z) {
        GcamModuleJNI.PortraitRequest_do_sff_set(this.swigCPtr, this, z);
    }

    public void setEmbed_gdepth_metadata(boolean z) {
        GcamModuleJNI.PortraitRequest_embed_gdepth_metadata_set(this.swigCPtr, this, z);
    }

    public void setEnable_cpu_fallback(boolean z) {
        GcamModuleJNI.PortraitRequest_enable_cpu_fallback_set(this.swigCPtr, this, z);
    }

    public void setFaces(PixelRectVector pixelRectVector) {
        GcamModuleJNI.PortraitRequest_faces_set(this.swigCPtr, this, PixelRectVector.getCPtr(pixelRectVector), pixelRectVector);
    }

    public void setFrame_metadata(StringFrameMetadataMap stringFrameMetadataMap) {
        GcamModuleJNI.PortraitRequest_frame_metadata_set(this.swigCPtr, this, StringFrameMetadataMap.getCPtr(stringFrameMetadataMap), stringFrameMetadataMap);
    }

    public void setGain_map(StringSpatialGainMap stringSpatialGainMap) {
        GcamModuleJNI.PortraitRequest_gain_map_set(this.swigCPtr, this, StringSpatialGainMap.getCPtr(stringSpatialGainMap), stringSpatialGainMap);
    }

    public void setHdrp_makernote(String str) {
        GcamModuleJNI.PortraitRequest_hdrp_makernote_set(this.swigCPtr, this, str);
    }

    public void setHorizontal_flip(boolean z) {
        GcamModuleJNI.PortraitRequest_horizontal_flip_set(this.swigCPtr, this, z);
    }

    public void setId(long j) {
        GcamModuleJNI.PortraitRequest_id_set(this.swigCPtr, this, j);
    }

    public void setImage_rotation(int i) {
        GcamModuleJNI.PortraitRequest_image_rotation_set(this.swigCPtr, this, i);
    }

    public void setOpencl_cache_directory(String str) {
        GcamModuleJNI.PortraitRequest_opencl_cache_directory_set(this.swigCPtr, this, str);
    }

    public void setOutput_format_primary(int i) {
        GcamModuleJNI.PortraitRequest_output_format_primary_set(this.swigCPtr, this, i);
    }

    public void setOutput_height(int i) {
        GcamModuleJNI.PortraitRequest_output_height_set(this.swigCPtr, this, i);
    }

    public void setOutput_width(int i) {
        GcamModuleJNI.PortraitRequest_output_width_set(this.swigCPtr, this, i);
    }

    public void setPd_version(int i) {
        GcamModuleJNI.PortraitRequest_pd_version_set(this.swigCPtr, this, i);
    }

    public void setPortrait_raw_path(String str) {
        GcamModuleJNI.PortraitRequest_portrait_raw_path_set(this.swigCPtr, this, str);
    }

    public void setPost_resample_sharpening(float f) {
        GcamModuleJNI.PortraitRequest_post_resample_sharpening_set(this.swigCPtr, this, f);
    }

    public void setShot_prefix(String str) {
        GcamModuleJNI.PortraitRequest_shot_prefix_set(this.swigCPtr, this, str);
    }

    public void setStatic_metadata(StringStaticMetadataMap stringStaticMetadataMap) {
        GcamModuleJNI.PortraitRequest_static_metadata_set(this.swigCPtr, this, StringStaticMetadataMap.getCPtr(stringStaticMetadataMap), stringStaticMetadataMap);
    }

    public void setUse_internal_rectiface(boolean z) {
        GcamModuleJNI.PortraitRequest_use_internal_rectiface_set(this.swigCPtr, this, z);
    }

    public void setWarpfield(SWIGTYPE_p_wireless_android_camera__warp__MeshWarpfield sWIGTYPE_p_wireless_android_camera__warp__MeshWarpfield) {
        GcamModuleJNI.PortraitRequest_warpfield_set(this.swigCPtr, this, SWIGTYPE_p_wireless_android_camera__warp__MeshWarpfield.getCPtr(sWIGTYPE_p_wireless_android_camera__warp__MeshWarpfield));
    }
}
