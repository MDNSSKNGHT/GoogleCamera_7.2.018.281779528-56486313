package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfp */
/* loaded from: classes.dex */
public final class gfp implements rgg {
    private final rhd a;

    private gfp(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfp a(rhd rhdVar) {
        return new gfp(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, (mcs) ((ggc) this.a).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}