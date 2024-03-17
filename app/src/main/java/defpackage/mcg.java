package defpackage;

/* compiled from: PG */
/* renamed from: mcg  reason: default package */
/* loaded from: classes.dex */
final class mcg implements mjq {
    private final /* synthetic */ map a;
    private final /* synthetic */ mch b;

    public mcg(mch mchVar, map mapVar) {
        this.b = mchVar;
        this.a = mapVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.b.b.remove(this.a);
    }
}
