package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: id  reason: default package */
/* loaded from: classes.dex */
public final class id {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public id(int i) {
        this.c = i;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.a.get(obj);
                if (obj2 == null) {
                    this.g++;
                    return null;
                }
                this.f++;
                return obj2;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L90
            if (r4 == 0) goto L90
            monitor-enter(r2)
            int r0 = r2.d     // Catch: java.lang.Throwable -> L8d
            int r0 = r0 + 1
            r2.d = r0     // Catch: java.lang.Throwable -> L8d
            int r0 = r2.b     // Catch: java.lang.Throwable -> L8d
            int r0 = r0 + 1
            r2.b = r0     // Catch: java.lang.Throwable -> L8d
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L1f
            int r4 = r2.b     // Catch: java.lang.Throwable -> L8d
            int r4 = r4 + (-1)
            r2.b = r4     // Catch: java.lang.Throwable -> L8d
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8d
            int r4 = r2.c
        L22:
            monitor-enter(r2)
            int r0 = r2.b     // Catch: java.lang.Throwable -> L8a
            if (r0 < 0) goto L6b
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L33
            int r0 = r2.b     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L6b
        L33:
            int r0 = r2.b     // Catch: java.lang.Throwable -> L8a
            if (r0 <= r4) goto L69
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L69
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L8a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L8a
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8a
            r0.getValue()     // Catch: java.lang.Throwable -> L8a
            java.util.LinkedHashMap r0 = r2.a     // Catch: java.lang.Throwable -> L8a
            r0.remove(r1)     // Catch: java.lang.Throwable -> L8a
            int r0 = r2.b     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + (-1)
            r2.b = r0     // Catch: java.lang.Throwable -> L8a
            int r0 = r2.e     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + 1
            r2.e = r0     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            goto L22
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            return r3
        L6b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            r4.<init>()     // Catch: java.lang.Throwable -> L8a
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L8a
            r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8a
            throw r3     // Catch: java.lang.Throwable -> L8a
        L8a:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8a
            throw r3
        L8d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8d
            throw r3
        L90:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            goto L99
        L98:
            throw r3
        L99:
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f;
        int i3 = this.g + i2;
        if (i3 == 0) {
            i = 0;
        } else {
            i = (i2 * 100) / i3;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i));
    }

    public id() {
        this(6);
    }

    public static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}