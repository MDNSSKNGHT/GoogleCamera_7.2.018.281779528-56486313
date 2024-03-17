package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: PG */
/* renamed from: pqb  reason: default package */
/* loaded from: classes.dex */
final class pqb extends ppp {
    public pqb(ppz ppzVar) {
        super(ppzVar);
    }

    @Override // defpackage.ppp
    public final ppp a(Comparable comparable, boolean z) {
        return this;
    }

    @Override // defpackage.ppp
    public final ppp a(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return this;
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg
    public final pwx ar() {
        return ptj.a;
    }

    @Override // defpackage.ppp
    public final ppp b(Comparable comparable, boolean z) {
        return this;
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // defpackage.psu
    public final pwx d() {
        return ptj.a;
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return ptj.a;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.psl
    public final boolean g() {
        return true;
    }

    @Override // defpackage.psl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ptj.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // defpackage.ppp, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // defpackage.psl, defpackage.prg
    public final prr f() {
        return prr.c();
    }

    @Override // defpackage.ppp, defpackage.psu
    public final psu b() {
        pup pupVar = pup.a;
        return psu.a((Comparator) pvk.a);
    }

    @Override // defpackage.psl, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // defpackage.psu, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ppp, defpackage.psu
    public final /* bridge */ /* synthetic */ psu b(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    @Override // defpackage.psu, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ppp
    public final puu a() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ppp, defpackage.psu
    public final /* bridge */ /* synthetic */ psu a(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        return this;
    }

    @Override // defpackage.ppp, defpackage.psu
    public final /* bridge */ /* synthetic */ psu a(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        return this;
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg
    Object writeReplace() {
        return new pqa(this.a);
    }
}
