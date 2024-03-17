package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gpj */
/* loaded from: classes.dex */
public final class gpj implements rgg {
    private final rhd a;

    private gpj(rhd rhdVar) {
        this.a = rhdVar;
    }

    public static gpj a(rhd rhdVar) {
        return new gpj(rhdVar);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        Object c;
        Map map = (Map) this.a.get();
        if (map.containsKey(htc.RAW_WIDE) || map.containsKey(htc.RAW_TELE)) {
            c = psl.c(gph.a);
        } else {
            c = pvi.a;
        }
        return (Set) rgk.a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}