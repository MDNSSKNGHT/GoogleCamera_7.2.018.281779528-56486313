package defpackage;

/* compiled from: PG */
/* renamed from: gex  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gex implements mjq {
    private final gev a;

    public gex(gev gevVar) {
        this.a = gevVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        gev gevVar = this.a;
        synchronized (gevVar.c) {
            qps qpsVar = gevVar.d;
            if (qpsVar != null) {
                qpsVar.shutdownNow();
            }
            gevVar.d = null;
            gevVar.e = true;
        }
    }
}