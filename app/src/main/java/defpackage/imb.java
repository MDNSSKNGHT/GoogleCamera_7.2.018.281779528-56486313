package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: imb  reason: default package */
/* loaded from: classes.dex */
public abstract class imb {
    public static String a(boolean z) {
        return z ? "1" : "0";
    }

    public abstract int a(String str, String str2, Integer num);

    public abstract SharedPreferences a();

    public abstract SharedPreferences a(String str);

    public abstract void a(ilr ilrVar);

    public abstract void a(String str, int i, int[] iArr);

    public abstract void a(String str, String str2, int i);

    public abstract void a(String str, String str2, long j);

    public abstract void a(String str, String str2, String str3);

    public abstract void a(String str, String str2, boolean z);

    public abstract void a(String str, boolean z);

    public abstract boolean a(String str, String str2);

    public abstract String b(String str, String str2);

    public abstract void b(ilr ilrVar);

    public abstract boolean b(String str, String str2, boolean z);

    public abstract int c(String str, String str2);

    public abstract long d(String str, String str2);

    public abstract boolean e(String str, String str2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2);

    public abstract void h(String str, String str2);

    public static String b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("_preferences_camera_") : "_preferences_camera_".concat(valueOf);
    }
}
