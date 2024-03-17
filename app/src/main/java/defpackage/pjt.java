package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: pjt  reason: default package */
/* loaded from: classes.dex */
public final class pjt implements Serializable, pjr {
    public static final long serialVersionUID = 0;
    private final pjr a;
    private final pjr b;

    public pjt(pjr pjrVar, pjr pjrVar2) {
        this.a = (pjr) qdu.d(pjrVar);
        this.b = (pjr) qdu.d(pjrVar2);
    }

    @Override // defpackage.pjr
    public final Object a(Object obj) {
        return this.a.a(this.b.a(obj));
    }

    @Override // defpackage.pjr
    public final boolean equals(Object obj) {
        if (obj instanceof pjt) {
            pjt pjtVar = (pjt) obj;
            if (this.b.equals(pjtVar.b) && this.a.equals(pjtVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}