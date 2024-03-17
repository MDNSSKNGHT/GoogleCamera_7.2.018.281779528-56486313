package defpackage;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: pwh  reason: default package */
/* loaded from: classes.dex */
abstract class pwh extends pwg implements ListIterator, j$.util.ListIterator {
    public pwh(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    private final ListIterator a() {
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return a().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(a().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return a().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}