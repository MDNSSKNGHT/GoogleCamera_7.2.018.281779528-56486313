package defpackage;

/* compiled from: PG */
/* renamed from: mne  reason: default package */
/* loaded from: classes.dex */
final class mne extends mou {
    public final mov a;
    public final mjs b;
    public final int c;
    public final int d;
    private final pjz e;
    private final pjz f;
    private final boolean g;

    public /* synthetic */ mne(mov movVar, pjz pjzVar, pjz pjzVar2, mjs mjsVar, int i, int i2, boolean z) {
        this.a = movVar;
        this.e = pjzVar;
        this.f = pjzVar2;
        this.b = mjsVar;
        this.c = i;
        this.d = i2;
        this.g = z;
    }

    @Override // defpackage.mou
    public final mov a() {
        return this.a;
    }

    @Override // defpackage.mou
    public final pjz b() {
        return this.e;
    }

    @Override // defpackage.mou
    public final pjz c() {
        return this.f;
    }

    @Override // defpackage.mou
    public final mjs d() {
        return this.b;
    }

    @Override // defpackage.mou
    public final int e() {
        return this.c;
    }

    @Override // defpackage.mou
    public final int f() {
        return this.d;
    }

    @Override // defpackage.mou
    public final boolean g() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mou) {
                mou mouVar = (mou) obj;
                if (this.a.equals(mouVar.a()) && this.e.equals(mouVar.b()) && this.f.equals(mouVar.c()) && this.b.equals(mouVar.d()) && this.c == mouVar.e() && this.d == mouVar.f() && this.g == mouVar.g()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ (!this.g ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        boolean z = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 112 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("StreamConfig{type=");
        sb.append(valueOf);
        sb.append(", cameraId=");
        sb.append(valueOf2);
        sb.append(", surface=");
        sb.append(valueOf3);
        sb.append(", size=");
        sb.append(valueOf4);
        sb.append(", imageFormat=");
        sb.append(i);
        sb.append(", capacity=");
        sb.append(i2);
        sb.append(", forCapture=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}