package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* renamed from: gfc */
/* loaded from: classes.dex */
public final class gfc implements rgg {
    private final rhd a;
    private final rhd b;

    private gfc(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gfc a(rhd rhdVar, rhd rhdVar2) {
        return new gfc(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ScheduledExecutorService a = eav.a("SchCameraEx", 1);
        ((mba) this.a.get()).a(new gey(a));
        ((mba) this.b.get()).a(new gez(a));
        return (ScheduledExecutorService) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}