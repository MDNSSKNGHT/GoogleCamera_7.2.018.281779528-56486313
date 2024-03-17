package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AfMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AfMetadata() {
        this(GcamModuleJNI.new_AfMetadata(), true);
    }

    public static long getCPtr(AfMetadata afMetadata) {
        if (afMetadata == null) {
            return 0L;
        }
        return afMetadata.swigCPtr;
    }

    public AfMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AfMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public WeightedPixelRectVector getMetering_rectangles() {
        long AfMetadata_metering_rectangles_get = GcamModuleJNI.AfMetadata_metering_rectangles_get(this.swigCPtr, this);
        if (AfMetadata_metering_rectangles_get != 0) {
            return new WeightedPixelRectVector(AfMetadata_metering_rectangles_get, false);
        }
        return null;
    }

    public int getMode() {
        return GcamModuleJNI.AfMetadata_mode_get(this.swigCPtr, this);
    }

    public int getState() {
        return GcamModuleJNI.AfMetadata_state_get(this.swigCPtr, this);
    }

    public int getTrigger() {
        return GcamModuleJNI.AfMetadata_trigger_get(this.swigCPtr, this);
    }

    public void setMetering_rectangles(WeightedPixelRectVector weightedPixelRectVector) {
        GcamModuleJNI.AfMetadata_metering_rectangles_set(this.swigCPtr, this, WeightedPixelRectVector.getCPtr(weightedPixelRectVector), weightedPixelRectVector);
    }

    public void setMode(int i) {
        GcamModuleJNI.AfMetadata_mode_set(this.swigCPtr, this, i);
    }

    public void setState(int i) {
        GcamModuleJNI.AfMetadata_state_set(this.swigCPtr, this, i);
    }

    public void setTrigger(int i) {
        GcamModuleJNI.AfMetadata_trigger_set(this.swigCPtr, this, i);
    }
}
