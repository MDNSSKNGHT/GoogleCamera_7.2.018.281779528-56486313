package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: mzq  reason: default package */
/* loaded from: classes.dex */
public final class mzq extends ndx {
    private final AtomicBoolean a;

    public mzq(neb nebVar) {
        super(nebVar);
        this.a = new AtomicBoolean(false);
    }

    @Override // defpackage.ndx, defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        super.close();
    }
}