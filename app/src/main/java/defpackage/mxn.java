package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: mxn  reason: default package */
/* loaded from: classes.dex */
public class mxn implements ndh {
    public final CameraCaptureSession a;

    public mxn(CameraCaptureSession cameraCaptureSession) {
        this.a = cameraCaptureSession;
    }

    @Override // defpackage.ndh
    public final void a() throws CameraAccessException, nde {
        try {
            this.a.abortCaptures();
        } catch (IllegalStateException | SecurityException e) {
            throw new nde(e);
        }
    }

    @Override // defpackage.ndh
    public final int a(ndm ndmVar, ndf ndfVar, Handler handler) throws nde, CameraAccessException {
        try {
            return this.a.capture((CaptureRequest) myh.a(ndmVar), new mxm(ndfVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new nde(e);
        }
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.ndh
    public final void a(List list) throws CameraAccessException {
        laq.a(this.a, myh.a(list));
    }

    @Override // defpackage.ndh
    public final ndj b() {
        return new mxq(this.a.getDevice());
    }

    @Override // defpackage.ndh
    public final int b(ndm ndmVar, ndf ndfVar, Handler handler) throws nde, CameraAccessException {
        try {
            return this.a.setRepeatingRequest((CaptureRequest) myh.a(ndmVar), new mxm(ndfVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new nde(e);
        }
    }

    @Override // defpackage.ndh
    public final void c() throws CameraAccessException, nde {
        try {
            this.a.stopRepeating();
        } catch (IllegalStateException | SecurityException e) {
            throw new nde(e);
        }
    }
}