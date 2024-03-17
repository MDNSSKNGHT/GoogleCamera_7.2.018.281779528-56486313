package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gwe  reason: default package */
/* loaded from: classes.dex */
public final class gwe implements mcs {
    public final ncs a;
    private final mbe b = new mbe();

    public gwe(ncs ncsVar) {
        this.a = ncsVar;
    }

    @Override // defpackage.mcs
    public final mjq a(mjw mjwVar, Executor executor) {
        gwa gwaVar = new gwa(executor, mjwVar);
        this.a.a(gwaVar);
        this.b.execute(new gwc(this, executor, mjwVar));
        return new gwd(this, gwaVar);
    }

    @Override // defpackage.mcs
    public final /* bridge */ /* synthetic */ Object a() {
        return this.a.a();
    }
}
