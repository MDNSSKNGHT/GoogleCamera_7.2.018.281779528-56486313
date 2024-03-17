package defpackage;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: gsn  reason: default package */
/* loaded from: classes.dex */
final class gsn implements gsk {
    private final mkg a;
    private final coc b;
    private double c = 33.0d;

    public gsn(mkf mkfVar, coc cocVar) {
        this.a = mkfVar.a("FrameJank");
        this.b = cocVar;
    }

    @Override // defpackage.gsk
    public final void a(ndr ndrVar, double d, double d2) {
        Long l = (Long) ndrVar.a(CaptureResult.SENSOR_TIMESTAMP);
        Long l2 = (Long) ndrVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        if (l != null && l2 != null) {
            this.b.a(l.longValue(), l2.longValue());
        }
        double d3 = this.c;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 1.5d) {
                mkg mkgVar = this.a;
                StringBuilder sb = new StringBuilder(146);
                sb.append("JANK! Time between frames (");
                sb.append(d);
                sb.append("ms) increased by ");
                sb.append(d4 * 100.0d);
                sb.append("% over the expected delta (");
                sb.append(d3);
                sb.append("ms)");
                mkgVar.d(sb.toString());
            }
        }
        if (d > 33.0d) {
            double d5 = this.c;
            if (d <= d5) {
                this.c = d;
            } else {
                this.c = (d + (d5 * 10.0d)) / 11.0d;
            }
        }
    }
}