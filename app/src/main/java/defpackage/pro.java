package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: pro  reason: default package */
/* loaded from: classes.dex */
final class pro extends prr {
    private final transient prr a;

    public pro(prr prrVar) {
        this.a = prrVar;
    }

    @Override // defpackage.prr
    public final prr b() {
        return this.a;
    }

    @Override // defpackage.prr, defpackage.prg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        qdu.b(i, size());
        return this.a.get(b(i));
    }

    @Override // defpackage.prr, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return b(lastIndexOf);
    }

    @Override // defpackage.prg
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.prr, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return b(indexOf);
    }

    private final int b(int i) {
        return (size() - 1) - i;
    }

    private final int c(int i) {
        return size() - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.prr
    public final prr a(int i, int i2) {
        qdu.a(i, i2, size());
        return this.a.a(c(i2), c(i)).b();
    }

    @Override // defpackage.prr, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }
}