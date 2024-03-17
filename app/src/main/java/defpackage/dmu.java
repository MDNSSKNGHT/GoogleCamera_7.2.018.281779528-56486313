package defpackage;

/* compiled from: PG */
/* renamed from: dmu */
/* loaded from: classes.dex */
public final class dmu implements rgg {
    private final rhd a;
    private final rhd b;

    private dmu(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dmu a(rhd rhdVar, rhd rhdVar2) {
        return new dmu(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        cin cinVar = (cin) this.b.get();
        return (Integer) rgk.a((cinVar.d(cit.R) && ((myo) this.a.get()).N() == mzg.BACK) ? Integer.valueOf(cinVar.e(cit.S)) : -1, "Cannot return null from a non-@Nullable @Provides method");
    }
}