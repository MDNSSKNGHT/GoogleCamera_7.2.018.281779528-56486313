package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: djl  reason: default package */
/* loaded from: classes.dex */
public final class djl {
    public final kom a;
    private final Map<djm, Executor> b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public djl() {
        this((byte) 0);
        new mkj();
    }

    public djl(byte b) {
        this.a = okf.a(68);
        this.b = new HashMap();
    }

    public final synchronized void a(djm djmVar, Executor executor) {
        this.b.put(djmVar, executor);
    }

    public final synchronized void a(ibf ibfVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new djk(entry, ibfVar));
        }
    }

    public final ibf a(long j) {
        return (ibf) this.a.a(dki.a(j));
    }

    public final List b() {
        return this.a.a();
    }

    public final ibf a() {
        return (ibf) this.a.f();
    }

    public final synchronized void a(djm djmVar) {
        if (this.b.containsKey(djmVar)) {
            this.b.remove(djmVar);
        }
    }
}