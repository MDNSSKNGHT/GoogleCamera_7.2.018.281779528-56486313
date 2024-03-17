package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: pvk  reason: default package */
/* loaded from: classes.dex */
final class pvk extends pus implements Serializable {
    public static final pvk a = new pvk();
    public static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.pus
    public final pus a() {
        return pup.a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    private pvk() {
    }

    @Override // defpackage.pus, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        qdu.d(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // defpackage.pus
    public final /* bridge */ /* synthetic */ Object b(Iterable iterable) {
        return (Comparable) pup.a.a(iterable);
    }

    @Override // defpackage.pus
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2) {
        return (Comparable) pup.a.a((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.pus
    public final /* bridge */ /* synthetic */ Object b(Iterator it) {
        return (Comparable) pup.a.a(it);
    }

    @Override // defpackage.pus
    public final /* bridge */ /* synthetic */ Object a(Iterable iterable) {
        return (Comparable) pup.a.b(iterable);
    }

    @Override // defpackage.pus
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return (Comparable) pup.a.b((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.pus
    public final /* bridge */ /* synthetic */ Object a(Iterator it) {
        return (Comparable) pup.a.b(it);
    }
}