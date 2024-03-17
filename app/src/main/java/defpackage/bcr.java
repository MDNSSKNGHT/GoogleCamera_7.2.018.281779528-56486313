package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: bcr  reason: default package */
/* loaded from: classes.dex */
public final class bcr implements gei {
    private static final String a = liu.a("PointMtgParams");
    private final PointF b;
    private final PointF c;
    private final gel d;
    private final int e;

    private bcr(PointF pointF, PointF pointF2, gel gelVar, int i) {
        this.b = pointF;
        this.c = pointF2;
        this.d = gelVar;
        this.e = i;
    }

    private static final int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static bcr a(PointF pointF, PointF pointF2, int i) {
        qdu.a(i % 90 == 0, "sensorOrientation must be a multiple of 90");
        qdu.a(i >= 0, "sensorOrientation must not be negative");
        return new bcr(pointF, pointF2, new gel(i % 360), 0);
    }

    public static bcr a(PointF pointF, PointF pointF2, int i, int i2) {
        qdu.a(i % 90 == 0, "sensorOrientation must be a multiple of 90");
        qdu.a(i >= 0, "sensorOrientation must not be negative");
        return new bcr(pointF, pointF2, new gel(i % 360), i2);
    }

    @Override // defpackage.gei
    public final MeteringRectangle[] a(Rect rect) {
        return new MeteringRectangle[]{a(this.c, rect)};
    }

    @Override // defpackage.gei
    public final MeteringRectangle[] b(Rect rect) {
        return new MeteringRectangle[]{a(this.b, rect)};
    }

    private final MeteringRectangle a(PointF pointF, Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            String str = a;
            String valueOf = String.valueOf(rect);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Negative cropRegion: ");
            sb.append(valueOf);
            liu.b(str, sb.toString());
        }
        rect.left = Math.max(0, rect.left);
        rect.top = Math.max(0, rect.top);
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        int max = Math.max(0, Math.min(rect.width(), rect.height()));
        PointF a2 = this.d.a(pointF);
        PointF pointF2 = new PointF(rect.left + (a2.x * rect.width()), rect.top + (a2.y * rect.height()));
        float f = (int) (max * 0.06125f);
        Rect rect2 = new Rect((int) (pointF2.x - f), (int) (pointF2.y - f), (int) (pointF2.x + f), (int) (pointF2.y + f));
        rect2.left = a(rect2.left, rect.left, rect.right);
        rect2.top = a(rect2.top, rect.top, rect.bottom);
        rect2.right = a(rect2.right, rect.left, rect.right);
        rect2.bottom = a(rect2.bottom, rect.top, rect.bottom);
        int i = this.e;
        if (i == 0) {
            i = 122;
        }
        return new MeteringRectangle(rect2, i);
    }
}