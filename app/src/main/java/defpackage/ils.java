package defpackage;

/* compiled from: PG */
/* renamed from: ils  reason: default package */
/* loaded from: classes.dex */
public enum ils {
    ON(0),
    ON_LOCKED(1),
    OFF_NEAR(2),
    OFF_FAR(3),
    OFF_INFINITY(4);
    
    public final int f;

    public static ils a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? ON : OFF_INFINITY : OFF_FAR : OFF_NEAR : ON_LOCKED;
    }

    public final boolean a() {
        return this != ON && this != ON_LOCKED;
    }

    ils(int i) {
        this.f = i;
    }

    public final int b() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        if (ordinal == 3) {
            return 5;
        }
        if (ordinal == 4) {
            return 6;
        }
        return 1;
    }
}