package defpackage;

/* compiled from: PG */
/* renamed from: hrw */
/* loaded from: classes.dex */
public final class hrw implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private hrw(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static hrw a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new hrw(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mnu mnuVar = (mnu) this.b.get();
        pjz pjzVar = (pjz) this.c.get();
        pjz pjzVar2 = (pjz) this.d.get();
        if (!((ipp) this.a.get()).a()) {
            pjzVar = pix.a;
        }
        return (pjz) rgk.a(ncp.a(mnuVar, pjzVar2, pjzVar, pix.a, pix.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}