package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* renamed from: ppl  reason: default package */
/* loaded from: classes.dex */
final class ppl extends pus implements Serializable {
    public static final long serialVersionUID = 0;
    private final Comparator a;

    public ppl(Comparator comparator) {
        this.a = (Comparator) qdu.d(comparator);
    }

    @Override // defpackage.pus, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ppl) {
                return this.a.equals(((ppl) obj).a);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}