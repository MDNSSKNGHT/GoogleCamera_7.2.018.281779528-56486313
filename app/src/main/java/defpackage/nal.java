package defpackage;

/* compiled from: PG */
/* renamed from: nal  reason: default package */
/* loaded from: classes.dex */
public final class nal {
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public float f;
    public float g;
    public float h;

    public nal() {
        this(0, 0, 0, 0L, 0L, 0.0f, 0.0f, 0.0f);
    }

    public nal(int i, int i2, int i3, long j, long j2, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = f2;
        this.h = f3;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new nal(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof nal) {
                    nal nalVar = (nal) obj;
                    return this.a == nalVar.a && this.b == nalVar.b && this.c == nalVar.c && this.d == nalVar.d && this.e == nalVar.e && this.f == nalVar.f && this.g == nalVar.g && this.h == nalVar.h;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void a(nal nalVar) {
        this.a = nalVar.a;
        this.b = nalVar.b;
        this.c = nalVar.c;
        this.d = nalVar.d;
        this.e = nalVar.e;
        this.f = nalVar.f;
        this.g = nalVar.g;
        this.h = nalVar.h;
    }
}