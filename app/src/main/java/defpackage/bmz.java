package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bmz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bmz implements bmx {
    private final Executor a;
    private final Runnable b;

    public bmz(Executor executor, Runnable runnable) {
        this.a = executor;
        this.b = runnable;
    }

    @Override // defpackage.bmx
    public final qpp Z() {
        Executor executor = this.a;
        Runnable runnable = this.b;
        qqg f = qqg.f();
        executor.execute(new bnb(runnable, f));
        return f;
    }
}