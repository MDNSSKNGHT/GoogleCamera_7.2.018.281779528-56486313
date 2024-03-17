package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ggo  reason: default package */
/* loaded from: classes.dex */
public final class ggo {
    public final Set<ggn> a;
    public final Set b;
    private final Set c;

    public ggo(Set set, Set set2, Set set3) {
        this.a = psl.a(set);
        this.b = psl.a(set2);
        this.c = psl.a(set3);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ggo)) {
            return false;
        }
        ggo ggoVar = (ggo) obj;
        return qdu.e(1, 1) && qdu.e(this.a, ggoVar.a) && qdu.e(this.c, ggoVar.c) && qdu.e(this.b, ggoVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{1, this.a, this.c, this.b});
    }
}