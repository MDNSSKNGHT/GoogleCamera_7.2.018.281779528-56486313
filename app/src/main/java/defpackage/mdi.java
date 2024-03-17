package defpackage;

/* compiled from: PG */
/* renamed from: mdi  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class mdi implements Runnable {
    private final mjw a;
    private final Object b;

    public mdi(mjw mjwVar, Object obj) {
        this.a = mjwVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}