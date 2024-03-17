package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BurstSpec {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public BurstSpec() {
        this(GcamModuleJNI.new_BurstSpec(), true);
    }

    public static long getCPtr(BurstSpec burstSpec) {
        if (burstSpec == null) {
            return 0L;
        }
        return burstSpec.swigCPtr;
    }

    public BurstSpec(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void Clear() {
        GcamModuleJNI.BurstSpec_Clear(this.swigCPtr, this);
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.BurstSpec_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public void Print(int i) {
        GcamModuleJNI.BurstSpec_Print(this.swigCPtr, this, i);
    }

    public void SerializeToString(String str) {
        GcamModuleJNI.BurstSpec_SerializeToString(this.swigCPtr, this, str);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_BurstSpec(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public FrameRequestVector getFrame_requests() {
        long BurstSpec_frame_requests_get = GcamModuleJNI.BurstSpec_frame_requests_get(this.swigCPtr, this);
        if (BurstSpec_frame_requests_get != 0) {
            return new FrameRequestVector(BurstSpec_frame_requests_get, false);
        }
        return null;
    }

    public void setFrame_requests(FrameRequestVector frameRequestVector) {
        GcamModuleJNI.BurstSpec_frame_requests_set(this.swigCPtr, this, FrameRequestVector.getCPtr(frameRequestVector), frameRequestVector);
    }
}
