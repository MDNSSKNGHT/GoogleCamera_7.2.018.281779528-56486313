package defpackage;

/* compiled from: PG */
/* renamed from: hth */
/* loaded from: classes.dex */
public final class hth implements rgg {
    private final rhd a;
    private final rhd b;

    private hth(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hth a(rhd rhdVar, rhd rhdVar2) {
        return new hth(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        geq a = ((ggy) this.a).a();
        int i = ((ggh) this.b.get()).b;
        mzu a2 = htd.a(a, 37, 38, 32);
        qdu.d(a2);
        return (mou) rgk.a(htd.a(a.M(), a2, i, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}