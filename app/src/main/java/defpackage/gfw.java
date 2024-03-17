package defpackage;

/* compiled from: PG */
/* renamed from: gfw */
/* loaded from: classes.dex */
public final class gfw implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private gfw(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static gfw a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new gfw(rhdVar, rhdVar2, rhdVar3);
    }

    public final gfv a() {
        return new gfv(((ggy) this.a).a(), (grh) this.b.get(), (mcs) this.c.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}