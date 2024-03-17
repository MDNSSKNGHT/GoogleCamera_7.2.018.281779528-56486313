package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hub */
/* loaded from: classes.dex */
public final class hub implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;

    private hub(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
    }

    public static hub a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        return new hub(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new hua((dqg) this.a.get(), (mjs) this.b.get(), ((doc) this.c).a(), (hrg) this.d.get(), ((ggy) this.e).a(), (Executor) this.f.get());
    }
}