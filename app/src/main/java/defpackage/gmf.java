package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmf  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gmf implements bmx {
    private final rhd a;
    private final rhd b;
    private final Executor c;
    private final Executor d;

    public gmf(rhd rhdVar, rhd rhdVar2, Executor executor, Executor executor2) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = executor;
        this.d = executor2;
    }

    @Override // defpackage.bmx
    public final qpp Z() {
        rhd rhdVar = this.a;
        rhd rhdVar2 = this.b;
        Executor executor = this.c;
        return rgk.a(new gmg(rhdVar, rhdVar2, executor), this.d);
    }
}