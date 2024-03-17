package defpackage;

/* compiled from: PG */
/* renamed from: goz */
/* loaded from: classes.dex */
public final class goz implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private goz(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static goz a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new goz(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (gnt) rgk.a(new gov((gev) this.a.get(), (qpp) this.c.get(), ((cnc) this.b).a(), (dtq) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}