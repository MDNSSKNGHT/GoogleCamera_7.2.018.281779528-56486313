package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmd */
/* loaded from: classes.dex */
public final class gmd implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private gmd(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static gmd a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new gmd(rhdVar, rhdVar2, rhdVar3);
    }

    public final gmb a() {
        return new gmb(((rgn) this.a).a(), (qqg) this.b.get(), (Executor) this.c.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}