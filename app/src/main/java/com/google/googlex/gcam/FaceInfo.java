package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FaceInfo {
    public boolean swigCMemOwn;
    public long swigCPtr;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static class Landmark {
        public boolean swigCMemOwn;
        public long swigCPtr;

        public Landmark() {
            this(GcamModuleJNI.new_FaceInfo_Landmark(), true);
        }

        public static long getCPtr(Landmark landmark) {
            if (landmark == null) {
                return 0L;
            }
            return landmark.swigCPtr;
        }

        public Landmark(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    GcamModuleJNI.delete_FaceInfo_Landmark(j);
                }
                this.swigCPtr = 0L;
            }
        }

        protected void finalize() {
            delete();
        }

        public float getX() {
            return GcamModuleJNI.FaceInfo_Landmark_x_get(this.swigCPtr, this);
        }

        public float getY() {
            return GcamModuleJNI.FaceInfo_Landmark_y_get(this.swigCPtr, this);
        }

        public void setX(float f) {
            GcamModuleJNI.FaceInfo_Landmark_x_set(this.swigCPtr, this, f);
        }

        public void setY(float f) {
            GcamModuleJNI.FaceInfo_Landmark_y_set(this.swigCPtr, this, f);
        }
    }

    public FaceInfo() {
        this(GcamModuleJNI.new_FaceInfo(), true);
    }

    public static long getCPtr(FaceInfo faceInfo) {
        if (faceInfo == null) {
            return 0L;
        }
        return faceInfo.swigCPtr;
    }

    public FaceInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(FaceInfo faceInfo) {
        return GcamModuleJNI.FaceInfo_Equals(this.swigCPtr, this, getCPtr(faceInfo), faceInfo);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FaceInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getConfidence() {
        return GcamModuleJNI.FaceInfo_confidence_get(this.swigCPtr, this);
    }

    public LandmarkMap getLandmarks() {
        long FaceInfo_landmarks_get = GcamModuleJNI.FaceInfo_landmarks_get(this.swigCPtr, this);
        if (FaceInfo_landmarks_get != 0) {
            return new LandmarkMap(FaceInfo_landmarks_get, false);
        }
        return null;
    }

    public float getPos_x() {
        return GcamModuleJNI.FaceInfo_pos_x_get(this.swigCPtr, this);
    }

    public float getPos_y() {
        return GcamModuleJNI.FaceInfo_pos_y_get(this.swigCPtr, this);
    }

    public float getSize() {
        return GcamModuleJNI.FaceInfo_size_get(this.swigCPtr, this);
    }

    public void setConfidence(float f) {
        GcamModuleJNI.FaceInfo_confidence_set(this.swigCPtr, this, f);
    }

    public void setLandmarks(LandmarkMap landmarkMap) {
        GcamModuleJNI.FaceInfo_landmarks_set(this.swigCPtr, this, LandmarkMap.getCPtr(landmarkMap), landmarkMap);
    }

    public void setPos_x(float f) {
        GcamModuleJNI.FaceInfo_pos_x_set(this.swigCPtr, this, f);
    }

    public void setPos_y(float f) {
        GcamModuleJNI.FaceInfo_pos_y_set(this.swigCPtr, this, f);
    }

    public void setSize(float f) {
        GcamModuleJNI.FaceInfo_size_set(this.swigCPtr, this, f);
    }
}
