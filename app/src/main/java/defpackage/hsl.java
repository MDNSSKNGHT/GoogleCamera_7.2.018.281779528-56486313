package defpackage;

/* compiled from: PG */
/* renamed from: hsl */
/* loaded from: classes.dex */
public final class hsl implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private hsl(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static hsl a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new hsl(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(hsh.a((mba) this.a.get(), (mnu) this.b.get(), (mou) this.c.get(), (qpp) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}