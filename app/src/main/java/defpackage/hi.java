package defpackage;

/* compiled from: PG */
/* renamed from: hi  reason: default package */
/* loaded from: classes.dex */
final class hi implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ hj b;

    public hi(hj hjVar, Object obj) {
        this.b = hjVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}