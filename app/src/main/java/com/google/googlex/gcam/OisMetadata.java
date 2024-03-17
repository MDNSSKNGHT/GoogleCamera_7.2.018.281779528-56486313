package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OisMetadata {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public OisMetadata() {
        this(GcamModuleJNI.new_OisMetadata(), true);
    }

    public static long getCPtr(OisMetadata oisMetadata) {
        if (oisMetadata == null) {
            return 0L;
        }
        return oisMetadata.swigCPtr;
    }

    public OisMetadata(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean Equals(OisMetadata oisMetadata) {
        return GcamModuleJNI.OisMetadata_Equals(this.swigCPtr, this, getCPtr(oisMetadata), oisMetadata);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_OisMetadata(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getLens_optical_stabilization_mode() {
        return GcamModuleJNI.OisMetadata_lens_optical_stabilization_mode_get(this.swigCPtr, this);
    }

    public OisPositionVector getOis_positions() {
        long OisMetadata_ois_positions_get = GcamModuleJNI.OisMetadata_ois_positions_get(this.swigCPtr, this);
        if (OisMetadata_ois_positions_get != 0) {
            return new OisPositionVector(OisMetadata_ois_positions_get, false);
        }
        return null;
    }

    public long getTimestamp_ois_clock_ns() {
        return GcamModuleJNI.OisMetadata_timestamp_ois_clock_ns_get(this.swigCPtr, this);
    }

    public void setLens_optical_stabilization_mode(int i) {
        GcamModuleJNI.OisMetadata_lens_optical_stabilization_mode_set(this.swigCPtr, this, i);
    }

    public void setOis_positions(OisPositionVector oisPositionVector) {
        GcamModuleJNI.OisMetadata_ois_positions_set(this.swigCPtr, this, OisPositionVector.getCPtr(oisPositionVector), oisPositionVector);
    }

    public void setTimestamp_ois_clock_ns(long j) {
        GcamModuleJNI.OisMetadata_timestamp_ois_clock_ns_set(this.swigCPtr, this, j);
    }
}
