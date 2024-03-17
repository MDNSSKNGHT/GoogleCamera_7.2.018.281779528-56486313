package defpackage;

/* compiled from: PG */
/* renamed from: gsd */
/* loaded from: classes.dex */
public final class gsd implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;

    private gsd(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
    }

    public static gsd a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        return new gsd(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gsc(((ggy) this.a).a(), (grh) this.b.get(), (mcs) this.c.get(), (mcs) this.d.get(), (mcs) this.e.get(), (dsv) this.f.get());
    }
}