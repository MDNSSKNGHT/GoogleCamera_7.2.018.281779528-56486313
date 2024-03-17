package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfi */
/* loaded from: classes.dex */
public final class gfi implements rgg {
    private final rhd a;

    private gfi(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfi a(rhd rhdVar) {
        return new gfi(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_SCENE_MODE, (mcs) ((gfu) this.a).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}