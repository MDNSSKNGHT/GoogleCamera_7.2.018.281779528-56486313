package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ExifMetadata;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hua  reason: default package */
/* loaded from: classes.dex */
public final class hua implements dpw {
    public static final String a = liu.a("PreviewProcessor");
    public final dqg b;
    public final mjs c;
    public final hrg d;
    public final geq e;
    public int f;
    public int g;
    public boolean h;
    public doa i;
    private final dob j;
    private final Executor k;

    @Override // defpackage.dpw
    public final void a(dse dseVar, int i, long j) {
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar, ExifMetadata exifMetadata) {
    }

    public hua(dqg dqgVar, mjs mjsVar, dob dobVar, hrg hrgVar, geq geqVar, Executor executor) {
        this.b = dqgVar;
        this.c = mjsVar;
        this.j = dobVar;
        this.d = hrgVar;
        this.e = geqVar;
        this.k = executor;
    }

    @Override // defpackage.dpw
    public final synchronized void a(dse dseVar) {
        this.h = false;
    }

    @Override // defpackage.dpw
    public final synchronized void a(dse dseVar, mnh mnhVar) {
        if (this.h) {
            this.g++;
            liu.b(a);
            this.k.execute(new htz(this, mnhVar, dseVar));
            return;
        }
        mnhVar.close();
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar, BurstSpec burstSpec) {
        this.i = this.j.a();
        if (burstSpec != null) {
            this.f = (int) burstSpec.getFrame_requests().size();
            this.g = 0;
        }
    }

    @Override // defpackage.dpw
    public final synchronized void b(dse dseVar) {
        this.h = false;
    }

    public final synchronized void a(long j) {
        if (j >= 30000) {
            this.h = true;
        }
    }
}