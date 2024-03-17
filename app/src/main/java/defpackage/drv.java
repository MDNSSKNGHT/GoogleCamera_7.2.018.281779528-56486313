package defpackage;

import com.google.googlex.gcam.hdrplus.BaseFrameCallback;

/* compiled from: PG */
/* renamed from: drv  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class drv implements BaseFrameCallback {
    private final dse a;

    public drv(dse dseVar) {
        this.a = dseVar;
    }

    @Override // com.google.googlex.gcam.hdrplus.BaseFrameCallback
    public final void onBaseFrameSelected(int i, int i2, long j) {
        dse dseVar = this.a;
        String str = dse.a;
        fpp.a("Base frame selected as %d (timestamp %d), shotId = %d", Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i));
        liu.b(str);
        qdu.d(dseVar.u == 1);
        qdu.a(i2 < dseVar.e.size(), "Base frame index %s >= payload timestamps size %s", i2, dseVar.e.size());
        qdu.a(i2 < dseVar.d.size(), "Base frame index %s >= payload metadata size %s", i2, dseVar.d.size());
        qdu.b(((Long) dseVar.e.get(i2)).longValue() == j, "Base frame timestamps don't match");
        ((dsf) dseVar.s.b().b()).a(dseVar, i2, j, (ndr) dseVar.d.get(i2));
    }
}
