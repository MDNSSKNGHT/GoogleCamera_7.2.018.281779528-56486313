package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ggq  reason: default package */
/* loaded from: classes.dex */
public final class ggq {
    private final pjz a;
    private final Set<ggj> b;
    private final Set<mrx> c;
    private final Set<ggn> d;

    public ggq(pjz pjzVar, Set set, Set set2, Set set3) {
        this.a = pjzVar;
        this.b = psl.a(set);
        this.c = psl.a(set2);
        this.d = psl.a(set3);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ggq)) {
            return false;
        }
        ggq ggqVar = (ggq) obj;
        return qdu.e(this.a, ggqVar.a) && qdu.e(this.b, ggqVar.b) && qdu.e(this.c, ggqVar.c) && qdu.e(this.d, ggqVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final void a(ggp ggpVar) {
        for (ggj ggjVar : this.b) {
            ggpVar.c.add(ggjVar.a());
        }
        for (mrx mrxVar : this.c) {
            ggpVar.b.add(mrxVar);
        }
        for (ggn ggnVar : this.d) {
            CaptureRequest.Key key = ggnVar.a;
            ggpVar.a.put(key, new ggn(key, ggnVar.b));
        }
    }
}