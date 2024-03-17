package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mnc  reason: default package */
/* loaded from: classes.dex */
final class mnc extends mnx {
    public final moh a;
    public final prr b;
    private final mzc c;
    private final mom d;
    private final mom e;
    private final mom f;
    private final mom g;
    private final mom h;
    private final psl i;
    private final mmf j;
    private final osu k;

    public /* synthetic */ mnc(mzc mzcVar, moh mohVar, mom momVar, mom momVar2, mom momVar3, mom momVar4, mom momVar5, osu osuVar, prr prrVar, psl pslVar, mmf mmfVar, byte b, byte b2) {
        this.c = mzcVar;
        this.a = mohVar;
        this.d = momVar;
        this.e = momVar2;
        this.f = momVar3;
        this.g = momVar4;
        this.h = momVar5;
        this.k = osuVar;
        this.b = prrVar;
        this.i = pslVar;
        this.j = mmfVar;
    }

    @Override // defpackage.mnx
    public final mzc a() {
        return this.c;
    }

    @Override // defpackage.mnx
    public final moh b() {
        return this.a;
    }

    @Override // defpackage.mnx
    public final mom c() {
        return this.d;
    }

    @Override // defpackage.mnx
    public final mom d() {
        return this.e;
    }

    @Override // defpackage.mnx
    public final mom e() {
        return this.f;
    }

    @Override // defpackage.mnx
    public final mom f() {
        return this.g;
    }

    @Override // defpackage.mnx
    public final mom g() {
        return this.h;
    }

    @Override // defpackage.mnx
    public final prr h() {
        return this.b;
    }

    @Override // defpackage.mnx
    public final psl i() {
        return this.i;
    }

    @Override // defpackage.mnx
    public final mmf j() {
        return this.j;
    }

    @Override // defpackage.mnx
    public final osu k() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mnx) {
                mnx mnxVar = (mnx) obj;
                return this.c.equals(mnxVar.a()) && this.a.equals(mnxVar.b()) && this.d.equals(mnxVar.c()) && this.e.equals(mnxVar.d()) && this.f.equals(mnxVar.e()) && this.g.equals(mnxVar.f()) && this.h.equals(mnxVar.g()) && this.k.equals(mnxVar.k()) && qdu.a((List) this.b, (Object) mnxVar.h()) && this.i.equals(mnxVar.i()) && this.j.equals(mnxVar.j());
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.c.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.k);
        String valueOf9 = String.valueOf(this.b);
        String valueOf10 = String.valueOf(this.i);
        String valueOf11 = String.valueOf(this.j);
        return "FrameServerConfig{cameraId=" +
                valueOf +
                ", operatingMode=" +
                valueOf2 +
                ", template=" +
                valueOf3 +
                ", captureTemplate=" +
                valueOf4 +
                ", reprocessingTemplate=" +
                valueOf5 +
                ", repeatingTemplate=" +
                valueOf6 +
                ", repeatingCaptureTemplate=" +
                valueOf7 +
                ", frameListener=" +
                valueOf8 +
                ", streams=" +
                valueOf9 +
                ", sessionParameters=" +
                valueOf10 +
                ", fatalErrorHandler=" +
                valueOf11 +
                "}";
    }
}