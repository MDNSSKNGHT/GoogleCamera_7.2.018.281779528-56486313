package defpackage;

/* compiled from: PG */
/* renamed from: gfu */
/* loaded from: classes.dex */
public final class gfu implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private gfu(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static gfu a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new gfu(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final gft a() {
        return new gft((mcs) this.a.get(), (mcs) this.b.get(), ((ggy) this.c).a(), (klw) this.d.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}