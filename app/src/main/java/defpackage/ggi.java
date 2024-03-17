package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: ggi */
/* loaded from: classes.dex */
public final class ggi implements Comparable {
    public final long a;
    public final long b;
    private final long c;

    public ggi(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.b > ((ggi) obj).b ? 1 : (this.b == ((ggi) obj).b ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ggi)) {
                ggi ggiVar = (ggi) obj;
                if (this.b == ggiVar.b && this.a == ggiVar.a && this.c == ggiVar.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a("timestamp", this.a);
        e.a("onStartedId", this.b);
        e.a("frameNumber", this.c);
        return e.toString();
    }
}