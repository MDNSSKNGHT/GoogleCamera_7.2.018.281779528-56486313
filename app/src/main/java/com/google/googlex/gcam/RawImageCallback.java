package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RawImageCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public RawImageCallback() {
        this(GcamModuleJNI.new_RawImageCallback(), true);
        GcamModuleJNI.RawImageCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(RawImageCallback rawImageCallback) {
        if (rawImageCallback == null) {
            return 0L;
        }
        return rawImageCallback.swigCPtr;
    }

    public RawImageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void ImageReady(int i, ExifMetadata exifMetadata, RawReadView rawReadView) {
        GcamModuleJNI.RawImageCallback_ImageReady(this.swigCPtr, this, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata, RawReadView.getCPtr(rawReadView), rawReadView);
    }

    public void MergeRawFailed(int i) {
        GcamModuleJNI.RawImageCallback_MergeRawFailed(this.swigCPtr, this, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_RawImageCallback(j);
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
        GcamModuleJNI.RawImageCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.RawImageCallback_change_ownership(this, this.swigCPtr, true);
    }
}
