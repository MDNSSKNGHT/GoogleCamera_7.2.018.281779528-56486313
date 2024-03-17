package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: pva  reason: default package */
/* loaded from: classes.dex */
final class pva extends ppp {
    public static final long serialVersionUID = 0;
    private final puu c;

    public pva(puu puuVar, ppz ppzVar) {
        super(ppzVar);
        this.c = puuVar;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                return this.c.e((Comparable) obj);
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return qdu.a((Collection) this, collection);
    }

    @Override // defpackage.psl
    public final prr k() {
        return new prb(this);
    }

    @Override // defpackage.psu
    public final pwx d() {
        return new puy(this, n());
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return d();
    }

    @Override // defpackage.psl, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pva) {
                pva pvaVar = (pva) obj;
                if (this.a.equals(pvaVar.a)) {
                    return m().equals(pvaVar.m()) && n().equals(pvaVar.n());
                }
            }
            return super.equals(obj);
        }
        return true;
    }

    public static boolean a(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && puu.c(comparable, comparable2) == 0;
    }

    public final Comparable m() {
        return this.c.b.a(this.a);
    }

    @Override // defpackage.psu, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object first() {
        return m();
    }

    @Override // defpackage.psl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return qdu.a((Set) this);
    }

    @Override // defpackage.ppp
    public final ppp a(Comparable comparable, boolean z) {
        return a(puu.a(comparable, pow.a(z)));
    }

    @Override // defpackage.ppp, defpackage.psu
    public final /* bridge */ /* synthetic */ psu b(Object obj, boolean z) {
        return a((Comparable) obj, z);
    }

    private final ppp a(puu puuVar) {
        if (this.c.a(puuVar)) {
            return ppp.a(this.c.b(puuVar), this.a);
        }
        return new pqb(this.a);
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg
    public final pwx ar() {
        return new pux(this, m());
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    public final Comparable n() {
        return this.c.c.b(this.a);
    }

    @Override // defpackage.psu, java.util.SortedSet
    public final /* bridge */ /* synthetic */ Object last() {
        return n();
    }

    @Override // defpackage.ppp
    public final puu a() {
        return puu.a(this.c.b.a(pow.CLOSED, this.a), this.c.c.b(pow.CLOSED, this.a));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        long intValue = ((Integer) n()).intValue() - ((Integer) m()).intValue();
        if (intValue < 2147483647L) {
            return ((int) intValue) + 1;
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.ppp
    public final ppp a(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        if (comparable.compareTo(comparable2) != 0 || z || z2) {
            return a(puu.a(comparable, pow.a(z), comparable2, pow.a(z2)));
        }
        return new pqb(this.a);
    }

    @Override // defpackage.ppp, defpackage.psu
    public final /* bridge */ /* synthetic */ psu a(Object obj, boolean z, Object obj2, boolean z2) {
        return a((Comparable) obj, z, (Comparable) obj2, z2);
    }

    @Override // defpackage.ppp
    public final ppp b(Comparable comparable, boolean z) {
        return a(puu.b(comparable, pow.a(z)));
    }

    @Override // defpackage.ppp, defpackage.psu
    public final /* bridge */ /* synthetic */ psu a(Object obj, boolean z) {
        return b((Comparable) obj, z);
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg
    Object writeReplace() {
        return new puz(this.c, this.a);
    }
}
