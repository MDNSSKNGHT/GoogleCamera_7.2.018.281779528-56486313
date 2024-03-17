package defpackage;

/* compiled from: PG */
/* renamed from: hmz  reason: default package */
/* loaded from: classes.dex */
final class hmz implements ges {
    private static final String a = liu.a("AdviceFrmRtrivlCmd");
    private final qpp b;
    private final mnu c;
    private final pjz d;
    private final pjz e;
    private final bgl f;

    public hmz(qpp qppVar, mnu mnuVar, pjz pjzVar, pjz pjzVar2, bgl bglVar) {
        this.b = qppVar;
        this.c = mnuVar;
        this.d = pjzVar;
        this.e = pjzVar2;
        this.f = bglVar;
    }

    @Override // defpackage.ges
    public final void a() {
        if (!this.d.a() || !this.e.a() || !((mnz) this.d.b()).a().contains(this.e.b())) {
            return;
        }
        mnz mnzVar = (mnz) this.d.b();
        mos mosVar = (mos) this.e.b();
        try {
            mnh b = this.c.b(mnzVar);
            osu.c(b);
            neb a2 = b.a(mosVar);
            bgw bgwVar = (bgw) maw.a(this.b);
            if (a2 != null) {
                if (bgwVar == null) {
                    a2.close();
                } else {
                    hzb a3 = hzc.a(a2);
                    a3.a(b.c());
                    a3.a((Integer) this.f.b().a());
                    bgwVar.a(a3.a());
                }
            }
            if (b != null) {
                b.close();
            }
        } catch (InterruptedException e) {
            liu.b(a, "Unable to retrieve frame", e);
        }
    }
}