package defpackage;

/* compiled from: PG */
/* renamed from: jdz  reason: default package */
/* loaded from: classes.dex */
public final class jdz implements rgg {
    private final rhd a;

    public jdz(rhd rhdVar) {
        this.a = rhdVar;
    }

    public final pjz a() {
        return (pjz) rgk.a(jdy.a(((dzs) this.a).a()), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}
