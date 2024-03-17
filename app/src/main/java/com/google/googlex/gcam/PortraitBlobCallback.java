package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitBlobCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitBlobCallback() {
        this(GcamModuleJNI.new_PortraitBlobCallback(), true);
        GcamModuleJNI.PortraitBlobCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(PortraitBlobCallback portraitBlobCallback) {
        if (portraitBlobCallback == null) {
            return 0L;
        }
        return portraitBlobCallback.swigCPtr;
    }

    public PortraitBlobCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void BlobReady(long j, String str, String str2, String str3) {
        GcamModuleJNI.PortraitBlobCallback_BlobReady(this.swigCPtr, this, j, str, str2, str3);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitBlobCallback(j);
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
        GcamModuleJNI.PortraitBlobCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.PortraitBlobCallback_change_ownership(this, this.swigCPtr, true);
    }
}
