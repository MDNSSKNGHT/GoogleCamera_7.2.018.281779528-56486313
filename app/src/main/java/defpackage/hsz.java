package defpackage;

/* compiled from: PG */
/* renamed from: hsz */
/* loaded from: classes.dex */
public final class hsz implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hsz(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hsz a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hsz(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(hsy.a((gff) this.a.get(), this.b, (hsw) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}