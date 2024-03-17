package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: prp  reason: default package */
/* loaded from: classes.dex */
final class prp implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;

    public prp(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return prr.a(this.a);
    }
}