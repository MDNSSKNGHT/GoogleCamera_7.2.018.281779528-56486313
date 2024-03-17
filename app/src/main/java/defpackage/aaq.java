package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: aaq  reason: default package */
/* loaded from: classes.dex */
class aaq implements Interpolator {
    private final float[] a;
    private final float b;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaq(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = 1.0f;
        if (f < 1.0f) {
            f2 = 0.0f;
            if (f > 0.0f) {
                int length = this.a.length;
                int min = Math.min((int) ((length - 1) * f), length - 2);
                float f3 = this.b;
                float[] fArr = this.a;
                float f4 = fArr[min];
                return f4 + (((f - (min * f3)) / f3) * (fArr[min + 1] - f4));
            }
        }
        return f2;
    }
}