package defpackage;

/* compiled from: PG */
/* renamed from: dsw */
/* loaded from: classes.dex */
public final class dsw implements rgg {
    private final rhd a;

    private dsw(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dsw a(rhd rhdVar) {
        return new dsw(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new dsv(((doj) this.a).a());
    }
}