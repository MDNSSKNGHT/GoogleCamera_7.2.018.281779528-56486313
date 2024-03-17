package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* renamed from: opk  reason: default package */
/* loaded from: classes.dex */
public final class opk {
    private static final hw a = new hw();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (opk.class) {
            uri = (Uri) a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() == 0 ? new String("content://com.google.android.gms.phenotype/") : "content://com.google.android.gms.phenotype/".concat(valueOf));
                a.put(str, uri);
            }
        }
        return uri;
    }
}