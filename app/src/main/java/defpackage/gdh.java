package defpackage;

/* compiled from: PG */
/* renamed from: gdh */
/* loaded from: classes.dex */
public final class gdh implements rgg {
    private final rhd a;
    private final rhd b;

    private gdh(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gdh a(rhd rhdVar, rhd rhdVar2) {
        return new gdh(rhdVar, rhdVar2);
    }

    public final gdg a() {
        return new gdg((mch) this.a.get(), (mcs) this.b.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}