package defpackage;

import android.os.Build;

/* compiled from: PG */
/* renamed from: ncz  reason: default package */
/* loaded from: classes.dex */
public final class ncz {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
        if ("MASTER".equals(r6) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private ncz(int r5, java.lang.String r6) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            r2 = 21
            if (r5 < r2) goto Lb
            r2 = 1
            goto Ld
        Lb:
            r2 = 0
        Ld:
            r4.a = r2
            r2 = 23
            if (r5 < r2) goto L15
            r2 = 1
            goto L17
        L15:
            r2 = 0
        L17:
            r4.b = r2
            r2 = 24
            if (r5 < r2) goto L1f
            r2 = 1
            goto L21
        L1f:
            r2 = 0
        L21:
            r4.c = r2
            r2 = 26
            if (r5 < r2) goto L29
            r2 = 1
            goto L2b
        L29:
            r2 = 0
        L2b:
            r4.d = r2
            r2 = 28
            if (r5 < r2) goto L33
            r3 = 1
            goto L35
        L33:
            r3 = 0
        L35:
            r4.e = r3
            if (r5 <= r2) goto L3a
        L39:
            goto L5d
        L3a:
            if (r5 < r2) goto L5c
            defpackage.qdu.c(r1)
            defpackage.qdu.c(r1)
            java.lang.String r5 = "Q"
            char r2 = r5.charAt(r0)
            char r3 = r6.charAt(r0)
            if (r3 > r2) goto L39
            boolean r5 = r6.startsWith(r5)
            if (r5 != 0) goto L39
            java.lang.String r5 = "MASTER"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L39
        L5c:
            r1 = 0
        L5d:
            r4.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ncz.<init>(int, java.lang.String):void");
    }

    public static ncz a() {
        Integer valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        String str = Build.ID;
        int intValue = valueOf.intValue() > 0 ? valueOf.intValue() : 1;
        if (str == null) {
            str = "AAA01";
        }
        return new ncz(intValue, str);
    }
}
