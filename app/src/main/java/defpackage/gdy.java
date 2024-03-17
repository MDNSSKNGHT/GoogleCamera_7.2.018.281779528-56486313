package defpackage;

/* compiled from: PG */
/* renamed from: gdy  reason: default package */
/* loaded from: classes.dex */
final class gdy extends gcy {
    private final ibg a;
    private final ibh b;

    public /* synthetic */ gdy(ibg ibgVar, ibh ibhVar) {
        this.a = ibgVar;
        this.b = ibhVar;
    }

    @Override // defpackage.gcy
    public final ibg b() {
        return this.a;
    }

    @Override // defpackage.gcy
    public final ibh c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gcy) {
                gcy gcyVar = (gcy) obj;
                if (this.a.equals(gcyVar.b()) && this.b.equals(gcyVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
        sb.append("AeState{aeMode=");
        sb.append(valueOf);
        sb.append(", aeState=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}