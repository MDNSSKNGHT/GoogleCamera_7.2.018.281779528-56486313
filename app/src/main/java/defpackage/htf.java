package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: htf */
/* loaded from: classes.dex */
public final class htf implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private htf(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static htf a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new htf(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        geq a = ((ggy) this.a).a();
        ggh gghVar = (ggh) this.b.get();
        rhd rhdVar = this.c;
        int intValue = ((Integer) this.d.get()).intValue();
        if (a.C()) {
            a = (geq) ((List) rhdVar.get()).get(0);
        }
        int i = gghVar.b;
        mzu a2 = htd.a(a, intValue);
        qdu.d(a2);
        return (mou) rgk.a(htd.a(a.M(), a2, i, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}