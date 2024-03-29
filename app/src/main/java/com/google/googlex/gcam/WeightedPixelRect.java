package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class WeightedPixelRect {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public WeightedPixelRect() {
        this(GcamModuleJNI.new_WeightedPixelRect(), true);
    }

    public static long getCPtr(WeightedPixelRect weightedPixelRect) {
        if (weightedPixelRect == null) {
            return 0L;
        }
        return weightedPixelRect.swigCPtr;
    }

    public WeightedPixelRect(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public boolean DeserializeFromString(SWIGTYPE_p_p_char sWIGTYPE_p_p_char) {
        return GcamModuleJNI.WeightedPixelRect_DeserializeFromString(this.swigCPtr, this, SWIGTYPE_p_p_char.getCPtr(sWIGTYPE_p_p_char));
    }

    public boolean Equals(WeightedPixelRect weightedPixelRect) {
        return GcamModuleJNI.WeightedPixelRect_Equals(this.swigCPtr, this, getCPtr(weightedPixelRect), weightedPixelRect);
    }

    public void Print(int i, int i2) {
        GcamModuleJNI.WeightedPixelRect_Print(this.swigCPtr, this, i, i2);
    }

    public void SerializeToString(String str, int i) {
        GcamModuleJNI.WeightedPixelRect_SerializeToString(this.swigCPtr, this, str, i);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_WeightedPixelRect(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public PixelRect getRect() {
        long WeightedPixelRect_rect_get = GcamModuleJNI.WeightedPixelRect_rect_get(this.swigCPtr, this);
        if (WeightedPixelRect_rect_get != 0) {
            return new PixelRect(WeightedPixelRect_rect_get, false);
        }
        return null;
    }

    public float getWeight() {
        return GcamModuleJNI.WeightedPixelRect_weight_get(this.swigCPtr, this);
    }

    public void setRect(PixelRect pixelRect) {
        GcamModuleJNI.WeightedPixelRect_rect_set(this.swigCPtr, this, PixelRect.getCPtr(pixelRect), pixelRect);
    }

    public void setWeight(float f) {
        GcamModuleJNI.WeightedPixelRect_weight_set(this.swigCPtr, this, f);
    }
}
