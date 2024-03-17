package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: mdt  reason: default package */
/* loaded from: classes.dex */
final class mdt implements mcs {
    public final /* synthetic */ mdu a;
    private final /* synthetic */ mcs b;

    public mdt(mdu mduVar, mcs mcsVar) {
        this.a = mduVar;
        this.b = mcsVar;
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        return this.b.a(new mds(this, mjwVar), executor);
    }

    @Override // defpackage.mcs
    public final Object a() {
        return this.a.b(this.b.a());
    }
}