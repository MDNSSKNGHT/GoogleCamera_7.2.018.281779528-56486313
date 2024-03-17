package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hsp */
/* loaded from: classes.dex */
public final class hsp implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;
    private final rhd h;
    private final rhd i;
    private final rhd j;
    private final rhd k;
    private final rhd l;
    private final rhd m;
    private final rhd n;
    private final rhd o;
    private final rhd p;

    private hsp(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9, rhd rhdVar10, rhd rhdVar11, rhd rhdVar12, rhd rhdVar13, rhd rhdVar14, rhd rhdVar15, rhd rhdVar16) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
        this.h = rhdVar8;
        this.i = rhdVar9;
        this.j = rhdVar10;
        this.k = rhdVar11;
        this.l = rhdVar12;
        this.m = rhdVar13;
        this.n = rhdVar14;
        this.o = rhdVar15;
        this.p = rhdVar16;
    }

    public static hsp a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9, rhd rhdVar10, rhd rhdVar11, rhd rhdVar12, rhd rhdVar13, rhd rhdVar14, rhd rhdVar15, rhd rhdVar16) {
        return new hsp(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8, rhdVar9, rhdVar10, rhdVar11, rhdVar12, rhdVar13, rhdVar14, rhdVar15, rhdVar16);
    }

    public final hsa a() {
        mba mbaVar = (mba) this.a.get();
        mnu mnuVar = (mnu) this.b.get();
        mkg a = ((mke) this.c).a();
        gnt gntVar = (gnt) this.d.get();
        mbe mbeVar = (mbe) this.e.get();
        cvo cvoVar = (cvo) this.f.get();
        mcs mcsVar = (mcs) this.g.get();
        return new hsa(mbaVar, mnuVar, a, gntVar, mbeVar, cvoVar, (gdl) this.h.get(), (mcs) this.i.get(), (mcs) this.j.get(), (mcs) this.k.get(), (mcs) this.l.get(), (Executor) this.m.get(), ((gmd) this.n).a(), (mby) this.o.get(), (bas) this.p.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}