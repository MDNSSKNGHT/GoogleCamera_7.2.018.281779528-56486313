package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: oft  reason: default package */
/* loaded from: classes.dex */
final class oft implements Executor {
    private final Executor b;
    private final Object a = new Object();
    private final Deque c = new ArrayDeque();
    private boolean d = false;

    public oft(Executor executor) {
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            this.c.addLast(runnable);
            if (!this.d) {
                this.d = true;
                this.b.execute(new ofr(this));
            }
        }
    }

    public final void a() {
        synchronized (this.a) {
            qdu.d(this.d);
            Runnable runnable = (Runnable) this.c.pollFirst();
            if (runnable == null) {
                this.d = false;
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                Log.e("SingleTaskExec", "Exception occurred on single-threaded executor", th);
            }
            this.b.execute(new ofs(this));
        }
    }
}