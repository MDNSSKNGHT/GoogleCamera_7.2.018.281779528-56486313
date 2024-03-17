package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: pwy */
/* loaded from: classes.dex */
public abstract class pwy extends pwx implements ListIterator, j$.util.ListIterator {
    private final int a;
    private int b;

    public pwy(int i, int i2) {
        qdu.c(i2, i);
        this.a = i;
        this.b = i2;
    }

    protected abstract Object a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}