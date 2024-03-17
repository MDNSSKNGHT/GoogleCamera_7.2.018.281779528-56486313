package defpackage;

/* compiled from: PG */
/* renamed from: mof  reason: default package */
/* loaded from: classes.dex */
public class mof extends oro {
    private boolean a = true;

    public final void e() throws InterruptedException {
        synchronized (this) {
            while (this.a) {
                wait();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        synchronized (this) {
            this.a = false;
            notifyAll();
        }
    }
}