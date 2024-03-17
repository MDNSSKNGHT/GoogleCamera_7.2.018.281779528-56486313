package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gds */
/* loaded from: classes.dex */
public final class gds implements rgg {
    private final rhd a;

    private gds(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gds a(rhd rhdVar) {
        return new gds(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_AE_REGIONS, (mcs) ((gcw) this.a).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}