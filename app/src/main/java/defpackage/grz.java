package defpackage;

/* compiled from: PG */
/* renamed from: grz */
/* loaded from: classes.dex */
public final class grz implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private grz(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static grz a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new grz(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final mcs a() {
        mcs mcsVar;
        cin cinVar = (cin) this.a.get();
        jfb a = ((jff) this.b).a();
        klw klwVar = (klw) this.c.get();
        mba mbaVar = (mba) this.d.get();
        if (klwVar != klw.LONG_EXPOSURE) {
            mcsVar = mdg.a((Integer) cinVar.a(cjb.e).b());
        } else {
            int intValue = ((Integer) cinVar.a(cjb.f).b()).intValue();
            int intValue2 = ((Integer) cinVar.a(cjb.g).b()).intValue();
            mch mchVar = new mch(Integer.valueOf(intValue));
            mbaVar.a(a.a(new grv(intValue, intValue2, mchVar)));
            mcsVar = mchVar;
        }
        return (mcs) rgk.a(mcsVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}