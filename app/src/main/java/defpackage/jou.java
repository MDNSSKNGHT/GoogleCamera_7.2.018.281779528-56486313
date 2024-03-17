package defpackage;

/* compiled from: PG */
/* renamed from: jou */
/* loaded from: classes.dex */
public final class jou implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private jou(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static jou a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new jou(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Boolean a = ((jom) this.a).a();
        rhd rhdVar = this.b;
        rhd rhdVar2 = this.c;
        geq a2 = ((ggy) this.d).a();
        boolean z = false;
        if (a.booleanValue() && a2.N() == mzg.BACK && ((pjz) rhdVar.get()).a() && ((pjz) rhdVar2.get()).a()) {
            z = true;
        }
        return (Boolean) rgk.a(Boolean.valueOf(z), "Cannot return null from a non-@Nullable @Provides method");
    }
}