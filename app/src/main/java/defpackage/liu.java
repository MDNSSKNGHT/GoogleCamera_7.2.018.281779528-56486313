package defpackage;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: liu  reason: default package */
/* loaded from: classes.dex */
public final class liu {
    public liu() {
    }

    public static void b(String str) {
        a(str, 3);
    }

    public static void c(String str) {
        a(str, 3);
    }

    public static void a(String str, String str2) {
        if (a(str, 6)) {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    public static void d(String str) {
        a(str, 4);
    }

    public static void e(String str) {
        a(str, 4);
    }

    public static boolean a(String str, int i) {
        try {
            if (cnh.a != 0) {
                return cnh.a <= i;
            } else if (i != 2) {
                return "userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE) || b(str, i);
            } else {
                return b(str, 2);
            }
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            a("CAM_Log", valueOf.isEmpty() ? "String too long:" : "String too long:".concat(valueOf));
            return false;
        }
    }

    public static String a(String str) {
        int length = str.length() - 19;
        if (length > 0) {
            b("CAM_Log", "Tag " +
                    str +
                    " is " +
                    length +
                    " chars longer than limit.");
        }
        if (length > 0) {
            str = str.substring(0, 19);
        }
        return str.isEmpty() ? "CAM_" : "CAM_".concat(str);
    }

    private static boolean b(String str, int i) {
        return Log.isLoggable("CAM_", i) || Log.isLoggable(str, i);
    }

    public static void f(String str) {
        a(str, 2);
    }

    public static void g(String str) {
        a(str, 2);
    }

    public static void b(String str, String str2) {
        if (a(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public liu(String[] strArr) {
        String[] strArr2 = (String[]) ctp.a(strArr);
        new ArrayList<>();
        new HashMap<>();
    }

    public static lff a(Status status) {
        if (status.h == null) {
            return new lff(status);
        }
        return new lfp(status);
    }
}