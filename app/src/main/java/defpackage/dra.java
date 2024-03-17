package defpackage;

import com.google.googlex.gcam.hdrplus.MemoryStateCallback;

/* compiled from: PG */
/* renamed from: dra  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dra implements MemoryStateCallback {
    private final drc a;

    public dra(drc drcVar) {
        this.a = drcVar;
    }

    @Override // com.google.googlex.gcam.hdrplus.MemoryStateCallback
    public final void onMemoryStateChanged(long j, long j2) {
        drc drcVar = this.a;
        String str = drc.a;
        StringBuilder sb = new StringBuilder(105);
        sb.append("MemoryStateCallback: peakMemoryBytes=");
        sb.append(j);
        sb.append(" peakMemoryWithNewShotBytes=");
        sb.append(j2);
        sb.toString();
        liu.f(str);
        drcVar.f.a(Long.valueOf(j));
        drcVar.g.a(Long.valueOf(j2));
    }
}
