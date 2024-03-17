package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ptf  reason: default package */
/* loaded from: classes.dex */
public final class ptf extends pnp {
    private final /* synthetic */ Iterator a;
    private final /* synthetic */ pkc b;

    public ptf(Iterator it, pkc pkcVar) {
        this.a = it;
        this.b = pkcVar;
    }

    @Override // defpackage.pnp
    protected final Object a() {
        while (this.a.hasNext()) {
            Object next = this.a.next();
            if (this.b.a(next)) {
                return next;
            }
        }
        return b();
    }
}