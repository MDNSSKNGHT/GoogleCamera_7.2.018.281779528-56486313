package defpackage;

/* compiled from: PG */
/* renamed from: hsx  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hsx implements bmx {
    private final gff a;
    private final hsw b;
    private final rhd c;

    public hsx(gff gffVar, hsw hswVar, rhd rhdVar) {
        this.a = gffVar;
        this.b = hswVar;
        this.c = rhdVar;
    }

    @Override // defpackage.bmx
    public final qpp Z() {
        gff gffVar = this.a;
        hsw hswVar = this.b;
        rhd rhdVar = this.c;
        int i = hsy.a;
        hsy.a(((ggo) gffVar.a()).b, hswVar, "CommonRequestTemplate");
        hsy.a(((rgn) rhdVar).a(), hswVar, "Dagger Set");
        return rgk.b((Object) true);
    }
}