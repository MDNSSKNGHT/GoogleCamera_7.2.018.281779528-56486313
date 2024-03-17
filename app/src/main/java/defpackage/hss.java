package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hss */
/* loaded from: classes.dex */
public final class hss implements rgg {
    private final rhd a;
    private final rhd b;

    private hss(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static hss a(rhd rhdVar, rhd rhdVar2) {
        return new hss(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Set a = ((rgn) this.a).a();
        return (gff) rgk.a(new gff(new ArrayList(a), ((rgn) this.b).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}