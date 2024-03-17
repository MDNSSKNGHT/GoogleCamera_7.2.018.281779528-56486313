package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfk */
/* loaded from: classes.dex */
public final class gfk implements rgg {
    private final rhd a;

    private gfk(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfk a(rhd rhdVar) {
        return new gfk(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (mcs) ((gct) this.a.get()).b), "Cannot return null from a non-@Nullable @Provides method");
    }
}