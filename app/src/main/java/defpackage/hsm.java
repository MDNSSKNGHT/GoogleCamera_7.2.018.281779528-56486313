package defpackage;

/* compiled from: PG */
/* renamed from: hsm */
/* loaded from: classes.dex */
public final class hsm implements rgg {
    private final rhd a;
    private final rhd b;

    private hsm(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hsm a(rhd rhdVar, rhd rhdVar2) {
        return new hsm(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mou) rgk.a(hsh.a((mjs) this.a.get(), ((ggy) this.b).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}