package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: qpg  reason: default package */
/* loaded from: classes2.dex */
public final class qpg implements Runnable {
    private final Future a;
    private final qpe b;

    public qpg(Future future, qpe qpeVar) {
        this.a = future;
        this.b = qpeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a(rgk.b(this.a));
        } catch (Error | RuntimeException e) {
            this.b.a(e);
        } catch (ExecutionException e3) {
            this.b.a(e3.getCause());
        }
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a(this.b);
        return e.toString();
    }
}