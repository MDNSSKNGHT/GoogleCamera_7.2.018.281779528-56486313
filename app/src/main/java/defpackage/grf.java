package defpackage;

/* compiled from: PG */
/* renamed from: grf  reason: default package */
/* loaded from: classes.dex */
public final class grf implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    public grf(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return (mcs) rgk.a(new gqw((mdl) this.a.get(), (mdl) this.b.get(), ((ggy) this.c).a(), gri.OFF), "Cannot return null from a non-@Nullable @Provides method");
    }
}
