package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dka  reason: default package */
/* loaded from: classes.dex */
public final class dka extends mrx {
    public final djl a;
    public final kno b;
    private final bgl c;
    private final Executor d;
    private final Set<String> e = new HashSet<>();

    public dka(djl djlVar, bgl bglVar, kno knoVar, Executor executor) {
        this.a = djlVar;
        this.c = bglVar;
        this.d = executor;
        this.b = knoVar;
    }

    public final synchronized void a(String str) {
        this.e.add(str);
    }

    @Override // defpackage.mrx
    public final void a(ndr ndrVar) {
        if (this.e.isEmpty()) {
            return;
        }
        this.d.execute(new djz(this, ndrVar, this.c.a()));
    }

    public final synchronized void b(String str) {
        this.e.remove(str);
    }
}