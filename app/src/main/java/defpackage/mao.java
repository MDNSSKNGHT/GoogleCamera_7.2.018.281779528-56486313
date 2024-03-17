package defpackage;

/* compiled from: PG */
/* renamed from: mao  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class mao implements Runnable {
    private final map a;
    private final Object b;

    public mao(map mapVar, Object obj) {
        this.a = mapVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        map mapVar = this.a;
        mapVar.a.a(this.b);
    }
}