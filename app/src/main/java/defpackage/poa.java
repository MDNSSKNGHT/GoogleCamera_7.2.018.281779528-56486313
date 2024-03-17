package defpackage;

import j$.util.Iterator$$CC;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: poa  reason: default package */
/* loaded from: classes.dex */
class poa implements Iterator, j$.util.Iterator {
    public final Iterator a;
    private final Collection b;
    private final /* synthetic */ pob c;

    public poa(pob pobVar) {
        Iterator it;
        this.c = pobVar;
        this.b = this.c.b;
        Collection collection = pobVar.b;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.a = it;
    }

    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Iterator$$CC.forEachRemaining$$dflt$$(this, consumer);
    }

    public poa(pob pobVar, Iterator it) {
        this.c = pobVar;
        this.b = this.c.b;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        pof.b(this.c.d);
        this.c.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.a();
        if (this.c.b == this.b) {
            return;
        }
        throw new ConcurrentModificationException();
    }
}