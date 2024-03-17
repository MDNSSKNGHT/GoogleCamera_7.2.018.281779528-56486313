package defpackage;

/* compiled from: PG */
/* renamed from: efs */
/* loaded from: classes.dex */
final class efs implements rhd {
    private final rhd a;

    private efs(rhd rhdVar) {
        this.a = (rhd) rgk.a(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return pjz.b(this.a.get());
    }

    public static rhd a(rhd rhdVar) {
        return new efs(rhdVar);
    }
}