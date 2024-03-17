package defpackage;

/* compiled from: PG */
/* renamed from: dpm */
/* loaded from: classes.dex */
public final class dpm implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private dpm(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static dpm a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new dpm(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mcs a;
        myo a2 = ((ggz) this.a).a();
        mdl mdlVar = (mdl) this.b.get();
        mdl mdlVar2 = (mdl) this.c.get();
        cqo a3 = ((cqp) this.d).a();
        cin cinVar = (cin) this.e.get();
        if (cinVar.d(cjh.b)) {
            a = mdg.a(doo.RGB_HW);
        } else {
            a = mdg.a(mdlVar, new dpg(a2, cinVar, a3, mdlVar2));
        }
        return (mcs) rgk.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}