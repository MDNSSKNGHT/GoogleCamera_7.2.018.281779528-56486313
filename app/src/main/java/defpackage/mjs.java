package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mjs  reason: default package */
/* loaded from: classes.dex */
public final class mjs {
    public final int a;
    public final int b;
    private volatile mjs c;

    public mjs(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final long b() {
        return this.a * this.b;
    }

    public final float c() {
        return this.a / this.b;
    }

    private mjs(int i, int i2, mjs mjsVar) {
        this.a = i;
        this.b = i2;
        this.c = mjsVar;
    }

    public final mjs d() {
        return this.a < this.b ? a() : this;
    }

    public final mjs e() {
        return this.b < this.a ? a() : this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                mjs mjsVar = (mjs) obj;
                if (this.a == mjsVar.a && this.b == mjsVar.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public static mjs a(int i, int i2) {
        return new mjs(i, i2);
    }

    public static mjs a(Point point) {
        return new mjs(point.x, point.y);
    }

    public static mjs a(Rect rect) {
        return new mjs(rect.width(), rect.height());
    }

    public final mjs a(mjo mjoVar) {
        mjo mjoVar2 = mjo.CLOCKWISE_0;
        int ordinal = mjoVar.ordinal();
        return (ordinal == 1 || ordinal == 3) ? a() : this;
    }

    public final Size f() {
        return new Size(this.a, this.b);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public final mjs a() {
        mjs mjsVar = this.c;
        if (mjsVar == null) {
            mjs mjsVar2 = new mjs(this.b, this.a, this);
            this.c = mjsVar2;
            return mjsVar2;
        }
        return mjsVar;
    }
}