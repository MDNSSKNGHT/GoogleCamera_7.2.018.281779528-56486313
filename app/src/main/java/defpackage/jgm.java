package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* renamed from: jgm  reason: default package */
/* loaded from: classes.dex */
final class jgm implements Runnable {
    private final /* synthetic */ jgo a;

    public jgm(jgo jgoVar) {
        this.a = jgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture = this.a.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.a.p;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
        this.a.a();
        this.a.r.b((Object) null);
    }
}