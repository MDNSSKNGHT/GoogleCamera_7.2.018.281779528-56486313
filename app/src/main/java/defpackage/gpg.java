package defpackage;

/* compiled from: PG */
/* renamed from: gpg */
/* loaded from: classes.dex */
public final class gpg implements rgg {
    private final rhd a;
    private final rhd b;

    private gpg(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gpg a(rhd rhdVar, rhd rhdVar2) {
        return new gpg(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gpd gpdVar = (gpd) this.b.get();
        ((ggw) this.a.get()).a(mrx.a(gpdVar));
        return (mcs) rgk.a(gpdVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}