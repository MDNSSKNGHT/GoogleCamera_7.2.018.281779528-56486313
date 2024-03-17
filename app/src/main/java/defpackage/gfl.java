package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfl */
/* loaded from: classes.dex */
public final class gfl implements rgg {
    private final rhd a;

    private gfl(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfl a(rhd rhdVar) {
        return new gfl(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_AE_MODE, (mcs) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}