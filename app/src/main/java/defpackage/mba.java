package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: mba  reason: default package */
/* loaded from: classes.dex */
public class mba implements mjq, mai {
    private final mba a;
    private final mby b;
    private final Set c;
    private boolean d;

    public mba() {
        this(mcb.a);
    }

    private mba(mba mbaVar, mby mbyVar) {
        this.b = mbyVar;
        this.c = new HashSet();
        this.a = mbaVar;
        this.d = false;
    }

    public mba(mby mbyVar) {
        this.b = mbyVar;
        this.c = new HashSet();
        this.a = null;
        this.d = false;
    }

    @Override // defpackage.mai
    public final mjq a(mjq mjqVar) {
        boolean z;
        qdu.d(mjqVar);
        synchronized (this.c) {
            if (!this.d) {
                this.c.add(mjqVar);
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            this.b.a(mjqVar);
        }
        return mjqVar;
    }

    @Override // defpackage.mjq, java.lang.AutoCloseable
    public void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            this.d = true;
            mba mbaVar = this.a;
            if (mbaVar != null) {
                synchronized (mbaVar.c) {
                    mbaVar.c.remove(this);
                }
            }
            arrayList.addAll(this.c);
            this.c.clear();
            this.b.a(arrayList, "Lifetime#close");
        }
    }

    @Override // defpackage.mai
    public final mba b() {
        return (mba) a(new mba(this, this.b));
    }

    public boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.d;
        }
        return z;
    }
}