package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: htz */
/* loaded from: classes.dex */
final /* synthetic */ class htz implements Runnable {
    private final hua a;
    private final mnh b;
    private final dse c;

    public htz(hua huaVar, mnh mnhVar, dse dseVar) {
        this.a = huaVar;
        this.b = mnhVar;
        this.c = dseVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        neb d = null;
        ndr c = null;
        hua huaVar = this.a;
        try (mnh mnhVar = this.b) {
            dse dseVar = this.c;
            try {
                osu.c(mnhVar);
                d = huaVar.d.a(mnhVar).d();
                c = mnhVar.c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                liu.a(hua.a, "Error generating on-demand preview image");
            }
            if (d != null && c != null) {
                Bitmap a = huaVar.b.a(d, c, huaVar.i.g(), huaVar.i.f(), huaVar.c, huaVar.f, huaVar.g);
                d.close();
                if (a != null) {
                    synchronized (huaVar) {
                        if (huaVar.h) {
                            liu.b(hua.a);
                            dseVar.c.b.b(kni.a(a, bgl.a(dseVar.c.a.a, huaVar.e)));
                        } else {
                            a.recycle();
                        }
                    }
                }
            }
            liu.a(hua.a, "Error getting the required input.");
        }
    }
}