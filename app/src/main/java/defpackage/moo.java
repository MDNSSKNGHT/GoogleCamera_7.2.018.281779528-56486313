package defpackage;

/* compiled from: PG */
/* renamed from: moo  reason: default package */
/* loaded from: classes.dex */
public final class moo {
    private Boolean a;
    private int b;
    private int c;
    private int d;

    public moo(byte b) {
    }

    public final moq a() {
        String str = this.b == 0 ? " exposure" : "";
        if (this.c == 0) {
            str = str.concat(" focus");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" whiteBalance");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" forCapture");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        return new mnd(this.b, this.c, this.d, this.a.booleanValue());
    }

    public final void a(int i) {
        if (i == 0) {
            throw new NullPointerException("Null exposure");
        }
        this.b = i;
    }

    public final void b(int i) {
        if (i == 0) {
            throw new NullPointerException("Null focus");
        }
        this.c = i;
    }

    public final void a(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null whiteBalance");
        }
        this.d = i;
    }

    public moo() {
    }
}