package defpackage;

/* compiled from: PG */
/* renamed from: dqh  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dqh implements Runnable {
    private final neb a;

    public dqh(neb nebVar) {
        this.a = nebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.close();
    }
}
