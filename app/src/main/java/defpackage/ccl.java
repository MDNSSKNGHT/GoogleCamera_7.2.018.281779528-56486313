package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* renamed from: ccl  reason: default package */
/* loaded from: classes.dex */
public final class ccl implements mjq {
    public Handler a;
    private final ccr b;
    private HandlerThread c;
    private max d;
    private boolean e = false;
    private final Object f = new Object();

    public ccl(ccr ccrVar) {
        this.b = ccrVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (this.e) {
                HandlerThread handlerThread = this.c;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.c = null;
                this.a = null;
                this.d = null;
                this.e = false;
            }
        }
    }

    public final max a() {
        b();
        return (max) qdu.d(this.d);
    }

    public final void b() {
        synchronized (this.f) {
            if (this.e) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("CamcorderCameraHandler");
            this.c = handlerThread;
            handlerThread.start();
            this.a = new Handler(this.c.getLooper());
            this.d = new max(this.a);
            this.b.a(ccq.CAPTURE_SESSION).a(this);
            this.e = true;
        }
    }
}