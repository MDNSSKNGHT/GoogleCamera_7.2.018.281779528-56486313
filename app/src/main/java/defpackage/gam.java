package defpackage;

/* compiled from: PG */
/* renamed from: gam */
/* loaded from: classes.dex */
public final class gam implements rgg {
    private final rhd a;
    private final rhd b;

    private gam(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gam a(rhd rhdVar, rhd rhdVar2) {
        return new gam(rhdVar, rhdVar2);
    }

    public final pjz a() {
        Object obj;
        pjz pjzVar = (pjz) this.a.get();
        pjz pjzVar2 = (pjz) this.b.get();
        if (!pjzVar2.a() || !((Boolean) pjzVar2.b()).booleanValue() || !pjzVar.a()) {
            obj = pix.a;
        } else {
            obj = pjz.b((gas) ((rhd) pjzVar.b()).get());
        }
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}