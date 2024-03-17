package defpackage;

import com.google.googlex.gcam.Gcam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: dow  reason: default package */
/* loaded from: classes.dex */
public final class dow {
    public static final String a = liu.a("HdrPCpuPriority");
    public Future d;
    private final Gcam e;
    private final ScheduledExecutorService f;
    public final Object b = new Object();
    public final List<dov> c = new ArrayList<>();
    private float g = 1.0f;

    public dow(Gcam gcam, ScheduledExecutorService scheduledExecutorService) {
        this.e = gcam;
        this.f = scheduledExecutorService;
    }

    public final void a() {
        liu.d(a);
        synchronized (this.b) {
            Future future = this.d;
            if (future != null) {
                future.cancel(false);
            }
        }
        this.f.execute(new dos(this));
    }

    public final void b() {
        liu.d(a);
        this.f.execute(new dot(this));
        synchronized (this.b) {
            this.d = this.f.schedule(new dou(this), 2000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void a(float f) {
        synchronized (this.b) {
            if (f != this.g) {
                this.g = f;
                for (Object obj : prr.a((Collection<dov>) this.c)) {
                    dov dovVar = (dov) obj;
                    String str = a;
                    int i = dovVar.a;
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Setting HDR+ CPU usage to ");
                    sb.append(f);
                    sb.append(" for shot ");
                    sb.append(i);
                    sb.toString();
                    liu.d(str);
                    this.e.LimitShotCpuUsage(dovVar.a, f);
                }
            }
        }
    }
}
