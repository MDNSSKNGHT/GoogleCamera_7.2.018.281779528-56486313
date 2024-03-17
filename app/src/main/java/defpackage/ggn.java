package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ggn  reason: default package */
/* loaded from: classes.dex */
public final class ggn {
    public final CaptureRequest.Key a;
    public final Object b;

    public ggn(CaptureRequest.Key key, Object obj) {
        this.a = (CaptureRequest.Key) qdu.c(key, "Parameter keys cannot be null.");
        this.b = qdu.c(obj, "Parameter values cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ggn)) {
                ggn ggnVar = (ggn) obj;
                if (qdu.e(this.a, ggnVar.a) && qdu.e(this.b, ggnVar.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}