package defpackage;

import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ExifMetadata;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dpx  reason: default package */
/* loaded from: classes.dex */
public final class dpx implements dpw {
    private static final String a = liu.a("HdrPlusPPManager");
    private final Set<dpw> b;

    public dpx(Set set) {
        String str = a;
        int size = set.size();
        StringBuilder sb = new StringBuilder(74);
        sb.append("HdrPlusPayloadProcessManager initialized with processor count: ");
        sb.append(size);
        sb.toString();
        liu.b(str);
        this.b = set;
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar) {
        liu.b(a);
        for (dpw dpwVar : this.b) {
            dpwVar.a(dseVar);
        }
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar, mnh mnhVar) {
        liu.b(a);
        for (dpw dpwVar : this.b) {
            mnh h = mnhVar.h();
            if (h != null) {
                dpwVar.a(dseVar, h);
            }
        }
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar, BurstSpec burstSpec) {
        liu.b(a);
        for (dpw dpwVar : this.b) {
            dpwVar.a(dseVar, burstSpec);
        }
    }

    @Override // defpackage.dpw
    public final void b(dse dseVar) {
        liu.b(a);
        for (dpw dpwVar : this.b) {
            dpwVar.b(dseVar);
        }
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar, ExifMetadata exifMetadata) {
        liu.b(a);
        for (dpw dpwVar : this.b) {
            dpwVar.a(dseVar, exifMetadata);
        }
    }

    @Override // defpackage.dpw
    public final void a(dse dseVar, int i, long j) {
        liu.b(a);
        for (dpw dpwVar : this.b) {
            dpwVar.a(dseVar, i, j);
        }
    }
}