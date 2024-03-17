package defpackage;

/* compiled from: PG */
/* renamed from: mfs  reason: default package */
/* loaded from: classes.dex */
public final class mfs {
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;

    public mfs(byte b) {
    }

    public final void f(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void g(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void i(int i) {
        this.d = Integer.valueOf(i);
    }

    public final mft a() {
        String str = this.a == null ? " audioBitRate" : "";
        if (this.b == null) {
            str = str.concat(" audioChannels");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" audioCodec");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" audioSampleRate");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" fileFormat");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" quality");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" videoBitRate");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" videoCodec");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" videoCodecProfile");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" videoCodecLevel");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" videoFrameHeight");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" videoFrameRate");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" videoFrameWidth");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        return new mfj(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i.intValue(), this.j.intValue(), this.k.intValue(), this.l.intValue(), this.m.intValue());
    }

    public final void a(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void j(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void k(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void l(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void m(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.k = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.m = Integer.valueOf(i);
    }

    public mfs() {
    }
}