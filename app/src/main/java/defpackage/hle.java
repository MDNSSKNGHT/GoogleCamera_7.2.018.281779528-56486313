package defpackage;

/* compiled from: PG */
/* renamed from: hle */
/* loaded from: classes.dex */
public final class hle implements rgg {
    private final rhd a;
    private final rhd b;

    public hle(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (bmx) rgk.a(kos.a(new hlb((mcs) this.b.get(), (mch) this.a.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}