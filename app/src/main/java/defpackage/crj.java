package defpackage;

/* compiled from: PG */
/* renamed from: crj */
/* loaded from: classes.dex */
public final class crj implements rgg {
    private final rhd a;

    private crj(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static crj a(rhd rhdVar) {
        return new crj(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new cri((crd) this.a.get());
    }
}