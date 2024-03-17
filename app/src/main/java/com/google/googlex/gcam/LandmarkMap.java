package com.google.googlex.gcam;

import com.google.googlex.gcam.FaceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LandmarkMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public LandmarkMap() {
        this(GcamModuleJNI.new_LandmarkMap__SWIG_0(), true);
    }

    public static long getCPtr(LandmarkMap landmarkMap) {
        if (landmarkMap == null) {
            return 0L;
        }
        return landmarkMap.swigCPtr;
    }

    public LandmarkMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public LandmarkMap(LandmarkMap landmarkMap) {
        this(GcamModuleJNI.new_LandmarkMap__SWIG_1(getCPtr(landmarkMap), landmarkMap), true);
    }

    public void clear() {
        GcamModuleJNI.LandmarkMap_clear(this.swigCPtr, this);
    }

    public void del(int i) {
        GcamModuleJNI.LandmarkMap_del(this.swigCPtr, this, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_LandmarkMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean empty() {
        return GcamModuleJNI.LandmarkMap_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public FaceInfo.Landmark get(int i) {
        return new FaceInfo.Landmark(GcamModuleJNI.LandmarkMap_get(this.swigCPtr, this, i), false);
    }

    public boolean has_key(int i) {
        return GcamModuleJNI.LandmarkMap_has_key(this.swigCPtr, this, i);
    }

    public void set(int i, FaceInfo.Landmark landmark) {
        GcamModuleJNI.LandmarkMap_set(this.swigCPtr, this, i, FaceInfo.Landmark.getCPtr(landmark), landmark);
    }

    public long size() {
        return GcamModuleJNI.LandmarkMap_size(this.swigCPtr, this);
    }
}
