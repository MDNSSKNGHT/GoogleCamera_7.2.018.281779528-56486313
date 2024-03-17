package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: hlv  reason: default package */
/* loaded from: classes.dex */
final class hlv implements bas {
    public static final String a = liu.a("pckstdt2f");
    public final mnu b;
    public final bct c;
    public final mbs d;
    public final gct e;
    public final mdl f;
    public final hqu g;
    public qqg h;
    private final mba i;
    private final mcs j;
    private volatile boolean k;

    public hlv(mnu mnuVar, bct bctVar, mba mbaVar, mbs mbsVar, gct gctVar, cvu cvuVar, hqu hquVar, mcs mcsVar) {
        this.b = mnuVar;
        this.c = bctVar;
        this.i = mbaVar;
        this.d = mbsVar;
        this.e = gctVar;
        this.f = cvuVar.a;
        this.g = hquVar;
        this.j = mcsVar;
    }

    public final void a() {
        try {
            this.d.execute(new hlr(this));
        } catch (RejectedExecutionException e) {
            liu.f(a);
        }
    }

    @Override // defpackage.bas
    public final bcs a(bbn bbnVar) {
        mbe.a();
        this.d.a();
        this.g.c();
        if (!this.k) {
            this.k = true;
            this.i.a(this.e.b.a(new hls(this), qot.INSTANCE));
            this.i.a(this.f.a(new hlt(this), qot.INSTANCE));
        }
        this.b.a(this.b.c().a(((ils) this.j.a()).a() ? 1 : 0).a(this.c.c(bbnVar.a)).b(this.c.c(bbnVar.a)).a(), ggt.b());
        a();
        qqg f = qqg.f();
        this.h = f;
        return new hlu(this, f, bbnVar);
    }
}