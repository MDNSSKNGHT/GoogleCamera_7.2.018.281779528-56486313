package defpackage;

/* compiled from: PG */
/* renamed from: gqi  reason: default package */
/* loaded from: classes.dex */
public final class gqi implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;
    private final rhd h;

    private gqi(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
        this.h = rhdVar8;
    }

    public static gqi a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8) {
        return new gqi(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mkf a = ((cnc) this.a).a();
        mcs mcsVar = (mcs) this.b.get();
        hqa a2 = ((hqb) this.c).a();
        hor a3 = ((hos) this.d).a();
        hkh a4 = ((hki) this.f).a();
        hkw a5 = ((hkx) this.g).a();
        psl a6 = ggt.a(((cin) this.h.get()).d(cit.M));
        gon gonVar = new gon(a3.a(a5, a4), 5, false);
        gon gonVar2 = new gon(a3.a(a5, (hkd) this.e.get()), 6, true);
        gon gonVar3 = new gon(a2.a(a6, gonVar), 7, false);
        return (goq) rgk.a(new goh(a, new goe(mcsVar, gonVar3, gonVar2, gonVar3, gonVar2, gonVar3)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
