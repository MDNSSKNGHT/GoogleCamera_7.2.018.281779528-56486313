package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: qpa  reason: default package */
/* loaded from: classes2.dex */
final class qpa extends qoy {
    private final qpp e;

    public qpa(qpp qppVar) {
        this.e = (qpp) qdu.d(qppVar);
    }

    @Override // defpackage.qnx, defpackage.qpp
    public final void a(Runnable runnable, Executor executor) {
        this.e.a(runnable, executor);
    }

    @Override // defpackage.qnx, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.e.cancel(z);
    }

    @Override // defpackage.qnx, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.e.get();
    }

    @Override // defpackage.qnx, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.e.get(j, timeUnit);
    }

    @Override // defpackage.qnx, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e.isCancelled();
    }

    @Override // defpackage.qnx, java.util.concurrent.Future
    public final boolean isDone() {
        return this.e.isDone();
    }

    @Override // defpackage.qnx
    public final String toString() {
        return this.e.toString();
    }
}