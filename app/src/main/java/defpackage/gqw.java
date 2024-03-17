package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gqw  reason: default package */
/* loaded from: classes.dex */
public final class gqw implements mdl {
    public final geq a;
    private final boolean b;
    private final grg c;
    private final grg d;

    public gqw(mdl mdlVar, mdl mdlVar2, geq geqVar, gri griVar) {
        this.a = geqVar;
        this.c = new grg(mdlVar, griVar);
        this.d = new grg(mdlVar2, griVar);
        this.b = geqVar.I();
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        mjr mjrVar = new mjr();
        mjrVar.a(this.c.a(new gqu(this, mjwVar), executor));
        mjrVar.a(this.d.a(new gqv(this, mjwVar), executor));
        return mjrVar;
    }

    @Override // defpackage.mcs
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.b) {
            if (this.a.N() == mzg.FRONT) {
                return (gri) this.d.a();
            }
            return (gri) this.c.a();
        }
        return gri.OFF;
    }

    @Override // defpackage.mjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        gri griVar = (gri) obj;
        if (this.a.N() == mzg.FRONT) {
            this.d.a(griVar);
        } else {
            this.c.a(griVar);
        }
    }
}