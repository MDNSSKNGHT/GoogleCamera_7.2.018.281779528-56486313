package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GenerateRgbImageOptions {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public GenerateRgbImageOptions() {
        this(GcamModuleJNI.new_GenerateRgbImageOptions(), true);
    }

    public static long getCPtr(GenerateRgbImageOptions generateRgbImageOptions) {
        if (generateRgbImageOptions == null) {
            return 0L;
        }
        return generateRgbImageOptions.swigCPtr;
    }

    public GenerateRgbImageOptions(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_GenerateRgbImageOptions(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getActual_number_of_frames() {
        return GcamModuleJNI.GenerateRgbImageOptions_actual_number_of_frames_get(this.swigCPtr, this);
    }

    public int getExpected_number_of_frames() {
        return GcamModuleJNI.GenerateRgbImageOptions_expected_number_of_frames_get(this.swigCPtr, this);
    }

    public boolean getVerbose() {
        return GcamModuleJNI.GenerateRgbImageOptions_verbose_get(this.swigCPtr, this);
    }

    public void setActual_number_of_frames(int i) {
        GcamModuleJNI.GenerateRgbImageOptions_actual_number_of_frames_set(this.swigCPtr, this, i);
    }

    public void setExpected_number_of_frames(int i) {
        GcamModuleJNI.GenerateRgbImageOptions_expected_number_of_frames_set(this.swigCPtr, this, i);
    }

    public void setVerbose(boolean z) {
        GcamModuleJNI.GenerateRgbImageOptions_verbose_set(this.swigCPtr, this, z);
    }
}
