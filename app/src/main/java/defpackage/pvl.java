package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: pvl  reason: default package */
/* loaded from: classes.dex */
final class pvl extends pus implements Serializable {
    public static final long serialVersionUID = 0;
    private final pus a;

    public pvl(pus pusVar) {
        this.a = (pus) qdu.d(pusVar);
    }

    @Override // defpackage.pus
    public final pus a() {
        return this.a;
    }

    @Override // defpackage.pus, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pvl) {
                return this.a.equals(((pvl) obj).a);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    @Override // defpackage.pus
    public final Object b(Iterable iterable) {
        return this.a.a(iterable);
    }

    @Override // defpackage.pus
    public final Object b(Object obj, Object obj2) {
        return this.a.a(obj, obj2);
    }

    @Override // defpackage.pus
    public final Object b(Iterator it) {
        return this.a.a(it);
    }

    @Override // defpackage.pus
    public final Object a(Iterable iterable) {
        return this.a.b(iterable);
    }

    @Override // defpackage.pus
    public final Object a(Object obj, Object obj2) {
        return this.a.b(obj, obj2);
    }

    @Override // defpackage.pus
    public final Object a(Iterator it) {
        return this.a.b(it);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}