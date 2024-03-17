package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mxs  reason: default package */
/* loaded from: classes.dex */
public final class mxs implements ndm {
    private final CaptureRequest a;

    public mxs(CaptureRequest captureRequest) {
        this.a = captureRequest;
    }

    @Override // defpackage.ndm
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return qdu.e(this.a, ((mxs) obj).a);
    }

    @Override // defpackage.ndm
    public final Object a(CaptureRequest.Key key) {
        return this.a.get(key);
    }

    @Override // defpackage.ndd
    public final myc h() {
        return new myc(this.a);
    }

    @Override // defpackage.ndm
    public final Object a() {
        return this.a.getTag();
    }

    @Override // defpackage.ndm
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}