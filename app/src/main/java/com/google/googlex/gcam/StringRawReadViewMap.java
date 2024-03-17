package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StringRawReadViewMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StringRawReadViewMap() {
        this(GcamModuleJNI.new_StringRawReadViewMap__SWIG_0(), true);
    }

    public static long getCPtr(StringRawReadViewMap stringRawReadViewMap) {
        if (stringRawReadViewMap == null) {
            return 0L;
        }
        return stringRawReadViewMap.swigCPtr;
    }

    public StringRawReadViewMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public StringRawReadViewMap(StringRawReadViewMap stringRawReadViewMap) {
        this(GcamModuleJNI.new_StringRawReadViewMap__SWIG_1(getCPtr(stringRawReadViewMap), stringRawReadViewMap), true);
    }

    public void clear() {
        GcamModuleJNI.StringRawReadViewMap_clear(this.swigCPtr, this);
    }

    public void del(String str) {
        GcamModuleJNI.StringRawReadViewMap_del(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StringRawReadViewMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean empty() {
        return GcamModuleJNI.StringRawReadViewMap_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public RawReadView get(String str) {
        return new RawReadView(GcamModuleJNI.StringRawReadViewMap_get(this.swigCPtr, this, str), false);
    }

    public boolean has_key(String str) {
        return GcamModuleJNI.StringRawReadViewMap_has_key(this.swigCPtr, this, str);
    }

    public void set(String str, RawReadView rawReadView) {
        GcamModuleJNI.StringRawReadViewMap_set(this.swigCPtr, this, str, RawReadView.getCPtr(rawReadView), rawReadView);
    }

    public long size() {
        return GcamModuleJNI.StringRawReadViewMap_size(this.swigCPtr, this);
    }
}
