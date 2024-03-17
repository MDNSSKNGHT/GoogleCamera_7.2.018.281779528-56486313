package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.apps.camera.debugui.DebugCanvasView;
import j$.util.Optional;

/* compiled from: PG */
/* renamed from: cri  reason: default package */
/* loaded from: classes.dex */
public final class cri extends mrx {
    private final crd a;

    public cri(crd crdVar) {
        this.a = crdVar;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        crd crdVar = this.a;
        Rect rect = (Rect) qdu.d((Rect) ndrVar.a(CaptureResult.SCALER_CROP_REGION));
        DebugCanvasView debugCanvasView = crdVar.a;
        if (debugCanvasView != null) {
            if (debugCanvasView.f.a(rect) && debugCanvasView.a()) {
                debugCanvasView.f.b().mapRect(debugCanvasView.c, new RectF(rect));
            }
        } else {
            liu.b(crd.b, "UI view not yet initialized");
        }
        MeteringRectangle[] meteringRectangleArr = (MeteringRectangle[]) ndrVar.a(CaptureResult.CONTROL_AF_REGIONS);
        if (meteringRectangleArr != null && meteringRectangleArr.length > 0) {
            this.a.a(Optional.ofNullable(meteringRectangleArr[0]));
        } else {
            this.a.a(Optional.empty());
        }
        crd crdVar2 = this.a;
        prr a = prr.a((Object[]) ((Face[]) qdu.d((Face[]) ndrVar.a(CaptureResult.STATISTICS_FACES))));
        DebugCanvasView debugCanvasView2 = crdVar2.a;
        if (debugCanvasView2 != null) {
            debugCanvasView2.d = a;
        } else {
            liu.b(crd.b, "UI view not yet initialized");
        }
        DebugCanvasView debugCanvasView3 = this.a.a;
        if (debugCanvasView3 == null) {
            liu.b(crd.b, "UI view not yet initialized");
        } else {
            debugCanvasView3.invalidate();
        }
    }
}