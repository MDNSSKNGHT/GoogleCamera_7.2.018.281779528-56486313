package defpackage;

import j$.util.Collection;
import j$.util.Collection$$CC;
import j$.util.List;
import j$.util.List$$CC;
import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Stream;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: pto  reason: default package */
/* loaded from: classes.dex */
public class pto extends AbstractList implements List, Collection {
    public final java.util.List a;

    public pto(java.util.List list) {
        this.a = (java.util.List) qdu.d((Object) list);
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

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(a(i), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(b(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ptn(this, this.a.listIterator(a(i)));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.a.remove(b(i));
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    private final int b(int i) {
        int size = size();
        qdu.b(i, size);
        return (size - 1) - i;
    }

    public final int a(int i) {
        int size = size();
        qdu.c(i, size);
        return size - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(b(i), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        qdu.a(i, i2, size());
        return qdu.a(this.a.subList(a(i2), a(i)));
    }
}