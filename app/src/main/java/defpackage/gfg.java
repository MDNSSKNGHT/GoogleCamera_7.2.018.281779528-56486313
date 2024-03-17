package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfg */
/* loaded from: classes.dex */
public final class gfg implements rgg {
    private final rhd a;

    private gfg(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfg a(rhd rhdVar) {
        return new gfg(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (ggq) rgk.a(ggt.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, knn.a(((ggy) this.a).a().y(), 30)), "Cannot return null from a non-@Nullable @Provides method");
    }
}