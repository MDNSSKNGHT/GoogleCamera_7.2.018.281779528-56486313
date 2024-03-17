package defpackage;

import java.util.Iterator;

import j$.util.Iterator$$CC;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: pwg  reason: default package */
/* loaded from: classes.dex */
abstract class pwg implements Iterator, j$.util.Iterator {
    public final Iterator a;

    public pwg(Iterator it) {
        this.a = (Iterator) qdu.d((Object) it);
    }

    public abstract Object a(Object obj);

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Iterator$$CC.forEachRemaining$$dflt$$(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}