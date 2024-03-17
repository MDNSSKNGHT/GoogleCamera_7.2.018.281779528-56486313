package defpackage;

/* compiled from: PG */
/* renamed from: htn */
/* loaded from: classes.dex */
public final class htn implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private htn(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static htn a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new htn(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        mjs mjsVar;
        klw klwVar = (klw) this.a.get();
        geq a = ((ggy) this.b).a();
        gtb gtbVar = (gtb) this.c.get();
        rhd rhdVar = this.d;
        if (klwVar == klw.PHOTO) {
            mjsVar = !mix.b.a(mix.a(gtbVar.b)) ? djy.a : djy.b;
        } else {
            mjsVar = (mjs) rhdVar.get();
        }
        return (mou) rgk.a(htd.a(a.M(), new mzu(35, mjsVar), 50, false), "Cannot return null from a non-@Nullable @Provides method");
    }
}