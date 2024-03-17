package defpackage;

/* compiled from: PG */
/* renamed from: iqw  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class iqw implements Runnable {
    private final cqo a;
    private final iqu b;
    private final geq c;

    public iqw(cqo cqoVar, iqu iquVar, geq geqVar) {
        this.a = cqoVar;
        this.b = iquVar;
        this.c = geqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.e()) {
            this.b.a(this.c);
        }
    }
}