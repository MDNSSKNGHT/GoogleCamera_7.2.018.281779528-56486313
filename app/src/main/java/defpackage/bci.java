package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bci  reason: default package */
/* loaded from: classes.dex */
public final class bci implements mjq {
    private static final long a = TimeUnit.MILLISECONDS.toNanos(500);
    private final Rect b;
    private final prr c;
    private final dnf d;
    private final mkg e;
    private final String f;
    private long g = 0;
    private float h = 0.0f;

    public bci(geq geqVar, dnf dnfVar, mkg mkgVar, String str) {
        Rect e = geqVar.e();
        this.b = e;
        this.c = prr.a(new float[]{0.0f, 0.0f}, new float[]{0.0f, e.height()}, new float[]{this.b.width(), 0.0f}, new float[]{this.b.width(), this.b.height()});
        this.d = dnfVar;
        this.e = mkgVar;
        this.f = str;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.e.b("Closing MotionSampler");
        if (this.d.a()) {
            this.d.b();
        }
    }

    public final boolean b() {
        return this.d.a() && this.h > 300.0f;
    }

    public final void a(ndr ndrVar) {
        if (this.d.a()) {
            ibf ibfVar = new ibf(ndrVar, 0, this.b);
            long j = ibfVar.b;
            if (j - this.g >= a) {
                this.g = j;
                List a2 = this.d.a(j, ibfVar);
                float f = 0.0f;
                if (a2.isEmpty()) {
                    this.e.c("Motion estimator returned empty homography list. Assuming zero motion.");
                    this.h = 0.0f;
                    return;
                }
                oar oarVar = (oar) a2.get(0);
                pwy d = this.c.d();
                while (d.hasNext()) {
                    float[] fArr = (float[]) d.next();
                    float[] b = oarVar.b(fArr);
                    f = Math.max(f, (float) Math.hypot(b[0] - fArr[0], b[1] - fArr[1]));
                }
                this.h = f;
                mkg mkgVar = this.e;
                StringBuilder sb = new StringBuilder(42);
                sb.append("Current motion magnitude = ");
                sb.append(f);
                mkgVar.e(sb.toString());
            }
        }
    }

    public final void a() {
        this.e.b("Starting MotionSampler");
        this.d.a(new mjs(this.b.width(), this.b.height()), 1, this.f);
    }
}