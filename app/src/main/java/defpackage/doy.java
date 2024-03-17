package defpackage;

/* compiled from: PG */
/* renamed from: doy  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class doy implements mjq {
    private final dpa a;
    private final doz b;

    public doy(dpa dpaVar, doz dozVar) {
        this.a = dpaVar;
        this.b = dozVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.b(this.b);
    }
}
