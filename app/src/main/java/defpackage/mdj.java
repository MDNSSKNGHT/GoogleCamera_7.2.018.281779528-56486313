package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mdj  reason: default package */
/* loaded from: classes.dex */
final class mdj implements mdl {
    private final /* synthetic */ Object a;

    public mdj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.mcs
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.mjw
    public final void a(Object obj) {
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        executor.execute(new mdi(mjwVar, this.a));
        return mdk.a;
    }

    public final String toString() {
        pjy a = qdu.a("Prop.of");
        a.a(this.a);
        return a.toString();
    }
}