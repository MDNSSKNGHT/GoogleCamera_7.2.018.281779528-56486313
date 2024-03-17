package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dms */
/* loaded from: classes.dex */
public final class dms implements rgg {
    private final rhd a;
    private final rhd b;

    private dms(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static dms a(rhd rhdVar, rhd rhdVar2) {
        return new dms(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        rhd rhdVar = this.b;
        if (((Integer) this.a.get()).intValue() >= 0) {
            obj = psl.c((mrx) rhdVar.get());
        } else {
            obj = pvi.a;
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}