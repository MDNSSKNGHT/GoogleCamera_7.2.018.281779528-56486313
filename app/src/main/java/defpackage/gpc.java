package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gpc */
/* loaded from: classes.dex */
public final class gpc implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private gpc(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static gpc a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new gpc(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mkf a = ((cnc) this.a).a();
        rhd rhdVar = this.d;
        mkg a2 = a.a("PictureTakerModule");
        a2.b("RootImageCommand requested");
        return (bmx) rgk.a(kos.a(new gox(a2, (qqg) this.c.get(), rhdVar), (Executor) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}