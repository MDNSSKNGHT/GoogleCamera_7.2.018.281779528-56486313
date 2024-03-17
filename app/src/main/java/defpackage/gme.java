package defpackage;

/* compiled from: PG */
/* renamed from: gme */
/* loaded from: classes.dex */
public final class gme implements rgg {
    private final rhd a;

    private gme(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gme a(rhd rhdVar) {
        return new gme(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mba mbaVar = new mba();
        mba b = ((gmo) this.a.get()).b();
        b.a(new bnl(new bnj("DelLifetime", 2000), mbaVar));
        mbaVar.a(b);
        return (mba) rgk.a(mbaVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}