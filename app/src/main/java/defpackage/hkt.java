package defpackage;

/* compiled from: PG */
/* renamed from: hkt */
/* loaded from: classes.dex */
public final class hkt implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private hkt(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static hkt a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new hkt(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gct gctVar = (gct) this.a.get();
        hqu hquVar = (hqu) this.c.get();
        mba mbaVar = (mba) this.d.get();
        cio cioVar = cim.a;
        ((cin) this.e.get()).b();
        hquVar.d();
        return (bmx) rgk.a(kos.a(new hkn(mbaVar, hquVar, (mnu) this.b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}