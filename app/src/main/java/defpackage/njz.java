package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: njz  reason: default package */
/* loaded from: classes.dex */
public final class njz {
    public static int a(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            default:
                return 0;
        }
    }

    public static HashMap a(icn[] icnVarArr) {
        HashMap hashMap = new HashMap();
        for (icn icnVar : icnVarArr) {
            if (icnVar.b.a()) {
                hashMap.put(Integer.valueOf((int) icnVar.a), (List) icnVar.b.b());
            }
        }
        return hashMap;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            a((RuntimeException) new NullPointerException());
        }
        return obj;
    }

    public static void a() {
        a(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    public static void a(boolean z, String str) {
        if (z) {
            return;
        }
        a((RuntimeException) new IllegalStateException(str));
    }

    private static void a(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }
}