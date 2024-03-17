package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: hrd */
/* loaded from: classes.dex */
public final class hrd implements rgg {
    private final rhd a;
    private final rhd b;

    private hrd(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hrd a(rhd rhdVar, rhd rhdVar2) {
        return new hrd(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        mch mchVar = (mch) this.b.get();
        if (((ncz) this.a.get()).f) {
            obj = psl.c(new hrc(mchVar));
        } else {
            obj = pvi.a;
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}