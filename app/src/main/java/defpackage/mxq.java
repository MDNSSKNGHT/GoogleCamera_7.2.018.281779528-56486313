package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: mxq  reason: default package */
/* loaded from: classes.dex */
public final class mxq implements ndj {
    private final CameraDevice a;

    public mxq(CameraDevice cameraDevice) {
        this.a = cameraDevice;
    }

    @Override // defpackage.ndj, defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ndj
    public final ndl a(int i) throws mmh {
        try {
            return new mxt(this.a.createCaptureRequest(i));
        } catch (CameraAccessException | IllegalStateException | SecurityException e) {
            throw new mmh(e);
        }
    }

    @Override // defpackage.ndj
    public final void a(ndw ndwVar) throws mmh {
        try {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(((nds) ndwVar).a, qdu.a(((nds) ndwVar).b, mxp.a), ((nds) ndwVar).c, new mxv(((nds) ndwVar).d));
            ndm ndmVar = ((nds) ndwVar).e;
            if (ndmVar != null) {
                sessionConfiguration.setSessionParameters((CaptureRequest) myh.a(ndmVar));
            }
            this.a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new mmh(e);
        }
    }

    @Override // defpackage.ndj
    public final void a(List list, ndg ndgVar, Handler handler) throws mmh {
        try {
            this.a.createCaptureSession(list, new mxv(ndgVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new mmh(e);
        }
    }

    @Override // defpackage.ndj
    public final void c(List list, ndg ndgVar, Handler handler) throws mmh {
        try {
            this.a.createCaptureSessionByOutputConfigurations(myh.a(list), new mxv(ndgVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new mmh(e);
        }
    }

    @Override // defpackage.ndj
    public final void b(List list, ndg ndgVar, Handler handler) throws mmh {
        try {
            this.a.createConstrainedHighSpeedCaptureSession(list, new mxv(ndgVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new mmh(e);
        }
    }

    @Override // defpackage.ndj
    public final String a() {
        return this.a.getId();
    }
}
