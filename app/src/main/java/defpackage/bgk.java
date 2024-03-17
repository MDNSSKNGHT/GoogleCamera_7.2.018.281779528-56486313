package defpackage;

/* compiled from: PG */
/* renamed from: bgk  reason: default package */
/* loaded from: classes.dex */
final class bgk implements pjr {
    private final /* synthetic */ bgl a;

    public bgk(bgl bglVar) {
        this.a = bglVar;
    }

    @Override // defpackage.pjr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        mjo mjoVar = (mjo) obj;
        bgl bglVar = this.a;
        if (mjoVar == null) {
            mjoVar = mjo.CLOCKWISE_0;
        }
        return Integer.valueOf(mjo.a(bgl.a(bglVar.a, mjoVar.e, bglVar.b)).e);
    }
}
