package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageSaverParams {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ImageSaverParams() {
        this(GcamModuleJNI.new_ImageSaverParams(), true);
    }

    public static long getCPtr(ImageSaverParams imageSaverParams) {
        if (imageSaverParams == null) {
            return 0L;
        }
        return imageSaverParams.swigCPtr;
    }

    public ImageSaverParams(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Print() {
        GcamModuleJNI.ImageSaverParams_Print(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ImageSaverParams(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public String getDest_folder() {
        return GcamModuleJNI.ImageSaverParams_dest_folder_get(this.swigCPtr, this);
    }

    public String getFilename_prefix() {
        return GcamModuleJNI.ImageSaverParams_filename_prefix_get(this.swigCPtr, this);
    }

    public String getFilename_suffix() {
        return GcamModuleJNI.ImageSaverParams_filename_suffix_get(this.swigCPtr, this);
    }

    public void setDest_folder(String str) {
        GcamModuleJNI.ImageSaverParams_dest_folder_set(this.swigCPtr, this, str);
    }

    public void setFilename_prefix(String str) {
        GcamModuleJNI.ImageSaverParams_filename_prefix_set(this.swigCPtr, this, str);
    }

    public void setFilename_suffix(String str) {
        GcamModuleJNI.ImageSaverParams_filename_suffix_set(this.swigCPtr, this, str);
    }
}
