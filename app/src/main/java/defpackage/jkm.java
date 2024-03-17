package defpackage;

import android.graphics.Rect;
import android.util.SizeF;

/* compiled from: PG */
/* renamed from: jkm  reason: default package */
/* loaded from: classes.dex */
public final class jkm extends jkx {
    private final ndn a;
    private final Rect b;
    private final SizeF c;
    private final boolean d;
    private final int e;
    private final float f;
    private final Rect g;

    public /* synthetic */ jkm(ndn ndnVar, Rect rect, SizeF sizeF, boolean z, int i, float f, Rect rect2) {
        this.a = ndnVar;
        this.b = rect;
        this.c = sizeF;
        this.d = z;
        this.e = i;
        this.f = f;
        this.g = rect2;
    }

    @Override // defpackage.jkx
    public final ndn a() {
        return this.a;
    }

    @Override // defpackage.jkx
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.jkx
    public final SizeF c() {
        return this.c;
    }

    @Override // defpackage.jkx
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.jkx
    public final int e() {
        return this.e;
    }

    @Override // defpackage.jkx
    public final float f() {
        return this.f;
    }

    @Override // defpackage.jkx
    public final Rect g() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof jkx) {
                jkx jkxVar = (jkx) obj;
                if (this.a.equals(jkxVar.a()) && this.b.equals(jkxVar.b()) && this.c.equals(jkxVar.c()) && this.d == jkxVar.d() && this.e == jkxVar.e() && Float.floatToIntBits(this.f) == Float.floatToIntBits(jkxVar.f()) && this.g.equals(jkxVar.g())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int i = this.e;
        float f = this.f;
        String valueOf4 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 165 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("EisParams{metadata=");
        sb.append(valueOf);
        sb.append(", sensorInfoActiveArraySize=");
        sb.append(valueOf2);
        sb.append(", sensorInfoPhysicalSize=");
        sb.append(valueOf3);
        sb.append(", supportOis=");
        sb.append(z);
        sb.append(", oisApiVersion=");
        sb.append(i);
        sb.append(", digitalZoomRatio=");
        sb.append(f);
        sb.append(", cropRegion=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}