package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bow  reason: default package */
/* loaded from: classes.dex */
public final class bow implements Executor, mbf {
    public final Executor a;
    private final qpp b;

    public bow(Executor executor, qpp qppVar) {
        this.a = executor;
        this.b = qppVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.b.isDone()) {
            this.a.execute(runnable);
        } else {
            maw.a(this.b, new bov(this, runnable), qot.INSTANCE);
        }
    }

    public bow(mbf mbfVar, qpp qppVar) {
        this((Executor) mbfVar, qppVar);
    }
}