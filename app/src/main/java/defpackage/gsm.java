package defpackage;

/* compiled from: PG */
/* renamed from: gsm */
/* loaded from: classes.dex */
public final class gsm implements rgg {
    private final rhd a;

    private gsm(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gsm a(rhd rhdVar) {
        return new gsm(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new gsl(((rgn) this.a).a());
    }
}