package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* renamed from: koe  reason: default package */
/* loaded from: classes.dex */
public final class koe {
    private final Context a;

    public koe(Context context) {
        this.a = context;
    }

    public final boolean a(String str) {
        qdu.d(str);
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0);
            if (packageInfo != null) {
                String str2 = packageInfo.versionName;
                if (str2.equals("DEVELOPMENT")) {
                    return true;
                }
                try {
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 39 + str.length());
                    sb.append("Fail to check the version between ");
                    sb.append(str2);
                    sb.append(" and ");
                    sb.append(str);
                    liu.a("PhotosPkgDtr", sb.toString());
                }
                return new kod(str2).a(new kod(str)) >= 0;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }
}
