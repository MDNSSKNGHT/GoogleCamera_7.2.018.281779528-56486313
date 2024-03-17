package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: qob  reason: default package */
/* loaded from: classes.dex */
public abstract class qob extends qox implements Runnable {
    private qpp e;
    private Object f;

    public qob(qpp qppVar, Object obj) {
        this.e = (qpp) qdu.d(qppVar);
        this.f = qdu.d(obj);
    }

    public abstract Object a(Object obj, Object obj2);

    public abstract void a(Object obj);

    @Override // defpackage.qnx
    protected final void b() {
        a((Future) this.e);
        this.e = null;
        this.f = null;
    }

    public static qpp a(qpp qppVar, pjr pjrVar, Executor executor) {
        qdu.d(pjrVar);
        qoa qoaVar = new qoa(qppVar, pjrVar);
        qppVar.a(qoaVar, rgk.a(executor, qoaVar));
        return qoaVar;
    }

    public static qpp a(qpp qppVar, qol qolVar, Executor executor) {
        qdu.d(executor);
        qnz qnzVar = new qnz(qppVar, qolVar);
        qppVar.a(qnzVar, rgk.a(executor, qnzVar));
        return qnzVar;
    }

    @Override // defpackage.qnx
    protected final String a() {
        String str;
        qpp qppVar = this.e;
        Object obj = this.f;
        String a = super.a();
        if (qppVar == null) {
            str = "";
        } else {
            String valueOf = String.valueOf(qppVar);
            String sb = "inputFuture=[" +
                    valueOf +
                    "], ";
            str = sb;
        }
        if (obj == null) {
            if (a != null) {
                String valueOf2 = str;
                return a.length() == 0 ? valueOf2 : valueOf2.concat(a);
            }
            return null;
        }
        String valueOf3 = String.valueOf(obj);
        String sb2 = str +
                "function=[" +
                valueOf3 +
                "]";
        return sb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qpp qppVar = this.e;
        Object obj = this.f;
        if (isCancelled() | (qppVar == null) | (obj == null)) {
            return;
        }
        this.e = null;
        if (qppVar.isCancelled()) {
            a(qppVar);
            return;
        }
        try {
            try {
                Object a = a(obj, rgk.b(qppVar));
                this.f = null;
                a(a);
            } catch (Throwable th) {
                try {
                    a(th);
                } finally {
                    this.f = null;
                }
            }
        } catch (CancellationException e2) {
            cancel(false);
        } catch (Error | RuntimeException e) {
            a(e);
        } /*catch (ExecutionException e4) {
            a(e4.getCause());
        }*/
    }
}