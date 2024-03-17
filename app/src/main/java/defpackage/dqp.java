package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dqp */
/* loaded from: classes.dex */
public final class dqp implements rgg {
    private final rhd a;
    private final rhd b;

    private dqp(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dqp a(rhd rhdVar, rhd rhdVar2) {
        return new dqp(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        geq a = ((ggy) this.a).a();
        if (((dop) this.b.get()).b() > 0) {
            obj = psl.c(ggt.a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, mdg.a(knn.a(a.y(), 15))));
        } else {
            obj = pvi.a;
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}