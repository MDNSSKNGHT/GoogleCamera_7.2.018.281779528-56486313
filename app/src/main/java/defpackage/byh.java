package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: byh  reason: default package */
/* loaded from: classes.dex */
public final class byh {
    public mgi a;
    public final Object b = new Object();
    private final bvm c;
    private final caz d;
    private final cbf e;
    private qpp f;

    public byh(bvm bvmVar, caz cazVar, cbf cbfVar) {
        this.c = bvmVar;
        this.d = cazVar;
        this.e = cbfVar;
    }

    public final mgi a() {
        synchronized (this.b) {
            mgi mgiVar = this.a;
            if (mgiVar == null) {
                try {
                    qpp qppVar = this.f;
                    if (qppVar == null) {
                        return b();
                    }
                    return (mgi) ((qpp) qdu.d(qppVar)).get();
                } catch (InterruptedException | ExecutionException e) {
                    liu.a("VideoRecProvider", "Error creating video recorder: ", e);
                    return null;
                }
            }
            return mgiVar;
        }
    }

    public final mgi b() {
        synchronized (this.b) {
            try {
                try {
                    d();
                    return (mgi) c().get();
                } catch (InterruptedException | ExecutionException e) {
                    liu.a("VideoRecProvider", "Error creating video recorder: ", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final qpp c() {
        qpp qppVar;
        synchronized (this.b) {
            d();
            liu.b("VideoRecProvider");
            cga b = this.c.b();
            cak a = this.c.a().a(this.e);
            cao a2 = this.d.a();
            synchronized (b.m) {
                if (b.r) {
                    b.r = false;
                    b.l.a(ccq.VIDEO_RECORDER).a(b);
                    b.p = ((cgl) b.d).a();
                }
            }
            qpp a3 = rgk.a(new cfz(b, this.e, a, qob.a(b.a.a(true), new cfy(b, a), qot.INSTANCE), a2), b.i.a());
            this.f = a3;
            rgk.a(a3, new byg(this), qot.INSTANCE);
            qppVar = this.f;
        }
        return qppVar;
    }

    public final void d() {
        synchronized (this.b) {
            mgi mgiVar = this.a;
            if (mgiVar != null) {
                ((mgi) qdu.d(mgiVar)).close();
                this.a = null;
            }
            qpp qppVar = this.f;
            if (qppVar != null) {
                ((qpp) qdu.d(qppVar)).cancel(true);
                this.f = null;
            }
        }
    }
}