package defpackage;

import j$.util.Iterator$$CC;
import j$.util.function.Consumer;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ptn  reason: default package */
/* loaded from: classes.dex */
final class ptn implements ListIterator, j$.util.ListIterator {
    private boolean a;
    private final /* synthetic */ ListIterator b;
    private final /* synthetic */ pto c;

    public ptn(pto ptoVar, ListIterator listIterator) {
        this.c = ptoVar;
        this.b = listIterator;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Iterator$$CC.forEachRemaining$$dflt$$(this, consumer);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.b.add(obj);
        this.b.previous();
        this.a = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c.a(this.b.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        qdu.a(this.a);
        this.b.remove();
        this.a = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        qdu.d(this.a);
        this.b.set(obj);
    }
}