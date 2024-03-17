package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StringSpatialGainMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StringSpatialGainMap() {
        this(GcamModuleJNI.new_StringSpatialGainMap__SWIG_0(), true);
    }

    public static long getCPtr(StringSpatialGainMap stringSpatialGainMap) {
        if (stringSpatialGainMap == null) {
            return 0L;
        }
        return stringSpatialGainMap.swigCPtr;
    }

    public StringSpatialGainMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public StringSpatialGainMap(StringSpatialGainMap stringSpatialGainMap) {
        this(GcamModuleJNI.new_StringSpatialGainMap__SWIG_1(getCPtr(stringSpatialGainMap), stringSpatialGainMap), true);
    }

    public void clear() {
        GcamModuleJNI.StringSpatialGainMap_clear(this.swigCPtr, this);
    }

    public void del(String str) {
        GcamModuleJNI.StringSpatialGainMap_del(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StringSpatialGainMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean empty() {
        return GcamModuleJNI.StringSpatialGainMap_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public SpatialGainMap get(String str) {
        return new SpatialGainMap(GcamModuleJNI.StringSpatialGainMap_get(this.swigCPtr, this, str), false);
    }

    public boolean has_key(String str) {
        return GcamModuleJNI.StringSpatialGainMap_has_key(this.swigCPtr, this, str);
    }

    public void set(String str, SpatialGainMap spatialGainMap) {
        GcamModuleJNI.StringSpatialGainMap_set(this.swigCPtr, this, str, SpatialGainMap.getCPtr(spatialGainMap), spatialGainMap);
    }

    public long size() {
        return GcamModuleJNI.StringSpatialGainMap_size(this.swigCPtr, this);
    }
}
