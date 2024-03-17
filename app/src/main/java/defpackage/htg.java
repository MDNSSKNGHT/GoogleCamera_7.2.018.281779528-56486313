package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: htg */
/* loaded from: classes.dex */
public final class htg implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private htg(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static htg a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new htg(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mzu a;
        geq a2 = ((ggy) this.a).a();
        List list = (List) this.c.get();
        klw klwVar = (klw) this.d.get();
        qdu.c(a2.C());
        int i = ((ggh) this.b.get()).b;
        geq geqVar = (geq) list.get(list.size() - 1);
        if (klwVar == klw.PORTRAIT) {
            a = new mzu(37, new mjs(2328, 1746));
        } else {
            a = htd.a(geqVar, 37, 38, 32);
        }
        qdu.d(a);
        return (mou) rgk.a(htd.a(geqVar.M(), a, i, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}