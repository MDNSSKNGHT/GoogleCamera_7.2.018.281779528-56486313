package defpackage;

/* compiled from: PG */
/* renamed from: qod  reason: default package */
/* loaded from: classes.dex */
final class qod implements Runnable {
    private final /* synthetic */ prg a;
    private final /* synthetic */ qof b;

    public qod(qof qofVar, prg prgVar) {
        this.b = qofVar;
        this.a = prgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}