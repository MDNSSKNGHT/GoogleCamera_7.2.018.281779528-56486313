package defpackage;

/* compiled from: PG */
/* renamed from: hta */
/* loaded from: classes.dex */
public final class hta implements rgg {
    private final rhd a;
    private final rhd b;

    private hta(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hta a(rhd rhdVar, rhd rhdVar2) {
        return new hta(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new hsw((hju) this.a.get(), (mba) this.b.get());
    }
}