package defpackage;

/* compiled from: PG */
/* renamed from: gsa */
/* loaded from: classes.dex */
public final class gsa implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private gsa(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static gsa a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new gsa(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mba mbaVar = (mba) this.a.get();
        dqg dqgVar = (dqg) this.b.get();
        drf drfVar = (drf) this.d.get();
        dob a = ((doc) this.e).a();
        boolean z = false;
        if (((dop) this.c.get()).a() && drfVar == drf.LONG_EXPOSURE) {
            z = true;
        }
        return (gsb) rgk.a((gsb) mbaVar.a(new grm(dqgVar, a, z)), "Cannot return null from a non-@Nullable @Provides method");
    }
}