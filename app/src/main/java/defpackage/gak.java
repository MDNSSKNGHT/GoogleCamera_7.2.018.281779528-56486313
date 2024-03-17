package defpackage;

/* compiled from: PG */
/* renamed from: gak */
/* loaded from: classes.dex */
public final class gak implements rgg {
    private final rhd a;
    private final rhd b;

    private gak(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gak a(rhd rhdVar, rhd rhdVar2) {
        return new gak(rhdVar, rhdVar2);
    }

    public final pjz a() {
        Object b;
        cqo a = ((cqp) this.a).a();
        pjz pjzVar = (pjz) this.b.get();
        if (a.d()) {
            b = pjzVar.a() ? pjz.b((gag) ((rhd) pjzVar.b()).get()) : pix.a;
        } else {
            b = pix.a;
        }
        return (pjz) rgk.a(b, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}