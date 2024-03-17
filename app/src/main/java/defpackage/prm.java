package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: prm  reason: default package */
/* loaded from: classes.dex */
public final class prm extends prf {
    public prm() {
        super(4);
    }

    public prm(int i) {
        super(i);
    }

    @Override // defpackage.prf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.a(obj);
    }

    public final void c(Object obj) {
        super.a(obj);
    }

    public final void b(Iterable iterable) {
        super.a(iterable);
    }

    public final void a(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
    }

    public final prr a() {
        this.c = true;
        return prr.b(this.a, this.b);
    }
}