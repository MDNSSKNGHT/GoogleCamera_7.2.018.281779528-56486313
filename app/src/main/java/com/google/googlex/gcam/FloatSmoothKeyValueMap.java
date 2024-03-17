package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FloatSmoothKeyValueMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public FloatSmoothKeyValueMap() {
        this(GcamModuleJNI.new_FloatSmoothKeyValueMap(), true);
    }

    public static long getCPtr(FloatSmoothKeyValueMap floatSmoothKeyValueMap) {
        if (floatSmoothKeyValueMap == null) {
            return 0L;
        }
        return floatSmoothKeyValueMap.swigCPtr;
    }

    public FloatSmoothKeyValueMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public float Get(float f) {
        return GcamModuleJNI.FloatSmoothKeyValueMap_Get(this.swigCPtr, this, f);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_FloatSmoothKeyValueMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
