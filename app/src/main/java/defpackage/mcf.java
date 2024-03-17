package defpackage;

/* compiled from: PG */
/* renamed from: mcf  reason: default package */
/* loaded from: classes.dex */
final class mcf implements Runnable {
    private final /* synthetic */ map a;
    private final /* synthetic */ mch b;

    public mcf(mch mchVar, map mapVar) {
        this.b = mchVar;
        this.a = mapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.c);
    }
}
