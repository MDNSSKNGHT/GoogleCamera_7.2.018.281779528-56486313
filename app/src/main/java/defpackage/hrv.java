package defpackage;

/* compiled from: PG */
/* renamed from: hrv */
/* loaded from: classes.dex */
public final class hrv implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private hrv(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static hrv a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new hrv(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pjz) rgk.a(ncp.a((mnu) this.a.get(), (pjz) this.b.get(), pix.a, (pjz) this.c.get(), (pjz) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}