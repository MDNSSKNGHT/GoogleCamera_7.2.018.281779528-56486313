package defpackage;

/* compiled from: PG */
/* renamed from: iqq  reason: default package */
/* loaded from: classes.dex */
final class iqq implements mjq {
    private final /* synthetic */ iqr a;
    private final /* synthetic */ iqu b;

    public iqq(iqu iquVar, iqr iqrVar) {
        this.b = iquVar;
        this.a = iqrVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            this.b.a.remove(this.a);
        }
    }
}