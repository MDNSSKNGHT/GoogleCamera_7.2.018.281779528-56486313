package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: mxv  reason: default package */
/* loaded from: classes.dex */
public final class mxv extends CameraCaptureSession.StateCallback {
    private final ndg a;

    public mxv(ndg ndgVar) {
        this.a = ndgVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        ndg ndgVar = this.a;
        a(cameraCaptureSession);
        ndgVar.e();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.a.a(a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.b(a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.a.c(a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        ndg ndgVar = this.a;
        a(cameraCaptureSession);
        ndgVar.f();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        ndg ndgVar = this.a;
        a(cameraCaptureSession);
        ndgVar.g();
    }

    private static final ndh a(CameraCaptureSession cameraCaptureSession) {
        if (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession) {
            return new mxo((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
        }
        return new mxn(cameraCaptureSession);
    }
}