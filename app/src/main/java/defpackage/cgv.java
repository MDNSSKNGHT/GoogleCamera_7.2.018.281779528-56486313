package defpackage;

/* compiled from: PG */
/* renamed from: cgv  reason: default package */
/* loaded from: classes.dex */
public final class cgv extends cgx {
    private final geq a;

    public cgv(geq geqVar) {
        this.a = geqVar;
    }

    @Override // defpackage.cgx
    public final geq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cgx) {
                return this.a.equals(((cgx) obj).a());
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("CameraFacingChange{characteristics=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}