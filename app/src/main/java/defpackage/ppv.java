package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: PG */
/* renamed from: ppv  reason: default package */
/* loaded from: classes.dex */
final class ppv extends psu {
    private final psu a;

    public ppv(psu psuVar) {
        super(pus.a(psuVar.b).a());
        this.a = psuVar;
    }

    @Override // defpackage.psu
    public final psu c() {
        return this.a;
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return this.a;
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.a.floor(obj);
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.psu
    public final psu b() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.psu
    public final pwx d() {
        return this.a.ar();
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator descendingIterator() {
        return d();
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.a.ceiling(obj);
    }

    @Override // defpackage.psu
    public final psu b(Object obj, boolean z) {
        return this.a.c(obj, z).c();
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.a.lower(obj);
    }

    @Override // defpackage.prg
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg
    public final pwx ar() {
        return this.a.d();
    }

    @Override // defpackage.psu, defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    @Override // defpackage.psu, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.a.higher(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.psu
    public final psu a(Object obj, boolean z, Object obj2, boolean z2) {
        return this.a.b(obj2, z2, obj, z).c();
    }

    @Override // defpackage.psu
    public final psu a(Object obj, boolean z) {
        return this.a.d(obj, z).c();
    }
}
