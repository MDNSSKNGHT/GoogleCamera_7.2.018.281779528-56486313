package defpackage;

/* compiled from: PG */
/* renamed from: dor  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dor implements mjq {
    private final dow a;
    private final dov b;

    public dor(dow dowVar, dov dovVar) {
        this.a = dowVar;
        this.b = dovVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        dow dowVar = this.a;
        dov dovVar = this.b;
        synchronized (dowVar.b) {
            dowVar.c.remove(dovVar);
        }
    }
}
