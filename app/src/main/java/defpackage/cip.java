package defpackage;

/* compiled from: PG */
/* renamed from: cip  reason: default package */
/* loaded from: classes.dex */
public final class cip {
    public String a;
    public String b;
    public psl c;

    public final cio i() {
        return new cio(this.a);
    }

    public final cio f() {
        return new cio(this.a, this.b, (byte) 0);
    }

    public final cio g() {
        return new cio(this.a, this.b, (char) 0);
    }

    public final void b() {
        new cio(this.a, this.b, false);
    }

    public final cio e() {
        return new cio(this.a, this.b, 0);
    }

    public final void c() {
        new cio(this.a, this.b, 0.0f);
    }

    public final void d() {
        new cio(this.a, this.b, (short) 0);
    }

    public final cio k() {
        return new cio(this.a, (byte) 0);
    }

    public final cio j() {
        return new cio(this.a, (char) 0);
    }

    public final cio l() {
        return new cio(this.a, this.b, (byte[]) null);
    }

    public final ciq a() {
        String str = this.a;
        String str2 = this.b;
        psl pslVar = this.c;
        if (pslVar == null) {
            pslVar = pvi.a;
        }
        return new ciq(str, str2, pslVar);
    }

    public final cio h() {
        return new cio(this.a, this.b, (char[]) null);
    }

    public final cio n() {
        return new cio(this.a, this.b, (short[]) null);
    }

    public final cio m() {
        return new cio(this.a, (short) 0);
    }
}