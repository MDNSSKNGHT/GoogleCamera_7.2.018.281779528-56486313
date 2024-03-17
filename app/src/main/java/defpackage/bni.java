package defpackage;

/* compiled from: PG */
/* renamed from: bni  reason: default package */
/* loaded from: classes.dex */
final class bni implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ bnj b;

    public bni(bnj bnjVar, Runnable runnable) {
        this.b = bnjVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.execute(this.a);
    }
}