package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* compiled from: PG */
/* renamed from: qrf  reason: default package */
/* loaded from: classes2.dex */
public final class qrf {
    public static /*final*/ qqz a;

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*static {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L15 java.lang.Exception -> L17
            r0 = r1
            goto L26
        L15:
            r1 = move-exception
            goto L50
        L17:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch: java.lang.Throwable -> L15
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.lang.Throwable -> L15
            r1.printStackTrace(r2)     // Catch: java.lang.Throwable -> L15
        L26:
            if (r0 == 0) goto L37
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L4d
            r2 = 19
            if (r1 >= r2) goto L31
            goto L37
        L31:
            qre r1 = new qre     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            goto L4c
        L37:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L4d
            r1 = r1 ^ 1
            if (r1 != 0) goto L47
            qrd r1 = new qrd     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
            goto L4c
        L47:
            qrc r1 = new qrc     // Catch: java.lang.Throwable -> L4d
            r1.<init>()     // Catch: java.lang.Throwable -> L4d
        L4c:
            goto L86
        L4d:
            r1 = move-exception
            goto L51
        L50:
        L51:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<qrd> r3 = defpackage.qrd.class
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 133
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            qrd r1 = new qrd
            r1.<init>()
        L86:
            defpackage.qrf.a = r1
            if (r0 == 0) goto L8d
            r0.intValue()
        L8d:
            return
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrf.<clinit>():void");
    }*/

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th) {
        a.b(th);
    }

    public static void a(Throwable th, PrintStream printStream) {
        a.a(th, printStream);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a.a(th, printWriter);
    }
}