package defpackage;

import android.view.Surface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: bum  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bum implements qok {
    private final bup a;
    private final cak b;
    private final qpp c;

    public bum(bup bupVar, cak cakVar, qpp qppVar) {
        this.a = bupVar;
        this.b = cakVar;
        this.c = qppVar;
    }

    @Override // defpackage.qok
    public qpp a() throws ExecutionException {
        bup bupVar = this.a;
        cak cakVar = this.b;
        Surface surface = (Surface) rgk.b(this.c);
        byh byhVar = bupVar.A;
        bupVar.e.b(bup.a.concat("#createCaptureSession"));
        mel melVar = bupVar.u;
        mzg o = cakVar.o();
        geq geqVar = cakVar.b().a;
        meo c = cakVar.c();
        mer d = cakVar.d();
        boolean z = false;
        mej mejVar = new mej((byte) 0);
        mejVar.d(false);
        mejVar.b(false);
        mejVar.a(false);
        mejVar.c(false);
        mejVar.f(false);
        mejVar.e(false);
        mejVar.d(!c.c());
        bwe bweVar = (bwe) melVar;
        mejVar.b(bweVar.a.d(cig.r) || o == mzg.BACK);
        mejVar.a(bweVar.a.d(cig.h) && o == mzg.FRONT || bweVar.a.d(cig.i));
        mejVar.c(geqVar.z() && bweVar.b.a());
        mejVar.f(bweVar.b.b());
        if (d != mer.RES_2160P && ((bweVar.a.d(cig.p) && c == meo.FPS_30) || (bweVar.a.d(cig.q) && c == meo.FPS_AUTO))) {
            z = true;
        }
        mejVar.e(z);
        String str = mejVar.a == null ? " useContinuousAutoFocusOnDuringRecording" : "";
        if (mejVar.b == null) {
            str = str.concat(" shouldUnlockAfAeWithSceneChange");
        }
        if (mejVar.c == null) {
            str = str.concat(" shouldDetectFace");
        }
        if (mejVar.d == null) {
            str = str.concat(" shouldVideoStabilizationOn");
        }
        if (mejVar.e == null) {
            str = str.concat(" useOpticalStabilization");
        }
        if (mejVar.f == null) {
            str = str.concat(" useGoogLlv");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() == 0 ? "Missing required properties:" : "Missing required properties:".concat(str));
        }
        mei meiVar = new mei(mejVar.a, mejVar.b, mejVar.c, mejVar.d, mejVar.e, mejVar.f);
        Surface surface2 = (Surface) byhVar.a().e().b();
        bvz bvzVar = bupVar.I;
        if (bupVar.D.g() == klw.VIDEO) {
            bvzVar.a.b();
        }
        pix pixVar = pix.a;
        buv buvVar = (buv) bupVar.C;
        pjz b = pjz.b(new buu(buv.a((cca) buvVar.a.get(), 1), buv.a((byh) buvVar.b.get(), 2), buv.a((caz) buvVar.c.get(), 3), buv.a((ccr) buvVar.d.get(), 4), buv.a((ccn) buvVar.e.get(), 5), buv.a((bvv) buvVar.f.get(), 6), buv.a(cakVar, 7), buv.a(meiVar, 8), buv.a(surface, 9), buv.a(surface2, 10)));
        bupVar.e.a();
        return rgk.b(b);
    }
}
