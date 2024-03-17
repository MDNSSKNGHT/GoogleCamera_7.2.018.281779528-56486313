package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InitParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public InitParams() {
        this(GcamModuleJNI.new_InitParams(), true);
    }

    public static long getCPtr(InitParams initParams) {
        if (initParams == null) {
            return 0L;
        }
        return initParams.swigCPtr;
    }

    public InitParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.InitParams_DeserializeFromString__SWIG_0(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean DeserializeFromString(String str) {
        return GcamModuleJNI.InitParams_DeserializeFromString__SWIG_1(this.swigCPtr, this, str);
    }

    public boolean Equals(InitParams initParams) {
        return GcamModuleJNI.InitParams_Equals(this.swigCPtr, this, getCPtr(initParams), initParams);
    }

    public void Print(int i) {
        GcamModuleJNI.InitParams_Print(this.swigCPtr, this, i);
    }

    public void SerializeToString(String str) {
        GcamModuleJNI.InitParams_SerializeToString(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_InitParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getAllow_unknown_devices() {
        return GcamModuleJNI.InitParams_allow_unknown_devices_get(this.swigCPtr, this);
    }

    public ThreadPoolConfig getCapture_threads() {
        long InitParams_capture_threads_get = GcamModuleJNI.InitParams_capture_threads_get(this.swigCPtr, this);
        if (InitParams_capture_threads_get != 0) {
            return new ThreadPoolConfig(InitParams_capture_threads_get, false);
        }
        return null;
    }

    public FileSaver getCustom_file_saver() {
        long InitParams_custom_file_saver_get = GcamModuleJNI.InitParams_custom_file_saver_get(this.swigCPtr, this);
        if (InitParams_custom_file_saver_get != 0) {
            return new FileSaver(InitParams_custom_file_saver_get, false);
        }
        return null;
    }

    public int getExecute_finish_on() {
        return GcamModuleJNI.InitParams_execute_finish_on_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__functionT_void_fF_t getFinish_queue_empty_callback() {
        return new SWIGTYPE_p_std__functionT_void_fF_t(GcamModuleJNI.InitParams_finish_queue_empty_callback_get(this.swigCPtr, this), true);
    }

    public ThreadPoolConfig getFinish_threads() {
        long InitParams_finish_threads_get = GcamModuleJNI.InitParams_finish_threads_get(this.swigCPtr, this);
        if (InitParams_finish_threads_get != 0) {
            return new ThreadPoolConfig(InitParams_finish_threads_get, false);
        }
        return null;
    }

    public ImageReleaseCallback getImage_release_callback() {
        long InitParams_image_release_callback_get = GcamModuleJNI.InitParams_image_release_callback_get(this.swigCPtr, this);
        if (InitParams_image_release_callback_get != 0) {
            return new ImageReleaseCallback(InitParams_image_release_callback_get, false);
        }
        return null;
    }

    public int getMax_payload_frames() {
        return GcamModuleJNI.InitParams_max_payload_frames_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__functionT_void_flong_long_long_longF_t getMemory_callback() {
        return new SWIGTYPE_p_std__functionT_void_flong_long_long_longF_t(GcamModuleJNI.InitParams_memory_callback_get(this.swigCPtr, this), true);
    }

    public SWIGTYPE_p_std__functionT_void_fF_t getMerge_queue_empty_callback() {
        return new SWIGTYPE_p_std__functionT_void_fF_t(GcamModuleJNI.InitParams_merge_queue_empty_callback_get(this.swigCPtr, this), true);
    }

    public ThreadPoolConfig getMerge_threads() {
        long InitParams_merge_threads_get = GcamModuleJNI.InitParams_merge_threads_get(this.swigCPtr, this);
        if (InitParams_merge_threads_get != 0) {
            return new ThreadPoolConfig(InitParams_merge_threads_get, false);
        }
        return null;
    }

    public String getSerialized_cache_dir() {
        return GcamModuleJNI.InitParams_serialized_cache_dir_get(this.swigCPtr, this);
    }

    public boolean getSimultaneous_merge_and_finish() {
        return GcamModuleJNI.InitParams_simultaneous_merge_and_finish_get(this.swigCPtr, this);
    }

    public boolean getVerbose() {
        return GcamModuleJNI.InitParams_verbose_get(this.swigCPtr, this);
    }

    public void setAllow_unknown_devices(boolean z) {
        GcamModuleJNI.InitParams_allow_unknown_devices_set(this.swigCPtr, this, z);
    }

    public void setCapture_threads(ThreadPoolConfig threadPoolConfig) {
        GcamModuleJNI.InitParams_capture_threads_set(this.swigCPtr, this, ThreadPoolConfig.getCPtr(threadPoolConfig), threadPoolConfig);
    }

    public void setCustom_file_saver(FileSaver fileSaver) {
        GcamModuleJNI.InitParams_custom_file_saver_set(this.swigCPtr, this, FileSaver.getCPtr(fileSaver), fileSaver);
    }

    public void setExecute_finish_on(int i) {
        GcamModuleJNI.InitParams_execute_finish_on_set(this.swigCPtr, this, i);
    }

    public void setFinish_queue_empty_callback(SWIGTYPE_p_std__functionT_void_fF_t sWIGTYPE_p_std__functionT_void_fF_t) {
        GcamModuleJNI.InitParams_finish_queue_empty_callback_set(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(sWIGTYPE_p_std__functionT_void_fF_t));
    }

    public void setFinish_threads(ThreadPoolConfig threadPoolConfig) {
        GcamModuleJNI.InitParams_finish_threads_set(this.swigCPtr, this, ThreadPoolConfig.getCPtr(threadPoolConfig), threadPoolConfig);
    }

    public void setImage_release_callback(ImageReleaseCallback imageReleaseCallback) {
        GcamModuleJNI.InitParams_image_release_callback_set(this.swigCPtr, this, ImageReleaseCallback.getCPtr(imageReleaseCallback), imageReleaseCallback);
    }

    public void setMax_payload_frames(int i) {
        GcamModuleJNI.InitParams_max_payload_frames_set(this.swigCPtr, this, i);
    }

    public void setMemory_callback(SWIGTYPE_p_std__functionT_void_flong_long_long_longF_t sWIGTYPE_p_std__functionT_void_flong_long_long_longF_t) {
        GcamModuleJNI.InitParams_memory_callback_set(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_flong_long_long_longF_t.getCPtr(sWIGTYPE_p_std__functionT_void_flong_long_long_longF_t));
    }

    public void setMerge_queue_empty_callback(SWIGTYPE_p_std__functionT_void_fF_t sWIGTYPE_p_std__functionT_void_fF_t) {
        GcamModuleJNI.InitParams_merge_queue_empty_callback_set(this.swigCPtr, this, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(sWIGTYPE_p_std__functionT_void_fF_t));
    }

    public void setMerge_threads(ThreadPoolConfig threadPoolConfig) {
        GcamModuleJNI.InitParams_merge_threads_set(this.swigCPtr, this, ThreadPoolConfig.getCPtr(threadPoolConfig), threadPoolConfig);
    }

    public void setSerialized_cache_dir(String str) {
        GcamModuleJNI.InitParams_serialized_cache_dir_set(this.swigCPtr, this, str);
    }

    public void setSimultaneous_merge_and_finish(boolean z) {
        GcamModuleJNI.InitParams_simultaneous_merge_and_finish_set(this.swigCPtr, this, z);
    }

    public void setVerbose(boolean z) {
        GcamModuleJNI.InitParams_verbose_set(this.swigCPtr, this, z);
    }
}
