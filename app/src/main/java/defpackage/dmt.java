package defpackage;

/* compiled from: PG */
/* renamed from: dmt */
/* loaded from: classes.dex */
public final class dmt implements rgg {
    private final rhd a;
    private final rhd b;

    private dmt(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dmt a(rhd rhdVar, rhd rhdVar2) {
        return new dmt(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object ebfVar;
        Integer num = (Integer) this.a.get();
        gtb gtbVar = (gtb) this.b.get();
        if (num.intValue() < 0) {
            ebfVar = new ebc();
        } else {
            ebfVar = new ebf(num.intValue(), gtbVar.a());
        }
        return (ebe) rgk.a(ebfVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}