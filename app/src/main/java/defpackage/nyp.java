package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: nyp  reason: default package */
/* loaded from: classes.dex */
public final class nyp implements nym {
    private final nym a;

    static {
        new qon(nww.a);
    }

    public static nyp d() {
        return nyo.a;
    }

    public nyp(nym nymVar) {
        this.a = nymVar;
    }

    @Override // defpackage.nym
    public final void a(nwx nwxVar) {
        this.a.a(nwxVar);
    }

    public static nyp a(nym nymVar) {
        return new nyp(nymVar);
    }

    @Override // defpackage.nym
    public final qpp a() {
        return this.a.a();
    }

    @Override // defpackage.nym
    public final /* bridge */ /* synthetic */ Object c() {
        return (nww) this.a.c();
    }

    @Override // defpackage.nym
    public final boolean b() {
        return this.a.b();
    }

    public static nyp b(nym nymVar) {
        return a(nymVar.a(qot.INSTANCE, nxf.a()));
    }

    @Override // defpackage.nym
    public final nym a(Executor executor, nwy nwyVar) {
        return this.a.a(executor, nwyVar);
    }

    @Override // defpackage.nym
    public final nym a(Executor executor, nwy nwyVar, nwy nwyVar2) {
        return this.a.a(executor, nwyVar, nwyVar2);
    }

    @Override // defpackage.nym
    public final nym a(Executor executor, nyq nyqVar) {
        return this.a.a(executor, nyqVar);
    }

    @Override // defpackage.nym
    public final /* bridge */ /* synthetic */ nym a(Executor executor, nyr nyrVar) {
        return b(executor, nyrVar);
    }

    public final nyp b(Executor executor, nyr nyrVar) {
        return new nyp(this.a.a(executor, nyrVar));
    }

    @Override // defpackage.nym
    public final /* bridge */ /* synthetic */ nym b(Executor executor, nwy nwyVar) {
        return new nyp(this.a.b(executor, nwyVar));
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}