package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: hti */
/* loaded from: classes.dex */
public final class hti implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private hti(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static hti a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new hti(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        qdu.c(((ggy) this.a).a().C());
        int i = ((ggh) this.b.get()).b;
        geq geqVar = (geq) ((List) this.c.get()).get(0);
        mzu a = htd.a(geqVar, 37, 38, 32);
        qdu.d(a);
        return (mou) rgk.a(htd.a(geqVar.M(), a, i, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}