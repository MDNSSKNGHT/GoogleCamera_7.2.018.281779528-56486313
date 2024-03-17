package defpackage;

/* compiled from: PG */
/* renamed from: goy */
/* loaded from: classes.dex */
public final class goy implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private goy(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static goy a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new goy(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final goq a() {
        mkf a = ((cnc) this.a).a();
        mba mbaVar = (mba) this.b.get();
        goq goqVar = (goq) this.c.get();
        mch mchVar = (mch) this.d.get();
        mbaVar.a(mdg.a(goqVar.b(), (mjw) mchVar));
        mchVar.a((ggq) goqVar.b().a());
        mbaVar.a(mdg.a(goqVar.a(), new gow(a.a("ImgCptrCmdReady"), goqVar)));
        return (goq) rgk.a(goqVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}