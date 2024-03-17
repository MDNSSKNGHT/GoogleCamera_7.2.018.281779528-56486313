package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfh */
/* loaded from: classes.dex */
public final class gfh implements rgg {
    private final rhd a;

    private gfh(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfh a(rhd rhdVar) {
        return new gfh(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_MODE, (mcs) ((gfs) this.a).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}