package defpackage;

/* compiled from: PG */
/* renamed from: gre  reason: default package */
/* loaded from: classes.dex */
public final class gre implements rgg {
    private final rhd a;
    private final rhd b;

    public gre(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mcs a;
        geq a2 = ((ggy) this.a).a();
        if (((cin) this.b.get()).d(cjb.h)) {
            a = mdg.a(mzf.EXTENDED);
        } else {
            a = mdg.a(a2.h());
        }
        return (mcs) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
