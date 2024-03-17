package defpackage;

/* compiled from: PG */
/* renamed from: hkv */
/* loaded from: classes.dex */
public final class hkv implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hkv(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hkv a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hkv(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pkx) rgk.a(new hkq((pjz) this.a.get(), (pkx) this.c.get(), (pjz) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}