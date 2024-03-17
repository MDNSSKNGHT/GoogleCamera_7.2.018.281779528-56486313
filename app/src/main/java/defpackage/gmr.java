package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: gmr  reason: default package */
/* loaded from: classes.dex */
final class gmr extends mrx {
    private final mjw a;

    public gmr(mjw mjwVar) {
        this.a = mjwVar;
    }

    @Override // defpackage.mrx
    public void a(ndr ndrVar) {
        this.a.a(new gmt((Face[]) qdu.b(ndrVar.a(CaptureResult.STATISTICS_FACES)), (Rect) qdu.b(ndrVar.a(CaptureResult.SCALER_CROP_REGION)), (Long) qdu.b(ndrVar.a(CaptureResult.SENSOR_FRAME_DURATION))));
    }
}