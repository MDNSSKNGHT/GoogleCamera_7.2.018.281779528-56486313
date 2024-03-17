package defpackage;

/* compiled from: PG */
/* renamed from: gga */
/* loaded from: classes.dex */
public final class gga implements rgg {
    private final rhd a;
    private final rhd b;

    private gga(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gga a(rhd rhdVar, rhd rhdVar2) {
        return new gga(rhdVar, rhdVar2);
    }

    public final gfz a() {
        geq a = ((ggy) this.a).a();
        gtb gtbVar = (gtb) this.b.get();
        return new gfz(a);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}