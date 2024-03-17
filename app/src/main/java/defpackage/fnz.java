package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fnz  reason: default package */
/* loaded from: classes.dex */
public final class fnz extends mrx {
    public final dnf a;
    public volatile long b;
    private final dka c;
    private volatile boolean d = true;

    public fnz(dnf dnfVar, dka dkaVar) {
        this.a = dnfVar;
        this.c = dkaVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        if (this.d) {
            Long l = (Long) knj.a((String) ndrVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID), ndrVar).a(CaptureResult.SENSOR_TIMESTAMP);
            if (l == null) {
                l = 0L;
            }
            this.b = l;
        }
    }

    public final void a(boolean z) {
        this.d = z;
        if (z) {
            this.c.a("microvideo-metadata");
        } else {
            this.c.b("microvideo-metadata");
        }
    }
}