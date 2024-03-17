package defpackage;

/* compiled from: PG */
/* renamed from: dqn */
/* loaded from: classes.dex */
public final class dqn implements rgg {
    private final rhd a;

    private dqn(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqn a(rhd rhdVar) {
        return new dqn(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a;
        cin cinVar = (cin) this.a.get();
        if (lap.g == null || !lsh.a(cinVar)) {
            a = ggt.a();
        } else {
            a = ggt.a(lap.g, (Object) true);
        }
        return (ggq) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}