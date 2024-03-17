package defpackage;

import com.google.googlex.gcam.ShotLogData;
import com.google.googlex.gcam.ShotStatusCallback;

/* compiled from: PG */
/* renamed from: dry  reason: default package */
/* loaded from: classes.dex */
final class dry extends ShotStatusCallback {
    private final /* synthetic */ cjn a;
    private final /* synthetic */ crb b;
    private final /* synthetic */ int c;
    private final /* synthetic */ dss d;
    private final /* synthetic */ izm e;
    private final /* synthetic */ gnq f;
    private final /* synthetic */ dse g;

    public dry(dse dseVar, cjn cjnVar, crb crbVar, int i, dss dssVar, izm izmVar, gnq gnqVar) {
        this.g = dseVar;
        this.a = cjnVar;
        this.b = crbVar;
        this.c = i;
        this.d = dssVar;
        this.e = izmVar;
        this.f = gnqVar;
    }

    @Override // com.google.googlex.gcam.ShotStatusCallback
    public final void OnAbort(int i) {
        String str = dse.a;
        fpp.a("HDR+ pipeline reported shotId %d was aborted.", Integer.valueOf(i));
        liu.d(str);
        qdu.d(this.g.u == 1);
        this.g.u = 4;
        this.f.c.e();
        this.f.d.close();
        this.f.a.g.close();
        this.g.t.close();
        if (this.d.m().a()) {
            ((dsq) this.d.m().b()).a(this.g);
        }
    }

    @Override // com.google.googlex.gcam.ShotStatusCallback
    public final void OnComplete(int i, ShotLogData shotLogData) {
        String str = dse.a;
        int i2 = 0;
        fpp.a("HDR+ pipeline reported completion for shotId %d.", Integer.valueOf(i));
        liu.b(str);
        qdu.d(this.g.u == 1);
        this.g.u = 2;
        int executed_finish_on = shotLogData.getExecuted_finish_on();
        dod dodVar = new dod(shotLogData, this.c);
        dss dssVar = this.d;
        if ((dssVar.i().a() || dssVar.j().a() || dssVar.k().a() || dssVar.l().a()) && this.c == 1 && executed_finish_on != 1) {
            liu.a(dse.a, "Hexagon failed");
        }
        while (true) {
            if (i2 >= shotLogData.getFinal_payload_frame_sharpness().size()) {
                break;
            } else if (shotLogData.getFinal_payload_frame_sharpness().get(i2) == 1.0f) {
                liu.a(dse.a, "Black frame detected");
                if (this.a != cjn.RELEASE) {
                    this.b.a("Black frame detected! Please immediately take and file a bug report.");
                }
            } else {
                i2++;
            }
        }
        izl b = this.e.b();
        this.g.t.close();
        if (this.d.m().a()) {
            ((dsq) this.d.m().b()).a(b, dodVar);
        }
    }

    @Override // com.google.googlex.gcam.ShotStatusCallback
    public final void OnError(int i, String str) {
        liu.a(dse.a, fpp.a("HDR+ pipeline reported error for shotId %d: %s", Integer.valueOf(i), str));
        qdu.d(this.g.u == 1);
        this.g.u = 3;
        this.f.c.e();
        this.f.d.close();
        this.f.a.g.close();
        this.g.t.close();
        if (this.d.m().a()) {
            ((dsq) this.d.m().b()).a(this.g, new dsk(str));
        }
    }
}