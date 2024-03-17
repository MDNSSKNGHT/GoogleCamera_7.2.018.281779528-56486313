package defpackage;

/* compiled from: PG */
/* renamed from: gtj */
/* loaded from: classes.dex */
public final class gtj implements rgg {
    private final rhd a;
    private final rhd b;

    private gtj(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gtj a(rhd rhdVar, rhd rhdVar2) {
        return new gtj(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ciq ciqVar = cit.a;
        ((cin) this.a.get()).b();
        return (mcs) rgk.a(mdg.a((mcs) this.b.get(), gth.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}