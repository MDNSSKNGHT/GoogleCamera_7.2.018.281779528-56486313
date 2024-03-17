package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hqe  reason: default package */
/* loaded from: classes.dex */
public abstract class hqe implements goq {
    private static final String a = liu.a("PckZslCptrCmd");
    private final hne b;
    private final goq c;
    private final Set d;

    protected abstract boolean a(List list, gop gopVar, gnq gnqVar);

    public hqe(hne hneVar, goq goqVar, Set set) {
        this.b = hneVar;
        this.c = goqVar;
        this.d = set;
    }

    @Override // defpackage.goq
    public final void a(gop gopVar, gnq gnqVar) {
        goq goqVar;
        liu.b(a);
        hnc c = this.b.c();
        try {
            List a2 = this.b.a();
            if (a2.size() <= 0) {
                liu.a(a, "Can't execute command, not enough ZSL images");
                a(this.c, a2, gopVar, gnqVar);
            } else {
                try {
                } catch (/*Interrupted*/Exception e) {
                    liu.a(a, "Error executing main ZSL command, executing fallback", e);
                    goqVar = this.c;
                }
                if (!a(a2, gopVar, gnqVar)) {
                    goqVar = this.c;
                    a(goqVar, a2, gopVar, gnqVar);
                }
            }
        } finally {
            c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((mnh) it.next()).close();
        }
    }

    private static final void a(goq goqVar, List list, gop gopVar, gnq gnqVar) {
        a(list);
        gnqVar.b.a().b();
        gnqVar.c.d();
        gnqVar.d.a();
        goqVar.a(gopVar, gnqVar);
    }

    @Override // defpackage.goq
    public final mcs a() {
        return this.c.a();
    }

    @Override // defpackage.goq
    public final mcs b() {
        return mdg.a(ggt.a(qdu.b((Iterable) this.d)));
    }
}