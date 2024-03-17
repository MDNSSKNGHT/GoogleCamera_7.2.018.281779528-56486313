package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dnb  reason: default package */
/* loaded from: classes.dex */
public final class dnb extends mrx {
    public final ebe a;
    public final int b;
    public final Set<mrx> c;
    private final Executor d;

    public dnb(ebe ebeVar, Integer num, Executor executor, Set<mrx> set) {
        this.a = ebeVar;
        this.b = num;
        this.d = executor;
        this.c = set;
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        this.d.execute(new dna(this, ndrVar));
    }
}