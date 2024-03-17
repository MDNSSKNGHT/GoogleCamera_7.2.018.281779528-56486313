package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: gpv */
/* loaded from: classes.dex */
public final class gpv implements rgg {
    private final rhd a;
    private final rhd b;

    private gpv(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gpv a(rhd rhdVar, rhd rhdVar2) {
        return new gpv(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pjz) rgk.a(mxi.a((mnu) this.a.get(), (mou) ((Map) this.b.get()).get(htc.DEPTH)), "Cannot return null from a non-@Nullable @Provides method");
    }
}