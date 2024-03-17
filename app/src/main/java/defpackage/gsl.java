package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gsl  reason: default package */
/* loaded from: classes.dex */
final class gsl extends mrx {
    private final Set<gsk> a;
    private long b = -1;
    private double c = -1.0d;

    public gsl(Set set) {
        this.a = set;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        long j;
        double d;
        Long l = (Long) ndrVar.a(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        long j2 = this.b;
        double r6 = 0;
        if (j2 >= 0) {
            double d2 = j - j2;
            Double.isNaN(d2);
            d = d2 / 1000000.0d;
            double d3 = this.c;
            r6 = d3 > 0.0d ? d3 : -1.0d;
            this.c = d;
        } else {
            d = -1.0d;
        }
        this.b = j;
        for (gsk gskVar : this.a) {
            gskVar.a(ndrVar, d, r6);
        }
    }
}