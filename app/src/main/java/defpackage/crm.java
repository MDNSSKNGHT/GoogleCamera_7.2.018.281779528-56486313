package defpackage;

/* compiled from: PG */
/* renamed from: crm */
/* loaded from: classes.dex */
public final class crm implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private crm(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static crm a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new crm(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggw ggwVar = (ggw) this.a.get();
        mba mbaVar = (mba) this.c.get();
        cri criVar = (cri) this.e.get();
        return (bmx) rgk.a(crl.a((cin) this.b.get(), (crd) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}