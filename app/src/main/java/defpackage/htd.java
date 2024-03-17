package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: htd */
/* loaded from: classes.dex */
public final class htd {
    public static final String a = liu.a("PckStreamConfigModule");

    public static mou a(mzc mzcVar, mzu mzuVar, int i, boolean z) {
        mot h = mou.h();
        h.a(mzcVar);
        h.a(mzuVar.b);
        h.b(mzuVar.a);
        h.a(i);
        h.a(mov.IMAGE_READER);
        h.a(z);
        return h.a();
    }

    public static mzu a(geq geqVar, int... iArr) {
        for (int i : iArr) {
            List a2 = geqVar.a(i);
            if (!a2.isEmpty()) {
                return new mzu(i, fpp.a(a2));
            }
        }
        return null;
    }

    public static Set a() {
        return lam.a != null ? psl.c(mop.a(lam.a, 0)) : pvi.a;
    }

    public static List a(myo myoVar, myz myzVar) {
        Set<mzc> H = myoVar.H();
        qdu.c(!H.isEmpty());
        ArrayList arrayList = new ArrayList();
        for (mzc mzcVar : H) {
            arrayList.add(new ger(myzVar.b(mzcVar)));
        }
        Collections.sort(arrayList, htb.a);
        return arrayList;
    }
}