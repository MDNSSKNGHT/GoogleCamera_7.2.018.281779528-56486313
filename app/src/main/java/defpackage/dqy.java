package defpackage;

/* compiled from: PG */
/* renamed from: dqy */
/* loaded from: classes.dex */
public final class dqy implements rgg {
    private final rhd a;

    private dqy(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dqy a(rhd rhdVar) {
        return new dqy(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (drh) rgk.a(new drh((gfe) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}