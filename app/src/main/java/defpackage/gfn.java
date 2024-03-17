package defpackage;

import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: gfn */
/* loaded from: classes.dex */
public final class gfn implements rgg {
    private final rhd a;

    private gfn(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfn a(rhd rhdVar) {
        return new gfn(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(ggt.a(CaptureRequest.JPEG_ORIENTATION, ((bgm) this.a).a().b()), "Cannot return null from a non-@Nullable @Provides method");
    }
}