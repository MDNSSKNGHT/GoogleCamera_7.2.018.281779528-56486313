package defpackage;

import j$.util.Collection;
import j$.util.Collection$$CC;
import j$.util.List;
import j$.util.List$$CC;
import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ptq  reason: default package */
/* loaded from: classes.dex */
public final class ptq extends AbstractList implements RandomAccess, Serializable, List, Collection {
    public static final long serialVersionUID = 0;
    public final pjr a;
    private final java.util.List b;

    public ptq(java.util.List list, pjr pjrVar) {
        this.b = (java.util.List) qdu.d((Object) list);
        this.a = (pjr) qdu.d(pjrVar);
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return Collection$$CC.parallelStream$$dflt$$(this);
    }

    public final boolean removeIf(Predicate predicate) {
        return Collection$$CC.removeIf$$dflt$$(this, predicate);
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        List$$CC.replaceAll$$dflt$$(this, unaryOperator);
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        List$$CC.sort$$dflt$$(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.Collection, java.util.Set
    public final Spliterator spliterator() {
        return List$$CC.spliterator$$dflt$$(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return Collection$$CC.stream$$dflt$$(this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.a(this.b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ptp(this, this.b.listIterator(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.a.a(this.b.remove(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}