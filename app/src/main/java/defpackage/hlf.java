package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: hlf */
/* loaded from: classes.dex */
public final class hlf implements rgg {
    private final rhd a;
    private final rhd b;

    public hlf(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.LENS_FOCUS_DISTANCE, mdg.a((mcs) this.b.get(), new hla(((ggz) this.a).a()))), "Cannot return null from a non-@Nullable @Provides method");
    }
}