package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: pvs  reason: default package */
/* loaded from: classes.dex */
final class pvs extends psl {
    private final transient Object a;
    private transient int b;

    public pvs(Object obj) {
        this.a = qdu.d(obj);
    }

    @Override // defpackage.prg
    public final boolean e() {
        return false;
    }

    @Override // defpackage.psl
    public final boolean g() {
        return this.b != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    public pvs(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.prg
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.psl
    public final prr k() {
        return prr.a(this.a);
    }

    @Override // defpackage.psl, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int hashCode = this.a.hashCode();
            this.b = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.psl, defpackage.prg
    public final pwx ar() {
        return new pti(this.a);
    }

    @Override // defpackage.psl, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return ar();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
