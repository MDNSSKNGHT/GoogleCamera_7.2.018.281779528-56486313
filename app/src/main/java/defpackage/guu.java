package defpackage;

/* compiled from: PG */
/* renamed from: guu  reason: default package */
/* loaded from: classes.dex */
public final class guu {
    public final guw a;
    public final int b;
    public final int c;
    public final int d;

    public guu(guw guwVar, int i, int i2, int i3) {
        this.a = guwVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int hashCode() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof guu) && this.a == ((guu) obj).a;
    }
}