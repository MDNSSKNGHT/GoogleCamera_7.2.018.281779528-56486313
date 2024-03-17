package defpackage;

/* compiled from: PG */
/* renamed from: hnx  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class hnx implements mjw {
    private final hnz a;
    private final mcs b;

    public hnx(hnz hnzVar, mcs mcsVar) {
        this.a = hnzVar;
        this.b = mcsVar;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        hnz hnzVar = this.a;
        mcs mcsVar = this.b;
        if (((Boolean) obj).booleanValue()) {
            synchronized (hnzVar) {
                if (hnzVar.c.equals(mcsVar.a())) {
                    hnzVar.a(true);
                }
            }
        }
    }
}