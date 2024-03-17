package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cag  reason: default package */
/* loaded from: classes.dex */
public final class cag {
    private static final String b = liu.a("CdrCharacteristics");
    public final geq a;
    private final Map<meo, List<mer>> c;

    public cag(geq geqVar, Map<meo, List<mer>> map) {
        this.a = geqVar;
        this.c = map;
        for (meo meoVar : map.keySet()) {
            String sb = "checkResolutionListOrder: [" +
                    meoVar +
                    "] = " +
                    map.get(meoVar);
            liu.d(b);
        }
    }

    public final List a(meo meoVar) {
        List list = this.c.get(meoVar);
        qdu.d(list);
        return list;
    }

    public final boolean a(meo meoVar, mer merVar) {
        List list = this.c.get(meoVar);
        qdu.d(list);
        return list.contains(merVar);
    }
}