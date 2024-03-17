package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mbs  reason: default package */
/* loaded from: classes.dex */
public final class mbs implements Executor, mjq {
    private final ScheduledExecutorService a;
    private final long b;
    private final TimeUnit c;
    private ScheduledFuture e;
    private final Object d = new Object();
    private boolean f = false;

    public mbs(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
        this.a = scheduledExecutorService;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.a.shutdownNow();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            a();
            this.e = this.a.schedule(runnable, this.b, this.c);
        }
    }

    public final void a() {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }
}