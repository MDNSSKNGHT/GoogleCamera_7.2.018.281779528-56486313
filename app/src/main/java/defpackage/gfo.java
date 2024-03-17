package defpackage;

/* compiled from: PG */
/* renamed from: gfo */
/* loaded from: classes.dex */
public final class gfo implements rgg {
    private final rhd a;

    private gfo(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gfo a(rhd rhdVar) {
        return new gfo(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        ((gga) this.a).a();
        return (ggq) rgk.a(ggt.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}