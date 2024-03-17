package defpackage;

/* compiled from: PG */
/* renamed from: dqt */
/* loaded from: classes.dex */
public final class dqt implements rgg {
    private final rhd a;

    private dqt(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqt a(rhd rhdVar) {
        return new dqt(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a;
        cin cinVar = (cin) this.a.get();
        if (lap.e == null || !lsh.a(cinVar)) {
            a = ggt.a();
        } else {
            a = ggt.a(lap.e, (Object) true);
        }
        return (ggq) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}