package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: oar */
/* loaded from: classes.dex */
public final class oar {
    public static final oar a = a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    public static final oar b = a(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    public final float[] c;

    private oar(float[] fArr) {
        qdu.c(fArr.length == 9);
        this.c = fArr;
    }

    public static oar a(float[] fArr) {
        return new oar(Arrays.copyOf(fArr, fArr.length));
    }

    public static oar a() {
        return a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof oar) {
                return Arrays.equals(this.c, ((oar) obj).c);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c);
    }

    public final float[] b() {
        float[] fArr = this.c;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final String toString() {
        float[] fArr = this.c;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        StringBuilder sb = new StringBuilder(153);
        sb.append("[");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(f3);
        sb.append("; ");
        sb.append(f4);
        sb.append(", ");
        sb.append(f5);
        sb.append(", ");
        sb.append(f6);
        sb.append("; ");
        sb.append(f7);
        sb.append(", ");
        sb.append(f8);
        sb.append(", ");
        sb.append(f9);
        sb.append("]");
        return sb.toString();
    }

    public final float[] b(float[] fArr) {
        float[] fArr2 = this.c;
        float f = fArr2[6];
        float f2 = fArr[0];
        float f3 = fArr2[7];
        float f4 = fArr[1];
        float f5 = (f * f2) + (f3 * f4) + fArr2[8];
        return new float[]{(((fArr2[0] * f2) + (fArr2[1] * f4)) + fArr2[2]) / f5, (((fArr2[3] * fArr[0]) + (fArr2[4] * fArr[1])) + fArr2[5]) / f5};
    }
}