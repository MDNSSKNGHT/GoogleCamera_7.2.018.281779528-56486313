package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gdt */
/* loaded from: classes.dex */
public final class gdt implements rgg {
    private final rhd a;

    private gdt(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gdt a(rhd rhdVar) {
        return new gdt(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.CONTROL_AE_LOCK, (mcs) ((gct) this.a.get()).a), "Cannot return null from a non-@Nullable @Provides method");
    }
}