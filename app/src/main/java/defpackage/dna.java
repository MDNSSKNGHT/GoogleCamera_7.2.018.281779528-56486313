package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import android.util.Log;

/* compiled from: PG */
/* renamed from: dna  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dna implements Runnable {
    private final dnb a;
    private final ndr b;

    public dna(dnb dnbVar, ndr ndrVar) {
        this.a = dnbVar;
        this.b = ndrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [ndn] */
    @Override // java.lang.Runnable
    public final void run() {
        dnb dnbVar = this.a;
        ndr ndrVar = this.b;
        String str = (String) ndrVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        ndr ndrVar2 = str != null ? (ndr) (ndn) ndrVar.e().get(str) : null;
        if (ndrVar2 == null) {
            ndrVar2 = ndrVar;
        }
        int i = dnbVar.b;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (CaptureResult.STATISTICS_OIS_SAMPLES == null) {
                        Log.e("OisListener", "Null OIS key (version: 2)");
                    } else {
                        OisSample[] oisSampleArr = (OisSample[]) ndrVar2.a(CaptureResult.STATISTICS_OIS_SAMPLES);
                        if (oisSampleArr == null) {
                            Log.e("OisListener", "Null pointer for OIS data. OIS API version: 2");
                        } else {
                            int length = oisSampleArr.length;
                            while (i2 < length) {
                                OisSample oisSample = oisSampleArr[i2];
                                dnbVar.a.a(oisSample.getTimestamp(), oisSample.getXshift(), oisSample.getYshift());
                                i2++;
                            }
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("Invalid OIS API version: ");
                    sb.append(i);
                    Log.e("OisListener", sb.toString());
                }
            } else if (lan.g == null || lan.h == null) {
                Log.e("OisListener", "Null OIS keys (version: 1)");
            } else {
                long[] jArr = (long[]) ndrVar2.a(lan.d);
                float[] fArr = (float[]) ndrVar2.a(lan.g);
                float[] fArr2 = (float[]) ndrVar2.a(lan.h);
                if (jArr == null || fArr == null || fArr2 == null) {
                    Log.e("OisListener", "Null pointer for OIS data. OIS API version: 1");
                } else {
                    while (i2 < jArr.length) {
                        dnbVar.a.a(jArr[i2], fArr[i2], fArr2[i2]);
                        i2++;
                    }
                }
            }
        } else if (lan.e == null || lan.f == null) {
            Log.e("OisListener", "Null OIS keys (version: 0)");
        } else {
            long[] jArr2 = (long[]) ndrVar2.a(lan.d);
            int[] iArr = (int[]) ndrVar2.a(lan.e);
            int[] iArr2 = (int[]) ndrVar2.a(lan.f);
            if (jArr2 == null || iArr == null || iArr2 == null) {
                Log.e("OisListener", "Null pointer for OIS data. OIS API version: 0");
            } else {
                while (i2 < jArr2.length) {
                    dnbVar.a.a(jArr2[i2], iArr[i2], iArr2[i2]);
                    i2++;
                }
            }
        }
        for (mrx mrxVar : dnbVar.c) {
            mrxVar.a(ndrVar);
        }
    }
}
