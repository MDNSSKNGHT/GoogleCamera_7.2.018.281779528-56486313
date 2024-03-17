package defpackage;

/* compiled from: PG */
/* renamed from: fdw  reason: default package */
/* loaded from: classes.dex */
public final class fdw {
    private static final String b = liu.a("MaxNativeMemory");
    public final long a;

    public fdw(cin cinVar) {
        long j;
        int intValue = ((Integer) cinVar.a(cit.k).b()).intValue();
        if (intValue > 0) {
            String str = b;
            StringBuilder sb = new StringBuilder(53);
            sb.append("Max native memory overridden (gservices): ");
            sb.append(intValue);
            sb.toString();
            liu.d(str);
            j = intValue;
        } else {
            String str2 = b;
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Max native memory overridden (device): 420");
            sb2.toString();
            liu.d(str2);
            j = 420;
        }
        this.a = j * 1000000;
    }
}
