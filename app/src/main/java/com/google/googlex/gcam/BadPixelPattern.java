package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BadPixelPattern {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public BadPixelPattern() {
        this(GcamModuleJNI.new_BadPixelPattern(), true);
    }

    public static long getCPtr(BadPixelPattern badPixelPattern) {
        if (badPixelPattern == null) {
            return 0L;
        }
        return badPixelPattern.swigCPtr;
    }

    public BadPixelPattern(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_BadPixelPattern(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public int getHeight() {
        return GcamModuleJNI.BadPixelPattern_height_get(this.swigCPtr, this);
    }

    public SWIGTYPE_p_std__vectorT_gcam__BadPixel_t getOffsets() {
        long BadPixelPattern_offsets_get = GcamModuleJNI.BadPixelPattern_offsets_get(this.swigCPtr, this);
        if (BadPixelPattern_offsets_get != 0) {
            return new SWIGTYPE_p_std__vectorT_gcam__BadPixel_t(BadPixelPattern_offsets_get, false);
        }
        return null;
    }

    public int getWidth() {
        return GcamModuleJNI.BadPixelPattern_width_get(this.swigCPtr, this);
    }

    public void setHeight(int i) {
        GcamModuleJNI.BadPixelPattern_height_set(this.swigCPtr, this, i);
    }

    public void setOffsets(SWIGTYPE_p_std__vectorT_gcam__BadPixel_t sWIGTYPE_p_std__vectorT_gcam__BadPixel_t) {
        GcamModuleJNI.BadPixelPattern_offsets_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_gcam__BadPixel_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__BadPixel_t));
    }

    public void setWidth(int i) {
        GcamModuleJNI.BadPixelPattern_width_set(this.swigCPtr, this, i);
    }
}
