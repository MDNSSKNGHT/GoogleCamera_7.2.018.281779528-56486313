package defpackage;

import android.graphics.Path;
import android.util.Log;

/* compiled from: PG */
/* renamed from: gl */
/* loaded from: classes.dex */
public final class gl {
    public char a;
    public final float[] b;

    public gl(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public gl(gl glVar) {
        this.a = glVar.a;
        float[] fArr = glVar.b;
        this.b = kq.a(fArr, fArr.length);
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        Double.isNaN(f);
        Double.isNaN(f2);
        Double.isNaN(f5);
        double d6 = (((double) f * cos) + ((double) f2 * sin)) / (double) f5;
        double d7 = f;
        double d9 = -f;
        Double.isNaN(d9);
        Double.isNaN(f2);
        Double.isNaN(f6);
        double d10 = ((d9 * sin) + ((double) f2 * cos)) / (double) f6;
        double d11 = f2;
        double d12 = f4;
        double d13 = f3;
        Double.isNaN(d13);
        Double.isNaN(d12);
        Double.isNaN(f5);
        double d14 = ((d13 * cos) + (d12 * sin)) / (double) f5;
        double d15 = -f3;
        Double.isNaN(d15);
        Double.isNaN(d12);
        Double.isNaN(f6);
        double d16 = ((d15 * sin) + (d12 * cos)) / (double) f6;
        double d17 = d6 - d14;
        double d18 = d10 - d16;
        double d19 = (d6 + d14) / 2.0d;
        double d20 = (d10 + d16) / 2.0d;
        double d21 = (d17 * d17) + (d18 * d18);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d17 * sqrt2;
        double d24 = sqrt2 * d18;
        if (z != z2) {
            d = d19 + d24;
            d2 = d20 - d23;
        } else {
            d = d19 - d24;
            d2 = d20 + d23;
        }
        double atan2 = Math.atan2(d10 - d2, d6 - d);
        double atan22 = Math.atan2(d16 - d2, d14 - d) - atan2;
        int i = 0;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 += atan22 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        Double.isNaN(f5);
        double d25 = d * (double) f5;
        Double.isNaN(f6);
        double d26 = d2 * (double) f6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d25 * sin) + (d26 * cos);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(f5);
        double d29 = -(double) f5;
        double d30 = d29 * cos2;
        Double.isNaN(f6);
        double d31 = (double) f6 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        Double.isNaN(f6);
        double d34 = (double) f6 * cos2;
        double d35 = (sin3 * d33) + (cos3 * d34);
        double d36 = ceil;
        Double.isNaN(d36);
        double d37 = atan22 / d36;
        double d38 = atan2;
        while (i < ceil) {
            double d39 = d38 + d37;
            double sin4 = Math.sin(d39);
            double cos4 = Math.cos(d39);
            Double.isNaN(f5);
            double d40 = d37;
            double d41 = (d27 + (((double) f5 * cos2) * cos4)) - (d31 * sin4);
            Double.isNaN(f5);
            double d42 = d28 + ((double) f5 * sin2 * cos4) + (d34 * sin4);
            double d43 = (d30 * sin4) - (d31 * cos4);
            double d44 = (sin4 * d33) + (cos4 * d34);
            double d45 = d39 - d38;
            double tan = Math.tan(d45 / 2.0d);
            double sin5 = (Math.sin(d45) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) (d7 + (d32 * sin5)), (float) (d11 + (d35 * sin5)), (float) (d41 - (sin5 * d43)), (float) (d42 - (sin5 * d44)), (float) d41, (float) d42);
            i++;
            d7 = d41;
            d11 = d42;
            d38 = d39;
            d35 = d44;
            d32 = d43;
            d37 = d40;
        }
    }
}