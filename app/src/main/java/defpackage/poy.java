package defpackage;

import j$.util.Collection;
import j$.util.Collection$$CC;
import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: poy  reason: default package */
/* loaded from: classes.dex */
public final class poy extends AbstractCollection implements Collection {
    public final java.util.Collection a;
    public final pkc b;

    public poy(java.util.Collection collection, pkc pkcVar) {
        this.a = collection;
        this.b = pkcVar;
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return Collection$$CC.parallelStream$$dflt$$(this);
    }

    public final boolean removeIf(Predicate predicate) {
        return Collection$$CC.removeIf$$dflt$$(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
    public final Spliterator spliterator() {
        return Collection$$CC.spliterator$$dflt$$(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return Collection$$CC.stream$$dflt$$(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        qdu.c(this.b.a(obj));
        return this.a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        for (Object obj : collection) {
            qdu.c(this.b.a(obj));
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        java.util.Collection collection = this.a;
        pkc pkcVar = this.b;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            qdu.d(pkcVar);
            while (it.hasNext()) {
                if (pkcVar.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        qdu.a((List) collection, (pkc) qdu.d(pkcVar));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (qdu.a(this.a, obj)) {
            return this.b.a(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return qdu.a((java.util.Collection) this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !qdu.b((Iterable) this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return qdu.a(this.a.iterator(), this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (Object obj : this.a) {
            if (this.b.a(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return qdu.b(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return qdu.b(iterator()).toArray(objArr);
    }
}