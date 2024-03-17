package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitImageCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitImageCallback() {
        this(GcamModuleJNI.new_PortraitImageCallback(), true);
        GcamModuleJNI.PortraitImageCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(PortraitImageCallback portraitImageCallback) {
        if (portraitImageCallback == null) {
            return 0L;
        }
        return portraitImageCallback.swigCPtr;
    }

    public PortraitImageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void RgbReady(long j, InterleavedReadViewU8 interleavedReadViewU8, int i, String str, String str2, String str3) {
        GcamModuleJNI.PortraitImageCallback_RgbReady(this.swigCPtr, this, j, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, i, str, str2, str3);
    }

    public void YuvReady(long j, YuvReadView yuvReadView, int i, String str, String str2, String str3) {
        GcamModuleJNI.PortraitImageCallback_YuvReady(this.swigCPtr, this, j, YuvReadView.getCPtr(yuvReadView), yuvReadView, i, str, str2, str3);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitImageCallback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.PortraitImageCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.PortraitImageCallback_change_ownership(this, this.swigCPtr, true);
    }
}
