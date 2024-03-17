package defpackage;

/* compiled from: PG */
/* renamed from: hto */
/* loaded from: classes.dex */
public final class hto implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hto(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hto a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hto(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        geq a = ((ggy) this.a).a();
        return (mou) rgk.a(htd.a(a.M(), ((gtb) this.c.get()).a, ((ggh) this.b.get()).a, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}