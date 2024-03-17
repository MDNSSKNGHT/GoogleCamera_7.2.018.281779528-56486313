package defpackage;

/* compiled from: PG */
/* renamed from: bnk  reason: default package */
/* loaded from: classes.dex */
final class bnk implements Runnable {
    private final /* synthetic */ bnl a;

    public bnk(bnl bnlVar) {
        this.a = bnlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.close();
    }
}