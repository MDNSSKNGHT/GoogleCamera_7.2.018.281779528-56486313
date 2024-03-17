package defpackage;

/* compiled from: PG */
/* renamed from: dqw */
/* loaded from: classes.dex */
public final class dqw implements rgg {
    private final rhd a;

    private dqw(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqw a(rhd rhdVar) {
        return new dqw(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a;
        cin cinVar = (cin) this.a.get();
        if (lap.a == null || !lsh.a(cinVar)) {
            a = ggt.a();
        } else {
            a = ggt.a(lap.a, (Object) true);
        }
        return (ggq) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}