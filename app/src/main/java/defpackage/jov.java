package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: jov */
/* loaded from: classes.dex */
public final class jov implements rgg {
    private final rhd a;
    private final rhd b;

    private jov(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static jov a(rhd rhdVar, rhd rhdVar2) {
        return new jov(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object obj;
        rhd rhdVar = this.b;
        if (((Boolean) this.a.get()).booleanValue()) {
            obj = psl.c(new joq((jox) ((pjz) rhdVar.get()).b()));
        } else {
            obj = pvi.a;
        }
        return (Set) rgk.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}