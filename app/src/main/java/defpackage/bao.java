package defpackage;

/* compiled from: PG */
/* renamed from: bao */
/* loaded from: classes.dex */
public final class bao implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private bao(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static bao a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new bao(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        bdb a;
        geq a2 = ((ggy) this.a).a();
        if (!a2.r()) {
            a = ((bdc) this.c).a();
        } else {
            a = ((bcw) this.b).a();
        }
        return (mrx) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}