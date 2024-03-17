package defpackage;

/* compiled from: PG */
/* renamed from: dqr */
/* loaded from: classes.dex */
public final class dqr implements rgg {
    private final rhd a;
    private final rhd b;

    private dqr(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dqr a(rhd rhdVar, rhd rhdVar2) {
        return new dqr(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mcs a;
        mcs mcsVar = (mcs) this.b.get();
        if (!((cin) this.a.get()).d(ciu.B) || lap.m == null) {
            a = mdg.a(ggt.a());
        } else {
            a = ggt.a(lap.m, mcsVar);
        }
        return (mcs) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}