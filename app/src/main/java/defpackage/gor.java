package defpackage;

/* compiled from: PG */
/* renamed from: gor  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gor implements pkx {
    private final gov a;
    private final gev b;

    public gor(gov govVar, gev gevVar) {
        this.a = govVar;
        this.b = gevVar;
    }

    @Override // defpackage.pkx
    public final Object a() {
        gov govVar = this.a;
        gev gevVar = this.b;
        goq goqVar = (goq) maw.a(govVar.a);
        int i = govVar.e.get();
        if (!gevVar.a() && i <= 0) {
            if (goqVar == null) {
                return mdg.a((Object) true);
            }
            return goqVar.a();
        }
        return mdg.a((Object) false);
    }
}