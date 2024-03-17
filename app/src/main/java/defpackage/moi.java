package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: moi  reason: default package */
/* loaded from: classes.dex */
public final class moi {
    public final CaptureRequest.Key a;
    public final Object b;

    public moi(CaptureRequest.Key key, Object obj) {
        this.a = (CaptureRequest.Key) qdu.c(key, "Parameter keys cannot be null.");
        this.b = qdu.c(obj, "Parameter values cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof moi)) {
                moi moiVar = (moi) obj;
                return qdu.e(this.a.getName(), moiVar.a.getName()) && qdu.e(this.b, moiVar.b);
            }
            return false;
        }
        return true;
    }

    public final String a() {
        return this.a.getName();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a.getName(), this.b});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "%s: %s", this.a.getName(), this.b);
    }
}