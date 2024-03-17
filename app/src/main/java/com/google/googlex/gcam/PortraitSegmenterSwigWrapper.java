package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitSegmenterSwigWrapper {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitSegmenterSwigWrapper() {
        this(GcamModuleJNI.new_PortraitSegmenterSwigWrapper(), true);
    }

    public static long getCPtr(PortraitSegmenterSwigWrapper portraitSegmenterSwigWrapper) {
        if (portraitSegmenterSwigWrapper == null) {
            return 0L;
        }
        return portraitSegmenterSwigWrapper.swigCPtr;
    }

    public PortraitSegmenterSwigWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DummyImageProducesReasonableMask() {
        return GcamModuleJNI.PortraitSegmenterSwigWrapper_DummyImageProducesReasonableMask(this.swigCPtr, this);
    }

    public long GetSegmenterHandle() {
        return GcamModuleJNI.PortraitSegmenterSwigWrapper_GetSegmenterHandle(this.swigCPtr, this);
    }

    public boolean Init(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return GcamModuleJNI.PortraitSegmenterSwigWrapper_Init(this.swigCPtr, this, j, j2, str, str2, z, z2, z3, z4);
    }

    public void Release() {
        GcamModuleJNI.PortraitSegmenterSwigWrapper_Release(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitSegmenterSwigWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
