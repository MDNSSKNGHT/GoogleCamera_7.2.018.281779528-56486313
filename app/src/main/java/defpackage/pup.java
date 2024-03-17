package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: pup  reason: default package */
/* loaded from: classes.dex */
public final class pup extends pus implements Serializable {
    public static final pup a = new pup();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.pus
    public final pus a() {
        return pvk.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    private pup() {
    }

    @Override // defpackage.pus, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        qdu.d(comparable);
        qdu.d(comparable2);
        return comparable.compareTo(comparable2);
    }
}
