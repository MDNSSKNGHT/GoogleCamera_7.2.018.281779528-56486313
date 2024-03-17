package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: bct  reason: default package */
/* loaded from: classes.dex */
public final class bct {
    private final gtl a;
    private final geq b;
    private final mop c;

    public bct(gtl gtlVar, mop mopVar, geq geqVar, byte b, byte b2) {
        this.a = gtlVar;
        this.c = mopVar;
        this.b = geqVar;
    }

    public final MeteringRectangle[] a() {
        return geh.a().b(((gtk) this.a.a()).a);
    }

    public final MeteringRectangle[] c(PointF pointF) {
        return bcr.a(pointF, pointF, this.b.d()).b(((gtk) this.a.a()).a);
    }

    private final MeteringRectangle[] a(PointF pointF, int i) {
        return bcr.a(pointF, pointF, this.b.d(), i).b(((gtk) this.a.a()).a);
    }

    public final MeteringRectangle[] b(PointF pointF) {
        return a(pointF, 2);
    }

    public final MeteringRectangle[] a(PointF pointF) {
        return a(pointF, 1);
    }
}