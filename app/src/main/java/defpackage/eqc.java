package defpackage;

/* compiled from: PG */
/* renamed from: eqc */
/* loaded from: classes.dex */
public final class eqc implements rgg {
    private final rhd a;
    private final rhd b;

    public eqc(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mnz) rgk.a(((mnu) this.a.get()).a(psl.c((mos) this.b.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}