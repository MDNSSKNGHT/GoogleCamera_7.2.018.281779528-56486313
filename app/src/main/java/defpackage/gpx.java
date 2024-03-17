package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: gpx */
/* loaded from: classes.dex */
public final class gpx implements rgg {
    private final rhd a;
    private final rhd b;

    private gpx(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gpx a(rhd rhdVar, rhd rhdVar2) {
        return new gpx(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (pjz) rgk.a(mxi.a((mnu) this.a.get(), (mou) ((Map) this.b.get()).get(htc.RAW_HDRPLUS)), "Cannot return null from a non-@Nullable @Provides method");
    }
}