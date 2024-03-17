package defpackage;

import j$.util.Collection;
import j$.util.Collection$$CC;
import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: pob  reason: default package */
/* loaded from: classes.dex */
class pob extends AbstractCollection implements Collection {
    public final Object a;
    public java.util.Collection b;
    public final pob c;
    public final /* synthetic */ pof d;
    private final java.util.Collection e;

    public pob(pof pofVar, Object obj, java.util.Collection collection, pob pobVar) {
        this.d = pofVar;
        this.a = obj;
        this.b = collection;
        this.c = pobVar;
        this.e = pobVar != null ? pobVar.b : null;
    }

    @Override // java.util.Collection
    public final Stream parallelStream() {
        return Collection$$CC.parallelStream$$dflt$$(this);
    }

    public final boolean removeIf(Predicate predicate) {
        return Collection$$CC.removeIf$$dflt$$(this, predicate);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
    public Spliterator spliterator() {
        return Collection$$CC.spliterator$$dflt$$(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return Collection$$CC.stream$$dflt$$(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            pof.a(this.d);
            if (isEmpty) {
                c();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            pof.a(this.d, this.b.size() - size);
            if (size == 0) {
                c();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        pob pobVar = this.c;
        if (pobVar == null) {
            this.d.a.put(this.a, this.b);
        } else {
            pobVar.c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size != 0) {
            this.b.clear();
            pof.b(this.d, size);
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        a();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        a();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj != this) {
            a();
            return this.b.equals(obj);
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a();
        return new poa(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        java.util.Collection collection;
        pob pobVar = this.c;
        if (pobVar != null) {
            pobVar.a();
            if (this.c.b == this.e) {
                return;
            }
            throw new ConcurrentModificationException();
        } else if (!this.b.isEmpty() || (collection = (java.util.Collection) this.d.a.get(this.a)) == null) {
        } else {
            this.b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        a();
        boolean remove = this.b.remove(obj);
        if (remove) {
            pof.b(this.d);
            b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            pof.a(this.d, this.b.size() - size);
            b();
        }
        return removeAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        pob pobVar = this.c;
        if (pobVar == null) {
            if (this.b.isEmpty()) {
                this.d.a.remove(this.a);
                return;
            }
            return;
        }
        pobVar.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        qdu.d((Object) collection);
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            pof.a(this.d, this.b.size() - size);
            b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        a();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.b.toString();
    }
}