package defpackage;

/* compiled from: PG */
/* renamed from: jos */
/* loaded from: classes.dex */
public final class jos implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;

    private jos(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
    }

    public static jos a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        return new jos(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        nak nakVar = (nak) this.a.get();
        eaz eazVar = (eaz) this.b.get();
        ebe ebeVar = (ebe) this.c.get();
        geq a = ((ggy) this.d).a();
        gtb gtbVar = (gtb) this.e.get();
        mba mbaVar = (mba) this.f.get();
        return (dnf) rgk.a(new dnf(nakVar, eazVar, ebeVar, a, gtbVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}