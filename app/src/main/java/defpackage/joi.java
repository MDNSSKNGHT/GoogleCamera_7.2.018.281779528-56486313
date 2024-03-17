package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: joi  reason: default package */
/* loaded from: classes.dex */
final class joi extends jpc {
    private final RectF a;
    private final float b;
    private final long c;
    private final int d;

    public /* synthetic */ joi(int i, RectF rectF, float f, long j) {
        this.d = i;
        this.a = rectF;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.jpc
    public final RectF a() {
        return this.a;
    }

    @Override // defpackage.jpc
    public final float b() {
        return this.b;
    }

    @Override // defpackage.jpc
    public final long c() {
        return this.c;
    }

    @Override // defpackage.jpc
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof jpc) {
                jpc jpcVar = (jpc) obj;
                int i = this.d;
                int d = jpcVar.d();
                if (i != 0) {
                    return i == d && this.a.equals(jpcVar.a()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(jpcVar.b()) && this.c == jpcVar.c();
                }
                throw null;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            int hashCode = this.a.hashCode();
            int floatToIntBits = Float.floatToIntBits(this.b);
            long j = this.c;
            return ((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ floatToIntBits) * 1000003) ^ ((int) ((j >>> 32) ^ j));
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i == 1) {
            str = "OFF";
        } else if (i == 2) {
            str = "OPTICAL_FLOW";
        } else if (i == 3) {
            str = "GYRO";
        } else if (i != 4) {
            str = i != 5 ? "null" : "UNKNOWN";
        } else {
            str = "GPU_TEMPLATE";
        }
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        long j = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 92 + String.valueOf(valueOf).length());
        sb.append("TrackingRoi{status=");
        sb.append(str);
        sb.append(", roi=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(f);
        sb.append(", trackedLengthMs=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}