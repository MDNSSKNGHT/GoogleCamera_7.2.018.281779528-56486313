package defpackage;

import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: kot  reason: default package */
/* loaded from: classes.dex */
public final class kot {
    private static final TreeMap a = new TreeMap();

    public static synchronized long a(long j) {
        long longValue;
        synchronized (kot.class) {
            Long l = (Long) a.get(Long.valueOf(j));
            longValue = l != null ? l.longValue() : System.currentTimeMillis();
        }
        return longValue;
    }

    public static synchronized void b(long j) {
        synchronized (kot.class) {
            TreeMap treeMap = a;
            Long valueOf = Long.valueOf(j);
            if (!treeMap.containsKey(valueOf)) {
                a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
            }
            while (a.size() > 1800) {
                a.pollFirstEntry();
            }
        }
    }
}