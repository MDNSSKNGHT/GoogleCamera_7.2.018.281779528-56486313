package defpackage;

import j$.util.Comparator$$CC;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: pus  reason: default package */
/* loaded from: classes.dex */
public abstract class pus implements Comparator, j$.util.Comparator {
    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Comparator$$CC.reversed$$dflt$$(this);
    }

    public final Comparator thenComparing(Function function) {
        return Comparator$$CC.thenComparing$$dflt$$(this, function);
    }

    public final Comparator thenComparing(Function function, Comparator comparator) {
        return Comparator$$CC.thenComparing$$dflt$$(this, function, comparator);
    }

    @Override // java.util.Comparator, j$.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        return Comparator$$CC.thenComparing$$dflt$$(this, comparator);
    }

    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator$$CC.thenComparingDouble$$dflt$$(this, toDoubleFunction);
    }

    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator$$CC.thenComparingInt$$dflt$$(this, toIntFunction);
    }

    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator$$CC.thenComparingLong$$dflt$$(this, toLongFunction);
    }

    public static pus a(Comparator comparator) {
        return !(comparator instanceof pus) ? new ppl(comparator) : (pus) comparator;
    }

    public Object b(Iterable iterable) {
        return b(iterable.iterator());
    }

    public Object b(Object obj, Object obj2) {
        return compare(obj, obj2) < 0 ? obj2 : obj;
    }

    public Object b(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = b(next, it.next());
        }
        return next;
    }

    public Object a(Iterable iterable) {
        return a(iterable.iterator());
    }

    public Object a(Object obj, Object obj2) {
        return compare(obj, obj2) > 0 ? obj2 : obj;
    }

    public Object a(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = a(next, it.next());
        }
        return next;
    }

    public final pus a(pjr pjrVar) {
        return new pox(pjrVar, this);
    }

    public pus a() {
        return new pvl(this);
    }
}
