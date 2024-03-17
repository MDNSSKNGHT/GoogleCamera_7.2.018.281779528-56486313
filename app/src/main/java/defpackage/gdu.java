package defpackage;

/* compiled from: PG */
/* renamed from: gdu */
/* loaded from: classes.dex */
public final class gdu implements rgg {
    private final rhd a;
    private final rhd b;

    private gdu(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gdu a(rhd rhdVar, rhd rhdVar2) {
        return new gdu(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(mdg.a(mdg.a(mdg.a(((gdl) this.b.get()).a(), new gdq()), (mcs) ((gde) this.a.get()).a), new gdr()), "Cannot return null from a non-@Nullable @Provides method");
    }
}