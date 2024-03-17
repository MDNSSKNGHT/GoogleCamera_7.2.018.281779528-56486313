package defpackage;

/* compiled from: PG */
/* renamed from: mbu  reason: default package */
/* loaded from: classes.dex */
public final class mbu implements mjq {
    public Runnable b;
    private final mbs c;
    public final Object a = new Object();
    private final Runnable d = new mbt(this);

    public mbu(mbs mbsVar) {
        this.c = mbsVar;
    }

    public final void a() {
        synchronized (this.a) {
            this.b = null;
            this.c.a();
        }
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.b != null) {
                this.b = null;
            }
        }
        this.c.close();
    }

    public final void a(Runnable runnable) {
        synchronized (this.a) {
            this.b = runnable;
            this.c.execute(this.d);
        }
    }
}