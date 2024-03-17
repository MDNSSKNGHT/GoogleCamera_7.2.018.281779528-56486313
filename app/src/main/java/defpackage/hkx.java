package defpackage;

/* compiled from: PG */
/* renamed from: hkx */
/* loaded from: classes.dex */
public final class hkx implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hkx(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hkx a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hkx(rhdVar, rhdVar2, rhdVar3);
    }

    public final hkw a() {
        return new hkw((mkn) this.a.get(), ((cnc) this.b).a(), (gde) this.c.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}