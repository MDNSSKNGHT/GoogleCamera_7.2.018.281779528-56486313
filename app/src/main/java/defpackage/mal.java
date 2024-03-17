package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: mal  reason: default package */
/* loaded from: classes.dex */
final class mal implements mjq {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final /* synthetic */ mam b;

    public /* synthetic */ mal(mam mamVar) {
        this.b = mamVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.a.getAndSet(true)) {
            return;
        }
        synchronized (this.b.d) {
            mam mamVar = this.b;
            int i = mamVar.b - 1;
            mamVar.b = i;
            z = false;
            qdu.a(i >= 0, "The number of handles should never be negative.");
        }
        mam mamVar2 = this.b;
        synchronized (mamVar2.d) {
            if (mamVar2.f) {
                return;
            }
            if (mamVar2.b == 0) {
                mbu mbuVar = mamVar2.c;
                if (mbuVar != null) {
                    mbuVar.a(mamVar2.e);
                } else {
                    mamVar2.f = true;
                    z = true;
                }
            }
            if (z) {
                mamVar2.a.close();
            }
        }
    }
}