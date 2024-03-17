package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: giz  reason: default package */
/* loaded from: classes.dex */
public final class giz implements gjf, mjq {
    public final Executor a;
    public final iah b;
    public final knz c;
    public final iel d;
    public final mkn e;
    private final ghf f;
    private final koq g;
    private final mdl h;
    private final AtomicBoolean i = new AtomicBoolean(false);

    public giz(Executor executor, knz knzVar, iel ielVar, koq koqVar, mkn mknVar) {
        qdu.d(executor);
        this.a = executor;
        this.h = new mch((Object) 2);
        this.c = knzVar;
        this.d = ielVar;
        this.g = koqVar;
        this.e = mknVar;
        this.b = new iae();
        this.f = new ghi(2);
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        if (this.i.compareAndSet(false, true)) {
            this.f.close();
            this.h.a(0);
        }
    }

    public final qpp a(hzc hzcVar) {
        if (hzcVar.a.b() != 35) {
            hzcVar.a.close();
            return rgk.a((Throwable) new mmh("Only YUV_420_888 images are supported"));
        }
        if (this.g.a((mzg) qdu.d(hzcVar.g))) {
            this.g.a(hzcVar.a, hzcVar.b);
        }
        return this.f.a(new gix(this, hzcVar));
    }

    @Override // defpackage.gje
    public final /* bridge */ /* synthetic */ qpp a(Object obj) {
        return a((hzc) obj);
    }
}