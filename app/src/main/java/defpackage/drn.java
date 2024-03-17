package defpackage;

/* compiled from: PG */
/* renamed from: drn */
/* loaded from: classes.dex */
public final class drn implements rgg {
    private final rhd a;
    private final rhd b;

    private drn(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static drn a(rhd rhdVar, rhd rhdVar2) {
        return new drn(rhdVar, rhdVar2);
    }

    public final drm a() {
        return new drm((knz) this.a.get(), ((mke) this.b).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}