package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: pjz  reason: default package */
/* loaded from: classes.dex */
public abstract class pjz implements Serializable {
    public static final long serialVersionUID = 0;

    public abstract Object a(Object obj);

    public abstract Object a(pkx pkxVar);

    public abstract pjz a(pjr pjrVar);

    public abstract pjz a(pjz pjzVar);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public static pjz c(Object obj) {
        return obj != null ? new pkh(obj) : pix.a;
    }

    public static pjz b(Object obj) {
        return new pkh(qdu.d(obj));
    }
}