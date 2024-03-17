package defpackage;

/* compiled from: PG */
/* renamed from: gfs */
/* loaded from: classes.dex */
public final class gfs implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private gfs(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static gfs a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new gfs(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final gfr a() {
        return new gfr((mcs) this.a.get(), (mcs) this.b.get(), (mch) this.c.get(), ((ggy) this.d).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}