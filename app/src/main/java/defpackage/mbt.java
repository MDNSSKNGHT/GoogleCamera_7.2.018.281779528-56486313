package defpackage;

/* compiled from: PG */
/* renamed from: mbt  reason: default package */
/* loaded from: classes.dex */
final class mbt implements Runnable {
    private final /* synthetic */ mbu a;

    public /* synthetic */ mbt(mbu mbuVar) {
        this.a = mbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            mbu mbuVar = this.a;
            Runnable runnable = mbuVar.b;
            if (runnable != null) {
                mbuVar.b = null;
                runnable.run();
            }
        }
    }
}