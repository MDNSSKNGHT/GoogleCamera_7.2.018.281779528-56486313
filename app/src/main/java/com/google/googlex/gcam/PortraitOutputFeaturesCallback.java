package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitOutputFeaturesCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitOutputFeaturesCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(PortraitOutputFeaturesCallback portraitOutputFeaturesCallback) {
        if (portraitOutputFeaturesCallback == null) {
            return 0L;
        }
        return portraitOutputFeaturesCallback.swigCPtr;
    }

    public void AddFeature(long j, String str, double d) {
        GcamModuleJNI.PortraitOutputFeaturesCallback_AddFeature(this.swigCPtr, this, j, str, d);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitOutputFeaturesCallback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
