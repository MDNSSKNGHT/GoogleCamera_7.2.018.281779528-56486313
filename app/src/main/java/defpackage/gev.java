package defpackage;

/* compiled from: PG */
/* renamed from: gev  reason: default package */
/* loaded from: classes.dex */
public final class gev {
    public final mkn a;
    public final mbe b;
    public final Object c;
    public qps d;
    public boolean e;

    public gev(mkf mkfVar, mkn mknVar, mbe mbeVar) {
        this.b = mbeVar;
        this.a = mknVar;
        mkfVar.a("CommandExecutor");
        this.c = new Object();
        this.e = false;
    }

    public final void a(ges gesVar) {
        synchronized (this.c) {
            if (!this.e) {
                if (this.d == null) {
                    this.d = (qps) rgk.a(gfa.a());
                }
                qdu.d(this.d);
                this.d.a(new geu(this, gesVar));
                return;
            }
            rgk.b((Object) null);
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.e;
        }
        return z;
    }
}