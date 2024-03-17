package defpackage;

/* compiled from: PG */
/* renamed from: gcs */
/* loaded from: classes.dex */
public final class gcs implements rgg {
    private final rhd a;

    private gcs(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gcs a(rhd rhdVar) {
        return new gcs(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (gel) rgk.a(new gel(((ggz) this.a).a().d()), "Cannot return null from a non-@Nullable @Provides method");
    }
}