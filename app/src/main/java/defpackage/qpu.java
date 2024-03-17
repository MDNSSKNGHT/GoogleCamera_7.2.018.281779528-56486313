package defpackage;

/* compiled from: PG */
/* renamed from: qpu  reason: default package */
/* loaded from: classes2.dex */
final class qpu implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ qpv b;

    public qpu(qpv qpvVar, Runnable runnable) {
        this.b = qpvVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a = false;
        this.a.run();
    }
}