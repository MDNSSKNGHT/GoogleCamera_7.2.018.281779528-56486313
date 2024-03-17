package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gml */
/* loaded from: classes.dex */
public final class gml implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private gml(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static gml a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new gml(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Executor executor = (Executor) this.b.get();
        rhd rhdVar = this.c;
        return (bmx) rgk.a(new gmf(this.d, rhdVar, executor, (Executor) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}