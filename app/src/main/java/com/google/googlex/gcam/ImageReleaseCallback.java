package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImageReleaseCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ImageReleaseCallback() {
        this(GcamModuleJNI.new_ImageReleaseCallback(), true);
        GcamModuleJNI.ImageReleaseCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(ImageReleaseCallback imageReleaseCallback) {
        if (imageReleaseCallback == null) {
            return 0L;
        }
        return imageReleaseCallback.swigCPtr;
    }

    public ImageReleaseCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Run(long j) {
        GcamModuleJNI.ImageReleaseCallback_Run(this.swigCPtr, this, j);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ImageReleaseCallback(j);
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
        GcamModuleJNI.ImageReleaseCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ImageReleaseCallback_change_ownership(this, this.swigCPtr, true);
    }
}
