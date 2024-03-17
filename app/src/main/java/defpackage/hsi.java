package defpackage;

/* compiled from: PG */
/* renamed from: hsi */
/* loaded from: classes.dex */
public final class hsi implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hsi(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hsi a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hsi(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(hsh.a((hju) this.a.get(), (mdl) this.b.get(), (neg) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}