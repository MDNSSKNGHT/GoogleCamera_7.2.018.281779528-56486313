package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwa  reason: default package */
/* loaded from: classes.dex */
final class gwa implements ncr {
    public final /* synthetic */ mjw a;
    private final /* synthetic */ Executor b;

    public gwa(Executor executor, mjw mjwVar) {
        this.b = executor;
        this.a = mjwVar;
    }

    @Override // defpackage.ncr
    public final void a(mjo mjoVar) {
        this.b.execute(new gvz(this, mjoVar));
    }
}
