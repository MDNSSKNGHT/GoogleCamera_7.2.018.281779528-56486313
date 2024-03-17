package defpackage;

/* compiled from: PG */
/* renamed from: gri  reason: default package */
/* loaded from: classes.dex */
public enum gri {
    AUTO("auto", 2),
    OFF("off", 1),
    ON("on", 3);
    
    public final String d;
    public final int e;

    gri(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public static gri a(String str, gri griVar) {
        qdu.d(str);
        return !AUTO.d.equals(str) ? !OFF.d.equals(str) ? ON.d.equals(str) ? ON : griVar : OFF : AUTO;
    }
}
