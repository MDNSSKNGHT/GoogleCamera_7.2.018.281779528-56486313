package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mch  reason: default package */
/* loaded from: classes.dex */
public class mch implements mdl, cdr {
    private final Executor a;
    public final Set<mjw> b;
    public volatile Object c;

    public mch(meo meoVar) {
        this((Object) meoVar);
    }

    @Override // defpackage.mcs
    public final Object a() {
        return this.c;
    }

    public mch() {
        this((Object) meo.FPS_30);
    }

    public mch(Object obj) {
        this.b = new CopyOnWriteArraySet();
        this.c = obj;
        this.a = new mdm();
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        map mapVar = new map(mjwVar, executor);
        this.b.add(mapVar);
        this.a.execute(new mcf(this, mapVar));
        return new mcg(this, mapVar);
    }

    public final String toString() {
        return qdu.a("ConcurrentObs").toString();
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
        this.a.execute(new mce(this, obj));
    }
}
