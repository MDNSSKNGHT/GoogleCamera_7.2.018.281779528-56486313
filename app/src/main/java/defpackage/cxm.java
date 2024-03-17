package defpackage;

/* compiled from: PG */
/* renamed from: cxm  reason: default package */
/* loaded from: classes.dex */
public final class cxm implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;

    private cxm(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
    }

    public static cxm a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5) {
        return new cxm(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return a();
    }

    public final Runnable a() {
        Object obj;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.b.get()).booleanValue();
        cyl cylVar = (cyl) this.c.get();
        geq a = ((ggy) this.d).a();
        cyo cyoVar = (cyo) this.e.get();
        if (!booleanValue || !booleanValue2) {
            obj = qqc.a;
        } else {
            obj = new cxi(cyoVar, a, cylVar);
        }
        return (Runnable) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}