package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.PostviewParams;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: hqc  reason: default package */
/* loaded from: classes.dex */
public final class hqc implements huc {
    private static final String a = liu.a("PckZslHdrPProc");
    private final dqg b;
    private final cin c;
    private final myo d;
    private final gtb e;
    private final dnx f;
    private final dob g;
    private final drq h;
    private final dpx i;
    private final mkn j;
    private final hrg k;
    private final izm l;

    public hqc(dqg dqgVar, cin cinVar, myo myoVar, gtb gtbVar, dnx dnxVar, dob dobVar, dpx dpxVar, drq drqVar, mkn mknVar, hrg hrgVar, izm izmVar) {
        this.b = dqgVar;
        this.c = cinVar;
        this.d = myoVar;
        this.e = gtbVar;
        this.f = dnxVar;
        this.g = dobVar;
        this.h = drqVar;
        this.i = dpxVar;
        this.j = mknVar;
        this.k = hrgVar;
        this.l = izmVar;
    }

    private static final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((mnh) it.next()).close();
        }
    }

    public final boolean a(List list, gop gopVar, gnq gnqVar) {
        if (!list.isEmpty()) {
            doa a2 = this.g.a();
            ndr a3 = hty.a(this.k.a((mnh) list.get(0)), true);
            if (a3 != null) {
                return a(list, gopVar, gnqVar, null, -1, a3, a2);
            }
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.huc
    public final boolean a(List list, gop gopVar, gnq gnqVar, dss dssVar, int i, ndr ndrVar, doa doaVar) {
        Throwable th;
        dse dseVar;
        dss a2;
        neb nebVar = null;
        neb d;
        String str;
        String str2 = a;
        int size = list.size();
        StringBuilder sb = new StringBuilder(29);
        sb.append("Processing ");
        sb.append(size);
        sb.append(" frames");
        sb.toString();
        liu.b(str2);
        boolean z = i < 0;
        if (z) {
            gnr gnrVar = gnqVar.d;
            Iterator it = list.iterator();
            long j = -1;
            ndr ndrVar2 = null;
            while (it.hasNext()) {
                ndr c = ((mnh) it.next()).c();
                if (c != null && c.c() > j) {
                    j = c.c();
                    ndrVar2 = c;
                }
            }
            if (ndrVar2 != null) {
                String str3 = a;
                long c2 = ndrVar2.c();
                StringBuilder sb2 = new StringBuilder(53);
                sb2.append("Use frame ");
                sb2.append(c2);
                sb2.append(" for setAfDebugMetadata");
                sb2.toString();
                liu.b(str3);
                gnrVar.a(ndrVar2);
            }
        }
        try {
            try {
                this.j.b("pckHdrZsl#processFrames");
                int a3 = this.b.a((ndn) ndrVar);
                String str4 = a;
                StringBuilder sb3 = new StringBuilder(36);
                sb3.append("gcam Physical camera ID: ");
                sb3.append(a3);
                sb3.toString();
                liu.b(str4);
                PostviewParams a4 = doe.a(this.d, this.e);
                if (dssVar != null) {
                    a2 = dssVar;
                } else {
                    liu.b(a);
                    a2 = this.f.a(gnqVar, this.h.a(ndrVar, a3), doaVar, bgl.a(gnqVar.a.a, this.d));
                }
                liu.d(a);
                this.j.b("pckHdrZsl#startZslShot");
                nebVar = null;
                dseVar = this.b.a(a3, a2, gnqVar, a4, doaVar.g(), doaVar.f(), ndrVar, -1, i, !z);
            } catch (/*Execution*/Exception/* | mmh*/ e) {
                th = e;
                dseVar = null;
            }
            try {
                if (dseVar != null) {
                    this.j.c("pckHdrZsl#processPayload");
                    liu.d(a);
                    gopVar.close();
                    this.b.b(dseVar);
                    if (z) {
                        this.i.a(dseVar, (BurstSpec) null);
                    }
                    HashSet hashSet = new HashSet();
                    if (this.c.c(ciu.A)) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            mnh mnhVar = (mnh) it2.next();
                            ndr c3 = mnhVar.c();
                            mnl b = mnhVar.b();
                            if (c3 != null && b != null && this.b.a(c3)) {
                                hashSet.add(b);
                            }
                        }
                    }
                    if (!this.c.c(ciu.A) || hashSet.size() == list.size()) {
                        hashSet.clear();
                    }
                    Iterator it3 = list.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        mnh mnhVar2 = (mnh) it3.next();
                        mnl b2 = mnhVar2.b();
                        qdu.d(b2);
                        if (hashSet.contains(b2)) {
                            String str5 = a;
                            String.format("Binning hasn't processed %d @%d, skipping.", Integer.valueOf(i2), Long.valueOf(b2.b));
                            liu.b(str5);
                        } else {
                            if (z) {
                                this.i.a(dseVar, mnhVar2);
                            }
                            ndr c4 = mnhVar2.c();
                            if (c4 != null) {
                                this.j.b("pckHdrZsl#addPayloadFrame");
                                hrf a5 = this.k.a(mnhVar2);
                                if (z) {
                                    d = a5.d();
                                    nebVar = a5.f();
                                    str = a5.b().a().a;
                                } else {
                                    d = a5.e();
                                    mos c5 = a5.c();
                                    if (c5 == null) {
                                        liu.a(a, "Can't find the source camera for the secondary image.");
                                        throw new mmh("Can't find the source camera for the secondary image.");
                                    }
                                    str = c5.a().a;
                                }
                                ndr a6 = (a5.a() && !z) ? hty.a(c4, str) : c4;
                                mnhVar2.close();
                                this.b.a(dseVar, i2, a6, d, nebVar);
                                if (d == null) {
                                    liu.b(a, String.format("Ignoring missing raw frame %d of %d for shot %d .", Integer.valueOf(i2 + 1), Integer.valueOf(list.size()), Integer.valueOf(dseVar.a())));
                                    if (nebVar != null) {
                                        nebVar.close();
                                    }
                                } else {
                                    String str6 = nebVar == null ? "" : "(+ PD)";
                                    String str7 = a;
                                    String.format("Submitting Frame: %d of %d @%d for shot %d %s", Integer.valueOf(i2 + 1), Integer.valueOf(list.size()), Long.valueOf(b2.b), Integer.valueOf(dseVar.a()), str6);
                                    liu.b(str7);
                                }
                                this.j.a();
                                i2++;
                                nebVar = null;
                            } else {
                                i2++;
                                liu.a(a, String.format("Failure for frame %d @%d, skipping.", Integer.valueOf(i2), Long.valueOf(b2.b)));
                                nebVar = null;
                            }
                        }
                    }
                    this.j.c("pckHdrZsl#endPayload");
                    if (this.b.c(dseVar)) {
                        if (z) {
                            this.i.b(dseVar);
                        }
                        if (this.b.a(dseVar)) {
                            if (z) {
                                izh a7 = gnqVar.b.a();
                                a7.a(ndrVar);
                                this.l.a(a7);
                            }
                            this.j.a();
                            a(list);
                            this.j.a();
                            return true;
                        }
                    }
                    String str8 = a;
                    int a8 = dseVar.a();
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("Error ending the HDR+ payload, aborting shot ");
                    sb4.append(a8);
                    liu.a(str8, sb4.toString());
                    if (z) {
                        this.i.a(dseVar);
                    }
                    this.b.d(dseVar);
                } else {
                    liu.b(a, "Failed to initiate HDR plus shot capture.");
                    this.j.a();
                }
            } catch (/*Execution*/Exception/* | mmh*/ e2) {
                th = e2;
                liu.a(a, "Error processing HDR+ payload.", th);
                if (dseVar != null) {
                    this.b.d(dseVar);
                }
                a(list);
                this.j.a();
                return false;
            }
            a(list);
            this.j.a();
            return false;
        } catch (Throwable th2) {
            a(list);
            this.j.a();
            throw th2;
        }
    }
}