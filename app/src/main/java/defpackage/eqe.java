package defpackage;

/* compiled from: PG */
/* renamed from: eqe */
/* loaded from: classes.dex */
public final class eqe implements rgg {
    private final rhd a;

    public eqe(rhd rhdVar) {
        this.a = rhdVar;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        pjz pjzVar = (pjz) this.a.get();
        qdu.c(pjzVar.a());
        return (mos) rgk.a((mos) pjzVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }
}