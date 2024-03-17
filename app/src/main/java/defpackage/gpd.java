package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gpd  reason: default package */
/* loaded from: classes.dex */
final class gpd implements mcs, mjw {
    private final mkg a;
    private final mch b;
    private final geq c;
    private int d;

    static {
        liu.a("AutoFlashIndicator");
    }

    public gpd(mkf mkfVar, geq geqVar, grh grhVar) {
        this.a = mkfVar.a("AutoFlashIndicator");
        this.c = geqVar;
        boolean z = false;
        if (((gri) grhVar.a()).equals(gri.ON) && geqVar.I()) {
            z = true;
        }
        this.b = new mch(Boolean.valueOf(z));
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.b.a(mjwVar, executor);
    }

    @Override // defpackage.mcs
    public final /* bridge */ /* synthetic */ Object a() {
        return (Boolean) this.b.c;
    }

    @Override // defpackage.mjw
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num;
        ndr ndrVar = (ndr) obj;
        if (this.c.I() && (num = (Integer) ndrVar.a(CaptureResult.CONTROL_AE_STATE)) != null) {
            if (qdu.e(num, 4)) {
                if (!((Boolean) this.b.c).booleanValue()) {
                    this.a.b("Flash required");
                }
                this.d = 0;
                this.b.a(true);
            } else if (qdu.e(num, 2) || qdu.e(num, 3)) {
                if (((Boolean) this.b.c).booleanValue()) {
                    this.a.b("Flash not required");
                }
                this.d = 0;
                this.b.a(false);
            } else {
                int i = this.d + 1;
                this.d = i;
                if (i <= 30 || ((Boolean) this.b.c).booleanValue()) {
                    return;
                }
                this.a.f(fpp.a("No converged AE result for %d frames,falling back to single-image auto-flash photo", Integer.valueOf(this.d)));
                this.b.a(true);
            }
        }
    }
}