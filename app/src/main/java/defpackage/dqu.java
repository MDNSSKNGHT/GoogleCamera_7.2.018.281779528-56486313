package defpackage;

/* compiled from: PG */
/* renamed from: dqu */
/* loaded from: classes.dex */
public final class dqu implements rgg {
    private final rhd a;

    private dqu(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqu a(rhd rhdVar) {
        return new dqu(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ggq a;
        cin cinVar = (cin) this.a.get();
        if (lao.s == null || !lsh.a(cinVar)) {
            a = ggt.a();
        } else {
            a = ggt.a(lao.s, (Object) true);
        }
        return (ggq) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}