package defpackage;

/* compiled from: PG */
/* renamed from: gdk  reason: default package */
/* loaded from: classes.dex */
public final class gdk {
    public final ibi a;
    public final ibj b;
    public final float c;
    public final boolean d;
    public final pjz e;
    public final int f;

    public gdk(ibi ibiVar, ibj ibjVar, float f, boolean z, pjz pjzVar, int i) {
        this.a = ibiVar;
        this.b = ibjVar;
        this.c = f;
        this.d = z;
        this.e = pjzVar;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof gdk) {
                gdk gdkVar = (gdk) obj;
                boolean z = this.a == gdkVar.a && this.b == gdkVar.b && this.c == gdkVar.c && this.d == gdkVar.d && this.f == gdkVar.f;
                if (!this.e.a() || !gdkVar.e.a()) {
                    return z;
                }
                if (z && ((gdj) this.e.b()).equals(gdkVar.e.b())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((this.a.e + 527) * 31) + this.b.h) * 31) + Float.floatToIntBits(this.c)) * 31) + (this.d ? 1 : 0);
    }

    public static gdk a() {
        return new gdk(ibi.OFF, ibj.INACTIVE, 0.0f, false, pix.a, 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        float f = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97 + String.valueOf(valueOf2).length());
        sb.append("{controlAfMode=");
        sb.append(valueOf);
        sb.append(", controlAfState=");
        sb.append(valueOf2);
        sb.append(", lensFocusDistance=");
        sb.append(f);
        sb.append(", isSceneChangeDetected=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}