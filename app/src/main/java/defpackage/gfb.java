package defpackage;

/* compiled from: PG */
/* renamed from: gfb */
/* loaded from: classes.dex */
public final class gfb implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private gfb(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static gfb a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        return new gfb(rhdVar, rhdVar2, rhdVar4, rhdVar5, rhdVar6);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gev gevVar = new gev(((cnc) this.c).a(), (mkn) this.d.get(), (mbe) this.e.get());
        ((mba) this.a.get()).a(new gew(gevVar));
        ((mba) this.b.get()).a(new gex(gevVar));
        return (gev) rgk.a(gevVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}