package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: gqb */
/* loaded from: classes.dex */
public final class gqb implements rgg {
    private final rhd a;
    private final rhd b;

    private gqb(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gqb a(rhd rhdVar, rhd rhdVar2) {
        return new gqb(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pjz) rgk.a(mxi.a((mnu) this.a.get(), (mou) ((Map) this.b.get()).get(htc.YUV_ANALYSIS)), "Cannot return null from a non-@Nullable @Provides method");
    }
}