package defpackage;

/* compiled from: PG */
/* renamed from: cbd  reason: default package */
/* loaded from: classes.dex */
public final class cbd implements mjq {
    private static final String f = liu.a("CdrV2OC");
    public final gwg a;
    private final mcs g;
    private mba h;
    public final mch b = new mch(0);
    public final mch c = new mch(mjo.CLOCKWISE_0);
    public final Object d = new Object();
    public boolean e = false;
    private final ncr i = new cbc(this);

    public cbd(mcs mcsVar, gwg gwgVar) {
        this.g = mcsVar;
        this.a = gwgVar;
    }

    public Integer a(mjo mjoVar) {
        cgx cgxVar = (cgx) ((mcs) qdu.d(this.g)).a();
        String sb = "facing: " + cgxVar.b();
        liu.b(f);
        return bgl.a(cgxVar.a().d(), mjoVar.e, cgxVar.b() == mzg.FRONT);
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public void close() {
        synchronized (this.d) {
            mba mbaVar = this.h;
            if (mbaVar != null && !mbaVar.a()) {
                this.a.b(this.i);
                mbaVar.close();
                this.h = null;
            }
        }
    }

    public void a() {
        synchronized (this.d) {
            mba mbaVar = this.h;
            if (mbaVar == null || mbaVar.a()) {
                mba mbaVar2 = new mba();
                this.b.a(a(this.a.c()));
                this.c.a(mjo.a(a(this.a.c()).intValue()));
                this.a.a(this.i);
                mbaVar2.a(this.g.a(new cbb(this), qot.INSTANCE));
                this.h = mbaVar2;
            }
        }
    }
}