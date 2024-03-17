package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ShotStatusCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public ShotStatusCallback() {
        this(GcamModuleJNI.new_ShotStatusCallback(), true);
        GcamModuleJNI.ShotStatusCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(ShotStatusCallback shotStatusCallback) {
        if (shotStatusCallback == null) {
            return 0L;
        }
        return shotStatusCallback.swigCPtr;
    }

    public ShotStatusCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void OnAbort(int i) {
        GcamModuleJNI.ShotStatusCallback_OnAbort(this.swigCPtr, this, i);
    }

    public void OnComplete(int i, ShotLogData shotLogData) {
        GcamModuleJNI.ShotStatusCallback_OnComplete(this.swigCPtr, this, i, ShotLogData.getCPtr(shotLogData), shotLogData);
    }

    public void OnError(int i, String str) {
        GcamModuleJNI.ShotStatusCallback_OnError(this.swigCPtr, this, i, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_ShotStatusCallback(j);
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
        GcamModuleJNI.ShotStatusCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.ShotStatusCallback_change_ownership(this, this.swigCPtr, true);
    }
}
