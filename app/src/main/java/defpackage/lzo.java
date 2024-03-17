package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: lzo  reason: default package */
/* loaded from: classes.dex */
public final class lzo {
    private static HashMap h;
    private static Object k;
    private static boolean l;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri g = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean d = new AtomicBoolean();
    public static final HashMap e = new HashMap();
    private static final HashMap i = new HashMap();
    public static final HashMap f = new HashMap();
    private static final HashMap j = new HashMap();
    private static final String[] m = new String[0];

    private static void b(ContentResolver contentResolver) {
        if (h == null) {
            d.set(false);
            h = new HashMap();
            k = new Object();
            l = false;
            contentResolver.registerContentObserver(a, true, new lzn());
        } else if (d.getAndSet(false)) {
            h.clear();
            e.clear();
            i.clear();
            f.clear();
            j.clear();
            k = new Object();
            l = false;
        }
    }

    public static int a(ContentResolver contentResolver, String str, int i2) {
        Object a2 = a(contentResolver);
        Integer num = (Integer) a(i, str, Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        String a3 = a(contentResolver, str);
        if (a3 != null) {
            try {
                int parseInt = Integer.parseInt(a3);
                num = Integer.valueOf(parseInt);
                i2 = parseInt;
            } catch (NumberFormatException e2) {
            }
        }
        a(a2, i, str, num);
        return i2;
    }

    @Deprecated
    public static String a(ContentResolver contentResolver, String str) {
        return a(contentResolver, str, (String) null);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (lzo.class) {
            b(contentResolver);
            Object obj = k;
            if (h.containsKey(str)) {
                String str3 = (String) h.get(str);
                if (str3 == null) {
                    str3 = str2;
                }
                return str3;
            }
            for (String str4 : m) {
                if (str.startsWith(str4)) {
                    if (!l || h.isEmpty()) {
                        String[] strArr = m;
                        HashMap hashMap = h;
                        Cursor query = contentResolver.query(g, null, null, strArr, null);
                        TreeMap treeMap = new TreeMap();
                        if (query != null) {
                            while (query.moveToNext()) {
                                treeMap.put(query.getString(0), query.getString(1));
                            }
                            query.close();
                        }
                        hashMap.putAll(treeMap);
                        l = true;
                        if (h.containsKey(str)) {
                            String str5 = (String) h.get(str);
                            if (str5 == null) {
                                str5 = str2;
                            }
                            return str5;
                        }
                    }
                    return str2;
                }
            }
            Cursor query2 = contentResolver.query(a, null, null, new String[]{str}, null);
            if (query2 != null) {
                try {
                    if (query2.moveToFirst()) {
                        String string = query2.getString(1);
                        if (string != null && string.equals(str2)) {
                            string = str2;
                        }
                        a(obj, str, string);
                        if (string != null) {
                            str2 = string;
                        }
                    } else {
                        a(obj, str, (String) null);
                    }
                    return str2;
                } finally {
                    query2.close();
                }
            }
            return str2;
        }
    }

    public static Object a(HashMap hashMap, String str, Object obj) {
        synchronized (lzo.class) {
            if (hashMap.containsKey(str)) {
                Object obj2 = hashMap.get(str);
                if (obj2 == null) {
                    obj2 = obj;
                }
                return obj2;
            }
            return null;
        }
    }

    public static Object a(ContentResolver contentResolver) {
        Object obj;
        synchronized (lzo.class) {
            b(contentResolver);
            obj = k;
        }
        return obj;
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (lzo.class) {
            if (obj == k) {
                h.put(str, str2);
            }
        }
    }

    public static void a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (lzo.class) {
            if (obj == k) {
                hashMap.put(str, obj2);
                h.remove(str);
            }
        }
    }
}