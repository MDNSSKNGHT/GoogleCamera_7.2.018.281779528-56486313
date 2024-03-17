package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: gez  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gez implements mjq {
    private final ScheduledExecutorService a;

    public gez(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.shutdownNow();
    }
}