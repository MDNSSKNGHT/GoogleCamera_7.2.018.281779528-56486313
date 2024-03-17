package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: hlh */
/* loaded from: classes.dex */
public final class hlh implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    public hlh(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        geq a = ((ggy) this.a).a();
        bca bcaVar = (bca) this.b.get();
        if (!((cin) this.c.get()).d(cim.d) || a.N() != mzg.BACK) {
            obj = pvi.a;
        } else {
            obj = psl.c(bcaVar);
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}