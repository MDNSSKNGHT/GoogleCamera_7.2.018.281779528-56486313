package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: fea  reason: default package */
/* loaded from: classes.dex */
final class fea implements mjq {
    public final fdu a;
    public final mch b;
    private final Collection<mjq> c;

    public /* synthetic */ fea(fdu fduVar, mch mchVar, Collection collection) {
        this.a = fduVar;
        this.b = mchVar;
        this.c = collection;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        for (mjq mjqVar : this.c) {
            mjqVar.close();
        }
    }
}
