package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: cjl  reason: default package */
/* loaded from: classes.dex */
public final class cjl {
    private static final Pattern a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    static {
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }

    public static boolean a(String str) {
        return a.matcher(str).matches();
    }
}
