package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: qoo  reason: default package */
/* loaded from: classes2.dex */
public final class qoo extends qof {
    private List g;

    public qoo(prg prgVar, boolean z) {
        super(prgVar, z, true);
        List c;
        if (!prgVar.isEmpty()) {
            c = qdu.b(prgVar.size());
        } else {
            c = prr.c();
        }
        this.g = c;
        for (int i = 0; i < prgVar.size(); i++) {
            this.g.add(null);
        }
        f();
    }

    @Override // defpackage.qof
    public final void a(int i, Object obj) {
        List list = this.g;
        if (list != null) {
            list.set(i, pjz.c(obj));
        }
    }

    @Override // defpackage.qof
    public final void g() {
        List<pjz> list = this.g;
        if (list != null) {
            ArrayList b = qdu.b(list.size());
            for (pjz pjzVar : list) {
                b.add(pjzVar != null ? pjzVar.c() : null);
            }
            b(Collections.unmodifiableList(b));
        }
    }

    @Override // defpackage.qof
    public final void a(qoe qoeVar) {
        super.a(qoeVar);
        this.g = null;
    }
}