package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: don */
/* loaded from: classes.dex */
public final class don implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private don(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static don a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new don(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(kos.a(((mkn) this.d.get()).a("HdrPlusImageCaptureAvailability", new dok((qqg) this.b.get(), this.a)), (Executor) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}