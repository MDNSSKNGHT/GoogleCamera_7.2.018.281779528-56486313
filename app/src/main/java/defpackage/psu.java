package defpackage;

import j$.util.SortedSet$$CC;
import j$.util.Spliterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: psu  reason: default package */
/* loaded from: classes.dex */
public abstract class psu extends psv implements NavigableSet, j$.util.NavigableSet, pvt {
    private transient psu a;
    public final transient Comparator b;

    public psu(Comparator comparator) {
        this.b = comparator;
    }

    public abstract psu a(Object obj, boolean z);

    public abstract psu a(Object obj, boolean z, Object obj2, boolean z2);

    @Override // defpackage.psl, defpackage.prg
    public abstract pwx ar();

    public abstract psu b();

    public abstract psu b(Object obj, boolean z);

    @Override // java.util.SortedSet, defpackage.pvt
    public final Comparator comparator() {
        return this.b;
    }

    public abstract pwx d();

    @Override // defpackage.psl, defpackage.prg, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
    public final Spliterator spliterator() {
        return SortedSet$$CC.spliterator$$dflt$$(this);
    }

    public Object ceiling(Object obj) {
        return qdu.a((Iterable) c(obj, true), (Object) null);
    }

    public /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return d();
    }

    public psu c() {
        psu psuVar = this.a;
        if (psuVar == null) {
            psu b = b();
            this.a = b;
            b.a = this;
            return b;
        }
        return psuVar;
    }

    public /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static pvj a(Comparator comparator) {
        return !pup.a.equals(comparator) ? new pvj(prr.c(), comparator) : pvj.a;
    }

    public Object first() {
        return ar().next();
    }

    public Object floor(Object obj) {
        return qdu.a((Iterator) d(obj, true).d(), (Object) null);
    }

    public psu b(Object obj) {
        return d(obj, false);
    }

    public /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return b(obj);
    }

    public psu d(Object obj, boolean z) {
        return b(qdu.d(obj), z);
    }

    public /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        return d(obj, z);
    }

    public Object higher(Object obj) {
        return qdu.a((Iterable) c(obj, false), (Object) null);
    }

    @Override // defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    public Object last() {
        return d().next();
    }

    public Object lower(Object obj) {
        return qdu.a((Iterator) d(obj, false).d(), (Object) null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public psu a(Object obj, Object obj2) {
        return b(obj, true, obj2, false);
    }

    public /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return a(obj, obj2);
    }

    public psu b(Object obj, boolean z, Object obj2, boolean z2) {
        qdu.d(obj);
        qdu.d(obj2);
        qdu.c(this.b.compare(obj, obj2) <= 0);
        return a(obj, z, obj2, z2);
    }

    public /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return b(obj, z, obj2, z2);
    }

    public psu a(Object obj) {
        return c(obj, true);
    }

    public /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return a(obj);
    }

    public psu c(Object obj, boolean z) {
        return a(qdu.d(obj), z);
    }

    public /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        return c(obj, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    @Override // defpackage.psl, defpackage.prg
    Object writeReplace() {
        return new pst(this.b, toArray());
    }
}
