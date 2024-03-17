package defpackage;

/* compiled from: PG */
/* renamed from: gew  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gew implements mjq {
    private final gev a;

    public gew(gev gevVar) {
        this.a = gevVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        gev gevVar = this.a;
        synchronized (gevVar.c) {
            qps qpsVar = gevVar.d;
            if (qpsVar != null) {
                qpsVar.shutdown();
            }
            gevVar.e = true;
        }
    }
}