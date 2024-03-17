package defpackage;

import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jex  reason: default package */
/* loaded from: classes.dex */
public final class jex implements PowerManager.OnThermalStatusChangedListener, jfb, eyy, eya, exz {
    public static final String a = liu.a("SlfUpdTemperature");
    private final fad c;
    private final jeu d;
    private final Executor e;
    private final boolean f;
    private boolean g;
    private final Map h = prx.h().a(0, jfa.NORMAL).a(1, jfa.HEAT_LIGHT).a(2, jfa.HEAT_MODERATE).a(3, jfa.HEAT_SEVERE).a(4, jfa.HEAT_CRITICAL).a(5, jfa.HEAT_EMERGENCY).a(6, jfa.HEAT_SHUTDOWN).a();
    public final List b = new ArrayList();
    private jfa i = jfa.UNKNOWN;

    @Override // defpackage.jfb
    public void a(float[] fArr) {
    }

    public jex(fad fadVar, jeu jeuVar, Executor executor, exv exvVar, mbe mbeVar, cin cinVar) {
        this.c = fadVar;
        this.d = jeuVar;
        this.e = executor;
        ciq ciqVar = cit.a;
        this.f = cinVar.d();
        liu.d(a);
        synchronized (this) {
            jeuVar.a(executor, this);
            this.g = true;
        }
        mig.a(mbeVar, exvVar, this);
        liu.b(a);
    }

    @Override // defpackage.jfb
    public synchronized mjq a(jez jezVar) {
        String sb = "Adding listener " + jezVar;
        liu.b(a);
        if (this.i != jfa.UNKNOWN) {
            jezVar.a(this.i);
        }
        this.b.add(jezVar);
        return new jew(this, jezVar);
    }

    @Override // defpackage.exz
    public synchronized void a() {
        liu.d(a);
        if (!this.g) {
            this.d.a(this.e, this);
        } else {
            liu.b(a, "Was already registered as ThermalStatusListener on AppStart");
        }
        this.g = true;
    }

    @Override // defpackage.eya
    public synchronized void b() {
        liu.d(a);
        if (!this.g) {
            liu.b(a, "Was not registered as ThermalStatusListener on AppStop");
        } else {
            this.d.a.removeThermalStatusListener(this);
        }
        this.g = false;
    }

    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    public synchronized void onThermalStatusChanged(int i) {
        String sb = "#onThermalStatusChanged -> " + this.h.get(i);
        liu.b(a);
        jfa jfaVar = (jfa) this.h.get(i);
        if (jfaVar != null) {
            if (!jfaVar.equals(this.i)) {
                String sb2 = "State changed " + this.i + " -> " + jfaVar;
                liu.b(a);
                qmd qmdVar = (qmd) qmf.f.f();
                int i2 = this.i.j;
                if (qmdVar.c) {
                    qmdVar.b();
                    qmdVar.c = false;
                }
                qmf qmfVar = (qmf) qmdVar.b;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                qmfVar.e = i3;
                int i4 = qmfVar.a | 8;
                qmfVar.a = i4;
                int i5 = jfaVar.j;
                int i6 = i5 - 1;
                if (i5 != 0) {
                    qmfVar.d = i6;
                    qmfVar.a = i4 | 4;
                    this.i = jfaVar;
                    this.c.a((qmf) qmdVar.e());
                    List list = this.b;
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((jez) list.get(i7)).a(this.i);
                    }
                    return;
                }
                throw null;
            }
        } else {
            if (!this.f) {
                String str3 = a;
                String sb3 = "Ignoring call to onThermalStatusChanged with unknown status value: " +
                        i;
                liu.b(str3, sb3);
                return;
            }
            String sb4 = "onThermalStatusChanged called with unknown status value: " +
                    i;
            throw new IllegalArgumentException(sb4);
        }
    }
}
