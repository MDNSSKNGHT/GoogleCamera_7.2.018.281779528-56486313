package defpackage;

/* compiled from: PG */
/* renamed from: grj  reason: default package */
/* loaded from: classes.dex */
public enum grj {
    ON("on", 3),
    AUTO("auto", 2),
    OFF("off", 1);
    
    public final String d;
    public final int e;

    grj(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public static grj a(String str, grj grjVar) {
        qdu.d(str);
        return !AUTO.d.equals(str) ? !OFF.d.equals(str) ? ON.d.equals(str) ? ON : grjVar : OFF : AUTO;
    }
}
