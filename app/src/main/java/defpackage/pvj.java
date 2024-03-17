package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: pvj  reason: default package */
/* loaded from: classes.dex */
final class pvj extends psu {
    public static final pvj a = new pvj(prr.c(), pup.a);
    public final transient prr c;

    @Override // defpackage.psl, defpackage.prg
    public final prr f() {
        return this.c;
    }

    public pvj(prr prrVar, Comparator comparator) {
        super(comparator);
        this.c = prrVar;
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int f = f(obj, true);
        if (f != size()) {
            return this.c.get(f);
        }
        return null;
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.c, obj, this.b) >= 0) {
                    return true;
                }
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof puh) {
            collection = ((puh) collection).e();
        }
        if (!qdu.a(this.b, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        pwx ar = ar();
        Iterator it = collection.iterator();
        if (ar.hasNext()) {
            Object next = it.next();
            Object next2 = ar.next();
            while (true) {
                try {
                    int c = c(next2, next);
                    if (c < 0) {
                        if (!ar.hasNext()) {
                            return false;
                        }
                        next2 = ar.next();
                    } else if (c != 0) {
                        return false;
                    } else {
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    }
                } catch (ClassCastException e) {
                } catch (NullPointerException e2) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.prg
    public final int a(Object[] objArr, int i) {
        return this.c.a(objArr, i);
    }

    @Override // defpackage.psu
    public final psu b() {
        Comparator reverseOrder = Collections.reverseOrder(this.b);
        return !isEmpty() ? new pvj(this.c.b(), reverseOrder) : a(reverseOrder);
    }

    @Override // defpackage.psu
    public final pwx d() {
        return this.c.b().d();
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[Catch: NoSuchElementException -> 0x0042, ClassCastException -> 0x0044, TryCatch #2 {ClassCastException -> 0x0044, NoSuchElementException -> 0x0042, blocks: (B:13:0x0026, B:14:0x002a, B:16:0x0030, B:18:0x003a), top: B:31:0x0026 }] */
    @Override // defpackage.psl, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r5) goto L4d
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L4c
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 != r3) goto L4c
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L4b
            java.util.Comparator r1 = r5.b
            boolean r1 = defpackage.qdu.a(r1, r6)
            if (r1 == 0) goto L46
            java.util.Iterator r6 = r6.iterator()
            pwx r1 = r5.ar()     // Catch: java.util.NoSuchElementException -> L42 java.lang.ClassCastException -> L44
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.util.NoSuchElementException -> L42 java.lang.ClassCastException -> L44
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()     // Catch: java.util.NoSuchElementException -> L42 java.lang.ClassCastException -> L44
            java.lang.Object r4 = r6.next()     // Catch: java.util.NoSuchElementException -> L42 java.lang.ClassCastException -> L44
            if (r4 == 0) goto L40
            int r3 = r5.c(r3, r4)     // Catch: java.util.NoSuchElementException -> L42 java.lang.ClassCastException -> L44
            if (r3 == 0) goto L2a
        L40:
            return r2
        L41:
            return r0
        L42:
            r6 = move-exception
            return r2
        L44:
            r6 = move-exception
            return r2
        L46:
            boolean r6 = r5.containsAll(r6)
            return r6
        L4b:
            return r0
        L4c:
            return r2
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvj.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.psu, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.c.get(0);
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object floor(Object obj) {
        int e = e(obj, true) - 1;
        if (e != -1) {
            return this.c.get(e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final pvj a(int i, int i2) {
        if (i != 0 || i2 != size()) {
            if (i < i2) {
                return new pvj(this.c.a(i, i2), this.b);
            }
            return a(this.b);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(Object obj, boolean z) {
        int binarySearch = Collections.binarySearch(this.c, qdu.d(obj), this.b);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : binarySearch ^ (-1);
    }

    @Override // defpackage.psu
    public final psu b(Object obj, boolean z) {
        return a(0, e(obj, z));
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object higher(Object obj) {
        int f = f(obj, false);
        if (f != size()) {
            return this.c.get(f);
        }
        return null;
    }

    @Override // defpackage.prg
    public final Object[] h() {
        return this.c.h();
    }

    @Override // defpackage.prg
    public final int j() {
        return this.c.j();
    }

    @Override // defpackage.prg
    public final int i() {
        return this.c.i();
    }

    @Override // defpackage.prg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg
    public final pwx ar() {
        return this.c.d();
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    @Override // defpackage.psu, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.c.get(size() - 1);
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object lower(Object obj) {
        int e = e(obj, false) - 1;
        if (e != -1) {
            return this.c.get(e);
        }
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.psu
    public final psu a(Object obj, boolean z, Object obj2, boolean z2) {
        return a(obj, z).b(obj2, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(Object obj, boolean z) {
        int binarySearch = Collections.binarySearch(this.c, qdu.d(obj), this.b);
        return binarySearch >= 0 ? !z ? binarySearch + 1 : binarySearch : binarySearch ^ (-1);
    }

    @Override // defpackage.psu
    public final psu a(Object obj, boolean z) {
        return a(f(obj, z), size());
    }
}
