package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hju  reason: default package */
/* loaded from: classes.dex */
public final class hju extends osu {
    private final Set a = new ArraySet();

    public final synchronized void a(osu osuVar) {
        this.a.add(osuVar);
    }

    @Override // defpackage.osu
    public final synchronized void a(mos mosVar, long j) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(mosVar, j);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(ndr ndrVar) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(ndrVar);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(ndk ndkVar) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(ndkVar);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(ndn ndnVar) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(ndnVar);
        }
    }

    @Override // defpackage.osu
    public final synchronized void b(long j, int i) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).b(j, i);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(long j, int i, long j2) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(j, i, j2);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(long j, Set set) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(j, set);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(long j, int i) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(j, i);
        }
    }

    @Override // defpackage.osu
    public final synchronized void a(mnl mnlVar) {
        pwx ar = psl.a(this.a).ar();
        while (ar.hasNext()) {
            ((osu) ar.next()).a(mnlVar);
        }
    }

    public final synchronized void b(osu osuVar) {
        this.a.remove(osuVar);
    }
}