package defpackage;

import j$.util.Set$$CC;
import j$.util.Spliterator;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: poe  reason: default package */
/* loaded from: classes.dex */
final class poe extends pob implements Set, j$.util.Set {
    private final /* synthetic */ pof e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poe(pof pofVar, Object obj, Set set) {
        super(pofVar, obj, set, null);
        this.e = pofVar;
    }

    @Override // defpackage.pob, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
    public final Spliterator spliterator() {
        return Set$$CC.spliterator$$dflt$$(this);
    }

    @Override // defpackage.pob, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = qdu.a((Set) this.b, collection);
        if (a) {
            pof.a(this.e, this.b.size() - size);
            b();
        }
        return a;
    }
}