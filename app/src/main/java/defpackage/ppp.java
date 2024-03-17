package defpackage;

import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: ppp  reason: default package */
/* loaded from: classes.dex */
public abstract class ppp extends psu {
    public final ppz a;

    public ppp(ppz ppzVar) {
        super(pup.a);
        this.a = ppzVar;
    }

    public abstract ppp a(Comparable comparable, boolean z);

    public abstract ppp a(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // defpackage.psu
    public /* bridge */ /* synthetic */ psu a(Object obj, boolean z) {
        throw null;
    }

    @Override // defpackage.psu
    public /* bridge */ /* synthetic */ psu a(Object obj, boolean z, Object obj2, boolean z2) {
        throw null;
    }

    public abstract puu a();

    public abstract ppp b(Comparable comparable, boolean z);

    @Override // defpackage.psu
    public /* bridge */ /* synthetic */ psu b(Object obj, boolean z) {
        throw null;
    }

    public static ppp a(puu puuVar, ppz ppzVar) {
        qdu.d(puuVar);
        qdu.d(ppzVar);
        try {
            puu b = !puuVar.b() ? puuVar.b(puu.d(ppzVar.b())) : puuVar;
            if (!puuVar.d()) {
                b = b.b(puu.b(ppzVar.a()));
            }
            if (b.f() || puu.c(puuVar.b.a(ppzVar), puuVar.c.b(ppzVar)) > 0) {
                return new pqb(ppzVar);
            }
            return new pva(b, ppzVar);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.psu
    public psu b() {
        return new ppv(this);
    }

    private final ppp a(Comparable comparable) {
        return a((Comparable) qdu.d(comparable), false);
    }

    private final ppp c(Comparable comparable, boolean z) {
        return a((Comparable) qdu.d(comparable), z);
    }

    @Override // defpackage.psu
    public final /* bridge */ /* synthetic */ psu b(Object obj) {
        return a((Comparable) obj);
    }

    @Override // defpackage.psu, java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return a((Comparable) obj);
    }

    @Override // defpackage.psu
    public final /* bridge */ /* synthetic */ psu d(Object obj, boolean z) {
        return c((Comparable) obj, z);
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        return c((Comparable) obj, z);
    }

    private final ppp a(Comparable comparable, Comparable comparable2) {
        qdu.d(comparable);
        qdu.d(comparable2);
        qdu.c(this.b.compare(comparable, comparable2) <= 0);
        return a(comparable, true, comparable2, false);
    }

    private final ppp b(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        qdu.d(comparable);
        qdu.d(comparable2);
        qdu.c(this.b.compare(comparable, comparable2) <= 0);
        return a(comparable, z, comparable2, z2);
    }

    @Override // defpackage.psu
    public final /* bridge */ /* synthetic */ psu a(Object obj, Object obj2) {
        return a((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.psu, java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return a((Comparable) obj, (Comparable) obj2);
    }

    @Override // defpackage.psu
    public final /* bridge */ /* synthetic */ psu b(Object obj, boolean z, Object obj2, boolean z2) {
        return b((Comparable) obj, z, (Comparable) obj2, z2);
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return b((Comparable) obj, z, (Comparable) obj2, z2);
    }

    private final ppp b(Comparable comparable) {
        return b((Comparable) qdu.d(comparable), true);
    }

    private final ppp d(Comparable comparable, boolean z) {
        return b((Comparable) qdu.d(comparable), z);
    }

    @Override // defpackage.psu
    public final /* bridge */ /* synthetic */ psu a(Object obj) {
        return b((Comparable) obj);
    }

    @Override // defpackage.psu, java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return b((Comparable) obj);
    }

    @Override // defpackage.psu
    public final /* bridge */ /* synthetic */ psu c(Object obj, boolean z) {
        return d((Comparable) obj, z);
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        return d((Comparable) obj, z);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return a().toString();
    }
}
