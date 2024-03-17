package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: pvf */
/* loaded from: classes.dex */
final class pvf extends psl {
    private final transient prx a;
    private final transient prr b;

    public pvf(prx prxVar, prr prrVar) {
        this.a = prxVar;
        this.b = prrVar;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return true;
    }

    @Override // defpackage.psl, defpackage.prg
    public final prr f() {
        return this.b;
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // defpackage.prg
    public final int a(Object[] objArr, int i) {
        return this.b.a(objArr, i);
    }

    @Override // defpackage.psl, defpackage.prg
    public final pwx ar() {
        return this.b.d();
    }

    @Override // defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}