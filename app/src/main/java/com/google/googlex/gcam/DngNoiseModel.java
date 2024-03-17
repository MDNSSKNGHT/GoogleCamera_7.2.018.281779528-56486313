package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DngNoiseModel extends AffineNoiseModel {
    public long swigCPtr;

    public DngNoiseModel() {
        this(GcamModuleJNI.new_DngNoiseModel(), true);
    }

    public static long getCPtr(DngNoiseModel dngNoiseModel) {
        if (dngNoiseModel == null) {
            return 0L;
        }
        return dngNoiseModel.swigCPtr;
    }

    public DngNoiseModel(long j, boolean z) {
        super(GcamModuleJNI.DngNoiseModel_SWIGUpcast(j), z);
        this.swigCPtr = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static long[] cArrayUnwrap(DngNoiseModel[] dngNoiseModelArr) {
        long[] jArr = new long[dngNoiseModelArr.length];
        for (int i = 0; i < dngNoiseModelArr.length; i++) {
            jArr[i] = getCPtr(dngNoiseModelArr[i]);
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static DngNoiseModel[] cArrayWrap(long[] jArr, boolean z) {
        DngNoiseModel[] dngNoiseModelArr = new DngNoiseModel[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            dngNoiseModelArr[i] = new DngNoiseModel(jArr[i], z);
        }
        return dngNoiseModelArr;
    }

    @Override // com.google.googlex.gcam.AffineNoiseModel
    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                GcamModuleJNI.delete_DngNoiseModel(j);
            }
            this.swigCPtr = 0L;
        }
        super.delete();
    }

    @Override // com.google.googlex.gcam.AffineNoiseModel
    protected void finalize() {
        delete();
    }
}
