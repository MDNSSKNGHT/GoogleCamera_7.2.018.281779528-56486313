package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwc  reason: default package */
/* loaded from: classes.dex */
final class gwc implements Runnable {
    public final /* synthetic */ mjw a;
    private final /* synthetic */ Executor b;
    private final /* synthetic */ gwe c;

    public gwc(gwe gweVar, Executor executor, mjw mjwVar) {
        this.c = gweVar;
        this.b = executor;
        this.a = mjwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.execute(new gwb(this, this.c.a.a()));
    }
}
