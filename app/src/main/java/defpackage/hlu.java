package defpackage;

/* compiled from: PG */
/* renamed from: hlu */
/* loaded from: classes.dex */
final class hlu implements bcs {
    private final /* synthetic */ qqg a;
    private final /* synthetic */ bbn b;
    private final /* synthetic */ hlv c;

    public hlu(hlv hlvVar, qqg qqgVar, bbn bbnVar) {
        this.c = hlvVar;
        this.a = qqgVar;
        this.b = bbnVar;
    }

    @Override // defpackage.bcs
    public final qpp b() {
        return this.a;
    }

    @Override // defpackage.bcs
    public final void c() {
        hlv hlvVar = this.c;
        hlvVar.e.a.a(true);
        hlvVar.b.a(ggt.c());
    }

    @Override // defpackage.bcs
    public final qpp e() {
        return rgk.b(new mch(this.b.a));
    }

    @Override // defpackage.bcs
    public final qpp a() {
        return rgk.b(ggt.e());
    }

    @Override // defpackage.bcs
    public final void d() {
        hlv hlvVar = this.c;
        liu.f(hlv.a);
        hlvVar.g.d();
        hlvVar.e.a();
        hlvVar.b.a(true, true, false);
        mnu mnuVar = hlvVar.b;
        mnuVar.a(mnuVar.c().a((Integer) 4).c(hlvVar.c.a()).a());
    }
}