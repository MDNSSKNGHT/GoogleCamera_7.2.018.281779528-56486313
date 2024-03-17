package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* renamed from: boe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class boe implements mjq {
    private final Future a;

    public boe(Future future) {
        this.a = future;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.cancel(false);
    }
}