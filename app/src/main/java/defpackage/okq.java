package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.File;

/* compiled from: PG */
/* renamed from: okq  reason: default package */
/* loaded from: classes.dex */
public class okq {
    @Deprecated
    public lfd a(Context context, Looper looper, ljk ljkVar, Object obj, lfj lfjVar, lfk lfkVar) {
        throw null;
    }

    public static String a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Context context) {
        File a = a(context);
        if (a.exists()) {
            a.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Context context) {
        orl.a(context);
        File cacheDir = context.getCacheDir();
        String d = d(context);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 17);
        sb.append(d);
        sb.append("_primes_mhd.hprof");
        File file = new File(cacheDir, sb.toString());
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File a(Context context) {
        orl.a(context);
        File cacheDir = context.getCacheDir();
        String d = d(context);
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 12);
        sb.append(d);
        sb.append("_primeshprof");
        return new File(cacheDir, sb.toString());
    }

    private static String d(Context context) {
        String d = onq.d(context);
        if (d != null) {
            String replaceAll = d.replaceAll("[^a-zA-Z0-9\\._]", "_");
            return replaceAll.substring(0, Math.min(32, replaceAll.length()));
        }
        return "";
    }
}