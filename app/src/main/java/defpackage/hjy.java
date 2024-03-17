package defpackage;

/* compiled from: PG */
/* renamed from: hjy */
/* loaded from: classes.dex */
public final class hjy implements rgg {
    private final rhd a;
    private final rhd b;

    private hjy(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hjy a(rhd rhdVar, rhd rhdVar2) {
        return new hjy(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mnu) rgk.a(((mol) this.a.get()).a((mnx) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}