package defpackage;

/* compiled from: PG */
/* renamed from: hsv  reason: default package */
/* loaded from: classes.dex */
final class hsv extends osu {
    private final /* synthetic */ hsw a;

    public /* synthetic */ hsv(hsw hswVar) {
        this.a = hswVar;
    }

    @Override // defpackage.osu
    public final void a(ndr ndrVar) {
        synchronized (this.a) {
            for (mrx mrxVar : this.a.a) {
                mrxVar.a(ndrVar);
            }
        }
    }

    @Override // defpackage.osu
    public final void a(ndk ndkVar) {
        if (ndkVar != null) {
            synchronized (this.a) {
                for (mrx mrxVar : this.a.a) {
                    mrxVar.a(ndkVar);
                }
            }
        }
    }

    @Override // defpackage.osu
    public final void a(ndn ndnVar) {
        synchronized (this.a) {
            for (mrx mrxVar : this.a.a) {
            }
        }
    }

    @Override // defpackage.osu
    public final void b(long j, int i) {
        synchronized (this.a) {
            for (mrx mrxVar : this.a.a) {
            }
        }
    }

    @Override // defpackage.osu
    public final void a(long j, int i, long j2) {
        synchronized (this.a) {
            for (mrx mrxVar : this.a.a) {
            }
        }
    }

    @Override // defpackage.osu
    public final void a(mnl mnlVar) {
        synchronized (this.a) {
            for (mrx mrxVar : this.a.a) {
                mrxVar.a(new ggi(mnlVar.a, mnlVar.c, mnlVar.b));
            }
        }
    }
}