package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: qof  reason: default package */
/* loaded from: classes2.dex */
abstract class qof extends qoj {
    private static final Logger g = Logger.getLogger(qof.class.getName());
    public prg e;
    private final boolean h;
    private final boolean i;

    public abstract void a(int i, Object obj);

    public abstract void g();

    public qof(prg prgVar, boolean z, boolean z2) {
        super(prgVar.size());
        this.e = (prg) qdu.d((Object) prgVar);
        this.h = z;
        this.i = z2;
    }

    private static boolean a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.qoj
    public final void a(Set set) {
        qdu.d((Object) set);
        if (isCancelled()) {
            return;
        }
        a(set, e());
    }

    @Override // defpackage.qnx
    protected final void b() {
        prg prgVar = this.e;
        a(qoe.OUTPUT_FUTURE_DONE);
        if (!isCancelled() || !(prgVar != null)) {
            return;
        }
        boolean d = d();
        pwx ar = prgVar.ar();
        while (ar.hasNext()) {
            ((Future) ar.next()).cancel(d);
        }
    }

    public final void a(int i, Future future) {
        try {
            a(i, rgk.b(future));
        } catch (ExecutionException e) {
            b(e.getCause());
        } catch (Throwable th) {
            b(th);
        }
    }

    public final void a(prg prgVar) {
        int a = qoj.f.a(this);
        int i = 0;
        qdu.b(a >= 0, "Less than 0 remaining futures");
        if (a != 0) {
            return;
        }
        if (prgVar != null) {
            pwx ar = prgVar.ar();
            while (ar.hasNext()) {
                Future future = (Future) ar.next();
                if (!future.isCancelled()) {
                    a(i, future);
                }
                i++;
            }
        }
        this.seenExceptions = null;
        g();
        a(qoe.ALL_INPUT_FUTURES_PROCESSED);
    }

    private final void b(Throwable th) {
        qdu.d(th);
        if (this.h && !a(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                a(newSetFromMap);
                qoj.f.a(this, newSetFromMap);
                set = this.seenExceptions;
            }
            if (a(set, th)) {
                c(th);
                return;
            }
        }
        if (th instanceof Error) {
            c(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.e.isEmpty()) {
            g();
        } else if (this.h) {
            pwx ar = this.e.ar();
            int i = 0;
            while (ar.hasNext()) {
                qpp qppVar = (qpp) ar.next();
                qppVar.a(new qoc(this, qppVar, i), qot.INSTANCE);
                i++;
            }
        } else {
            qod qodVar = new qod(this, this.i ? this.e : null);
            pwx ar2 = this.e.ar();
            while (ar2.hasNext()) {
                ((qpp) ar2.next()).a(qodVar, qot.INSTANCE);
            }
        }
    }

    private static void c(Throwable th) {
        g.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", !(th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qnx
    public final String a() {
        prg prgVar = this.e;
        if (prgVar != null) {
            String valueOf = String.valueOf(prgVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
            sb.append("futures=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return null;
    }

    public void a(qoe qoeVar) {
        qdu.d(qoeVar);
        this.e = null;
    }
}