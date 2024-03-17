package defpackage;

/* compiled from: PG */
/* renamed from: mot  reason: default package */
/* loaded from: classes.dex */
public final class mot {
    private mov a;
    private pjz b;
    private pjz c;
    private mjs d;
    private Integer e;
    private Integer f;
    private Boolean g;

    public mot(byte b) {
        this.b = pix.a;
        this.c = pix.a;
    }

    public final void a(mzc mzcVar) {
        this.b = pjz.b(mzcVar);
    }

    public final void a(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void a(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void a(mjs mjsVar) {
        if (mjsVar == null) {
            throw new NullPointerException("Null size");
        }
        this.d = mjsVar;
    }

    public final void a(mov movVar) {
        if (movVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = movVar;
    }

    public mot() {
    }

    public final mou a() {
        String str = this.a == null ? " type" : "";
        if (this.d == null) {
            str = str.concat(" size");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" imageFormat");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" capacity");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" forCapture");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        mne mneVar = new mne(this.a, this.b, this.c, this.d, this.e.intValue(), this.f.intValue(), this.g.booleanValue());
        int i = mneVar.d;
        qdu.b(i > 0 || i == -1, "Capacity should be positive or -1");
        qdu.b(mneVar.b.b() > 0, "Size area must be positive");
        qdu.b(mneVar.c >= 0, "Format must be valid");
        qdu.b(mneVar.a != null, "StreamType cannot be null");
        qdu.b(mneVar.b != null, "Size cannot be null");
        return mneVar;
    }
}