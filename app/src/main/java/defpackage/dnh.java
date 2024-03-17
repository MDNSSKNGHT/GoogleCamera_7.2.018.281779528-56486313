package defpackage;

/* compiled from: PG */
/* renamed from: dnh  reason: default package */
/* loaded from: classes.dex */
final class dnh extends dss {
    private final pjz a;
    private final pjz b;
    private final pjz c;
    private final pjz d;
    private final pjz e;
    private final pjz f;
    private final pjz g;
    private final pjz h;
    private final pjz i;
    private final pjz j;
    private final pjz k;
    private final pjz l;
    private final pjz m;
    private final pjz n;

    public /* synthetic */ dnh(pjz pjzVar, pjz pjzVar2, pjz pjzVar3, pjz pjzVar4, pjz pjzVar5, pjz pjzVar6, pjz pjzVar7, pjz pjzVar8, pjz pjzVar9, pjz pjzVar10, pjz pjzVar11, pjz pjzVar12, pjz pjzVar13, pjz pjzVar14) {
        this.a = pjzVar;
        this.b = pjzVar2;
        this.c = pjzVar3;
        this.d = pjzVar4;
        this.e = pjzVar5;
        this.f = pjzVar6;
        this.g = pjzVar7;
        this.h = pjzVar8;
        this.i = pjzVar9;
        this.j = pjzVar10;
        this.k = pjzVar11;
        this.l = pjzVar12;
        this.m = pjzVar13;
        this.n = pjzVar14;
    }

    @Override // defpackage.dss
    public final pjz a() {
        return this.a;
    }

    @Override // defpackage.dss
    public final pjz b() {
        return this.b;
    }

    @Override // defpackage.dss
    public final pjz c() {
        return this.c;
    }

    @Override // defpackage.dss
    public final pjz d() {
        return this.d;
    }

    @Override // defpackage.dss
    public final pjz e() {
        return this.e;
    }

    @Override // defpackage.dss
    public final pjz f() {
        return this.f;
    }

    @Override // defpackage.dss
    public final pjz g() {
        return this.g;
    }

    @Override // defpackage.dss
    public final pjz h() {
        return this.h;
    }

    @Override // defpackage.dss
    public final pjz i() {
        return this.i;
    }

    @Override // defpackage.dss
    public final pjz j() {
        return this.j;
    }

    @Override // defpackage.dss
    public final pjz k() {
        return this.k;
    }

    @Override // defpackage.dss
    public final pjz l() {
        return this.l;
    }

    @Override // defpackage.dss
    public final pjz m() {
        return this.m;
    }

    @Override // defpackage.dss
    public final pjz n() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dss) {
                dss dssVar = (dss) obj;
                if (this.a.equals(dssVar.a()) && this.b.equals(dssVar.b()) && this.c.equals(dssVar.c()) && this.d.equals(dssVar.d()) && this.e.equals(dssVar.e()) && this.f.equals(dssVar.f()) && this.g.equals(dssVar.g()) && this.h.equals(dssVar.h()) && this.i.equals(dssVar.i()) && this.j.equals(dssVar.j()) && this.k.equals(dssVar.k()) && this.l.equals(dssVar.l()) && this.m.equals(dssVar.m()) && this.n.equals(dssVar.n())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        StringBuilder sb = new StringBuilder(length + 280 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf13).length() + String.valueOf(valueOf14).length());
        sb.append("ShotConfig{progressCallback=");
        sb.append(valueOf);
        sb.append(", baseFrameCallback=");
        sb.append(valueOf2);
        sb.append(", postviewRgbCallback=");
        sb.append(valueOf3);
        sb.append(", postviewYuvCallback=");
        sb.append(valueOf4);
        sb.append(", postviewHardwareBufferCallback=");
        sb.append(valueOf5);
        sb.append(", dngCallback=");
        sb.append(valueOf6);
        sb.append(", rawCallback=");
        sb.append(valueOf7);
        sb.append(", pdCallback=");
        sb.append(valueOf8);
        sb.append(", yuvCallback=");
        sb.append(valueOf9);
        sb.append(", rgbCallback=");
        sb.append(valueOf10);
        sb.append(", rgbHardwareBufferCallback=");
        sb.append(valueOf11);
        sb.append(", jpegCallback=");
        sb.append(valueOf12);
        sb.append(", shotStatusCallback=");
        sb.append(valueOf13);
        sb.append(", mutableRawCallback=");
        sb.append(valueOf14);
        sb.append("}");
        return sb.toString();
    }
}