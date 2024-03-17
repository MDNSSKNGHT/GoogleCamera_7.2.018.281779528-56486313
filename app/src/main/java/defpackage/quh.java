package defpackage;

/* compiled from: PG */
/* renamed from: quh  reason: default package */
/* loaded from: classes2.dex */
public final class quh {
    public final qwg a;
    public final Object b;
    public final qwg c;
    public final quv d;

    public quh() {
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public final qxy a() {
        return this.d.b;
    }

    public quh(qwg qwgVar, Object obj, qwg qwgVar2, quv quvVar) {
        if (qwgVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (quvVar.b != qxy.MESSAGE || qwgVar2 != null) {
            this.a = qwgVar;
            this.b = obj;
            this.c = qwgVar2;
            this.d = quvVar;
            return;
        }
        throw new IllegalArgumentException("Null messageDefaultInstance");
    }

    public final Object a(Object obj) {
        if (this.d.c() != qxz.ENUM) {
            return obj;
        }
        ((Integer) obj).intValue();
        throw null;
    }
}