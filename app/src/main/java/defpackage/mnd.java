package defpackage;

/* compiled from: PG */
/* renamed from: mnd  reason: default package */
/* loaded from: classes.dex */
final class mnd extends moq {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;

    public /* synthetic */ mnd(int i, int i2, int i3, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a = z;
    }

    @Override // defpackage.moq
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.moq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.moq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.moq
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof moq) {
                moq moqVar = (moq) obj;
                int i = this.b;
                int b = moqVar.b();
                if (i != 0) {
                    if (i == b) {
                        int i2 = this.c;
                        int c = moqVar.c();
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 == c) {
                            int i3 = this.d;
                            int d = moqVar.d();
                            if (i3 == 0) {
                                throw null;
                            }
                            if (i3 == d && this.a == moqVar.a()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                throw null;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((mop.b(this.b) ^ 1000003) * 1000003) ^ mop.b(this.c)) * 1000003) ^ mop.b(this.d)) * 1000003) ^ (!this.a ? 1237 : 1231);
    }

    public final String toString() {
        String a = mop.a(this.b);
        String a2 = mop.a(this.c);
        String a3 = mop.a(this.d);
        boolean z = this.a;
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append("Spec3A{exposure=");
        sb.append(a);
        sb.append(", focus=");
        sb.append(a2);
        sb.append(", whiteBalance=");
        sb.append(a3);
        sb.append(", forCapture=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}