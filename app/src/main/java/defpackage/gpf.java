package defpackage;

/* compiled from: PG */
/* renamed from: gpf */
/* loaded from: classes.dex */
public final class gpf implements rgg {
    private final rhd a;
    private final rhd b;

    private gpf(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gpf a(rhd rhdVar, rhd rhdVar2) {
        return new gpf(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gct gctVar = (gct) this.b.get();
        return (grh) rgk.a(new grh((mcs) this.a.get(), gctVar.b, gctVar.c, gctVar.d), "Cannot return null from a non-@Nullable @Provides method");
    }
}