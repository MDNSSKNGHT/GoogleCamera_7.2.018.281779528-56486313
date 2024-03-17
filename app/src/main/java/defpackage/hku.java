package defpackage;

/* compiled from: PG */
/* renamed from: hku */
/* loaded from: classes.dex */
public final class hku implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private hku(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static hku a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new hku(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        klw klwVar = (klw) this.a.get();
        cin cinVar = (cin) this.b.get();
        myo a = ((ggz) this.c).a();
        pkx pkxVar = (pkx) this.d.get();
        mcs mcsVar = (mcs) this.e.get();
        if (klwVar != klw.LONG_EXPOSURE || ((Integer) cinVar.a(ciu.b).a((Object) 0)).intValue() <= 0 || a.N() != mzg.BACK) {
            obj = hko.a;
        } else {
            obj = new hkp(mcsVar, pkxVar);
        }
        return (pkx) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}