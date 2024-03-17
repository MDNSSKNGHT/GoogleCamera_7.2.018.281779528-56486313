package defpackage;

/* compiled from: PG */
/* renamed from: gwb  reason: default package */
/* loaded from: classes.dex */
final class gwb implements Runnable {
    private final /* synthetic */ mjo a;
    private final /* synthetic */ gwc b;

    public gwb(gwc gwcVar, mjo mjoVar) {
        this.b = gwcVar;
        this.a = mjoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}
