package defpackage;

/* compiled from: PG */
/* renamed from: gvz  reason: default package */
/* loaded from: classes.dex */
final class gvz implements Runnable {
    private final /* synthetic */ mjo a;
    private final /* synthetic */ gwa b;

    public gvz(gwa gwaVar, mjo mjoVar) {
        this.b = gwaVar;
        this.a = mjoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}
