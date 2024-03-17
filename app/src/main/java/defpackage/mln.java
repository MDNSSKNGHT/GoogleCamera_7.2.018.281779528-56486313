package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: mln  reason: default package */
/* loaded from: classes.dex */
public final class mln {
    public mba b;
    private final ScheduledExecutorService d;
    private mam e;
    public final Object a = new Object();
    public Boolean c = false;

    public mln(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
        mba mbaVar = new mba();
        this.b = mbaVar;
        this.e = a(mbaVar);
    }

    public final mjq a() {
        mjq a;
        synchronized (this.a) {
            a = this.e.a();
            if (a == null) {
                mba mbaVar = new mba();
                this.b = mbaVar;
                mam a2 = a(mbaVar);
                this.e = a2;
                a = a2.a();
                qdu.d(a);
            }
        }
        return a;
    }

    public final mba b() {
        mba b;
        synchronized (this.a) {
            b = this.b.b();
        }
        return b;
    }

    private final mam a(mba mbaVar) {
        synchronized (this.a) {
            if (!this.c.booleanValue()) {
                return new mam(mbaVar, qot.INSTANCE, new mbu(new mbs(this.d, 1000L, TimeUnit.MILLISECONDS)));
            }
            return new mam(mbaVar, qot.INSTANCE);
        }
    }
}