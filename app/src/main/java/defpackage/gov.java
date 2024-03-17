package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: gov  reason: default package */
/* loaded from: classes.dex */
public final class gov implements gnt {
    public final qpp a;
    public final mkg b;
    public final mdh c;
    private final gev f;
    private final dtq h;
    public final mch d = new mch((Object) false);
    public final AtomicInteger e = new AtomicInteger(0);
    private final long g = 1000;

    public gov(gev gevVar, qpp qppVar, mkf mkfVar, dtq dtqVar) {
        this.f = gevVar;
        this.b = mkfVar.a("PictureTakerImpl");
        this.h = dtqVar;
        this.a = qppVar;
        this.c = new mdh(new gor(this, gevVar));
        qppVar.a(new gos(this), qot.INSTANCE);
    }

    @Override // defpackage.gnt
    public final mcs b() {
        return this.d;
    }

    @Override // defpackage.gnt
    public final mcs a() {
        return mdg.a((mcs) this.c);
    }

    public final goq c() {
        try {
            return (goq) this.a.get(this.g, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.gnt
    public final qpp a(gnq gnqVar) {
        if (this.f.a()) {
            this.b.c("Take picture was invoked, but the executor is shutting down!");
            gnqVar.d.close();
            gnqVar.c.e();
            return rgk.b((Object) false);
        }
        qqg f = qqg.f();
        this.d.a(Boolean.valueOf(this.e.incrementAndGet() > 0));
        this.c.b();
        this.f.a(new gou(this, new got(this, f), gnqVar, this.h));
        return f;
    }
}