package defpackage;

/* compiled from: PG */
/* renamed from: dok  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dok implements Runnable {
    private final qqg a;
    private final rhd b;

    public dok(qqg qqgVar, rhd rhdVar) {
        this.a = qqgVar;
        this.b = rhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b((mcs) this.b.get());
    }
}