package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: mxt  reason: default package */
/* loaded from: classes.dex */
public final class mxt implements ndl {
    private final CaptureRequest.Builder a;

    public mxt(CaptureRequest.Builder builder) {
        this.a = builder;
    }

    @Override // defpackage.ndl
    public final void a(Surface surface) {
        this.a.addTarget(surface);
    }

    @Override // defpackage.ndl
    public final ndm a() {
        return new mxs(this.a.build());
    }

    @Override // defpackage.ndl
    public final void a(CaptureRequest.Key key, Object obj) {
        CaptureRequest.Builder builder = this.a;
        String valueOf = String.valueOf(key.getName());
        builder.set(key, qdu.c(obj, valueOf.length() == 0 ? new String("Value cannot be null for key ") : "Value cannot be null for key ".concat(valueOf)));
    }

    @Override // defpackage.ndl
    public final void a(Object obj) {
        this.a.setTag(obj);
    }
}