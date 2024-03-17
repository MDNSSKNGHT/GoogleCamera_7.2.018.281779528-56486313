package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gmj */
/* loaded from: classes.dex */
public final class gmj implements rgg {
    private final rhd a;
    private final rhd b;

    private gmj(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gmj a(rhd rhdVar, rhd rhdVar2) {
        return new gmj(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (Executor) rgk.a(new bow((Executor) this.a.get(), (qpp) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}