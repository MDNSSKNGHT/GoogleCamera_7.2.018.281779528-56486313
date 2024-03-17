package defpackage;

/* compiled from: PG */
/* renamed from: knp */
/* loaded from: classes.dex */
public final class knp implements rgg {
    private final rhd a;
    private final rhd b;

    private knp(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static knp a(rhd rhdVar, rhd rhdVar2) {
        return new knp(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new kno((myz) this.a.get(), (myo) this.b.get());
    }
}