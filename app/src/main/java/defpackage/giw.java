package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: giw */
/* loaded from: classes.dex */
public final class giw implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private giw(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static giw a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new giw(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final giv a() {
        return new giv(((dzr) this.a).a(), (jdg) this.b.get(), (jcv) this.c.get(), (Executor) this.d.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}