package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: cjw  reason: default package */
/* loaded from: classes.dex */
public final class cjw {
    public final cjp a;
    public final ndc b;
    public final SharedPreferences c;

    public cjw(ndc ndcVar, SharedPreferences sharedPreferences, cjp cjpVar) {
        this.a = cjpVar;
        this.b = ndcVar;
        this.c = sharedPreferences;
    }

    static ops a(cio cioVar, Integer num) {
        String str = cioVar.b;
        if (str != null) {
            String str2 = (String) qdu.d(str);
            String str3 = cioVar.a;
            opr oprVar = cjr.a;
            String sb = str2 +
                    "__" +
                    str3;
            return new opm(oprVar, sb, (Integer) qdu.d(num));
        }
        return null;
    }

    static ops a(cio cioVar, boolean z) {
        String str = cioVar.b;
        if (str != null) {
            String str2 = (String) qdu.d(str);
            String str3 = cioVar.a;
            opr oprVar = cjr.a;
            String sb = str2 +
                    "__" +
                    str3;
            return ops.a(oprVar, sb, z);
        }
        return null;
    }

    String a(String str) {
        if (str != null) {
            String a = this.b.a(str);
            if (a == null) {
                return this.b.a(str.isEmpty() ? "persist." : "persist.".concat(str));
            }
            return a;
        }
        return null;
    }
}