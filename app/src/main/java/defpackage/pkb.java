package defpackage;

import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: pkb  reason: default package */
/* loaded from: classes.dex */
public final class pkb {
    static {
        Logger.getLogger(pkb.class.getName());
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    private pkb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pjm c(String str) {
        qdu.d(str);
        return new pjv(Pattern.compile(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pjz a(Class cls, String str) {
        Map map;
        synchronized (pjn.a) {
            map = (Map) pjn.a.get(cls);
            if (map == null) {
                map = new HashMap();
                Iterator it = EnumSet.allOf(cls).iterator();
                while (it.hasNext()) {
                    Enum r3 = (Enum) it.next();
                    map.put(r3.name(), new WeakReference(r3));
                }
                pjn.a.put(cls, map);
            }
        }
        WeakReference weakReference = (WeakReference) map.get(str);
        return weakReference != null ? pjz.b((Enum) cls.cast(weakReference.get())) : pix.a;
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.nanoTime();
    }
}