package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gqa */
/* loaded from: classes.dex */
public final class gqa implements rgg {
    private final rhd a;
    private final rhd b;

    private gqa(rhd rhdVar, rhd rhdVar2) {
        this.a = rhdVar;
        this.b = rhdVar2;
    }

    public static gqa a(rhd rhdVar, rhd rhdVar2) {
        return new gqa(rhdVar, rhdVar2);
    }

    @Override // defpackage.rhd
    public /* bridge */ /* synthetic */ Object get() {
        mnu mnuVar = (mnu) this.a.get();
        Map<htc, mos> map = (Map<htc, mos>) this.b.get();
        EnumMap<htc, mos> enumMap = new EnumMap<>(htc.class);
        for (htc htcVar : map.keySet()) {
            mos a = mnuVar.a().a((mou) map.get(htcVar));
            if (a != null) {
                enumMap.put(htcVar, a);
            }
        }
        return rgk.a(enumMap, "Cannot return null from a non-@Nullable @Provides method");
    }
}