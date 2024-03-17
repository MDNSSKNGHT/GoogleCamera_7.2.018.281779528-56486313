package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: hmr */
/* loaded from: classes.dex */
public final class hmr implements rgg {
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
    private final rhd q;
    private final rhd r;

    private hmr(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9, rhd rhdVar10, rhd rhdVar11, rhd rhdVar12, rhd rhdVar13, rhd rhdVar14, rhd rhdVar15, rhd rhdVar16, rhd rhdVar17, rhd rhdVar18) {
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
        this.q = rhdVar17;
        this.r = rhdVar18;
    }

    public static hmr a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9, rhd rhdVar10, rhd rhdVar11, rhd rhdVar12, rhd rhdVar13, rhd rhdVar14, rhd rhdVar15, rhd rhdVar16, rhd rhdVar17, rhd rhdVar18) {
        return new hmr(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8, rhdVar9, rhdVar10, rhdVar11, rhdVar12, rhdVar13, rhdVar14, rhdVar15, rhdVar16, rhdVar17, rhdVar18);
    }

    public final hmq a() {
        mba mbaVar = (mba) this.a.get();
        return new hmq(((ggy) this.b).a(), (pjz) this.c.get(), ((hlq) this.d).a(), (gct) this.e.get(), (ScheduledExecutorService) this.f.get(), (bcx) this.g.get(), (mnu) this.h.get(), (mdl) this.i.get(), (mdl) this.j.get(), (gdl) this.k.get(), ((joo) this.l).a(), (fad) this.m.get(), this.n, ((bcu) this.o).a(), (hqu) this.p.get(), (cin) this.q.get(), (bba) this.r.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}