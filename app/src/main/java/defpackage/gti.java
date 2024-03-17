package defpackage;

/* compiled from: PG */
/* renamed from: gti */
/* loaded from: classes.dex */
public final class gti implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;

    private gti(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
    }

    public static gti a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        return new gti(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gtl gtlVar;
        mdl mdlVar = (mdl) this.a.get();
        myo a = ((ggz) this.b).a();
        mix mixVar = (mix) this.c.get();
        cgt cgtVar = (cgt) this.e.get();
        mba mbaVar = (mba) this.f.get();
        if (((nda) this.d.get()).e()) {
            gtlVar = new gtl(mdlVar, a);
        } else {
            gtlVar = new gtl(mdlVar, a, mixVar);
        }
        mbaVar.a(cgtVar.a(new gtg(gtlVar), qot.INSTANCE));
        return (gtl) rgk.a(gtlVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}