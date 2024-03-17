package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: huo  reason: default package */
/* loaded from: classes.dex */
public final class huo implements huk {
    private final CaptureResult.Key a;

    public huo(CaptureResult.Key key) {
        this.a = key;
    }

    @Override // defpackage.huk
    public final boolean a(ndr ndrVar) {
        return ndrVar.a(this.a) != null;
    }
}