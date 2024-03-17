package defpackage;

import j$.util.Collection;
import j$.util.Collection$$CC;
import j$.util.Spliterator;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: prg  reason: default package */
/* loaded from: classes.dex */
public abstract class prg extends AbstractCollection implements Serializable, Collection {
    private static final Object[] jh = new Object[0];

    public abstract pwx ar();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public abstract boolean e();

    public prr f() {
        throw null;
    }

    public Object[] h() {
        return null;
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
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public int a(Object[] objArr, int i) {
        pwx ar = ar();
        while (ar.hasNext()) {
            objArr[i] = ar.next();
            i++;
        }
        return i;
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(jh);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        qdu.d(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] h = h();
            if (h == null) {
                objArr = qdu.a(objArr, size);
            } else {
                return Arrays.copyOfRange(h, i(), j(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    Object writeReplace() {
        return new prp(toArray());
    }
}
