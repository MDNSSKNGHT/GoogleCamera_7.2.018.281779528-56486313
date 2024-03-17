package defpackage;

import android.view.WindowManager;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: hpa  reason: default package */
/* loaded from: classes.dex */
public final class hpa implements goq {
    public static final Long a = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(100));
    public final mkg b;
    public final mos c;
    public final biu d;
    public final WindowManager e;
    public final dpa f;
    public final dqg g;
    public final myo h;
    public fby i;
    public boolean j = false;
    private final hoq k;
    private final mnu l;
    private final mnz m;
    private final mba n;
    private mba o;

    @Override // defpackage.goq
    public final mcs a() {
        return this.k.b;
    }

    public hpa(mkg mkgVar, mos mosVar, mnu mnuVar, mnz mnzVar, qpp qppVar, myo myoVar, myz myzVar, mba mbaVar, WindowManager windowManager, pjz pjzVar, biu biuVar, cin cinVar, dqg dqgVar, dpa dpaVar, myo myoVar2, hoq hoqVar) {
        this.b = mkgVar.a("PckLongExposureCmd");
        this.k = hoqVar;
        this.c = mosVar;
        this.m = mnzVar;
        this.l = mnuVar;
        this.d = biuVar;
        this.e = windowManager;
        this.n = mbaVar;
        this.f = dpaVar;
        this.g = dqgVar;
        this.h = myoVar2;
        if (cinVar.c(ciy.e)) {
            fby fbyVar = (fby) mbaVar.a(((fbz) pjzVar.b()).a(myoVar, myzVar));
            maw.a(qppVar, new hox(this, fbyVar));
            this.i = fbyVar;
        }
        c();
    }

    private final void c() {
        mnk a2 = this.l.a(this.m, 3);
        mba b = this.n.b();
        this.o = b;
        b.a(a2);
        a2.a(new hoy(this));
    }

    @Override // defpackage.goq
    public final void a(gop gopVar, gnq gnqVar) {
        fby fbyVar = this.i;
        if (fbyVar == null) {
            this.k.a(gopVar, gnqVar);
            return;
        }
        try {
            fbyVar.a();
            this.o.close();
            this.k.a(gopVar, gnqVar);
        } finally {
            c();
            fbyVar.b();
        }
    }

    @Override // defpackage.goq
    public final mcs b() {
        return this.k.b();
    }
}