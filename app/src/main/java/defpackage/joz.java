package defpackage;

/* compiled from: PG */
/* renamed from: joz  reason: default package */
/* loaded from: classes.dex */
public final class joz implements joy {
    private final dnf a;
    private final djl b;
    private final dka c;

    public joz(dnf dnfVar, dka dkaVar, djl djlVar) {
        this.a = dnfVar;
        this.c = dkaVar;
        this.b = djlVar;
        dkaVar.a("tracking-meta");
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.b("tracking-meta");
    }

    @Override // defpackage.joy
    public final synchronized float[] a(long j) {
        if (this.a.a()) {
            return ((oar) this.a.a(j, this.b.a(j)).get(0)).b();
        }
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @Override // defpackage.joy
    public final boolean a() {
        ibf a = this.b.a();
        return a != null && a.c > 50000000 && ((long) a.e) > 350;
    }

    @Override // defpackage.joy
    public final synchronized boolean a(mjs mjsVar, long j) {
        if (this.a.c()) {
            mjs mjsVar2 = new mjs(mjsVar.a, mjsVar.b);
            if (!this.a.a()) {
                this.a.a(mjsVar2, 1, "trk-gyro-session");
            }
            this.a.a(j, this.b.a(j));
            return true;
        }
        return false;
    }

    @Override // defpackage.joy
    public final synchronized void b() {
        this.a.b();
    }
}