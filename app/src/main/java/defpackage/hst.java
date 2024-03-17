package defpackage;

/* compiled from: PG */
/* renamed from: hst */
/* loaded from: classes.dex */
public final class hst implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private hst(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static hst a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new hst(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(new hsq(rgf.b(this.a), (mba) this.c.get(), (mnu) this.b.get(), (hqu) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}