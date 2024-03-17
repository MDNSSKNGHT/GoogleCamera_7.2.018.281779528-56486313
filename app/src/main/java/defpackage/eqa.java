package defpackage;

/* compiled from: PG */
/* renamed from: eqa */
/* loaded from: classes.dex */
public final class eqa implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    public eqa(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public final hkb a() {
        cin cinVar = (cin) this.a.get();
        hkb a = ((hll) this.c).a();
        hkb a2 = ((hkx) this.d).a();
        if (!(Boolean) ((pkx) this.b.get()).a() || cinVar.c(ciu.r)) {
            a = a2;
        }
        return (hkb) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}