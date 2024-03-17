package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: gsr  reason: default package */
/* loaded from: classes.dex */
final class gsr implements gsk {
    private final ViewfinderJankSession a;

    public gsr(ViewfinderJankSession viewfinderJankSession) {
        this.a = viewfinderJankSession;
    }

    @Override // defpackage.gsk
    public final void a(ndr ndrVar, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.a;
        synchronized (viewfinderJankSession.a) {
            if (viewfinderJankSession.b.size() < 30) {
                qgm a = ViewfinderJankSession.a(ndrVar, d, d2);
                viewfinderJankSession.b.add(a);
                viewfinderJankSession.a(a);
            }
        }
    }
}