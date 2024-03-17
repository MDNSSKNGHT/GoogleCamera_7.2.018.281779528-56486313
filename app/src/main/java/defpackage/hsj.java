package defpackage;

/* compiled from: PG */
/* renamed from: hsj */
/* loaded from: classes.dex */
public final class hsj implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hsj(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hsj a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hsj(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(hsh.a((cin) this.a.get(), (gqs) this.b.get(), (hju) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}