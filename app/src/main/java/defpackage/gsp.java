package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* renamed from: gsp  reason: default package */
/* loaded from: classes.dex */
final class gsp implements gsk {
    private final ViewfinderJankSession a;
    private double b = 33.0d;

    public gsp(ViewfinderJankSession viewfinderJankSession) {
        this.a = viewfinderJankSession;
    }

    @Override // defpackage.gsk
    public final void a(ndr ndrVar, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.a;
        viewfinderJankSession.d++;
        double d3 = this.b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 0.5d) {
                synchronized (viewfinderJankSession.a) {
                    if (d4 >= 0.5d) {
                        viewfinderJankSession.e++;
                    }
                    if (d4 >= 1.5d) {
                        viewfinderJankSession.f++;
                    }
                    if (d4 >= 5.0d) {
                        viewfinderJankSession.g++;
                    }
                    if (d4 >= 1.5d) {
                        qgm a = ViewfinderJankSession.a(ndrVar, d, d3);
                        viewfinderJankSession.c.add(a);
                        viewfinderJankSession.a(a);
                    }
                }
            }
        }
        if (d > 33.0d) {
            double d5 = this.b;
            if (d <= d5) {
                this.b = d;
            } else {
                this.b = (d + (d5 * 10.0d)) / 11.0d;
            }
        }
    }
}