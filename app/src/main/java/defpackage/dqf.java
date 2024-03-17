package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dqf */
/* loaded from: classes.dex */
public final class dqf implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private dqf(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static dqf a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new dqf(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new dqe((mcs) this.a.get(), (Executor) this.b.get(), (mba) this.c.get());
    }
}