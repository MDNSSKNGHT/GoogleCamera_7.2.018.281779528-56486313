package defpackage;

/* compiled from: PG */
/* renamed from: jom */
/* loaded from: classes.dex */
public final class jom implements rgg {
    private final rhd a;

    public jom(rhd rhdVar) {
        this.a = rhdVar;
    }

    public final Boolean a() {
        return (Boolean) rgk.a(Boolean.valueOf(((cin) this.a.get()).b(cit.E)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}