package defpackage;

/* compiled from: PG */
/* renamed from: gwd  reason: default package */
/* loaded from: classes.dex */
final class gwd implements mjq {
    private final /* synthetic */ ncr a;
    private final /* synthetic */ gwe b;

    public gwd(gwe gweVar, ncr ncrVar) {
        this.b = gweVar;
        this.a = ncrVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.b.a.b(this.a);
    }
}
