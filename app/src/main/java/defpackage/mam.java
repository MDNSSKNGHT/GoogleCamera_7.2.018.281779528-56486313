package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mam  reason: default package */
/* loaded from: classes.dex */
public final class mam implements mjq {
    public final mjq a;
    public int b;
    public final mbu c;
    public final Object d;
    public final Runnable e;
    public boolean f;

    public mam(mjq mjqVar) {
        this(mjqVar, rgk.a(), null);
    }

    public mam(mjq mjqVar, Executor executor) {
        this(mjqVar, executor, null);
    }

    public mam(mjq mjqVar, Executor executor, mbu mbuVar) {
        this.f = false;
        this.a = mjqVar;
        this.c = mbuVar;
        this.d = new Object();
        this.b = 0;
        this.e = new man(new mak(this), executor);
    }

    public final mjq a() {
        synchronized (this.d) {
            if (this.f) {
                return null;
            }
            this.b++;
            mbu mbuVar = this.c;
            if (mbuVar != null) {
                mbuVar.a();
            }
            return new mal(this);
        }
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            mbu mbuVar = this.c;
            if (mbuVar != null) {
                mbuVar.a();
            }
            this.a.close();
        }
    }
}