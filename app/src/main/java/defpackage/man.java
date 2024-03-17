package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: man  reason: default package */
/* loaded from: classes.dex */
public final class man implements Runnable {
    private final Runnable a;
    private final Executor b;

    public man(Runnable runnable, Executor executor) {
        this.b = executor;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.execute(this.a);
    }
}