package defpackage;

/* compiled from: PG */
/* renamed from: ggc  reason: default package */
/* loaded from: classes.dex */
public final class ggc implements rgg {
    private final rhd a;

    private ggc(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static ggc a(rhd rhdVar) {
        return new ggc(rhdVar);
    }

    public final ggb a() {
        return new ggb((mcs) this.a.get());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}