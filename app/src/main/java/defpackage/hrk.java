package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: hrk  reason: default package */
/* loaded from: classes.dex */
public final class hrk {
    static {
        liu.a("HdrPAvailability");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static mcs a(boolean z, rhd rhdVar, feb febVar, cin cinVar) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(febVar.a(fdt.HDR_PLUS));
            arrayList.add(new hrj(((mnz) ((pkx) rhdVar.get()).a()).c(), (!cinVar.c(ciu.A) ? 1 : 2) + 1));
            ciq ciqVar = cit.a;
            cinVar.b();
            return mdg.a((Collection) arrayList);
        }
        return mdg.a((Object) false);
    }
}