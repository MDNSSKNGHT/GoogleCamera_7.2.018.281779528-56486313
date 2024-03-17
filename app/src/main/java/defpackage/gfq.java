package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfq */
/* loaded from: classes.dex */
public final class gfq implements rgg {
    private final rhd a;
    private final rhd b;

    private gfq(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gfq a(rhd rhdVar, rhd rhdVar2) {
        return new gfq(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        gep gepVar = (gep) this.a.get();
        pjz pjzVar = (pjz) this.b.get();
        if (pjzVar.a()) {
            gepVar = (gep) pjzVar.b();
        }
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_AWB_MODE, gepVar.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}