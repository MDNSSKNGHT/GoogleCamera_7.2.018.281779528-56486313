package defpackage;

/* compiled from: PG */
/* renamed from: gdv */
/* loaded from: classes.dex */
public final class gdv implements rgg {
    private final rhd a;

    private gdv(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gdv a(rhd rhdVar) {
        return new gdv(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mrx) rgk.a(((gee) this.a.get()).d, "Cannot return null from a non-@Nullable @Provides method");
    }
}