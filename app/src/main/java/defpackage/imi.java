package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: imi  reason: default package */
/* loaded from: classes.dex */
public final class imi {
    private final SharedPreferences a;

    public imi(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final synchronized int a(String str) {
        return this.a.getInt(c(str), 0);
    }

    private static String c(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("tooltip_impression_count_for_") : "tooltip_impression_count_for_".concat(valueOf);
    }

    public final synchronized void b(String str) {
        String c = c(str);
        int i = this.a.getInt(c, 0) + 1;
        String valueOf = String.valueOf(str);
        this.a.edit().putInt(c, i).putLong(valueOf.length() == 0 ? new String("tooltip_latest_impression_timestamp_for_") : "tooltip_latest_impression_timestamp_for_".concat(valueOf), System.currentTimeMillis()).apply();
    }

    public final synchronized void a(String str, int i) {
        this.a.edit().putInt(c(str), i).apply();
    }
}