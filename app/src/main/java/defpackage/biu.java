package defpackage;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: biu  reason: default package */
/* loaded from: classes.dex */
@SuppressLint("ResourceType")
public final class biu implements bho {
    private static final String b = liu.a("ScnDistPlgin");
    public final biw a;
    private ScheduledFuture d;
    private ScheduledExecutorService e;
    private mzg f;
    private final Resources g;
    private final fad h;
    private bgp j;
    private bhv k;
    private long c = 0;
    private bht i = bgu.a();

    @Override // defpackage.bhq
    public final void a(mzc mzcVar) {
    }

    @Override // defpackage.bhq
    public final bhm c() {
        return this.a;
    }

    public biu(biw biwVar, Resources resources, fad fadVar) {
        this.a = biwVar;
        this.g = resources;
        this.h = fadVar;
    }

    @Override // defpackage.bhq
    public final void b() {
        a();
        ScheduledExecutorService scheduledExecutorService = this.e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.e = null;
        }
        this.d = null;
    }

    public final void a() {
        if (this.i == null || !d()) {
            return;
        }
        String str = b;
        String valueOf = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Dismissing adviceState ");
        sb.append(valueOf);
        sb.toString();
        liu.b(str);
        this.i.b();
    }

    private final boolean d() {
        bht bhtVar = this.i;
        if (bhtVar != null) {
            return bhtVar.c() == 1 || this.i.c() == 2;
        }
        return false;
    }

    @Override // defpackage.bho
    public final void a(ndr ndrVar) {
        Boolean bool;
        if (this.a.b()) {
            mzg mzgVar = this.f;
            if ((mzgVar != null && mzgVar == mzg.FRONT) || (bool = (Boolean) ndrVar.a(lao.a)) == null) {
                return;
            }
            if (bool.booleanValue()) {
                liu.b(b);
                if (d()) {
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture == null) {
                        return;
                    }
                    scheduledFuture.cancel(false);
                    return;
                }
                bhv bhvVar = this.k;
                bgp bgpVar = this.j;
                if (bgpVar != null && bhvVar != null) {
                    bht a = bhvVar.a(bgpVar);
                    this.i = a;
                    if (a != null && a.c() != 4) {
                        String str = b;
                        String valueOf = String.valueOf(this.j);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
                        sb.append("Showing advice ");
                        sb.append(valueOf);
                        sb.toString();
                        liu.b(str);
                        this.c = SystemClock.uptimeMillis();
                        this.h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.c;
            if (uptimeMillis >= 2000) {
                a();
                return;
            }
            long j = 2000 - uptimeMillis;
            if (this.e == null) {
                this.e = eav.c("scn-dist");
            }
            this.d = this.e.schedule(new bit(this), j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.bhq
    public final void a(bhv bhvVar) {
        this.k = bhvVar;
        if (bhvVar != null) {
            bgo a = bgp.a();
            a.a = this.g.getString(2131951715);
            a.b = this.g.getString(2131951715);
            a.c = true;
            a.e = 536870911;
            this.j = a.a();
            return;
        }
        this.j = null;
    }

    @Override // defpackage.bhq
    public final void a(myo myoVar) {
        this.f = myoVar.N();
        a();
    }
}