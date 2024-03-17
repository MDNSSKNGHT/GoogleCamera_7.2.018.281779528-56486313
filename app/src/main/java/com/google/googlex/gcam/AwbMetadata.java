package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AwbMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AwbMetadata() {
        this(GcamModuleJNI.new_AwbMetadata(), true);
    }

    public static long getCPtr(AwbMetadata awbMetadata) {
        if (awbMetadata == null) {
            return 0L;
        }
        return awbMetadata.swigCPtr;
    }

    public AwbMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AwbMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public boolean getLock() {
        return GcamModuleJNI.AwbMetadata_lock_get(this.swigCPtr, this);
    }

    public WeightedPixelRectVector getMetering_rectangles() {
        long AwbMetadata_metering_rectangles_get = GcamModuleJNI.AwbMetadata_metering_rectangles_get(this.swigCPtr, this);
        if (AwbMetadata_metering_rectangles_get != 0) {
            return new WeightedPixelRectVector(AwbMetadata_metering_rectangles_get, false);
        }
        return null;
    }

    public int getMode() {
        return GcamModuleJNI.AwbMetadata_mode_get(this.swigCPtr, this);
    }

    public int getState() {
        return GcamModuleJNI.AwbMetadata_state_get(this.swigCPtr, this);
    }

    public void setLock(boolean z) {
        GcamModuleJNI.AwbMetadata_lock_set(this.swigCPtr, this, z);
    }

    public void setMetering_rectangles(WeightedPixelRectVector weightedPixelRectVector) {
        GcamModuleJNI.AwbMetadata_metering_rectangles_set(this.swigCPtr, this, WeightedPixelRectVector.getCPtr(weightedPixelRectVector), weightedPixelRectVector);
    }

    public void setMode(int i) {
        GcamModuleJNI.AwbMetadata_mode_set(this.swigCPtr, this, i);
    }

    public void setState(int i) {
        GcamModuleJNI.AwbMetadata_state_set(this.swigCPtr, this, i);
    }
}
