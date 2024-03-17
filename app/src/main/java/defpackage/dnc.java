package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dnc */
/* loaded from: classes.dex */
public final class dnc implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private dnc(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static dnc a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new dnc(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new dnb((ebe) this.a.get(), (Integer) this.b.get(), (Executor) this.c.get(), ((rgn) this.d).a());
    }
}