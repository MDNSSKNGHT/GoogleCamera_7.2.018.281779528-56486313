package defpackage;

/* compiled from: PG */
/* renamed from: mkk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mkk implements Runnable {
    private final mkn a;
    private final String b;
    private final Runnable c;

    public mkk(mkn mknVar, String str, Runnable runnable) {
        this.a = mknVar;
        this.b = str;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c);
    }
}
