package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.view.Display;

/* compiled from: PG */
/* renamed from: kmr  reason: default package */
/* loaded from: classes.dex */
public enum kmr {
    PORTRAIT(0),
    LANDSCAPE(270),
    REVERSE_LANDSCAPE(90),
    REVERSE_PORTRAIT(180);
    
    public final int e;

    kmr(int i) {
        this.e = i;
    }

    public static kmr a(int i) {
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i == 270) {
                        return LANDSCAPE;
                    }
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Unsupported orientation degrees: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                return REVERSE_PORTRAIT;
            }
            return REVERSE_LANDSCAPE;
        }
        return PORTRAIT;
    }

    public static kmr a(int i, boolean z, int i2, int i3) {
        if (i2 >= i3 && !z) {
            if (i == 0 || i == 1) {
                return LANDSCAPE;
            }
            if (i == 2 || i == 3) {
                return REVERSE_LANDSCAPE;
            }
            throw new IllegalStateException("Reverse portrait not supported");
        }
        return PORTRAIT;
    }

    public static kmr a(Display display, Context context) {
        Point point = new Point();
        display.getSize(point);
        return a(display, context, point.x, point.y);
    }

    public static kmr a(Display display, Context context, int i, int i2) {
        return a(display.getRotation(), ((Activity) context).isInMultiWindowMode(), i, i2);
    }

    public final kmr a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return PORTRAIT;
                    }
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("unsupported orientation: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                return LANDSCAPE;
            }
            return REVERSE_LANDSCAPE;
        }
        return REVERSE_PORTRAIT;
    }

    public static boolean a(kmr kmrVar) {
        return kmrVar.equals(PORTRAIT) || kmrVar.equals(REVERSE_PORTRAIT);
    }
}