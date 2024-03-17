package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageSaver {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ImageSaver(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(ImageSaver imageSaver) {
        if (imageSaver == null) {
            return 0L;
        }
        return imageSaver.swigCPtr;
    }

    public ImageSaver(ImageSaverParams imageSaverParams, String str) {
        this(GcamModuleJNI.new_ImageSaver__SWIG_1(ImageSaverParams.getCPtr(imageSaverParams), imageSaverParams, str), true);
    }

    public ImageSaver(String str, String str2, String str3, String str4) {
        this(GcamModuleJNI.new_ImageSaver__SWIG_0(str, str2, str3, str4), true);
    }

    public String GetPath(String str) {
        return GcamModuleJNI.ImageSaver_GetPath(this.swigCPtr, this, str);
    }

    public String GetUniquePath(String str) {
        return GcamModuleJNI.ImageSaver_GetUniquePath(this.swigCPtr, this, str);
    }

    public String Save(InterleavedReadViewU16 interleavedReadViewU16, String str) {
        return GcamModuleJNI.ImageSaver_Save__SWIG_1(this.swigCPtr, this, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16, str);
    }

    public String Save(InterleavedReadViewU8 interleavedReadViewU8, String str) {
        return GcamModuleJNI.ImageSaver_Save__SWIG_0(this.swigCPtr, this, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, str);
    }

    public String Save(SWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t, String str) {
        return GcamModuleJNI.ImageSaver_Save__SWIG_2(this.swigCPtr, this, SWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__ReadOnlyTImageViewT_unsigned_short_gcam__kChannelContiguous_t), str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ImageSaver(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public String dest_folder() {
        return GcamModuleJNI.ImageSaver_dest_folder(this.swigCPtr, this);
    }

    public String filename_prefix() {
        return GcamModuleJNI.ImageSaver_filename_prefix(this.swigCPtr, this);
    }

    public String filename_suffix() {
        return GcamModuleJNI.ImageSaver_filename_suffix(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public String gcam_version() {
        return GcamModuleJNI.ImageSaver_gcam_version(this.swigCPtr, this);
    }
}
