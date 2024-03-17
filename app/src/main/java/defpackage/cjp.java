package defpackage;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: cjp  reason: default package */
/* loaded from: classes.dex */
public final class cjp {
    private final ContentResolver a;

    public cjp(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public final String a(String str) {
        if (str != null) {
            String a = lzo.a(this.a, str.isEmpty() ? "camera:" : "camera:".concat(str), "");
            if (pkb.a(a)) {
                return null;
            }
            return a;
        }
        return null;
    }
}