package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class JpgEncodeOptions {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public JpgEncodeOptions() {
        this(GcamModuleJNI.new_JpgEncodeOptions(), true);
    }

    public static long getCPtr(JpgEncodeOptions jpgEncodeOptions) {
        if (jpgEncodeOptions == null) {
            return 0L;
        }
        return jpgEncodeOptions.swigCPtr;
    }

    public JpgEncodeOptions(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_JpgEncodeOptions(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public ExifMetadata getExif_data() {
        long JpgEncodeOptions_exif_data_get = GcamModuleJNI.JpgEncodeOptions_exif_data_get(this.swigCPtr, this);
        if (JpgEncodeOptions_exif_data_get != 0) {
            return new ExifMetadata(JpgEncodeOptions_exif_data_get, false);
        }
        return null;
    }

    public int getPixel_format() {
        return GcamModuleJNI.JpgEncodeOptions_pixel_format_get(this.swigCPtr, this);
    }

    public int getQuality() {
        return GcamModuleJNI.JpgEncodeOptions_quality_get(this.swigCPtr, this);
    }

    public void setExif_data(ExifMetadata exifMetadata) {
        GcamModuleJNI.JpgEncodeOptions_exif_data_set(this.swigCPtr, this, ExifMetadata.getCPtr(exifMetadata), exifMetadata);
    }

    public void setPixel_format(int i) {
        GcamModuleJNI.JpgEncodeOptions_pixel_format_set(this.swigCPtr, this, i);
    }

    public void setQuality(int i) {
        GcamModuleJNI.JpgEncodeOptions_quality_set(this.swigCPtr, this, i);
    }
}
