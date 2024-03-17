package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* renamed from: pkd  reason: default package */
/* loaded from: classes.dex */
public final class pkd implements Serializable, pkc {
    public static final long serialVersionUID = 0;
    private final List a;

    public /* synthetic */ pkd(List list) {
        this.a = list;
    }

    @Override // defpackage.pkc
    public final boolean a(Object obj) {
        for (int i = 0; i < this.a.size(); i++) {
            if (!((pkc) this.a.get(i)).a(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.pkc
    public final boolean equals(Object obj) {
        if (obj instanceof pkd) {
            return this.a.equals(((pkd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.a;
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append("and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}