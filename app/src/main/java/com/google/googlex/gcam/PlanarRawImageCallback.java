package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PlanarRawImageCallback {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public PlanarRawImageCallback() {
        this(GcamModuleJNI.new_PlanarRawImageCallback(), true);
        GcamModuleJNI.PlanarRawImageCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
    }

    public static long getCPtr(PlanarRawImageCallback planarRawImageCallback) {
        if (planarRawImageCallback == null) {
            return 0L;
        }
        return planarRawImageCallback.swigCPtr;
    }

    public PlanarRawImageCallback(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public void ImageReady(int i, ExifMetadata exifMetadata, SWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t sWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t) {
        GcamModuleJNI.PlanarRawImageCallback_ImageReady(this.swigCPtr, this, i, ExifMetadata.getCPtr(exifMetadata), exifMetadata, SWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t.getCPtr(sWIGTYPE_p_gcam__ReadWriteTImageViewT_unsigned_short_gcam__kChannelContiguous_t));
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_PlanarRawImageCallback(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        GcamModuleJNI.PlanarRawImageCallback_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        GcamModuleJNI.PlanarRawImageCallback_change_ownership(this, this.swigCPtr, true);
    }
}
