package defpackage;

/* compiled from: PG */
/* renamed from: gcx  reason: default package */
/* loaded from: classes.dex */
public final class gcx {
    private ibg a;
    private ibh b;

    public gcx() {
    }

    public gcx(byte b) {
    }

    public final void a(ibg ibgVar) {
        if (ibgVar == null) {
            throw new NullPointerException("Null aeMode");
        }
        this.a = ibgVar;
    }

    public final void a(ibh ibhVar) {
        if (ibhVar == null) {
            throw new NullPointerException("Null aeState");
        }
        this.b = ibhVar;
    }

    public final gcy a() {
        String str = this.a == null ? " aeMode" : "";
        if (this.b == null) {
            str = str.concat(" aeState");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        return new gdy(this.a, this.b);
    }
}