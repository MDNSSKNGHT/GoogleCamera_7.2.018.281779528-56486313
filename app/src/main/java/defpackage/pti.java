package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: pti  reason: default package */
/* loaded from: classes.dex */
final class pti extends pwx {
    private boolean a;
    private final /* synthetic */ Object b;

    public pti(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a) {
            throw new NoSuchElementException();
        }
        this.a = true;
        return this.b;
    }
}
