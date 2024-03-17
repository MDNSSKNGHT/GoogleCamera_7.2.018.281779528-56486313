package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: cga  reason: default package */
/* loaded from: classes.dex */
public final class cga implements mjq {
    public final jel a;
    public final jde b;
    public final mkn c;
    public final rhd d;
    public final qps e;
    public final cdp f;
    public final mew g;
    public final rhd h;
    public final ccl i;
    public final ezm j;
    public final bzu k;
    public final ccr l;
    public mgk p;
    public mgi q;
    private final cdb s;
    public final Object m = new Object();
    public pjz n = pix.a;
    public pjz o = pix.a;
    public boolean r = true;

    public cga(mew mewVar, rhd rhdVar, ccl cclVar, qps qpsVar, cdp cdpVar, jel jelVar, jde jdeVar, cdb cdbVar, mkn mknVar, rhd rhdVar2, ezm ezmVar, bzu bzuVar, ccr ccrVar) {
        this.g = mewVar;
        this.a = jelVar;
        this.b = jdeVar;
        this.s = cdbVar;
        this.c = mknVar;
        this.e = qpsVar;
        this.f = cdpVar;
        this.h = rhdVar2;
        this.i = cclVar;
        this.d = rhdVar;
        this.j = ezmVar;
        this.k = bzuVar;
        this.l = ccrVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.m) {
            liu.b("VideoRecFac");
            this.r = true;
            if (this.n.a()) {
                liu.b("VideoRecFac");
                ((Surface) this.n.b()).release();
                this.n = pix.a;
            }
            mgk mgkVar = this.p;
            if (mgkVar != null) {
                mgkVar.close();
                this.p = null;
            }
            if (this.o.a()) {
                liu.b("VideoRecFac");
                ((mio) this.o.b()).e();
                this.o = pix.a;
            }
            this.s.a();
            if (this.q != null) {
                liu.b("VideoRecFac");
                ((mgi) qdu.d(this.q)).close();
                this.q = null;
            }
        }
    }
}