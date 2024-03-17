package defpackage;

/* compiled from: PG */
/* renamed from: mtz  reason: default package */
/* loaded from: classes.dex */
public final class mtz {
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;

    private mtz() {
    }

    public static int d() {
        int i;
        synchronized (mtz.class) {
            i = d;
            d = i + 1;
        }
        return i;
    }

    public static int b() {
        int i;
        synchronized (mtz.class) {
            i = b;
            b = i + 1;
        }
        return i;
    }

    public static int e() {
        int i;
        synchronized (mtz.class) {
            i = e;
            e = i + 1;
        }
        return i;
    }

    public static int c() {
        int i;
        synchronized (mtz.class) {
            i = c;
            c = i + 1;
        }
        return i;
    }

    public static int a() {
        int i;
        synchronized (mtz.class) {
            i = a;
            a = i + 1;
        }
        return i;
    }

    public static int f() {
        int i;
        synchronized (mtz.class) {
            i = f;
            f = i + 1;
        }
        return i;
    }
}