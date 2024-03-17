package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: qoc  reason: default package */
/* loaded from: classes.dex */
final class qoc implements Runnable {
    private final /* synthetic */ qpp a;
    private final /* synthetic */ int b;
    private final /* synthetic */ qof c;

    public qoc(qof qofVar, qpp qppVar, int i) {
        this.c = qofVar;
        this.a = qppVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.isCancelled()) {
                this.c.a(this.b, (Future) this.a);
            } else {
                qof qofVar = this.c;
                qofVar.e = null;
                qofVar.cancel(false);
            }
        } finally {
            this.c.a((prg) null);
        }
    }
}