package defpackage;

/* compiled from: PG */
/* renamed from: mak  reason: default package */
/* loaded from: classes.dex */
final class mak implements Runnable {
    private final /* synthetic */ mam a;

    public /* synthetic */ mak(mam mamVar) {
        this.a = mamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.a.d) {
            mam mamVar = this.a;
            z = false;
            if (!mamVar.f && mamVar.b == 0) {
                mamVar.f = true;
                z = true;
            }
        }
        if (z) {
            this.a.a.close();
        }
    }
}