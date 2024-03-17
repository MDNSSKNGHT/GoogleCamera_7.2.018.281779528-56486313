package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* compiled from: PG */
/* renamed from: net  reason: default package */
/* loaded from: classes.dex */
public final class net {
    public static /* synthetic */ int a;
    private static UserManager b;
    private static volatile boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        c = false;
    }

    private net() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3.isUserRunning(android.os.Process.myUserHandle()) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r7) {
        /*
            boolean r0 = defpackage.net.c
            r1 = 1
            if (r0 != 0) goto L5b
            java.lang.Class<net> r0 = defpackage.net.class
            monitor-enter(r0)
            boolean r2 = defpackage.net.c     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            return r1
        Le:
            r2 = 1
        Lf:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L49
            android.os.UserManager r3 = defpackage.net.b     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L22
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L58
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> L58
            defpackage.net.b = r3     // Catch: java.lang.Throwable -> L58
        L22:
            android.os.UserManager r3 = defpackage.net.b     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L47
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.NullPointerException -> L3a java.lang.Throwable -> L58
            if (r6 != 0) goto L38
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L3a java.lang.Throwable -> L58
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L3a java.lang.Throwable -> L58
            if (r7 == 0) goto L37
            goto L49
        L37:
        L38:
            r5 = 1
            goto L4a
        L3a:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L58
            defpackage.net.b = r4     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + 1
            goto Lf
        L47:
            r5 = 1
            goto L50
        L49:
        L4a:
            if (r5 != 0) goto L4d
            goto L50
        L4d:
            defpackage.net.b = r4     // Catch: java.lang.Throwable -> L58
        L50:
            if (r5 != 0) goto L53
            goto L56
        L53:
            defpackage.net.c = r1     // Catch: java.lang.Throwable -> L58
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            return r5
        L58:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            throw r7
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.net.b(android.content.Context):boolean");
    }

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return !b(context);
    }

    public static void a() {
        int i = Build.VERSION.SDK_INT;
    }
}