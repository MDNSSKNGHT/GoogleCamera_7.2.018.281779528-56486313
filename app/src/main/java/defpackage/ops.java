package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: ops  reason: default package */
/* loaded from: classes.dex */
public abstract class ops {
    private static pkx c;
    private final opr d;
    private final String e;
    private final Object f;
    private volatile int h = -1;
    private volatile Object i;
    private static final Object b = new Object();
    public static Context a = null;
    private static final AtomicInteger g = new AtomicInteger();

    public abstract Object a(Object obj);

    public /* synthetic */ ops(opr oprVar, String str, Object obj) {
        String str2 = oprVar.a;
        if (str2 != null || oprVar.b != null) {
            if (str2 == null || oprVar.b == null) {
                this.d = oprVar;
                this.e = str;
                this.f = obj;
                return;
            }
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[Catch: all -> 0x009f, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:13:0x0027, B:15:0x002d, B:22:0x0040, B:41:0x0090, B:18:0x0034, B:20:0x003a, B:23:0x0043, B:29:0x005e, B:33:0x006b, B:35:0x0075, B:36:0x007a, B:37:0x007f, B:39:0x0089, B:40:0x008c, B:28:0x005a, B:42:0x0095, B:43:0x009c, B:44:0x009d), top: B:51:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: all -> 0x009f, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0013, B:11:0x0021, B:13:0x0027, B:15:0x002d, B:22:0x0040, B:41:0x0090, B:18:0x0034, B:20:0x003a, B:23:0x0043, B:29:0x005e, B:33:0x006b, B:35:0x0075, B:36:0x007a, B:37:0x007f, B:39:0x0089, B:40:0x008c, B:28:0x005a, B:42:0x0095, B:43:0x009c, B:44:0x009d), top: B:51:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = defpackage.ops.g
            int r0 = r0.get()
            int r1 = r7.h
            if (r1 >= r0) goto La2
            monitor-enter(r7)
            int r1 = r7.h     // Catch: java.lang.Throwable -> L9f
            if (r1 >= r0) goto L9d
            android.content.Context r1 = defpackage.ops.a     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L95
            pkx r1 = defpackage.ops.c     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L9f
            pjz r1 = (defpackage.pjz) r1     // Catch: java.lang.Throwable -> L9f
            boolean r2 = r1.a()     // Catch: java.lang.Throwable -> L9f
            if (r2 != 0) goto L43
            opr r1 = r7.d     // Catch: java.lang.Throwable -> L9f
            boolean r1 = r1.f     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L34
            java.lang.Object r1 = r7.d()     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L90
            java.lang.Object r1 = r7.e()     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L90
            goto L40
        L34:
            java.lang.Object r1 = r7.e()     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L90
            java.lang.Object r1 = r7.d()     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L90
        L40:
            java.lang.Object r1 = r7.f     // Catch: java.lang.Throwable -> L9f
            goto L90
        L43:
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Throwable -> L9f
            opi r1 = (defpackage.opi) r1     // Catch: java.lang.Throwable -> L9f
            opr r2 = r7.d     // Catch: java.lang.Throwable -> L9f
            android.net.Uri r3 = r2.b     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = r2.a     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r2.d     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r7.e     // Catch: java.lang.Throwable -> L9f
            r6 = 0
            if (r3 != 0) goto L5a
            if (r4 == 0) goto L59
            goto L5e
        L59:
            goto L87
        L5a:
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L9f
        L5e:
            java.util.Map r1 = r1.a     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L9f
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L69
            goto L59
        L69:
            if (r2 == 0) goto L7f
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L9f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto L7a
            java.lang.String r5 = r2.concat(r3)     // Catch: java.lang.Throwable -> L9f
            goto L7f
        L7a:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L9f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L9f
        L7f:
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L9f
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L9f
        L87:
            if (r6 != 0) goto L8c
            java.lang.Object r1 = r7.f     // Catch: java.lang.Throwable -> L9f
            goto L90
        L8c:
            java.lang.Object r1 = r7.a(r6)     // Catch: java.lang.Throwable -> L9f
        L90:
            r7.i = r1     // Catch: java.lang.Throwable -> L9f
            r7.h = r0     // Catch: java.lang.Throwable -> L9f
            goto L9d
        L95:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9d:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            goto La2
        L9f:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L9f
            throw r0
        La2:
            java.lang.Object r0 = r7.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ops.c():java.lang.Object");
    }

    public final String b() {
        return a(this.d.d);
    }

    private final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.e;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.e);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        g.incrementAndGet();
    }

    private final Object e() {
        if (!this.d.e) {
            oph a2 = oph.a(a);
            opr oprVar = this.d;
            String b2 = a2.b(!oprVar.e ? a(oprVar.c) : null);
            if (b2 != null) {
                return a((Object) b2);
            }
        }
        return null;
    }

    private final Object d() {
        ope a2;
        Object a3;
        String b2;
        if (this.d.g || (b2 = oph.a(a).b("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) == null || !lzo.b.matcher(b2).matches()) {
            if (this.d.b != null) {
                if (opj.a(a, this.d.b)) {
                    if (!this.d.h) {
                        a2 = opb.a(a.getContentResolver(), this.d.b);
                    } else {
                        ContentResolver contentResolver = a.getContentResolver();
                        String lastPathSegment = this.d.b.getLastPathSegment();
                        String packageName = a.getPackageName();
                        StringBuilder sb = new StringBuilder(String.valueOf(lastPathSegment).length() + 1 + String.valueOf(packageName).length());
                        sb.append(lastPathSegment);
                        sb.append("#");
                        sb.append(packageName);
                        a2 = opb.a(contentResolver, opk.a(sb.toString()));
                    }
                } else {
                    a2 = null;
                }
            } else {
                a2 = opu.a(a, this.d.a);
            }
            if (a2 != null && (a3 = a2.a(b())) != null) {
                return a(a3);
            }
        }
        return null;
    }

    public static void a(Context context) {
        synchronized (b) {
            if (a == null) {
                synchronized (b) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (a != context) {
                        opb.b();
                        opu.a();
                        oph.a();
                        a();
                        a = context;
                        c = qdu.a(opl.a);
                    }
                }
            }
        }
    }

    public static ops a(opr oprVar, String str, String str2) {
        return new opp(oprVar, str, str2);
    }

    public static ops a(opr oprVar, String str, boolean z) {
        return new opn(oprVar, str, Boolean.valueOf(z));
    }
}