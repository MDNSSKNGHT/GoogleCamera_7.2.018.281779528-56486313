package defpackage;

/* compiled from: PG */
/* renamed from: dou  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dou implements Runnable {
    private final dow a;

    public dou(dow dowVar) {
        this.a = dowVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dow dowVar = this.a;
        dowVar.a(1.0f);
        synchronized (dowVar.b) {
            dowVar.d = null;
        }
    }
}
