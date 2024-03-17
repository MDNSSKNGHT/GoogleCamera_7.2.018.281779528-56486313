package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mdh  reason: default package */
/* loaded from: classes.dex */
public final class mdh implements mcs {
    private final pkx a;
    private final mch b;
    private final mcs c;

    public mdh(pkx pkxVar) {
        this.a = pkxVar;
        mch mchVar = new mch(pkxVar.a());
        this.b = mchVar;
        this.c = mdg.b(mchVar);
    }

    @Override // defpackage.mcs
    public final Object a() {
        return this.b.c;
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.c.a(mjwVar, executor);
    }

    public final String toString() {
        pjy a = qdu.a("PollingObs");
        a.a(this.a);
        return a.toString();
    }

    public final void b() {
        this.b.a(this.a.a());
    }
}