package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: pox  reason: default package */
/* loaded from: classes.dex */
final class pox extends pus implements Serializable {
    public static final long serialVersionUID = 0;
    private final pjr a;
    private final pus b;

    public pox(pjr pjrVar, pus pusVar) {
        this.a = (pjr) qdu.d(pjrVar);
        this.b = (pus) qdu.d(pusVar);
    }

    @Override // defpackage.pus, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.a(obj), this.a.a(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pox) {
                pox poxVar = (pox) obj;
                if (this.a.equals(poxVar.a) && this.b.equals(poxVar.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}