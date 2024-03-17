package defpackage;

/* compiled from: PG */
/* renamed from: dqm */
/* loaded from: classes.dex */
public final class dqm implements rgg {
    private final rhd a;

    private dqm(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqm a(rhd rhdVar) {
        return new dqm(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mrx) rgk.a(mrx.a((drh) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}