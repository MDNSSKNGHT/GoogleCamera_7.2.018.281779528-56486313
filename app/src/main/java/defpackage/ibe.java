package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: ibe  reason: default package */
/* loaded from: classes.dex */
public final class ibe {
    public final Rect a;
    public final int b;
    public final PointF c;
    public final PointF d;
    public final PointF e;
    public final PointF f;
    public final PointF g;
    public final PointF h;
    public final int i;
    public final float j;
    public final float k;
    public final float l;

    private ibe(int i, Rect rect, int i2, PointF pointF, PointF pointF2, PointF pointF3) {
        this(i, rect, i2, pointF, pointF2, pointF3, null, null, null, 0.0f, 0.0f, 0.0f);
    }

    public ibe(int i, Rect rect, int i2, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5, PointF pointF6, float f, float f2, float f3) {
        this.a = rect;
        this.b = i2;
        this.c = pointF;
        this.d = pointF2;
        this.e = pointF3;
        this.f = pointF4;
        this.g = pointF5;
        this.h = pointF6;
        this.i = i;
        this.j = f;
        this.k = f2;
        this.l = f3;
    }

    public ibe(Rect rect, int i) {
        this(-1, rect, i, null, null, null);
    }

    public static ibe a(Face face) {
        return new ibe(face.getId(), face.getBounds(), face.getScore(), face.getLeftEyePosition() != null ? new PointF(face.getLeftEyePosition()) : null, face.getRightEyePosition() != null ? new PointF(face.getRightEyePosition()) : null, face.getMouthPosition() != null ? new PointF(face.getMouthPosition()) : null);
    }
}