package defpackage;

/* compiled from: PG */
/* renamed from: gub */
/* loaded from: classes.dex */
final /* synthetic */ class gub implements gva {
    private final gun a;
    private final pov b;
    private final mdl c;
    private final gut d;

    public gub(gun gunVar, pov povVar, mdl mdlVar, gut gutVar) {
        this.a = gunVar;
        this.b = povVar;
        this.c = mdlVar;
        this.d = gutVar;
    }

    @Override // defpackage.gva
    public final void a(guw guwVar) {
        gun gunVar = this.a;
        Object obj = this.b.get(guwVar);
        if (obj != null) {
            this.c.a(obj);
            fad fadVar = gunVar.aA;
            if (fadVar != null) {
                fadVar.a(guwVar);
            }
            if (this.d.a() == guv.MICROVIDEO && gunVar.h.a("micro_tutorial_dismiss") == 0 && !gunVar.i) {
                gunVar.ax.a(false);
            }
        }
    }
}