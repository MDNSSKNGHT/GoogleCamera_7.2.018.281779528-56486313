package defpackage;

/* compiled from: PG */
/* renamed from: hlq */
/* loaded from: classes.dex */
public final class hlq implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;

    private hlq(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
    }

    public static hlq a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        return new hlq(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7);
    }

    public final hlp a() {
        return new hlp((mnu) this.a.get(), ((gdx) this.b).a(), (bcx) this.c.get(), (gct) this.d.get(), ((bcu) this.e).a(), (hqu) this.f.get(), (mcs) this.g.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}