package defpackage;

/* compiled from: PG */
/* renamed from: dqi  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class dqi implements mjq {
    private final dqj a;
    private final int b;

    public dqi(dqj dqjVar, int i) {
        this.a = dqjVar;
        this.b = i;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        this.a.b.d.remove(Integer.valueOf(this.b));
    }
}
