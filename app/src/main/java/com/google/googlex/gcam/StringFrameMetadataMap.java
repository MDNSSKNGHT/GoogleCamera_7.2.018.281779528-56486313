package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StringFrameMetadataMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StringFrameMetadataMap() {
        this(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
    }

    public static long getCPtr(StringFrameMetadataMap stringFrameMetadataMap) {
        if (stringFrameMetadataMap == null) {
            return 0L;
        }
        return stringFrameMetadataMap.swigCPtr;
    }

    public StringFrameMetadataMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public StringFrameMetadataMap(StringFrameMetadataMap stringFrameMetadataMap) {
        this(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_1(getCPtr(stringFrameMetadataMap), stringFrameMetadataMap), true);
    }

    public void clear() {
        GcamModuleJNI.StringFrameMetadataMap_clear(this.swigCPtr, this);
    }

    public void del(String str) {
        GcamModuleJNI.StringFrameMetadataMap_del(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StringFrameMetadataMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean empty() {
        return GcamModuleJNI.StringFrameMetadataMap_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public FrameMetadata get(String str) {
        return new FrameMetadata(GcamModuleJNI.StringFrameMetadataMap_get(this.swigCPtr, this, str), false);
    }

    public boolean has_key(String str) {
        return GcamModuleJNI.StringFrameMetadataMap_has_key(this.swigCPtr, this, str);
    }

    public void set(String str, FrameMetadata frameMetadata) {
        GcamModuleJNI.StringFrameMetadataMap_set(this.swigCPtr, this, str, FrameMetadata.getCPtr(frameMetadata), frameMetadata);
    }

    public long size() {
        return GcamModuleJNI.StringFrameMetadataMap_size(this.swigCPtr, this);
    }
}
