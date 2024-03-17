package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hrc  reason: default package */
/* loaded from: classes.dex */
public final class hrc extends mrx {
    public static final String a = liu.a("ActiveCameraMonitor");
    public final mch b;
    private final Executor c = eav.b("ActiveCamera");

    public hrc(mch mchVar) {
        this.b = mchVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        String str = (String) ndrVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null || str.equals(this.b.c)) {
            return;
        }
        this.c.execute(new hrb(this, str));
    }
}
