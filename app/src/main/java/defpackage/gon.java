package defpackage;

/* compiled from: PG */
/* renamed from: gon  reason: default package */
/* loaded from: classes.dex */
public final class gon implements goq {
    private final goq a;
    private final boolean b;
    private final int c;

    static {
        liu.a("UsgStatsImgCapCmd");
    }

    public gon(goq goqVar, int i, boolean z) {
        this.a = (goq) qdu.d(goqVar);
        this.c = i;
        this.b = z;
    }

    @Override // defpackage.goq
    public final void a(gop gopVar, gnq gnqVar) {
        gnqVar.b.a().a(this.b);
        gnqVar.b.b(this.c);
        this.a.a(gopVar, gnqVar);
    }

    @Override // defpackage.goq
    public final mcs a() {
        return this.a.a();
    }

    @Override // defpackage.goq
    public final mcs b() {
        return this.a.b();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a.toString());
        return valueOf.length() == 0 ? new String("UsageStats for ") : "UsageStats for ".concat(valueOf);
    }
}