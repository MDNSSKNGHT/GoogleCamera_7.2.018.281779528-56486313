package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PortraitSwigWrapper {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PortraitSwigWrapper() {
        this(GcamModuleJNI.new_PortraitSwigWrapper(), true);
    }

    public static long getCPtr(PortraitSwigWrapper portraitSwigWrapper) {
        if (portraitSwigWrapper == null) {
            return 0L;
        }
        return portraitSwigWrapper.swigCPtr;
    }

    public PortraitSwigWrapper(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Init(long j) {
        return GcamModuleJNI.PortraitSwigWrapper_Init(this.swigCPtr, this, j);
    }

    public boolean Process(long j, PortraitOutputs portraitOutputs, InterleavedReadViewU8 interleavedReadViewU8, PortraitDepthArguments portraitDepthArguments, long j2, PortraitRequest portraitRequest) {
        return GcamModuleJNI.PortraitSwigWrapper_Process(this.swigCPtr, this, j, PortraitOutputs.getCPtr(portraitOutputs), portraitOutputs, InterleavedReadViewU8.getCPtr(interleavedReadViewU8), interleavedReadViewU8, PortraitDepthArguments.getCPtr(portraitDepthArguments), portraitDepthArguments, j2, PortraitRequest.getCPtr(portraitRequest), portraitRequest);
    }

    public void Release() {
        GcamModuleJNI.PortraitSwigWrapper_Release(this.swigCPtr, this);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PortraitSwigWrapper(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }
}
