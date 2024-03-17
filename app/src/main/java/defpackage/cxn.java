package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cxn */
/* loaded from: classes.dex */
public final class cxn implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private cxn(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static cxn a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new cxn(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(kos.a(((mkn) this.c.get()).a("FaceBeautificationCM.Startup", new cxj(this.a)), (Executor) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}