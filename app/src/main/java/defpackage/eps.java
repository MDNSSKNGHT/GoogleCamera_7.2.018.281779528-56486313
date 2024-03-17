package defpackage;

/* compiled from: PG */
/* renamed from: eps  reason: default package */
/* loaded from: classes.dex */
public final class eps implements epr {
    private static final String a = liu.a("Pck1CameraSelector");
    private final epq b;
    private final mkn c;

    public eps(epq epqVar, mkn mknVar) {
        this.b = epqVar;
        this.c = mknVar;
    }

    @Override // defpackage.epr
    public final gcn a(geq geqVar, epc epcVar, grb grbVar) {
        qdu.d(geqVar);
        qdu.d(epcVar);
        qdu.d(grbVar);
        this.c.b("OneCameraDependencies#new");
        ggx ggxVar = new ggx(geqVar);
        try {
            gtb a2 = gtb.a(geqVar, grbVar.a, 35);
            String sb = "Selected picture configuration: " + a2;
            liu.d(a);
            epv a3 = this.b.a(ggxVar, epcVar, new gtc(a2));
            this.c.a();
            klw klwVar = epcVar.g;
            String sb2 = "Selecting OneCamera for Application Mode: " + klwVar;
            liu.b(a);
            if (klwVar == klw.PORTRAIT) {
                return a3.a();
            }
            if (klwVar == klw.LONG_EXPOSURE) {
                return a3.b();
            }
            if (klwVar == klw.MOTION_BLUR) {
                return a3.c();
            }
            if (klwVar == klw.IMAGE_INTENT) {
                return a3.d();
            }
            return a3.e();
        } catch (gsz e) {
            throw new IllegalStateException("Unable to access OneCamera.", e);
        }
    }
}
