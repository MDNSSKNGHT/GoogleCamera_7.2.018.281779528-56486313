package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: got  reason: default package */
/* loaded from: classes.dex */
final class got implements gop {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final /* synthetic */ qqg b;
    private final /* synthetic */ gov c;

    public got(gov govVar, qqg qqgVar) {
        this.c = govVar;
        this.b = qqgVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        gov govVar = this.c;
        govVar.d.a(Boolean.valueOf(govVar.e.decrementAndGet() > 0));
        this.c.c.b();
        this.b.b((Object) true);
    }
}