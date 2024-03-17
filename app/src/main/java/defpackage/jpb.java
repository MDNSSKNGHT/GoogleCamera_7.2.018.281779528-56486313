package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: jpb  reason: default package */
/* loaded from: classes.dex */
public final class jpb {
    private RectF a;
    private Float b;
    private Long c;
    private int d;

    public jpb(byte b) {
    }

    public final jpc a() {
        String str = this.d == 0 ? " status" : "";
        if (this.a == null) {
            str = str.concat(" roi");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" confidence");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" trackedLengthMs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        return new joi(this.d, this.a, this.b.floatValue(), this.c.longValue());
    }

    public final void a(float f) {
        this.b = Float.valueOf(f);
    }

    public final void a(RectF rectF) {
        if (rectF == null) {
            throw new NullPointerException("Null roi");
        }
        this.a = rectF;
    }

    public final void a(int i) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.d = i;
    }

    public final void a(long j) {
        this.c = Long.valueOf(j);
    }

    public jpb() {
    }
}