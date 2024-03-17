package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: oro  reason: default package */
/* loaded from: classes.dex */
public /* synthetic */ class oro {
    private static Thread a;
    private static volatile Handler b;

    public static boolean a(short s) {
        return ((s & (-16)) != -64 || s == -60 || s == -56 || s == -52) ? false : true;
    }

    public void a() {
    }

    public void a(ndr ndrVar) {
    }

    public void b() {
    }

    public void c() {
    }

    public static void h() {
        if (g()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static Handler i() {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        return b;
    }

    public static boolean g() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static void a(Runnable runnable) {
        i().post(runnable);
    }

    public static orr f() {
        return new ors();
    }
}