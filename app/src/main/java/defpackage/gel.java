package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: gel  reason: default package */
/* loaded from: classes.dex */
public final class gel {
    private final int a;

    public gel(int i) {
        this.a = i;
    }

    public final PointF a(PointF pointF) {
        int i = this.a;
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return new PointF(1.0f - pointF.y, pointF.x);
                    }
                    throw new IllegalArgumentException("Unsupported Sensor Orientation");
                }
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            }
            return new PointF(pointF.y, 1.0f - pointF.x);
        }
        return pointF;
    }

    public final PointF b(PointF pointF) {
        int i = this.a;
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return new PointF(pointF.y, 1.0f - pointF.x);
                    }
                    throw new IllegalArgumentException("Unsupported Sensor Orientation");
                }
                return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
            }
            return new PointF(1.0f - pointF.y, pointF.x);
        }
        return pointF;
    }
}