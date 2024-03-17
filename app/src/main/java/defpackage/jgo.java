package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: jgo  reason: default package */
/* loaded from: classes.dex */
public final class jgo implements bas {
    public static final String a = liu.a("Cheetah3AContr");
    public final gct b;
    public final gde c;
    public final cvw f;
    public final bbk g;
    public final cin h;
    public final bcx i;
    public final gep j;
    public myo l;
    public mnu m;
    public mba n;
    public gtl o;
    public ScheduledFuture p;
    public ScheduledFuture q;
    public qqg r;
    private final ScheduledExecutorService s;
    private final mop t;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final Runnable k = new jgm(this);
    public final gdl d = new gdm(false);

    public jgo(gct gctVar, gde gdeVar, cvw cvwVar, bbk bbkVar, cin cinVar, bcx bcxVar, ScheduledExecutorService scheduledExecutorService, mop mopVar, gep gepVar, byte b, byte b2) {
        this.b = gctVar;
        this.c = gdeVar;
        this.f = cvwVar;
        this.g = bbkVar;
        this.h = cinVar;
        this.i = bcxVar;
        this.s = scheduledExecutorService;
        this.t = mopVar;
        this.j = gepVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        MeteringRectangle[] a2 = geh.a().a(((gtk) this.o.a()).a);
        this.m.a(true, true, !this.e.get());
        mnu mnuVar = this.m;
        mnuVar.a(mnuVar.c().c(a2).a());
        this.i.b(this.k);
        this.b.a();
        this.c.a();
    }

    @Override // defpackage.bas
    public final bcs a(bbn bbnVar) {
        liu.b(a);
        this.i.b(this.k);
        ScheduledFuture scheduledFuture = this.q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.p;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
        PointF pointF = bbnVar.a;
        this.m.c(this.m.c().c(bcr.a(pointF, pointF, this.l.d()).b(((gtk) this.o.a()).a)).a());
        this.r = qqg.f();
        this.q = this.s.schedule(new jgk(this), 2000L, TimeUnit.MILLISECONDS);
        this.p = this.s.schedule(new jgl(this), 5000L, TimeUnit.MILLISECONDS);
        return new jgn(this, bbnVar);
    }
}