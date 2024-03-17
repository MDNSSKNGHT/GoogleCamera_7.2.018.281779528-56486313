package defpackage;

/* compiled from: PG */
/* renamed from: grd  reason: default package */
/* loaded from: classes.dex */
public final class grd implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    public grd(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        geq a = ((ggy) this.a).a();
        mdl mdlVar = (mdl) this.b.get();
        mdl mdlVar2 = (mdl) this.c.get();
        if (a.N() == mzg.FRONT) {
            mdlVar = mdlVar2;
        }
        return (mcs) rgk.a(mdg.a(mdlVar, grc.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
