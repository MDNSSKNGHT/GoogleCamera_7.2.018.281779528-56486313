package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: mjy */
/* loaded from: classes.dex */
public final class mjy {
    public static final Object a = new Object();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    private mjy() {
    }

    public static void a(Class cls) {
        a(cls, null);
    }

    public static void a(Class cls, String str) {
        mjx mjxVar;
        synchronized (a) {
            String str2 = (String) c.get(cls);
            if (str2 != null) {
                mjxVar = (mjx) b.get(str2);
            } else if (str != null) {
                mjxVar = (mjx) b.get(str);
                if (mjxVar == null) {
                    mjxVar = new mjx(str);
                    b.put(str, mjxVar);
                }
            } else {
                mjxVar = null;
            }
        }
        if (mjxVar != null) {
            try {
                mjxVar.b();
                return;
            } catch (UnsatisfiedLinkError e) {
                String mapLibraryName = System.mapLibraryName(mjxVar.a);
                String message = e.getMessage();
                if (message != null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(mapLibraryName).length() + 16);
                    sb.append("couldn't find \"");
                    sb.append(mapLibraryName);
                    sb.append("\"");
                    if (message.contains(sb.toString())) {
                        throw new UnsatisfiedLinkError(String.format((Locale) null, "Failed to resolve \"%s\" for \"%s\". Did you forget to include the .so or register it with %s.register(%s.class, %s)? \n%s", mapLibraryName, cls.getSimpleName(), mjy.class.getSimpleName(), cls.getSimpleName(), mjxVar.a, e.getMessage()));
                    }
                }
                throw e;
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new IllegalStateException(valueOf.length() == 0 ? new String("JniLoader was null for ") : "JniLoader was null for ".concat(valueOf));
    }
}