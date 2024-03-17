package defpackage;

/* compiled from: PG */
/* renamed from: ilw  reason: default package */
/* loaded from: classes.dex */
public enum ilw {
    OFF(0),
    THREE(3),
    TEN(10),
    AUTO(-1);
    
    public final int g;
    public static final ilw e = OFF;
    public static final int[] f = new int[values().length];

    public static ilw a(int i) {
        return i != -1 ? i != 0 ? i != 3 ? i != 10 ? e : TEN : THREE : OFF : AUTO;
    }

    static {
        int i = 0;
        ilw[] values = values();
        int length = values.length;
        int i2 = 0;
        while (i < length) {
            f[i2] = values[i].g;
            i++;
            i2++;
        }
    }

    ilw(int i) {
        this.g = i;
    }
}