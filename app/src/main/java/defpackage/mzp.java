package defpackage;

/* compiled from: PG */
/* renamed from: mzp  reason: default package */
/* loaded from: classes.dex */
public final class mzp extends ndx {
    private int a;

    public mzp(neb nebVar) {
        this(nebVar, 1);
    }

    public mzp(neb nebVar, int i) {
        super(nebVar);
        qdu.a(i > 0, "Initial reference count must be greater than zero!");
        this.a = i;
    }

    @Override // defpackage.ndx, defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        j();
    }

    public final neb i() {
        synchronized (this) {
            int i = this.a;
            if (i > 0) {
                this.a = i + 1;
                return new mzq(this);
            }
            return null;
        }
    }

    public final void j() {
        synchronized (this) {
            int i = this.a;
            if (i > 0) {
                int i2 = i - 1;
                this.a = i2;
                if (i2 == 0) {
                    super.close();
                }
            }
        }
    }

    @Override // defpackage.ndx
    public final String toString() {
        String pjyVar;
        synchronized (this) {
            pjy e = qdu.e(this);
            e.a("refCount", this.a);
            e.a(super.toString());
            pjyVar = e.toString();
        }
        return pjyVar;
    }
}