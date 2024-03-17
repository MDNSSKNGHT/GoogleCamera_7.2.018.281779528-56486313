package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dne */
/* loaded from: classes.dex */
final /* synthetic */ class dne implements nai {
    private final dnf a;

    public dne(dnf dnfVar) {
        this.a = dnfVar;
    }

    @Override // defpackage.nai
    public final Object a(List list) {
        dnf dnfVar = this.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nal nalVar = (nal) it.next();
            if (dnfVar.b) {
                dnfVar.a.a(nalVar.f, nalVar.g, nalVar.h, nalVar.e);
            } else {
                dnfVar.a.a(nalVar.f, -nalVar.g, -nalVar.h, nalVar.e);
            }
        }
        return null;
    }
}