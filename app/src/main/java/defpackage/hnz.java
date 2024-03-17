package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: hnz  reason: default package */
/* loaded from: classes.dex */
public final class hnz implements mnk {
    public static final String a = liu.a("PckDynamicFB");
    public final String b;
    public final String c;
    public mnk e;
    public mnk f;
    public mnk g;
    public boolean h;
    public final List d = new ArrayList();
    public final mnj i = new hnw(this);

    public hnz(mnu mnuVar, pjz pjzVar, pjz pjzVar2, mcs mcsVar, mba mbaVar, mcs mcsVar2, cin cinVar) {
        qdu.c(pjzVar.a());
        qdu.c(pjzVar2.a());
        boolean c = cinVar.c(cit.w);
        mnk a2 = mnuVar.a((mnz) pjzVar.b(), 1);
        this.e = a2;
        a2.a(this.i);
        this.g = this.e;
        this.b = ((mzc) qdu.d(myh.a((mnz) pjzVar.b()))).a;
        this.c = ((mzc) qdu.d(myh.a((mnz) pjzVar2.b()))).a;
        mbaVar.a(mcsVar2.a(new hnx(this, mcsVar), qot.INSTANCE));
        mbaVar.a(mcsVar.a(new hny(this, mnuVar, pjzVar, pjzVar2, c, mcsVar2), qot.INSTANCE));
    }

    @Override // defpackage.mnk
    public final synchronized void a(mnj mnjVar) {
        this.d.add(mnjVar);
    }

    @Override // defpackage.mnk
    public final synchronized int g() {
        return this.g.g();
    }

    @Override // defpackage.mnk, defpackage.mjq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.h = true;
        this.d.clear();
        this.g.b(this.i);
        mnk mnkVar = this.e;
        if (mnkVar != null) {
            mnkVar.close();
        }
        mnk mnkVar2 = this.f;
        if (mnkVar2 != null) {
            mnkVar2.close();
        }
    }

    public final void a(boolean z) {
        mnk mnkVar = this.e;
        if (mnkVar != null) {
            mnkVar.close();
            this.e = null;
            String str = !z ? "" : "due to thermal conditions";
            liu.b(a, str.length() == 0 ? new String("Shutting down wide buffer ") : "Shutting down wide buffer ".concat(str));
        }
    }

    @Override // defpackage.mnk
    public final synchronized mnz a() {
        return this.g.a();
    }

    @Override // defpackage.mnk
    public final synchronized List f() {
        return this.g.f();
    }

    @Override // defpackage.mnk
    public final synchronized mnh d() {
        return this.g.d();
    }

    @Override // defpackage.mnk
    public final synchronized mnh a(pkc pkcVar) {
        return this.g.a(pkcVar);
    }

    @Override // defpackage.mnk
    public final synchronized mnh e() {
        return this.g.e();
    }

    @Override // defpackage.mnk
    public final synchronized mnh b(pkc pkcVar) {
        return this.g.b(pkcVar);
    }

    @Override // defpackage.mnk
    public final synchronized boolean a(mnl mnlVar) {
        return this.g.a(mnlVar);
    }

    @Override // defpackage.mnk
    public final synchronized List c() {
        return this.g.c();
    }

    @Override // defpackage.mnk
    public final synchronized mnh b() {
        return this.g.b();
    }

    @Override // defpackage.mnk
    public final synchronized void b(mnj mnjVar) {
        this.d.remove(mnjVar);
    }

    @Override // defpackage.mnk
    public final synchronized void a(mni mniVar) {
        this.g.a(mniVar);
    }
}