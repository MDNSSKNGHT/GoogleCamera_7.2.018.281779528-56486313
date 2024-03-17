package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: gpz */
/* loaded from: classes.dex */
public final class gpz implements rgg {
    private final rhd a;
    private final rhd b;

    private gpz(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gpz a(rhd rhdVar, rhd rhdVar2) {
        return new gpz(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pjz) rgk.a(mxi.a((mnu) this.a.get(), (mou) ((Map) this.b.get()).get(htc.RAW_WIDE)), "Cannot return null from a non-@Nullable @Provides method");
    }
}