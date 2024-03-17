package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: bca  reason: default package */
/* loaded from: classes.dex */
public final class bca extends mrx {
    public final mzg a;
    public final bbz b;
    public float c = 0.0f;
    public ils d = ils.ON;
    private final mkg e;
    private final mdl f;
    private final bci g;

    public bca(mkg mkgVar, mba mbaVar, geq geqVar, dnf dnfVar, mdl mdlVar, mdl mdlVar2, fad fadVar, cin cinVar) {
        this.e = mkgVar.a("LowLightAfLock");
        mzg N = geqVar.N();
        this.a = N;
        this.f = N == mzg.FRONT ? mdlVar2 : mdlVar;
        this.b = new bbz(ciy.a(cinVar, this.a));
        mkg mkgVar2 = this.e;
        String valueOf = String.valueOf(this.a.name());
        bci bciVar = (bci) mbaVar.a(new bci(geqVar, dnfVar, mkgVar2, valueOf.length() == 0 ? new String("cuttlef-af-") : "cuttlef-af-".concat(valueOf)));
        this.g = bciVar;
        bciVar.a();
        mbaVar.a(this.f.a(new bby(this, fadVar), qot.INSTANCE));
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        this.c = ((Float) qdu.b((Float) ndrVar.a(CaptureResult.LENS_FOCUS_DISTANCE))).floatValue();
        this.g.a(ndrVar);
        bbz bbzVar = this.b;
        float longValue = ((float) ((Long) qdu.b((Long) ndrVar.a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue()) * 1.0E-6f * ((Integer) qdu.b((Integer) ndrVar.a(CaptureResult.SENSOR_SENSITIVITY))).intValue() * ((Integer) qdu.b((Integer) ndrVar.a(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST))).intValue();
        bbzVar.b = longValue;
        if (longValue < bbzVar.a) {
            bbzVar.c = 0;
        } else {
            int min = Math.min(bbzVar.c + 1, 5);
            bbzVar.c = min;
            if (min >= 5 && !this.g.b()) {
                if (((Integer) this.f.a()).intValue() == ils.ON.f && ibj.a(((Integer) qdu.b((Integer) ndrVar.a(CaptureResult.CONTROL_AF_STATE))).intValue()) == ibj.PASSIVE_UNFOCUSED) {
                    this.e.d("Locking AF");
                    this.f.a(Integer.valueOf(ils.ON_LOCKED.f));
                    return;
                }
                return;
            }
        }
        if (((Integer) this.f.a()).intValue() == ils.ON_LOCKED.f) {
            this.e.d("Unlocking AF");
            this.f.a(Integer.valueOf(ils.ON.f));
        }
    }
}