package defpackage;

/* compiled from: PG */
/* renamed from: doc */
/* loaded from: classes.dex */
public final class doc implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;

    private doc(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
    }

    public static doc a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        return new doc(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7);
    }

    public final dob a() {
        return new dob((mcs) this.a.get(), (mcs) this.b.get(), (mdl) this.c.get(), (mcs) this.d.get(), (cin) this.e.get(), (grh) this.f.get(), ((rgn) this.g).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}