package defpackage;

/* compiled from: PG */
/* renamed from: ilu  reason: default package */
/* loaded from: classes.dex */
public enum ilu {
    OFF(0),
    ON_LIGHT(1),
    ON_STRONG(2),
    APPROX_LIGHT(3),
    APPROX_STRONG(4);
    
    public final int d;

    public final boolean a() {
        return this != OFF;
    }

    ilu(int i) {
        this.d = i;
    }

    public static ilu a(int i) {
        if (i == 0) {
            return OFF;
        }
        if (i == 1) {
            return ON_LIGHT;
        }
        if (i == 2) {
            return ON_STRONG;
        }
        if (i == 3) {
            return APPROX_LIGHT;
        }
        if (i == 4) {
            return APPROX_STRONG;
        }
        throw new RuntimeException("Unknown beautification level");
    }
}