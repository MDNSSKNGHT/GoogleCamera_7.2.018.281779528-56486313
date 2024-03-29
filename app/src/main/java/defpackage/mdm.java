package defpackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mdm  reason: default package */
/* loaded from: classes.dex */
public final class mdm implements Executor {
    private boolean a = false;
    private final Queue b = new LinkedList();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Runnable runnable2;
        synchronized (this.b) {
            if (this.a) {
                this.b.add(runnable);
                return;
            }
            this.a = true;
            while (runnable != null) {
                runnable.run();
                synchronized (this.b) {
                    runnable2 = (Runnable) this.b.poll();
                    if (runnable2 == null) {
                        this.a = false;
                    }
                }
                runnable = runnable2;
            }
        }
    }
}
