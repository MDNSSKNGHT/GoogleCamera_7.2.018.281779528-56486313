package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExifMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ExifMetadata() {
        this(GcamModuleJNI.new_ExifMetadata__SWIG_0(), true);
    }

    public static long getCPtr(ExifMetadata exifMetadata) {
        if (exifMetadata == null) {
            return 0L;
        }
        return exifMetadata.swigCPtr;
    }

    public ExifMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public ExifMetadata(ExifMetadata exifMetadata) {
        this(GcamModuleJNI.new_ExifMetadata__SWIG_1(getCPtr(exifMetadata), exifMetadata), true);
    }

    public double ApertureValue() {
        return GcamModuleJNI.ExifMetadata_ApertureValue(this.swigCPtr, this);
    }

    public double BrightnessValue() {
        return GcamModuleJNI.ExifMetadata_BrightnessValue(this.swigCPtr, this);
    }

    public void ClearThumbnail() {
        GcamModuleJNI.ExifMetadata_ClearThumbnail(this.swigCPtr, this);
    }

    public int Flash() {
        return GcamModuleJNI.ExifMetadata_Flash(this.swigCPtr, this);
    }

    public boolean HasThumbnail() {
        return GcamModuleJNI.ExifMetadata_HasThumbnail(this.swigCPtr, this);
    }

    public int Iso() {
        return GcamModuleJNI.ExifMetadata_Iso(this.swigCPtr, this);
    }

    public void NoiseModelRgb(DngNoiseModel dngNoiseModel) {
        GcamModuleJNI.ExifMetadata_NoiseModelRgb(this.swigCPtr, this, DngNoiseModel.getCPtr(dngNoiseModel), dngNoiseModel);
    }

    public int Orientation() {
        return GcamModuleJNI.ExifMetadata_Orientation(this.swigCPtr, this);
    }

    public double SensitivityValue() {
        return GcamModuleJNI.ExifMetadata_SensitivityValue(this.swigCPtr, this);
    }

    public void SetFlash(int i) {
        GcamModuleJNI.ExifMetadata_SetFlash(this.swigCPtr, this, i);
    }

    public void SetIso(int i) {
        GcamModuleJNI.ExifMetadata_SetIso(this.swigCPtr, this, i);
    }

    public void SetNoiseModelRgb(DngNoiseModel[] dngNoiseModelArr) {
        GcamModuleJNI.ExifMetadata_SetNoiseModelRgb(this.swigCPtr, this, DngNoiseModel.cArrayUnwrap(dngNoiseModelArr));
    }

    public void SetOrientation(int i) {
        GcamModuleJNI.ExifMetadata_SetOrientation(this.swigCPtr, this, i);
    }

    public void SetTimestampCurrent() {
        GcamModuleJNI.ExifMetadata_SetTimestampCurrent(this.swigCPtr, this);
    }

    public double ShutterSpeedValue() {
        return GcamModuleJNI.ExifMetadata_ShutterSpeedValue(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ExifMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public AeResults getAe_results() {
        long ExifMetadata_ae_results_get = GcamModuleJNI.ExifMetadata_ae_results_get(this.swigCPtr, this);
        if (ExifMetadata_ae_results_get != 0) {
            return new AeResults(ExifMetadata_ae_results_get, false);
        }
        return null;
    }

    public ClientExifMetadata getClient_exif() {
        long ExifMetadata_client_exif_get = GcamModuleJNI.ExifMetadata_client_exif_get(this.swigCPtr, this);
        if (ExifMetadata_client_exif_get != 0) {
            return new ClientExifMetadata(ExifMetadata_client_exif_get, false);
        }
        return null;
    }

    public PixelRect getDng_user_crop() {
        long ExifMetadata_dng_user_crop_get = GcamModuleJNI.ExifMetadata_dng_user_crop_get(this.swigCPtr, this);
        if (ExifMetadata_dng_user_crop_get != 0) {
            return new PixelRect(ExifMetadata_dng_user_crop_get, false);
        }
        return null;
    }

    public float getExposure_compensation() {
        return GcamModuleJNI.ExifMetadata_exposure_compensation_get(this.swigCPtr, this);
    }

    public NormalizedRect getFinal_crop() {
        long ExifMetadata_final_crop_get = GcamModuleJNI.ExifMetadata_final_crop_get(this.swigCPtr, this);
        if (ExifMetadata_final_crop_get != 0) {
            return new NormalizedRect(ExifMetadata_final_crop_get, false);
        }
        return null;
    }

    public int getFlash_mode() {
        return GcamModuleJNI.ExifMetadata_flash_mode_get(this.swigCPtr, this);
    }

    public FrameMetadata getFrame_metadata() {
        long ExifMetadata_frame_metadata_get = GcamModuleJNI.ExifMetadata_frame_metadata_get(this.swigCPtr, this);
        if (ExifMetadata_frame_metadata_get != 0) {
            return new FrameMetadata(ExifMetadata_frame_metadata_get, false);
        }
        return null;
    }

    public InterleavedImageF getGain_map_rggb() {
        long ExifMetadata_gain_map_rggb_get = GcamModuleJNI.ExifMetadata_gain_map_rggb_get(this.swigCPtr, this);
        if (ExifMetadata_gain_map_rggb_get != 0) {
            return new InterleavedImageF(ExifMetadata_gain_map_rggb_get, false);
        }
        return null;
    }

    public int getIcc_profile() {
        return GcamModuleJNI.ExifMetadata_icc_profile_get(this.swigCPtr, this);
    }

    public int getImage_rotation() {
        return GcamModuleJNI.ExifMetadata_image_rotation_get(this.swigCPtr, this);
    }

    public String getMakernote() {
        return GcamModuleJNI.ExifMetadata_makernote_get(this.swigCPtr, this);
    }

    public PixelRect getRaw_crop() {
        long ExifMetadata_raw_crop_get = GcamModuleJNI.ExifMetadata_raw_crop_get(this.swigCPtr, this);
        if (ExifMetadata_raw_crop_get != 0) {
            return new PixelRect(ExifMetadata_raw_crop_get, false);
        }
        return null;
    }

    public String getSoftware_suffix() {
        return GcamModuleJNI.ExifMetadata_software_suffix_get(this.swigCPtr, this);
    }

    public StaticMetadata getStatic_metadata() {
        long ExifMetadata_static_metadata_get = GcamModuleJNI.ExifMetadata_static_metadata_get(this.swigCPtr, this);
        if (ExifMetadata_static_metadata_get != 0) {
            return new StaticMetadata(ExifMetadata_static_metadata_get, false);
        }
        return null;
    }

    public int getThumbnail_height() {
        return GcamModuleJNI.ExifMetadata_thumbnail_height_get(this.swigCPtr, this);
    }

    public Uint8Vector getThumbnail_jpg() {
        long ExifMetadata_thumbnail_jpg_get = GcamModuleJNI.ExifMetadata_thumbnail_jpg_get(this.swigCPtr, this);
        if (ExifMetadata_thumbnail_jpg_get != 0) {
            return new Uint8Vector(ExifMetadata_thumbnail_jpg_get, false);
        }
        return null;
    }

    public int getThumbnail_width() {
        return GcamModuleJNI.ExifMetadata_thumbnail_width_get(this.swigCPtr, this);
    }

    public long getTimestamp_unix_us() {
        return GcamModuleJNI.ExifMetadata_timestamp_unix_us_get(this.swigCPtr, this);
    }

    public int getWb_mode() {
        return GcamModuleJNI.ExifMetadata_wb_mode_get(this.swigCPtr, this);
    }

    public String getXmp_metadata_extended() {
        return GcamModuleJNI.ExifMetadata_xmp_metadata_extended_get(this.swigCPtr, this);
    }

    public String getXmp_metadata_main() {
        return GcamModuleJNI.ExifMetadata_xmp_metadata_main_get(this.swigCPtr, this);
    }

    public void setAe_results(AeResults aeResults) {
        GcamModuleJNI.ExifMetadata_ae_results_set(this.swigCPtr, this, AeResults.getCPtr(aeResults), aeResults);
    }

    public void setClient_exif(ClientExifMetadata clientExifMetadata) {
        GcamModuleJNI.ExifMetadata_client_exif_set(this.swigCPtr, this, ClientExifMetadata.getCPtr(clientExifMetadata), clientExifMetadata);
    }

    public void setDng_user_crop(PixelRect pixelRect) {
        GcamModuleJNI.ExifMetadata_dng_user_crop_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public void setExposure_compensation(float f) {
        GcamModuleJNI.ExifMetadata_exposure_compensation_set(this.swigCPtr, this, f);
    }

    public void setFinal_crop(NormalizedRect normalizedRect) {
        GcamModuleJNI.ExifMetadata_final_crop_set(this.swigCPtr, this, NormalizedRect.getCPtr(normalizedRect), normalizedRect);
    }

    public void setFlash_mode(int i) {
        GcamModuleJNI.ExifMetadata_flash_mode_set(this.swigCPtr, this, i);
    }

    public void setFrame_metadata(FrameMetadata frameMetadata) {
        GcamModuleJNI.ExifMetadata_frame_metadata_set(this.swigCPtr, this, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public void setGain_map_rggb(InterleavedImageF interleavedImageF) {
        GcamModuleJNI.ExifMetadata_gain_map_rggb_set(this.swigCPtr, this, InterleavedImageF.getCPtr(interleavedImageF), interleavedImageF);
    }

    public void setIcc_profile(int i) {
        GcamModuleJNI.ExifMetadata_icc_profile_set(this.swigCPtr, this, i);
    }

    public void setImage_rotation(int i) {
        GcamModuleJNI.ExifMetadata_image_rotation_set(this.swigCPtr, this, i);
    }

    public void setMakernote(String str) {
        GcamModuleJNI.ExifMetadata_makernote_set(this.swigCPtr, this, str);
    }

    public void setRaw_crop(PixelRect pixelRect) {
        GcamModuleJNI.ExifMetadata_raw_crop_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public void setSoftware_suffix(String str) {
        GcamModuleJNI.ExifMetadata_software_suffix_set(this.swigCPtr, this, str);
    }

    public void setStatic_metadata(StaticMetadata staticMetadata) {
        GcamModuleJNI.ExifMetadata_static_metadata_set(this.swigCPtr, this, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public void setThumbnail_height(int i) {
        GcamModuleJNI.ExifMetadata_thumbnail_height_set(this.swigCPtr, this, i);
    }

    public void setThumbnail_jpg(Uint8Vector uint8Vector) {
        GcamModuleJNI.ExifMetadata_thumbnail_jpg_set(this.swigCPtr, this, Uint8Vector.getCPtr(uint8Vector), uint8Vector);
    }

    public void setThumbnail_width(int i) {
        GcamModuleJNI.ExifMetadata_thumbnail_width_set(this.swigCPtr, this, i);
    }

    public void setTimestamp_unix_us(long j) {
        GcamModuleJNI.ExifMetadata_timestamp_unix_us_set(this.swigCPtr, this, j);
    }

    public void setWb_mode(int i) {
        GcamModuleJNI.ExifMetadata_wb_mode_set(this.swigCPtr, this, i);
    }

    public void setXmp_metadata_extended(String str) {
        GcamModuleJNI.ExifMetadata_xmp_metadata_extended_set(this.swigCPtr, this, str);
    }

    public void setXmp_metadata_main(String str) {
        GcamModuleJNI.ExifMetadata_xmp_metadata_main_set(this.swigCPtr, this, str);
    }
}
