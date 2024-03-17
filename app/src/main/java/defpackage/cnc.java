package defpackage;

/* compiled from: PG */
/* renamed from: cnc */
/* loaded from: classes.dex */
public final class cnc implements rgg {
    private final rhd a;

    public cnc(rhd rhdVar) {
        this.a = rhdVar;
    }

    public final mkf a() {
        return a(((mke) this.a).a());
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public static mkf a(mkg mkgVar) {
        mkf cniVar;
        if (mkgVar instanceof mkf) {
            cniVar = (mkf) mkgVar;
        } else {
            cniVar = new cni(mkgVar);
        }
        return (mkf) rgk.a(cniVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}