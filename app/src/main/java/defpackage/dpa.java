package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: dpa  reason: default package */
/* loaded from: classes.dex */
public final class dpa {
    public final cin a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private final List<doz> e = new CopyOnWriteArrayList<>();

    public dpa(cin cinVar) {
        this.a = cinVar;
    }

    public synchronized boolean a() {
        return this.c;
    }

    public synchronized boolean b() {
        return this.d;
    }

    public synchronized boolean c() {
        return this.b;
    }

    public synchronized mjq a(doz dozVar) {
        if (!this.e.contains(dozVar)) {
            this.e.add(dozVar);
            return new doy(this, dozVar);
        }
        return new mjn();
    }

    public synchronized void b(boolean z, mzg mzgVar) {
        if (this.a.c(ciu.n)) {
            if (mzgVar.equals(mzg.FRONT)) {
                z = false;
            }
            this.d = z;
            for (doz dozVar : this.e) {
                dozVar.a(this.d, false);
            }
        }
    }

    public synchronized void a(boolean z, mzg mzgVar) {
        if (this.a.c(ciu.n)) {
            this.c = z;
            if (mzgVar.equals(mzg.FRONT)) {
                this.c = false;
            }
            for (doz dozVar : this.e) {
                dozVar.a(this.c, true);
            }
        }
    }

    public synchronized void b(doz dozVar) {
        this.e.remove(dozVar);
    }

    public synchronized void a(boolean z) {
        this.b = z;
        if (!z) {
            for (doz dozVar : this.e) {
                dozVar.b();
            }
        }
    }

    public synchronized void d() {
        for (doz dozVar : this.e) {
            dozVar.a();
        }
    }
}
