package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dkb */
/* loaded from: classes.dex */
public final class dkb implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private dkb(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static dkb a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new dkb(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new dka((djl) this.a.get(), ((bgm) this.b).a(), (kno) this.c.get(), (Executor) this.d.get());
    }
}