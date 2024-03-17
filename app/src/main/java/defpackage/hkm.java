package defpackage;

/* compiled from: PG */
/* renamed from: hkm  reason: default package */
/* loaded from: classes.dex */
public final class hkm implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;
    private final rhd h;
    private final rhd i;

    private hkm(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
        this.h = rhdVar8;
        this.i = rhdVar9;
    }

    public static hkm a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9) {
        return new hkm(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8, rhdVar9);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object a;
        mba mbaVar = (mba) this.a.get();
        rhd rhdVar = this.b;
        rhd rhdVar2 = this.c;
        rhd rhdVar3 = this.d;
        pjz pjzVar = (pjz) this.e.get();
        pjz pjzVar2 = (pjz) this.f.get();
        pjz pjzVar3 = (pjz) this.g.get();
        rhd rhdVar4 = this.h;
        geq a2 = ((ggy) this.i).a();
        if (!a2.r()) {
            a = ((hlw) rhdVar3).a();
        } else if (a2.N() == mzg.BACK && pjzVar.a() && pjzVar2.a() && pjzVar3.a()) {
            ((jox) pjzVar3.b()).a(pix.a, (pjz) rhdVar4.get());
            ((mnk) pjzVar.b()).a(new hkj(pjzVar2, pjzVar3));
            a = (bas) mbaVar.a(((hmr) rhdVar2).a());
        } else {
            a = ((hlq) rhdVar).a();
        }
        return (bas) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
