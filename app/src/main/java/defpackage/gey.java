package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: gey  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gey implements mjq {
    private final ScheduledExecutorService a;

    public gey(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.shutdown();
    }
}