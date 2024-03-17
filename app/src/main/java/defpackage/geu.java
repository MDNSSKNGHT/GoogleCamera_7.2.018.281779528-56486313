package defpackage;

/* compiled from: PG */
/* renamed from: geu  reason: default package */
/* loaded from: classes.dex */
final class geu implements Runnable {
    private final ges a;
    private final /* synthetic */ gev b;

    public geu(gev gevVar, ges gesVar) {
        this.b = gevVar;
        this.a = gesVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mkn mknVar;
        try {
            try {
                this.b.a.b("Command#" + this.a);
                this.a.a();
                mknVar = this.b.a;
            } /*catch (InterruptedException | mmh e) {
                mknVar = this.b.a;
                mknVar.a();
            } */catch (Exception e3) {
                this.b.b.execute(new get(e3));
                mknVar = this.b.a;
            }
            mknVar.a();
        } catch (Throwable th) {
            this.b.a.a();
            throw th;
        }
    }
}