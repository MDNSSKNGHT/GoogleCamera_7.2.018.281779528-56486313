package defpackage;

/* compiled from: PG */
/* renamed from: cbb  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class cbb implements mjw {
    private final cbd a;

    public cbb(cbd cbdVar) {
        this.a = cbdVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        cbd cbdVar = this.a;
        cgx cgxVar = (cgx) obj;
        synchronized (cbdVar.d) {
            Integer a = cbdVar.a(cbdVar.a.c());
            cbdVar.b.a(a);
            cbdVar.c.a(mjo.a(a.intValue()));
        }
    }
}