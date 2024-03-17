package defpackage;

/* compiled from: PG */
/* renamed from: opj  reason: default package */
/* loaded from: classes.dex */
public final class opj {
    private static volatile pjz a = pix.a;
    private static final Object b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(12:15|(7:17|(1:21)|22|23|24|25|26)|27|28|29|30|(1:32)(1:33)|22|23|24|25|26) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r3, android.net.Uri r4) {
        /*
            java.lang.String r4 = r4.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r4)
            r1 = 0
            if (r0 != 0) goto L2e
            java.lang.String r3 = java.lang.String.valueOf(r4)
            int r3 = r3.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r3 = r3 + 91
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r3 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "PhenotypeClientHelper"
            android.util.Log.e(r4, r3)
            return r1
        L2e:
            pjz r4 = defpackage.opj.a
            boolean r4 = r4.a()
            if (r4 == 0) goto L43
            pjz r3 = defpackage.opj.a
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L43:
            java.lang.Object r4 = defpackage.opj.b
            monitor-enter(r4)
            pjz r0 = defpackage.opj.a     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L9f
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L72
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "com.google.android.gms.phenotype"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r1)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L71
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L71
            goto L72
        L71:
            goto L87
        L72:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L85 java.lang.Throwable -> Lad
            int r3 = r3.flags     // Catch: java.lang.Throwable -> Lad
            r3 = r3 & 129(0x81, float:1.81E-43)
            if (r3 != 0) goto L83
            goto L71
        L83:
            r1 = 1
            goto L71
        L85:
            r3 = move-exception
        L87:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Lad
            pjz r3 = defpackage.pjz.b(r3)     // Catch: java.lang.Throwable -> Lad
            defpackage.opj.a = r3     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lad
            pjz r3 = defpackage.opj.a
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L9f:
            pjz r3 = defpackage.opj.a     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lad
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lad
            return r3
        Lad:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lad
            goto Lb1
        Lb0:
            throw r3
        Lb1:
            goto Lb0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opj.a(android.content.Context, android.net.Uri):boolean");
    }
}