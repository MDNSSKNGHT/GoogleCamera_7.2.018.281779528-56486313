package defpackage;

/* compiled from: PG */
/* renamed from: dqs */
/* loaded from: classes.dex */
public final class dqs implements rgg {
    private final rhd a;

    private dqs(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqs a(rhd rhdVar) {
        return new dqs(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a;
        cin cinVar = (cin) this.a.get();
        if (lap.f == null || !lsh.a(cinVar)) {
            a = ggt.a();
        } else {
            a = ggt.a(lap.f, (Object) true);
        }
        return (ggq) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}