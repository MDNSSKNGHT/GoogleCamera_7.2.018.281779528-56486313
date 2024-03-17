package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cyl  reason: default package */
/* loaded from: classes.dex */
public final class cyl implements AutoCloseable, mcs {
    private static final mjq a = cyk.a;
    private mcs b;
    private mjq c = a;
    private mdl d = mdk.a(klw.PHOTO);
    private mjq e = a;
    private mzg f = mzg.BACK;
    private final Executor g = eav.b("LVesperClbck");
    private final mdl h;
    private final mcs i;

    public cyl() {
        mch mchVar = new mch((Object) false);
        this.h = mchVar;
        this.i = mdg.b(mchVar);
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.i.a(mjwVar, executor);
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.e.close();
        this.e = a;
        this.c.close();
        this.c = a;
    }

    @Override // defpackage.mcs
    public final /* bridge */ /* synthetic */ Object a() {
        return (Boolean) this.i.a();
    }

    public final synchronized void b() {
        klw klwVar = (klw) this.d.a();
        boolean booleanValue = ((Boolean) this.b.a()).booleanValue();
        mzg mzgVar = this.f;
        boolean z = true;
        if (!booleanValue || ((klwVar != klw.PHOTO || mzgVar != mzg.FRONT) && ((klwVar != klw.LONG_EXPOSURE || mzgVar != mzg.FRONT) && klwVar != klw.PORTRAIT))) {
            z = false;
        }
        String valueOf = String.valueOf(mzgVar);
        String valueOf2 = String.valueOf(klwVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
        sb.append("facing: ");
        sb.append(valueOf);
        sb.append(", mode: ");
        sb.append(valueOf2);
        sb.append(", is enabled: ");
        sb.append(booleanValue);
        sb.append(" ==> is active: ");
        sb.append(z);
        sb.toString();
        this.h.a(Boolean.valueOf(z));
    }

    public final synchronized void a(mdl mdlVar) {
        this.d = mdlVar;
        this.e.close();
        this.e = mdlVar.a(new cyj(this), this.g);
    }

    public final synchronized void a(mzg mzgVar) {
        this.f = mzgVar;
        b();
    }

    public final synchronized void a(mcs mcsVar) {
        this.b = mcsVar;
        this.c.close();
        this.c = mcsVar.a(new cyi(this), this.g);
    }
}