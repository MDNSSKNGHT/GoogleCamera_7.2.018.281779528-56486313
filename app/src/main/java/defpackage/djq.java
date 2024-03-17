package defpackage;

/* compiled from: PG */
/* renamed from: djq */
/* loaded from: classes.dex */
public final class djq implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;

    private djq(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
    }

    public static djq a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4) {
        return new djq(rhdVar, rhdVar2, rhdVar3, rhdVar4);
    }

    public final Boolean a() {
        cqo a = ((cqp) this.a).a();
        cin cinVar = (cin) this.b.get();
        fia fiaVar = (fia) this.c.get();
        geq a2 = ((ggy) this.d).a();
        ciq ciqVar = cit.a;
        cinVar.b();
        boolean z = true;
        boolean z2 = a.b() && fiaVar.a;
        boolean z3 = cinVar.b(cit.E) && a2.N() == mzg.BACK;
        if (!z2 && !z3) {
            z = false;
        }
        return (Boolean) rgk.a(Boolean.valueOf(z), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }
}