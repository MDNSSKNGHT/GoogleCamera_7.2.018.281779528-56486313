package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: gpw */
/* loaded from: classes.dex */
public final class gpw implements rgg {
    private final rhd a;
    private final rhd b;

    private gpw(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gpw a(rhd rhdVar, rhd rhdVar2) {
        return new gpw(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pjz) rgk.a(mxi.a((mnu) this.a.get(), (mou) ((Map) this.b.get()).get(htc.PD)), "Cannot return null from a non-@Nullable @Provides method");
    }
}