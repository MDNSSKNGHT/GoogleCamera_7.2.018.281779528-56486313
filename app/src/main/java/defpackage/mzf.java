package defpackage;

/* compiled from: PG */
/* renamed from: mzf  reason: default package */
/* loaded from: classes.dex */
public enum mzf {
    EXTENDED(128),
    FULL(2),
    SIMPLE(1),
    NONE(0);
    
    public final int e;

    public static mzf a(int i) {
        return i != 1 ? i != 2 ? i != 128 ? NONE : EXTENDED : FULL : SIMPLE;
    }

    mzf(int i) {
        this.e = i;
    }
}
