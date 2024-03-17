package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: bnl  reason: default package */
/* loaded from: classes.dex */
public final class bnl implements mjq {
    public final mba a;
    private final bnj b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public bnl(bnj bnjVar, mba mbaVar) {
        this.b = bnjVar;
        this.a = mbaVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.b.execute(new bnk(this));
        this.b.close();
    }
}