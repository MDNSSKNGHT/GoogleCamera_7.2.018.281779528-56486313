package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* renamed from: gmu  reason: default package */
/* loaded from: classes.dex */
final class gmu extends gmy {
    private final Float a;
    private final Pair b;

    public gmu(Float f, Pair pair) {
        this.a = f;
        this.b = pair;
    }

    @Override // defpackage.gmy
    public final Float a() {
        return this.a;
    }

    @Override // defpackage.gmy
    public final Pair b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gmy) {
                gmy gmyVar = (gmy) obj;
                Float f = this.a;
                if (f == null ? gmyVar.a() == null : f.equals(gmyVar.a())) {
                    Pair pair = this.b;
                    if (pair == null ? gmyVar.b() == null : pair.equals(gmyVar.b())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = ((f != null ? f.hashCode() : 0) ^ 1000003) * 1000003;
        Pair pair = this.b;
        return hashCode ^ (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("FocusDistanceResult{focusDistance=");
        sb.append(valueOf);
        sb.append(", focusRange=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}