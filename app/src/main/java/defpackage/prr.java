package defpackage;

import j$.util.List$$CC;
import j$.util.Spliterator;
import j$.util.function.UnaryOperator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: prr  reason: default package */
/* loaded from: classes.dex */
public abstract class prr extends prg implements List, RandomAccess, j$.util.List {
    private static final pwy a = new prn(pvc.a, 0);

    public static prr c() {
        return pvc.a;
    }

    @Override // defpackage.prg
    public final prr f() {
        return this;
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        List$$CC.replaceAll$$dflt$$(this, unaryOperator);
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        List$$CC.sort$$dflt$$(this, comparator);
    }

    @Override // defpackage.prg, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
    public final Spliterator spliterator() {
        return List$$CC.spliterator$$dflt$$(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static prr b(Object[] objArr) {
        return b(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static prr b(Object[] objArr, int i) {
        return i != 0 ? new pvc(objArr, i) : pvc.a;
    }

    public static prm g() {
        return new prm();
    }

    public static prm a(int i) {
        qdu.a(i, "expectedSize");
        return new prm(i);
    }

    private static prr c(Object... objArr) {
        return b(qdu.a(objArr));
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // defpackage.prg
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public static prr a(Iterable iterable) {
        qdu.d((Object) iterable);
        if (iterable instanceof Collection) {
            return a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return a(next);
            }
            prm prmVar = new prm();
            prmVar.c(next);
            prmVar.a(it);
            return prmVar.a();
        }
        return pvc.a;
    }

    public static prr a(Collection collection) {
        if (collection instanceof prg) {
            prr f = ((prg) collection).f();
            return f.e() ? b(f.toArray()) : f;
        }
        return c(collection.toArray());
    }

    public static prr a(Object[] objArr) {
        return objArr.length != 0 ? c((Object[]) objArr.clone()) : pvc.a;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return qdu.a((List) this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.prg
    public final pwx ar() {
        return d();
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return d();
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
            return -1;
        }
        return -1;
    }

    public final pwy d() {
        return b(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return d();
    }

    private final pwy b(int i) {
        qdu.c(i, size());
        return !isEmpty() ? new prn(this, i) : a;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return b(i);
    }

    public static prr a(Object obj) {
        return c(obj);
    }

    public static prr a(Object obj, Object obj2) {
        return c(obj, obj2);
    }

    public static prr a(Object obj, Object obj2, Object obj3) {
        return c(obj, obj2, obj3);
    }

    public static prr a(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, obj3, obj4);
    }

    public static prr a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c(obj, obj2, obj3, obj4, obj5);
    }

    public static prr a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return c(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static prr a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @SafeVarargs
    public static prr a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        qdu.a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return c(objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public prr b() {
        return size() > 1 ? new pro(this) : this;
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public static prr a(Comparator comparator, Iterable iterable) {
        qdu.d(comparator);
        Object[] e = qdu.e(iterable);
        qdu.a(e);
        Arrays.sort(e, comparator);
        return b(e);
    }

    public prr a(int i, int i2) {
        qdu.a(i, i2, size());
        int i3 = i2 - i;
        return i3 != size() ? i3 != 0 ? new prq(this, i, i3) : pvc.a : this;
    }

    public /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    @Override // defpackage.prg
    Object writeReplace() {
        return new prp(toArray());
    }
}
