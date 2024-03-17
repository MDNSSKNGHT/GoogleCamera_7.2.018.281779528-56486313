package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: pst  reason: default package */
/* loaded from: classes.dex */
final class pst implements Serializable {
    public static final long serialVersionUID = 0;
    private final Comparator a;
    private final Object[] b;

    public pst(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        pss pssVar = new pss(this.a);
        Object[] objArr = this.b;
        qdu.a(objArr);
        int i = pssVar.b;
        int length = objArr.length;
        pssVar.a(i + length);
        System.arraycopy(objArr, 0, pssVar.a, pssVar.b, length);
        pssVar.b += length;
        return pssVar.b();
    }
}
