package defpackage;

/* compiled from: PG */
/* renamed from: ilt  reason: default package */
/* loaded from: classes.dex */
public enum ilt {
    SIXTEEN_BY_NINE(0),
    FOUR_BY_THREE(1);
    
    public final int c;

    ilt(int i) {
        this.c = i;
    }

    public static ilt a(int i) {
        if (i == 0) {
            return SIXTEEN_BY_NINE;
        }
        if (i == 1) {
            return FOUR_BY_THREE;
        }
        throw new RuntimeException("Unknown aspect ratio " + i);
    }
}