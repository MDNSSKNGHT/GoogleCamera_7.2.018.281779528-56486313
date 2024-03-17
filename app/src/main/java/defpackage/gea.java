package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: gea  reason: default package */
/* loaded from: classes.dex */
public final class gea extends gdj {
    private final PointF a;
    private final int b;
    private final boolean c;

    public /* synthetic */ gea(PointF pointF, int i, boolean z) {
        this.a = pointF;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.gdj
    public final PointF a() {
        return this.a;
    }

    @Override // defpackage.gdj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.gdj
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gdj) {
                gdj gdjVar = (gdj) obj;
                if (this.a.equals(gdjVar.a()) && this.b == gdjVar.b() && this.c == gdjVar.c()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (!this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
        sb.append("AfRoi{normalizedCenterPoint=");
        sb.append(valueOf);
        sb.append(", confidenceScore=");
        sb.append(i);
        sb.append(", isFace=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}