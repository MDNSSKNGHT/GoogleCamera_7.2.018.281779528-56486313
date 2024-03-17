package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: cxl */
/* loaded from: classes.dex */
public final class cxl implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;

    private cxl(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
    }

    public static cxl a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3) {
        return new cxl(rhdVar, rhdVar2, rhdVar3);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.b.get()).booleanValue();
        cyo cyoVar = (cyo) this.c.get();
        if (!booleanValue || !booleanValue2) {
            obj = pvi.a;
        } else {
            obj = psl.c(new cxk());
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}