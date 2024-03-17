package defpackage;

import java.util.Iterator;

import j$.util.Iterator$$CC;
import j$.util.function.Consumer;

/* compiled from: PG */
/* renamed from: pwx  reason: default package */
/* loaded from: classes.dex */
public abstract class pwx implements Iterator, j$.util.Iterator {
    @Override // j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        Iterator$$CC.forEachRemaining$$dflt$$(this, consumer);
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
