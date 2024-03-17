package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bar */
/* loaded from: classes.dex */
public final class bar implements rgg {
    private final rhd a;
    private final rhd b;

    private bar(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static bar a(rhd rhdVar, rhd rhdVar2) {
        return new bar(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        geq a = ((ggy) this.a).a();
        gdg a2 = ((gdh) this.b).a();
        if (a.r()) {
            obj = psl.c(ggt.a(CaptureRequest.CONTROL_AF_REGIONS, (mcs) a2));
        } else {
            obj = pvi.a;
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}