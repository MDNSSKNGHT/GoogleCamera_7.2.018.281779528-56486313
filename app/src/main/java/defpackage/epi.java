package defpackage;

/* compiled from: PG */
/* renamed from: epi  reason: default package */
/* loaded from: classes.dex */
public final class epi implements rgg {
    private final epc a;
    private final rhd b;

    public epi(epc epcVar, rhd rhdVar) {
        this.a = epcVar;
        this.b = rhdVar;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(!((ggz) this.b).a().g() ? mdg.a((Object) false) : this.a.h, "Cannot return null from a non-@Nullable @Provides method");
    }
}
