package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;

/* compiled from: PG */
/* renamed from: onq  reason: default package */
/* loaded from: classes.dex */
public final class onq {
    private static volatile ActivityManager a = null;
    private static volatile boolean b;

    private onq() {
    }

    public static ActivityManager a(Context context) {
        if (a == null) {
            synchronized (onq.class) {
                if (a == null) {
                    a = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
                }
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(android.content.Context r6) {
        /*
            java.lang.String r6 = r6.getPackageName()
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 <= 0) goto L56
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r5 = 25
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r4.append(r0)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L4a
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3f
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3f
            r2.close()     // Catch: java.io.IOException -> L39
            goto L58
        L39:
            r2 = move-exception
            goto L58
        L3b:
            r6 = move-exception
            r1 = r2
            goto L42
        L3f:
            r0 = move-exception
            goto L4c
        L41:
            r6 = move-exception
        L42:
            if (r1 == 0) goto L49
            r1.close()     // Catch: java.io.IOException -> L48
            goto L49
        L48:
            r0 = move-exception
        L49:
            throw r6
        L4a:
            r0 = move-exception
            r2 = r1
        L4c:
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L52
            goto L57
        L52:
            r0 = move-exception
            r0 = r1
            goto L58
        L55:
            goto L57
        L56:
        L57:
            r0 = r1
        L58:
            if (r0 != 0) goto L5b
        L5a:
            goto L77
        L5b:
            if (r6 == 0) goto L5a
            boolean r2 = r0.startsWith(r6)
            if (r2 == 0) goto L77
            int r6 = r6.length()
            int r2 = r0.length()
            if (r2 != r6) goto L6f
            r0 = r1
            goto L77
        L6f:
            int r6 = r6 + 1
            java.lang.String r6 = r0.substring(r6)
            return r6
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onq.d(android.content.Context):java.lang.String");
    }

    public static boolean b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName())) {
                int i = Build.VERSION.SDK_INT;
                return true;
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService(Context.POWER_SERVICE)).isInteractive();
    }
}