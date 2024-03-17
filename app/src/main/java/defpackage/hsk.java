package defpackage;

/* compiled from: PG */
/* renamed from: hsk */
/* loaded from: classes.dex */
public final class hsk implements rgg {
    private final rhd a;
    private final rhd b;

    private hsk(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hsk a(rhd rhdVar, rhd rhdVar2) {
        return new hsk(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (gcm) rgk.a(hsh.a(((hsp) this.a).a(), (mba) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}