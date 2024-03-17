package defpackage;

/* compiled from: PG */
/* renamed from: mke */
/* loaded from: classes.dex */
public final class mke implements rgg {
    private final rhd a;

    public mke(rhd rhdVar) {
        this.a = rhdVar;
    }

    public final mkg a() {
        return a((pjz) this.a.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public static mkg a(pjz pjzVar) {
        Object a;
        if (pjzVar.a()) {
            a = (mkg) pjzVar.b();
        } else {
            a = new mkc("pck").a("pck");
        }
        return (mkg) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}