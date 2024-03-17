package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: hqw  reason: default package */
/* loaded from: classes.dex */
public final class hqw extends mrx {
    private final myz a;
    private final myo b;
    private final hqu c;
    private final ncz d;
    private String e = "";

    public hqw(myz myzVar, myo myoVar, hqu hquVar, ncz nczVar) {
        this.a = myzVar;
        this.b = myoVar;
        this.c = hquVar;
        this.d = nczVar;
    }

    @Override // defpackage.mrx
    public final synchronized void a(ndr ndrVar) {
        float[] fArr;
        String str;
        if (lap.b != null && (fArr = (float[]) ndrVar.a(lap.b)) != null && fArr.length >= 13) {
            float f = fArr[11];
            float f2 = fArr[12];
            mzc mzcVar = null;
            if (this.d.f && (str = (String) ndrVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID)) != null && !this.e.equals(str)) {
                this.e = str;
                mzcVar = this.a.a(str);
            }
            if (mzcVar == null) {
                this.c.a(this.b, f, f2);
            } else {
                this.c.a(this.a.b(mzcVar), f, f2);
            }
        }
    }
}
