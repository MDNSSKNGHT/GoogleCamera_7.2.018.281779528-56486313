package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitOutputs {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitOutputs() {
        this(GcamModuleJNI.new_PortraitOutputs(), true);
    }

    public static long getCPtr(PortraitOutputs portraitOutputs) {
        if (portraitOutputs == null) {
            return 0L;
        }
        return portraitOutputs.swigCPtr;
    }

    public PortraitOutputs(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitOutputs(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public PortraitBlobCallback getBlob_callback() {
        long PortraitOutputs_blob_callback_get = GcamModuleJNI.PortraitOutputs_blob_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_blob_callback_get != 0) {
            return new PortraitBlobCallback(PortraitOutputs_blob_callback_get, false);
        }
        return null;
    }

    public SWIGTYPE_p_std__functionT_void_flong_longF_t getComplete_callback() {
        return new SWIGTYPE_p_std__functionT_void_flong_longF_t(GcamModuleJNI.PortraitOutputs_complete_callback_get(this.swigCPtr, this), true);
    }

    public PortraitImageCallback getDebug_image_callback() {
        long PortraitOutputs_debug_image_callback_get = GcamModuleJNI.PortraitOutputs_debug_image_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_debug_image_callback_get != 0) {
            return new PortraitImageCallback(PortraitOutputs_debug_image_callback_get, false);
        }
        return null;
    }

    public ClientInterleavedU8Allocator getDebug_rgb_allocator() {
        long PortraitOutputs_debug_rgb_allocator_get = GcamModuleJNI.PortraitOutputs_debug_rgb_allocator_get(this.swigCPtr, this);
        if (PortraitOutputs_debug_rgb_allocator_get != 0) {
            return new ClientInterleavedU8Allocator(PortraitOutputs_debug_rgb_allocator_get, false);
        }
        return null;
    }

    public long getDynamic_depth_result_ptr() {
        return GcamModuleJNI.PortraitOutputs_dynamic_depth_result_ptr_get(this.swigCPtr, this);
    }

    public PortraitOutputFeaturesCallback getFeatures_callback() {
        long PortraitOutputs_features_callback_get = GcamModuleJNI.PortraitOutputs_features_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_features_callback_get != 0) {
            return new PortraitOutputFeaturesCallback(PortraitOutputs_features_callback_get, false);
        }
        return null;
    }

    public PortraitImageCallback getImage_callback() {
        long PortraitOutputs_image_callback_get = GcamModuleJNI.PortraitOutputs_image_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_image_callback_get != 0) {
            return new PortraitImageCallback(PortraitOutputs_image_callback_get, false);
        }
        return null;
    }

    public PortraitBlobCallback getPortrait_logs_callback() {
        long PortraitOutputs_portrait_logs_callback_get = GcamModuleJNI.PortraitOutputs_portrait_logs_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_portrait_logs_callback_get != 0) {
            return new PortraitBlobCallback(PortraitOutputs_portrait_logs_callback_get, false);
        }
        return null;
    }

    public SWIGTYPE_p_std__functionT_void_flong_long_floatF_t getProgress_callback() {
        return new SWIGTYPE_p_std__functionT_void_flong_long_floatF_t(GcamModuleJNI.PortraitOutputs_progress_callback_get(this.swigCPtr, this), true);
    }

    public ClientInterleavedU8Allocator getRgb_allocator() {
        long PortraitOutputs_rgb_allocator_get = GcamModuleJNI.PortraitOutputs_rgb_allocator_get(this.swigCPtr, this);
        if (PortraitOutputs_rgb_allocator_get != 0) {
            return new ClientInterleavedU8Allocator(PortraitOutputs_rgb_allocator_get, false);
        }
        return null;
    }

    public PortraitImageCallback getSecondary_image_callback() {
        long PortraitOutputs_secondary_image_callback_get = GcamModuleJNI.PortraitOutputs_secondary_image_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_secondary_image_callback_get != 0) {
            return new PortraitImageCallback(PortraitOutputs_secondary_image_callback_get, false);
        }
        return null;
    }

    public PortraitImageCallback getUpsampled_input_image_callback() {
        long PortraitOutputs_upsampled_input_image_callback_get = GcamModuleJNI.PortraitOutputs_upsampled_input_image_callback_get(this.swigCPtr, this);
        if (PortraitOutputs_upsampled_input_image_callback_get != 0) {
            return new PortraitImageCallback(PortraitOutputs_upsampled_input_image_callback_get, false);
        }
        return null;
    }

    public ClientYuvAllocator getYuv_allocator() {
        long PortraitOutputs_yuv_allocator_get = GcamModuleJNI.PortraitOutputs_yuv_allocator_get(this.swigCPtr, this);
        if (PortraitOutputs_yuv_allocator_get != 0) {
            return new ClientYuvAllocator(PortraitOutputs_yuv_allocator_get, false);
        }
        return null;
    }

    public void setBlob_callback(PortraitBlobCallback portraitBlobCallback) {
        GcamModuleJNI.PortraitOutputs_blob_callback_set(this.swigCPtr, this, PortraitBlobCallback.getCPtr(portraitBlobCallback), portraitBlobCallback);
    }

    public void setComplete_callback(SWIGTYPE_p_std__functionT_void_flong_longF_t sWIGTYPE_p_std__functionT_void_flong_longF_t) {
        GcamModuleJNI.PortraitOutputs_complete_callback_set(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_flong_longF_t.getCPtr(sWIGTYPE_p_std__functionT_void_flong_longF_t));
    }

    public void setDebug_image_callback(PortraitImageCallback portraitImageCallback) {
        GcamModuleJNI.PortraitOutputs_debug_image_callback_set(this.swigCPtr, this, PortraitImageCallback.getCPtr(portraitImageCallback), portraitImageCallback);
    }

    public void setDebug_rgb_allocator(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        GcamModuleJNI.PortraitOutputs_debug_rgb_allocator_set(this.swigCPtr, this, ClientInterleavedU8Allocator.getCPtr(clientInterleavedU8Allocator), clientInterleavedU8Allocator);
    }

    public void setDynamic_depth_result_ptr(long j) {
        GcamModuleJNI.PortraitOutputs_dynamic_depth_result_ptr_set(this.swigCPtr, this, j);
    }

    public void setFeatures_callback(PortraitOutputFeaturesCallback portraitOutputFeaturesCallback) {
        GcamModuleJNI.PortraitOutputs_features_callback_set(this.swigCPtr, this, PortraitOutputFeaturesCallback.getCPtr(portraitOutputFeaturesCallback), portraitOutputFeaturesCallback);
    }

    public void setImage_callback(PortraitImageCallback portraitImageCallback) {
        GcamModuleJNI.PortraitOutputs_image_callback_set(this.swigCPtr, this, PortraitImageCallback.getCPtr(portraitImageCallback), portraitImageCallback);
    }

    public void setPortrait_logs_callback(PortraitBlobCallback portraitBlobCallback) {
        GcamModuleJNI.PortraitOutputs_portrait_logs_callback_set(this.swigCPtr, this, PortraitBlobCallback.getCPtr(portraitBlobCallback), portraitBlobCallback);
    }

    public void setProgress_callback(SWIGTYPE_p_std__functionT_void_flong_long_floatF_t sWIGTYPE_p_std__functionT_void_flong_long_floatF_t) {
        GcamModuleJNI.PortraitOutputs_progress_callback_set(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_flong_long_floatF_t.getCPtr(sWIGTYPE_p_std__functionT_void_flong_long_floatF_t));
    }

    public void setRgb_allocator(ClientInterleavedU8Allocator clientInterleavedU8Allocator) {
        GcamModuleJNI.PortraitOutputs_rgb_allocator_set(this.swigCPtr, this, ClientInterleavedU8Allocator.getCPtr(clientInterleavedU8Allocator), clientInterleavedU8Allocator);
    }

    public void setSecondary_image_callback(PortraitImageCallback portraitImageCallback) {
        GcamModuleJNI.PortraitOutputs_secondary_image_callback_set(this.swigCPtr, this, PortraitImageCallback.getCPtr(portraitImageCallback), portraitImageCallback);
    }

    public void setUpsampled_input_image_callback(PortraitImageCallback portraitImageCallback) {
        GcamModuleJNI.PortraitOutputs_upsampled_input_image_callback_set(this.swigCPtr, this, PortraitImageCallback.getCPtr(portraitImageCallback), portraitImageCallback);
    }

    public void setYuv_allocator(ClientYuvAllocator clientYuvAllocator) {
        GcamModuleJNI.PortraitOutputs_yuv_allocator_set(this.swigCPtr, this, ClientYuvAllocator.getCPtr(clientYuvAllocator), clientYuvAllocator);
    }
}
