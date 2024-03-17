package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

import j$.util.Set$$CC;
import j$.util.Spliterator;

/* compiled from: PG */
/* renamed from: psl  reason: default package */
/* loaded from: classes.dex */
public abstract class psl extends prg implements Set, j$.util.Set {
    private transient prr jg;

    @Override // defpackage.prg
    public abstract pwx ar();

    public boolean g() {
        return false;
    }

    @Override // defpackage.prg, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
    public Spliterator spliterator() {
        return Set$$CC.spliterator$$dflt$$(this);
    }

    @Override // defpackage.prg
    public prr f() {
        prr prrVar = this.jg;
        if (prrVar == null) {
            prr k = k();
            this.jg = k;
            return k;
        }
        return prrVar;
    }

    public static psj l() {
        return new psj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < max);
            return highestOneBit;
        }
        qdu.a(max < 1073741824, "collection too large");
        return 1073741824;
    }

    private static psl a_internal(int i, Object... objArr) {
        if (i != 0) {
            if (i == 1) {
                return c(objArr[0]);
            }
            int b = b(i);
            Object[] objArr2 = new Object[b];
            int i2 = b - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object a = qdu.a(objArr[i5], i5);
                int hashCode = a.hashCode();
                int c = qdu.c(hashCode);
                while (true) {
                    int i6 = c & i2;
                    Object obj = objArr2[i6];
                    if (obj != null) {
                        if (!obj.equals(a)) {
                            c++;
                        }
                    } else {
                        objArr[i4] = a;
                        objArr2[i6] = a;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new pvs(objArr[0], i3);
            }
            if (b(i4) < b / 2) {
                return a_internal(i4, objArr);
            }
            int length = objArr.length;
            if (i4 < (length >> 1) + (length >> 2)) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new pvi(objArr, i3, objArr2, i2, i4);
        }
        return pvi.a;
    }

    public static psl a(Collection collection) {
        if ((collection instanceof psl) && !(collection instanceof SortedSet)) {
            psl pslVar = (psl) collection;
            if (!pslVar.e()) {
                return pslVar;
            }
        }
        Object[] array = collection.toArray();
        return a_internal(array.length, array);
    }

    public static psl a(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return c(objArr[0]);
            }
            return a_internal(length, (Object[]) objArr.clone());
        }
        return pvi.a;
    }

    public prr k() {
        return prr.b(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof psl) && g() && ((psl) obj).g() && hashCode() != obj.hashCode()) {
                return false;
            }
            if (obj != this) {
                if (obj instanceof Set) {
                    Set set = (Set) obj;
                    try {
                        if (size() == set.size()) {
                            return containsAll(set);
                        }
                        return false;
                    } catch (ClassCastException e) {
                        return false;
                    } catch (NullPointerException e2) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return qdu.a((Set) this);
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    public static psl c(Object obj) {
        return new pvs(obj);
    }

    public static psl b(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static psl a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static psl a(Object obj, Object obj2, Object obj3, Object obj4) {
        return a(4, obj, obj2, obj3, obj4);
    }

    public static psl a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return a(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static psl a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        qdu.a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return a_internal(i, objArr2);
    }

    @Override // defpackage.prg
    Object writeReplace() {
        return new psk(toArray());
    }
}
