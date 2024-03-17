package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: djz  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class djz implements Runnable {
    private final dka a;
    private final ndr b;
    private final mjo c;

    public djz(dka dkaVar, ndr ndrVar, mjo mjoVar) {
        this.a = dkaVar;
        this.b = ndrVar;
        this.c = mjoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dka dkaVar = this.a;
        ndr ndrVar = this.b;
        String str = (String) ndrVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        ibf ibfVar = new ibf(knj.a(str, ndrVar), this.c.e, (Rect) dkaVar.b.a(str).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE), str);
        djl djlVar = dkaVar.a;
        djlVar.a.a(dki.a(ibfVar.b), ibfVar);
        djlVar.a(ibfVar);
    }
}
