package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmg  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class gmg implements qok {
    private final rhd a;
    private final rhd b;
    private final Executor c;

    public gmg(rhd rhdVar, rhd rhdVar2, Executor executor) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = executor;
    }

    @Override // defpackage.qok
    public final qpp a() {
        //Stream$$CC.concat$$STATIC$$(Collection$$Dispatch.stream((Set) this.a.get()), Collection$$Dispatch.stream((Set) this.b.get()).map(gmh.a)).forEach(new gmi(this.c));
        return rgk.b((Object) true);
    }
}