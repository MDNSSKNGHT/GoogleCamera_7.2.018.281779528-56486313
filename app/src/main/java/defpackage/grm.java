package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* renamed from: grm  reason: default package */
/* loaded from: classes.dex */
final class grm implements gsb, mcc {
    private static final String a = liu.a("LazySMProcssor");
    private final dqg b;
    private final dob c;
    private final boolean d;
    private final Object e = new Object();
    private mzp f = null;
    private ndr g = null;
    private boolean h = false;

    @Override // defpackage.mcc
    public final String c() {
        return a;
    }

    public grm(dqg dqgVar, dob dobVar, boolean z) {
        this.b = dqgVar;
        this.c = dobVar;
        this.d = z;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.h) {
                return;
            }
            this.h = true;
            ndr ndrVar = this.g;
            if (ndrVar != null) {
                this.b.a(this.b.a((ndn) ndrVar));
            }
            d();
            this.g = null;
        }
    }

    @Override // defpackage.gsb
    public final void d() {
        synchronized (this.e) {
            mzp mzpVar = this.f;
            if (mzpVar != null) {
                mzpVar.j();
                this.f = null;
            }
        }
    }

    @Override // defpackage.gsb
    public final synchronized pjz a() {
        pjz pjzVar;
        synchronized (this.e) {
            mzp mzpVar = this.f;
            if (mzpVar != null) {
                pjzVar = pjz.c(mzpVar.i());
                mzpVar.j();
            } else {
                pjzVar = pix.a;
            }
        }
        return pjzVar;
    }

    @Override // defpackage.gsb
    public final void a(ghc ghcVar, ndr ndrVar) {
        synchronized (this.e) {
            if (!this.h) {
                if (!ghcVar.i()) {
                    liu.b(a, "No Image Data! Ignoring the metering frames.");
                    ghcVar.close();
                    return;
                }
                mzp mzpVar = this.f;
                if (mzpVar != null) {
                    mzpVar.j();
                }
                mzp mzpVar2 = new mzp(ghcVar);
                this.g = ndrVar;
                if (this.d) {
                    doa a2 = this.c.a();
                    neb i = mzpVar2.i();
                    if (i != null) {
                        this.b.a(this.b.a((ndn) ndrVar), a2.g(), i, ndrVar);
                    }
                }
                this.f = mzpVar2;
                return;
            }
            ghcVar.close();
        }
    }

    @Override // defpackage.gsb
    public final pkx b() {
        pkx c;
        synchronized (this.e) {
            c = qdu.c(Pair.create(null, this.g));
        }
        return c;
    }
}
