package defpackage;

/* compiled from: PG */
/* renamed from: qxy */
/* loaded from: classes2.dex */
public enum qxy {
    DOUBLE(qxz.DOUBLE, 1),
    FLOAT(qxz.FLOAT, 5),
    INT64(qxz.LONG, 0),
    UINT64(qxz.LONG, 0),
    INT32(qxz.INT, 0),
    FIXED64(qxz.LONG, 1),
    FIXED32(qxz.INT, 5),
    BOOL(qxz.BOOLEAN, 0),
    STRING(qxz.STRING, 2),
    GROUP(qxz.MESSAGE, 3),
    MESSAGE(qxz.MESSAGE, 2),
    BYTES(qxz.BYTE_STRING, 2),
    UINT32(qxz.INT, 0),
    ENUM(qxz.ENUM, 0),
    SFIXED32(qxz.INT, 5),
    SFIXED64(qxz.LONG, 1),
    SINT32(qxz.INT, 0),
    SINT64(qxz.LONG, 0);
    
    public final qxz g;
    public final int h;

    qxy(qxz qxzVar, int i) {
        this.g = qxzVar;
        this.h = i;
    }
}