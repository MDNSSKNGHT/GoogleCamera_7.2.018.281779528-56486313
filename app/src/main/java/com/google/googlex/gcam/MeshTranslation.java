package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MeshTranslation {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public MeshTranslation() {
        this(GcamModuleJNI.new_MeshTranslation(), true);
    }

    public static long getCPtr(MeshTranslation meshTranslation) {
        if (meshTranslation == null) {
            return 0L;
        }
        return meshTranslation.swigCPtr;
    }

    public MeshTranslation(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_MeshTranslation(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getX() {
        return GcamModuleJNI.MeshTranslation_x_get(this.swigCPtr, this);
    }

    public int getY() {
        return GcamModuleJNI.MeshTranslation_y_get(this.swigCPtr, this);
    }

    public void setX(int i) {
        GcamModuleJNI.MeshTranslation_x_set(this.swigCPtr, this, i);
    }

    public void setY(int i) {
        GcamModuleJNI.MeshTranslation_y_set(this.swigCPtr, this, i);
    }
}
