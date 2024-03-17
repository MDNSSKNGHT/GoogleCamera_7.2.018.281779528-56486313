package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* renamed from: bnj  reason: default package */
/* loaded from: classes.dex */
public final class bnj implements Executor, mjq {
    public final Executor a = new mbe();
    private final int b;
    private final ScheduledExecutorService c;

    public bnj(String str, int i) {
        this.b = i;
        this.c = eav.c(str);
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.c.shutdown();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.c.schedule(new bni(this, runnable), this.b, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
        }
    }
}