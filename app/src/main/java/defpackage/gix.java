package defpackage;

/* compiled from: PG */
/* renamed from: gix  reason: default package */
/* loaded from: classes.dex */
final class gix implements ghe {
    private final /* synthetic */ hzc a;
    private final /* synthetic */ giz b;

    public gix(giz gizVar, hzc hzcVar) {
        this.b = gizVar;
        this.a = hzcVar;
    }

    @Override // defpackage.ghe
    public final qpp a() {
        qqg f = qqg.f();
        giz gizVar = this.b;
        gizVar.a.execute(new giy(gizVar, this.a, f));
        return f;
    }

    @Override // defpackage.ghe
    public final qpp b() {
        this.a.a.close();
        return rgk.a((Throwable) new mmh("Software jpeg saver was closed"));
    }
}