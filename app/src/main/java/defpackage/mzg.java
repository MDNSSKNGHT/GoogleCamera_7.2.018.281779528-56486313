package defpackage;

/* compiled from: PG */
/* renamed from: mzg  reason: default package */
/* loaded from: classes.dex */
public enum mzg {
    FRONT,
    BACK,
    EXTERNAL;

    public static String a(mzg mzgVar) {
        int ordinal = mzgVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "unknown" : "external" : "back" : "front";
    }
}