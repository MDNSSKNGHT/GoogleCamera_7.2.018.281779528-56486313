package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: nda  reason: default package */
/* loaded from: classes.dex */
public final class nda {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    private nda(long j) {
        this.a = j == -2398083415379664855L;
        this.b = j == 1938362633813361533L;
        this.c = j == -1181909560337748989L;
        this.i = j == 2353878190013225779L;
        this.h = j == 5177423953723387160L;
        this.j = j == 1998349393618216766L;
        this.k = j == -3048193804805810922L;
        this.d = j == -1134170917312626182L;
        this.e = j == 7819589124620182093L;
        this.f = j == 1863053326329578117L;
        this.l = j == -6540513541338685385L;
        this.m = j == 8020350475331722164L;
        this.n = j == 4736388726057620427L;
        this.g = j == 1128693008105137506L;
    }

    public boolean b() {
        return this.i || this.h;
    }

    public boolean c() {
        return this.j || this.k;
    }

    public boolean d() {
        return this.e || this.d;
    }

    public boolean e() {
        return this.f || this.l;
    }

    public boolean f() {
        return this.m || this.n || this.g;
    }

    public static nda a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.FINGERPRINT;
        String a = a(str);
        String a2 = a(str2);
        String a3 = a(str3);
        if (a2.startsWith("GENERIC") || a3.startsWith("GENERIC") || a3.contains("SDK_") || a3.contains("_SDK")) {
            return new nda(-8977428044353436645L);
        }
        String sb = "G1V5VHBME0Mq6trmUxb9Q9URJXm0Sof1|" +
                a2 +
                "|" +
                a;
        return new nda(qbe.a().a(sb.toUpperCase(Locale.ROOT)).c());
    }

    private static String a(String str) {
        return str != null ? str.toUpperCase(Locale.ROOT) : "unknown";
    }
}
