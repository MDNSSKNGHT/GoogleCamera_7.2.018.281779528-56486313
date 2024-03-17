package defpackage;

/* compiled from: PG */
/* renamed from: hkl */
/* loaded from: classes.dex */
public final class hkl implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private hkl(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static hkl a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new hkl(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        nak nakVar = (nak) this.a.get();
        eaz eazVar = (eaz) this.b.get();
        geq a = ((ggy) this.c).a();
        gtb gtbVar = (gtb) this.d.get();
        mba mbaVar = (mba) this.e.get();
        return (dnf) rgk.a(new dnf(nakVar, eazVar, new ebc(), a, gtbVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}