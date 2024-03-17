package defpackage;

/* compiled from: PG */
/* renamed from: mei  reason: default package */
/* loaded from: classes.dex */
public final class mei extends mek {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public /* synthetic */ mei(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    @Override // defpackage.mek
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.mek
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.mek
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.mek
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.mek
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.mek
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return (((((((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mek) {
                mek mekVar = (mek) obj;
                if (this.a == mekVar.a() && this.b == mekVar.b() && this.c == mekVar.c() && this.d == mekVar.d() && this.e == mekVar.e() && this.f == mekVar.f()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        StringBuilder sb = new StringBuilder(214);
        sb.append("CamcorderCameraConfig{useContinuousAutoFocusOnDuringRecording=");
        sb.append(z);
        sb.append(", shouldUnlockAfAeWithSceneChange=");
        sb.append(z2);
        sb.append(", shouldDetectFace=");
        sb.append(z3);
        sb.append(", shouldVideoStabilizationOn=");
        sb.append(z4);
        sb.append(", useOpticalStabilization=");
        sb.append(z5);
        sb.append(", useGoogLlv=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}