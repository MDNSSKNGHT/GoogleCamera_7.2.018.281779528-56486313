package defpackage;

/* compiled from: PG */
/* renamed from: cbc  reason: default package */
/* loaded from: classes.dex */
final class cbc implements ncr {
    private final /* synthetic */ cbd a;

    public cbc(cbd cbdVar) {
        this.a = cbdVar;
    }

    @Override // defpackage.ncr
    public final void a(mjo mjoVar) {
        Integer a = this.a.a(mjoVar);
        synchronized (this.a.d) {
            cbd cbdVar = this.a;
            if (!cbdVar.e) {
                cbdVar.b.a(a);
            }
            this.a.c.a(mjo.a(a.intValue()));
        }
    }
}