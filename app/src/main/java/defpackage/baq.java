package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: baq */
/* loaded from: classes.dex */
public final class baq implements rgg {
    private final rhd a;

    private baq(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static baq a(rhd rhdVar) {
        return new baq(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_AF_MODE, mdg.a((mch) this.a.get(), new ban())), "Cannot return null from a non-@Nullable @Provides method");
    }
}