package defpackage;

/* compiled from: PG */
/* renamed from: hrx */
/* loaded from: classes.dex */
public final class hrx implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private hrx(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static hrx a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new hrx(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mnu mnuVar = (mnu) this.b.get();
        pjz pjzVar = (pjz) this.c.get();
        pjz pjzVar2 = (pjz) this.d.get();
        pjz pjzVar3 = (pjz) this.e.get();
        if (!((ipp) this.a.get()).a()) {
            pjzVar2 = pix.a;
        }
        return (pjz) rgk.a(ncp.a(mnuVar, pjzVar, pjzVar2, pjzVar3, pix.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}