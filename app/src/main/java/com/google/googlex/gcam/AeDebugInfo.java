package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AeDebugInfo {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AeDebugInfo() {
        this(GcamModuleJNI.new_AeDebugInfo(), true);
    }

    public static long getCPtr(AeDebugInfo aeDebugInfo) {
        if (aeDebugInfo == null) {
            return 0L;
        }
        return aeDebugInfo.swigCPtr;
    }

    public AeDebugInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AeDebugInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getExec_time_dual_ae_sec() {
        return GcamModuleJNI.AeDebugInfo_exec_time_dual_ae_sec_get(this.swigCPtr, this);
    }

    public int getNum_faces() {
        return GcamModuleJNI.AeDebugInfo_num_faces_get(this.swigCPtr, this);
    }

    public AeModeResult getOriginal_result() {
        long AeDebugInfo_original_result_get = GcamModuleJNI.AeDebugInfo_original_result_get(this.swigCPtr, this);
        if (AeDebugInfo_original_result_get != 0) {
            return new AeModeResult(AeDebugInfo_original_result_get, false);
        }
        return null;
    }

    public void setExec_time_dual_ae_sec(float f) {
        GcamModuleJNI.AeDebugInfo_exec_time_dual_ae_sec_set(this.swigCPtr, this, f);
    }

    public void setNum_faces(int i) {
        GcamModuleJNI.AeDebugInfo_num_faces_set(this.swigCPtr, this, i);
    }

    public void setOriginal_result(AeModeResult aeModeResult) {
        GcamModuleJNI.AeDebugInfo_original_result_set(this.swigCPtr, this, AeModeResult.getCPtr(aeModeResult), aeModeResult);
    }
}
