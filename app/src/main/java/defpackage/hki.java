package defpackage;

/* compiled from: PG */
/* renamed from: hki */
/* loaded from: classes.dex */
public final class hki implements rgg {
    private final rhd a;

    private hki(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static hki a(rhd rhdVar) {
        return new hki(rhdVar);
    }

    public final hkh a() {
        return new hkh(((gfw) this.a).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}