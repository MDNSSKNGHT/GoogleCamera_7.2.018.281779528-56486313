package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StringAeResultsMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StringAeResultsMap() {
        this(GcamModuleJNI.new_StringAeResultsMap__SWIG_0(), true);
    }

    public static long getCPtr(StringAeResultsMap stringAeResultsMap) {
        if (stringAeResultsMap == null) {
            return 0L;
        }
        return stringAeResultsMap.swigCPtr;
    }

    public StringAeResultsMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public StringAeResultsMap(StringAeResultsMap stringAeResultsMap) {
        this(GcamModuleJNI.new_StringAeResultsMap__SWIG_1(getCPtr(stringAeResultsMap), stringAeResultsMap), true);
    }

    public void clear() {
        GcamModuleJNI.StringAeResultsMap_clear(this.swigCPtr, this);
    }

    public void del(String str) {
        GcamModuleJNI.StringAeResultsMap_del(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StringAeResultsMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean empty() {
        return GcamModuleJNI.StringAeResultsMap_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public AeResults get(String str) {
        return new AeResults(GcamModuleJNI.StringAeResultsMap_get(this.swigCPtr, this, str), false);
    }

    public boolean has_key(String str) {
        return GcamModuleJNI.StringAeResultsMap_has_key(this.swigCPtr, this, str);
    }

    public void set(String str, AeResults aeResults) {
        GcamModuleJNI.StringAeResultsMap_set(this.swigCPtr, this, str, AeResults.getCPtr(aeResults), aeResults);
    }

    public long size() {
        return GcamModuleJNI.StringAeResultsMap_size(this.swigCPtr, this);
    }
}
