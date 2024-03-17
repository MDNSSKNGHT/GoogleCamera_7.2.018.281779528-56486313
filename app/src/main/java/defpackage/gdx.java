package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: gdx */
/* loaded from: classes.dex */
public final class gdx implements rgg {
    private final rhd a;
    private final rhd b;

    private gdx(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gdx a(rhd rhdVar, rhd rhdVar2) {
        return new gdx(rhdVar, rhdVar2);
    }

    public final mbs a() {
        return (mbs) rgk.a(new mbs((ScheduledExecutorService) this.a.get(), ((bap) this.b).a().intValue(), TimeUnit.SECONDS), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}