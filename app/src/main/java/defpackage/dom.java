package defpackage;

/* compiled from: PG */
/* renamed from: dom */
/* loaded from: classes.dex */
public final class dom implements rgg {
    private final rhd a;

    private dom(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static dom a(rhd rhdVar) {
        return new dom(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(mdg.a((Object) false, (qpp) ((qqg) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}