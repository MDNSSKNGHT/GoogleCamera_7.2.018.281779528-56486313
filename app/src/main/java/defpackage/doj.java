package defpackage;

/* compiled from: PG */
/* renamed from: doj */
/* loaded from: classes.dex */
public final class doj implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private doj(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static doj a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new doj(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final doi a() {
        return new doi((mba) this.a.get(), (dqg) this.b.get(), (mcs) this.c.get(), ((mke) this.d).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}