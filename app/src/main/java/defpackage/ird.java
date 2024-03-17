package defpackage;

/* compiled from: PG */
/* renamed from: ird */
/* loaded from: classes.dex */
public final class ird implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private ird(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static ird a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new ird(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(kos.a(new iqw(((cqp) this.b).a(), (iqu) this.a.get(), ((ggy) this.c).a())), "Cannot return null from a non-@Nullable @Provides method");
    }
}