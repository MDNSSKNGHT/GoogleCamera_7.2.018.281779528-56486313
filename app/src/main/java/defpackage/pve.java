package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: pve */
/* loaded from: classes.dex */
final class pve extends psl {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient prx d;

    public pve(prx prxVar, Object[] objArr, int i, int i2) {
        this.d = prxVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.prg
    public final boolean e() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.prg
    public final int a(Object[] objArr, int i) {
        return f().a(objArr, i);
    }

    @Override // defpackage.psl
    public final prr k() {
        return new pvd(this);
    }

    @Override // defpackage.psl, defpackage.prg
    public final pwx ar() {
        return f().d();
    }

    @Override // defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }
}