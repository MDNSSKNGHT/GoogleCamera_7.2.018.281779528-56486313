package defpackage;

/* compiled from: PG */
/* renamed from: mmk  reason: default package */
/* loaded from: classes.dex */
public final class mmk {
    public static neb a(gab gabVar, int... iArr) {
        neb b = gabVar.b();
        neb nebVar = null;
        int i = -1;
        while (b != null) {
            if (!rgk.a(iArr, b.b())) {
                b.close();
            } else {
                int c = b.c() * b.d();
                if (c > i) {
                    if (nebVar != null) {
                        nebVar.close();
                    }
                    nebVar = b;
                    i = c;
                }
            }
            b = gabVar.b();
        }
        gabVar.close();
        return nebVar;
    }

    public static synchronized boolean a() {
        synchronized (mmk.class) {
        }
        return false;
    }

    public static void b(mkn mknVar, String str, Runnable runnable) {
        try {
            mknVar.b(str);
            runnable.run();
        } finally {
            mknVar.a();
        }
    }

    public static Runnable a(mkn mknVar, String str, Runnable runnable) {
        return new mkk(mknVar, str, runnable);
    }

    public static String a(long j) {
        return a(j % 1000, 3);
    }

    public static String b(long j) {
        return a(j, 2);
    }

    private static String a(long j, int i) {
        return qdu.a(Long.toString(j), i);
    }
}
