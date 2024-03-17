package defpackage;

/* compiled from: PG */
/* renamed from: grx */
/* loaded from: classes.dex */
public final class grx implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;

    private grx(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
    }

    public static grx a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        return new grx(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mnk a;
        mba mbaVar = (mba) this.a.get();
        hoa a2 = ((hob) this.b).a();
        mnu mnuVar = (mnu) this.c.get();
        pjz pjzVar = (pjz) this.d.get();
        pjz pjzVar2 = (pjz) this.e.get();
        pjz pjzVar3 = (pjz) this.f.get();
        if (pjzVar.a()) {
            a = mnuVar.a(mnuVar.a((mos) pjzVar.b()), 1);
        } else if (!pjzVar2.a() || !pjzVar3.a()) {
            a = mnuVar.a(mnuVar.a((mos) pjzVar2.a((pkx) new gru(pjzVar3))), 1);
        } else {
            boolean z = false;
            if (pjzVar2.a() && pjzVar3.a()) {
                z = true;
            }
            qdu.b(z, "Not enough RAW streams have been configured.");
            a = new hnz((mnu) hoa.a((mnu) a2.a.get(), 1), (pjz) hoa.a((pjz) a2.b.get(), 2), (pjz) hoa.a((pjz) a2.c.get(), 3), (mcs) hoa.a((mcs) a2.d.get(), 4), (mba) hoa.a((mba) a2.e.get(), 5), (mcs) hoa.a((mcs) a2.f.get(), 6), (cin) hoa.a((cin) a2.g.get(), 7));
        }
        return (mnk) rgk.a((mnk) mbaVar.a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
}