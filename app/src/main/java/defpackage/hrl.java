package defpackage;

/* compiled from: PG */
/* renamed from: hrl */
/* loaded from: classes.dex */
public final class hrl implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private hrl(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static hrl a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new hrl(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(hrk.a(((gpu) this.a).a().booleanValue(), this.b, (feb) this.c.get(), (cin) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}