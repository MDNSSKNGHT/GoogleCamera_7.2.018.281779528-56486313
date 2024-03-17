package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: qpv  reason: default package */
/* loaded from: classes2.dex */
public final class qpv implements Executor {
    public boolean a = true;
    private final /* synthetic */ Executor b;
    private final /* synthetic */ qnx c;

    public qpv(Executor executor, qnx qnxVar) {
        this.b = executor;
        this.c = qnxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.b.execute(new qpu(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.a) {
                this.c.a((Throwable) e);
            }
        }
    }
}