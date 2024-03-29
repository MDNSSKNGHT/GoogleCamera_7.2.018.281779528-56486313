package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PdImageCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PdImageCallback() {
        this(GcamModuleJNI.new_PdImageCallback(), true);
        GcamModuleJNI.PdImageCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(PdImageCallback pdImageCallback) {
        if (pdImageCallback == null) {
            return 0L;
        }
        return pdImageCallback.swigCPtr;
    }

    public PdImageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void ImageReady(int i, InterleavedReadViewU16 interleavedReadViewU16) {
        GcamModuleJNI.PdImageCallback_ImageReady(this.swigCPtr, this, i, InterleavedReadViewU16.getCPtr(interleavedReadViewU16), interleavedReadViewU16);
    }

    public void MergePdFailed(int i) {
        GcamModuleJNI.PdImageCallback_MergePdFailed(this.swigCPtr, this, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PdImageCallback(j);
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
        GcamModuleJNI.PdImageCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.PdImageCallback_change_ownership(this, this.swigCPtr, true);
    }
}
