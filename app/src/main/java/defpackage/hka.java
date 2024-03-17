package defpackage;

/* compiled from: PG */
/* renamed from: hka */
/* loaded from: classes.dex */
public final class hka implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hka(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hka a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hka(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        mba mbaVar = (mba) this.a.get();
        mnu mnuVar = (mnu) this.b.get();
        pjz pjzVar = (pjz) this.c.get();
        if (pjzVar.a()) {
            obj = pjz.b((mnk) mbaVar.a(mnuVar.a(mnuVar.a((mos) pjzVar.b(), pvi.a), 2)));
        } else {
            obj = pix.a;
        }
        return (pjz) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}