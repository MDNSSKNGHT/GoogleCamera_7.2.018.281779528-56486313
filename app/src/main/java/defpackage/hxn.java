package defpackage;

import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: hxn  reason: default package */
/* loaded from: classes.dex */
public final class hxn implements hxq {
    public final mkg a;
    public boolean d;
    private final Runnable g;
    public final LinkedList c = new LinkedList();
    public boolean e = false;
    public final Object b = new Object();
    public int f = 3;

    public hxn(mkf mkfVar, Runnable runnable) {
        this.g = runnable;
        this.a = mkfVar.a("ProcessingSvcMgr");
    }

    @Override // defpackage.hxq
    public final void a(hxp hxpVar) {
        synchronized (this.b) {
            if (!this.c.contains(hxpVar)) {
                this.c.add(hxpVar);
                mkg mkgVar = this.a;
                String valueOf = String.valueOf(hxpVar);
                int size = this.c.size();
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
                sb.append("Task added [");
                sb.append(valueOf);
                sb.append("]. Queue size now: ");
                sb.append(size);
                mkgVar.b(sb.toString());
                if (!this.e) {
                    b();
                }
            } else {
                throw new IllegalArgumentException("Task already enqueued");
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            int i = this.f;
            if (i == 3) {
                this.a.d("Starting service (was DESTROYED)");
                this.g.run();
                this.f = 1;
            } else if (i == 2) {
                this.a.d("Scheduling service restart, is shutting down");
                this.d = true;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.f != 1 && this.c.isEmpty()) {
                z = false;
            }
        }
        return z;
    }
}