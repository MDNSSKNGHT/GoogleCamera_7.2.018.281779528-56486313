package defpackage;

/* compiled from: PG */
/* renamed from: gcw */
/* loaded from: classes.dex */
public final class gcw implements rgg {
    private final rhd a;
    private final rhd b;

    private gcw(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gcw a(rhd rhdVar, rhd rhdVar2) {
        return new gcw(rhdVar, rhdVar2);
    }

    public final gcv a() {
        return new gcv((mch) this.a.get(), (mcs) this.b.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}