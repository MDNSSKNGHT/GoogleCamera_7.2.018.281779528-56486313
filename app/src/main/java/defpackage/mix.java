package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: mix  reason: default package */
/* loaded from: classes.dex */
public final class mix {
    public static final mix a = a(4, 3);
    public static final mix b = a(16, 9);
    private final int c;
    private final int d;

    private final boolean e() {
        return this.c <= this.d;
    }

    public final float a() {
        return this.c / this.d;
    }

    public final float a(float f) {
        return (f * this.d) / this.c;
    }

    public final double b() {
        double d = this.c;
        double d2 = this.d;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    private mix(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final mix c() {
        return this.c < this.d ? d() : this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mix) {
                mix mixVar = (mix) obj;
                if (this.d == mixVar.d && this.c == mixVar.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final Rect a(Rect rect) {
        mix a2 = a(rect.width(), rect.height());
        if (this.c * a2.d > a2.c * this.d) {
            int width = (rect.width() * this.d) / this.c;
            int height = rect.top + ((rect.height() - width) / 2);
            return new Rect(rect.left, height, rect.left + rect.width(), width + height);
        }
        int height2 = (rect.height() * this.c) / this.d;
        int width2 = rect.left + ((rect.width() - height2) / 2);
        return new Rect(width2, rect.top, height2 + width2, rect.top + rect.height());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final boolean a(mix mixVar) {
        float a2 = a();
        if (!e()) {
            mixVar = mixVar.c();
        } else if (!mixVar.e()) {
            mixVar = mixVar.d();
        }
        return ((double) Math.abs(a2 - mixVar.a())) < 0.025d;
    }

    public static mix a(int i, int i2) {
        int intValue = BigInteger.valueOf(i).gcd(BigInteger.valueOf(i2)).intValue();
        return new mix(i / intValue, i2 / intValue);
    }

    public static mix a(Size size) {
        return a(size.getWidth(), size.getHeight());
    }

    public static mix a(mjs mjsVar) {
        return a(mjsVar.a, mjsVar.b);
    }

    public final String toString() {
        return String.format((Locale) null, "AspectRatio[%d:%d]", Integer.valueOf(this.c), Integer.valueOf(this.d));
    }

    private final mix d() {
        return a(this.d, this.c);
    }
}
