package defpackage;

import android.view.Display;

/* compiled from: PG */
/* renamed from: mjo  reason: default package */
/* loaded from: classes.dex */
public enum mjo {
    CLOCKWISE_0(0),
    CLOCKWISE_90(90),
    CLOCKWISE_180(180),
    CLOCKWISE_270(270);
    
    public final int e;

    public final int a() {
        return (360 - this.e) % 360;
    }

    mjo(int i) {
        this.e = i;
    }

    public static mjo a(int i) {
        if (i != -1 && i != 0) {
            if (i != 90) {
                if (i != 180) {
                    if (i != 270) {
                        int abs = (((Math.abs(i / 360) * 360) + 360) + i) % 360;
                        return (abs > 315 || abs <= 45) ? CLOCKWISE_0 : abs > 135 ? abs > 225 ? CLOCKWISE_270 : CLOCKWISE_180 : CLOCKWISE_90;
                    }
                    return CLOCKWISE_270;
                }
                return CLOCKWISE_180;
            }
            return CLOCKWISE_90;
        }
        return CLOCKWISE_0;
    }

    public static mjo a(Display display) {
        return b(display.getRotation());
    }

    public static mjo c(int i) {
        return a((360 - i) % 360);
    }

    public static mjo b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return i != 3 ? CLOCKWISE_0 : c(270);
                }
                return c(180);
            }
            return c(90);
        }
        return c(0);
    }
}