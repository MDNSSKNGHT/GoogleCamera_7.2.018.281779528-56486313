package defpackage;

/* compiled from: PG */
/* renamed from: gox  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gox implements Runnable {
    private final mkg a;
    private final qqg b;
    private final rhd c;

    public gox(mkg mkgVar, qqg qqgVar, rhd rhdVar) {
        this.a = mkgVar;
        this.b = qqgVar;
        this.c = rhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mkg mkgVar = this.a;
        qqg qqgVar = this.b;
        rhd rhdVar = this.c;
        mkgVar.b("Creating RootImageCommand");
        qqgVar.b(((goy) rhdVar).a());
        mkgVar.b("Created RootImageCommand");
    }
}