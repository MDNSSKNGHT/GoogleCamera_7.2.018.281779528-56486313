package defpackage;

/* compiled from: PG */
/* renamed from: mfj  reason: default package */
/* loaded from: classes.dex */
final class mfj extends mft {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;

    public /* synthetic */ mfj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
        this.m = i13;
    }

    @Override // defpackage.mfo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.mfo
    public final int b() {
        return this.b;
    }

    @Override // defpackage.mfo
    public final int c() {
        return this.c;
    }

    @Override // defpackage.mfo
    public final int d() {
        return this.d;
    }

    @Override // defpackage.mfo
    public final int e() {
        return this.e;
    }

    @Override // defpackage.mfo
    public final int f() {
        return this.f;
    }

    @Override // defpackage.mfo
    public final int g() {
        return this.g;
    }

    @Override // defpackage.mfo
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m;
    }

    @Override // defpackage.mfo
    public final int i() {
        return this.i;
    }

    @Override // defpackage.mfo
    public final int j() {
        return this.j;
    }

    @Override // defpackage.mfo
    public final int k() {
        return this.k;
    }

    @Override // defpackage.mfo
    public final int l() {
        return this.l;
    }

    @Override // defpackage.mfo
    public final int m() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mft) {
                mft mftVar = (mft) obj;
                if (this.a == mftVar.a() && this.b == mftVar.b() && this.c == mftVar.c() && this.d == mftVar.d() && this.e == mftVar.e() && this.f == mftVar.f() && this.g == mftVar.g() && this.h == mftVar.h() && this.i == mftVar.i() && this.j == mftVar.j() && this.k == mftVar.k() && this.l == mftVar.l() && this.m == mftVar.m()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        int i11 = this.k;
        int i12 = this.l;
        int i13 = this.m;
        StringBuilder sb = new StringBuilder(375);
        sb.append("SimpleCamcorderProfileProxy{audioBitRate=");
        sb.append(i);
        sb.append(", audioChannels=");
        sb.append(i2);
        sb.append(", audioCodec=");
        sb.append(i3);
        sb.append(", audioSampleRate=");
        sb.append(i4);
        sb.append(", fileFormat=");
        sb.append(i5);
        sb.append(", quality=");
        sb.append(i6);
        sb.append(", videoBitRate=");
        sb.append(i7);
        sb.append(", videoCodec=");
        sb.append(i8);
        sb.append(", videoCodecProfile=");
        sb.append(i9);
        sb.append(", videoCodecLevel=");
        sb.append(i10);
        sb.append(", videoFrameHeight=");
        sb.append(i11);
        sb.append(", videoFrameRate=");
        sb.append(i12);
        sb.append(", videoFrameWidth=");
        sb.append(i13);
        sb.append("}");
        return sb.toString();
    }
}
