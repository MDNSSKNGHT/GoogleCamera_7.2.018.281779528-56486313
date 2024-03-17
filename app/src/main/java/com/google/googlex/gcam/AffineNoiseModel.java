package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AffineNoiseModel {
    public boolean swigCMemOwn;
    public long swigCPtr;

    public AffineNoiseModel() {
        this(GcamModuleJNI.new_AffineNoiseModel(), true);
    }

    public static long getCPtr(AffineNoiseModel affineNoiseModel) {
        if (affineNoiseModel == null) {
            return 0L;
        }
        return affineNoiseModel.swigCPtr;
    }

    public AffineNoiseModel(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static void ApplyGain(float f, AffineNoiseModel affineNoiseModel) {
        GcamModuleJNI.AffineNoiseModel_ApplyGain(f, getCPtr(affineNoiseModel), affineNoiseModel);
    }

    public static void ApproxWeightedAverage(FloatVector floatVector, SWIGTYPE_p_std__vectorT_gcam__AffineNoiseModel_const_p_t sWIGTYPE_p_std__vectorT_gcam__AffineNoiseModel_const_p_t, FloatVector floatVector2, AffineNoiseModel affineNoiseModel) {
        GcamModuleJNI.AffineNoiseModel_ApproxWeightedAverage(FloatVector.getCPtr(floatVector), floatVector, SWIGTYPE_p_std__vectorT_gcam__AffineNoiseModel_const_p_t.getCPtr(sWIGTYPE_p_std__vectorT_gcam__AffineNoiseModel_const_p_t), FloatVector.getCPtr(floatVector2), floatVector2, getCPtr(affineNoiseModel), affineNoiseModel);
    }

    public static void AverageNumSamples(float f, AffineNoiseModel affineNoiseModel) {
        GcamModuleJNI.AffineNoiseModel_AverageNumSamples(f, getCPtr(affineNoiseModel), affineNoiseModel);
    }

    public boolean Check() {
        return GcamModuleJNI.AffineNoiseModel_Check(this.swigCPtr, this);
    }

    public boolean Equals(AffineNoiseModel affineNoiseModel) {
        return GcamModuleJNI.AffineNoiseModel_Equals(this.swigCPtr, this, getCPtr(affineNoiseModel), affineNoiseModel);
    }

    public static void WeightedAverage(FloatVector floatVector, AffineNoiseModel affineNoiseModel) {
        GcamModuleJNI.AffineNoiseModel_WeightedAverage(FloatVector.getCPtr(floatVector), floatVector, getCPtr(affineNoiseModel), affineNoiseModel);
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_AffineNoiseModel(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void finalize() {
        delete();
    }

    public float getOffset() {
        return GcamModuleJNI.AffineNoiseModel_offset_get(this.swigCPtr, this);
    }

    public float getScale() {
        return GcamModuleJNI.AffineNoiseModel_scale_get(this.swigCPtr, this);
    }

    public void setOffset(float f) {
        GcamModuleJNI.AffineNoiseModel_offset_set(this.swigCPtr, this, f);
    }

    public void setScale(float f) {
        GcamModuleJNI.AffineNoiseModel_scale_set(this.swigCPtr, this, f);
    }
}
