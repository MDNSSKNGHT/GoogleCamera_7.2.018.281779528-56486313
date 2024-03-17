package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StringStaticMetadataMap {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public StringStaticMetadataMap() {
        this(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
    }

    public static long getCPtr(StringStaticMetadataMap stringStaticMetadataMap) {
        if (stringStaticMetadataMap == null) {
            return 0L;
        }
        return stringStaticMetadataMap.swigCPtr;
    }

    public StringStaticMetadataMap(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public StringStaticMetadataMap(StringStaticMetadataMap stringStaticMetadataMap) {
        this(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_1(getCPtr(stringStaticMetadataMap), stringStaticMetadataMap), true);
    }

    public void clear() {
        GcamModuleJNI.StringStaticMetadataMap_clear(this.swigCPtr, this);
    }

    public void del(String str) {
        GcamModuleJNI.StringStaticMetadataMap_del(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_StringStaticMetadataMap(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean empty() {
        return GcamModuleJNI.StringStaticMetadataMap_empty(this.swigCPtr, this);
    }

    protected void finalize() {
        delete();
    }

    public StaticMetadata get(String str) {
        return new StaticMetadata(GcamModuleJNI.StringStaticMetadataMap_get(this.swigCPtr, this, str), false);
    }

    public boolean has_key(String str) {
        return GcamModuleJNI.StringStaticMetadataMap_has_key(this.swigCPtr, this, str);
    }

    public void set(String str, StaticMetadata staticMetadata) {
        GcamModuleJNI.StringStaticMetadataMap_set(this.swigCPtr, this, str, StaticMetadata.getCPtr(staticMetadata), staticMetadata);
    }

    public long size() {
        return GcamModuleJNI.StringStaticMetadataMap_size(this.swigCPtr, this);
    }
}
