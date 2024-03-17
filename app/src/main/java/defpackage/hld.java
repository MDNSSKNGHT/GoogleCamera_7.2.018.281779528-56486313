package defpackage;

/* compiled from: PG */
/* renamed from: hld */
/* loaded from: classes.dex */
public final class hld implements rgg {
    private final rhd a;

    public hld(rhd rhdVar) {
        this.a = rhdVar;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a;
        cin cinVar = (cin) this.a.get();
        if (lap.n != null) {
            a = ggt.a(lap.n, (Object) true);
        } else {
            a = ggt.a();
        }
        return (ggq) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}