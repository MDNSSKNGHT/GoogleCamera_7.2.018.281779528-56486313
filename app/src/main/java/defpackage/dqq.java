package defpackage;

/* compiled from: PG */
/* renamed from: dqq */
/* loaded from: classes.dex */
public final class dqq implements rgg {
    private final rhd a;
    private final rhd b;

    private dqq(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dqq a(rhd rhdVar, rhd rhdVar2) {
        return new dqq(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        pjz pjzVar = (pjz) this.a.get();
        mba mbaVar = (mba) this.b.get();
        if (pjzVar.a()) {
            naj a = ((nak) pjzVar.b()).a("HdrPlusSession");
            if (a != null) {
                mjz.a(a);
            }
            if (a != null) {
                mbaVar.a(new dql(a));
                obj = pjz.b(a);
                return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
            }
        }
        obj = pix.a;
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}