package defpackage;

/* compiled from: PG */
/* renamed from: bnb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class bnb implements Runnable {
    private final Runnable a;
    private final qqg b;

    public bnb(Runnable runnable, qqg qqgVar) {
        this.a = runnable;
        this.b = qqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.a;
        qqg qqgVar = this.b;
        try {
            runnable.run();
            qqgVar.b((Object) true);
        } finally {
            qqgVar.b((Object) false);
        }
    }
}