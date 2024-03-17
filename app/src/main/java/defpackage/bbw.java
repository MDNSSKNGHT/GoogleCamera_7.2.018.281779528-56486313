package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bbw  reason: default package */
/* loaded from: classes.dex */
public final class bbw extends mrx {
    public final Set a;
    public final bci b;
    private final Executor c;
    private boolean d = false;

    public bbw(mba mbaVar, dnf dnfVar, geq geqVar, Executor executor, mkg mkgVar) {
        String valueOf = String.valueOf(geqVar.N().name());
        this.b = new bci(geqVar, dnfVar, mkgVar.a("gyro-scn-ch"), valueOf.length() == 0 ? new String("scene-ch-") : "scene-ch-".concat(valueOf));
        this.a = new HashSet();
        this.c = executor;
        mbaVar.a(this.b);
    }

    public final synchronized void a(Runnable runnable) {
        this.a.add(runnable);
    }

    @Override // defpackage.mrx
    public final synchronized void a(ndr ndrVar) {
        if (this.d) {
            this.c.execute(new bbv(this, ndrVar));
        }
    }

    public final synchronized void b(Runnable runnable) {
        this.a.remove(runnable);
    }

    public final synchronized void a() {
        this.d = true;
        this.b.a();
    }

    public final synchronized void b() {
        this.d = false;
        this.b.close();
    }
}