package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: mnl  reason: default package */
/* loaded from: classes.dex */
public final class mnl implements Comparable {
    public final long a;
    public final long b;
    public final long c;

    public mnl(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final int a(mnl mnlVar) {
        return (this.c > mnlVar.c ? 1 : (this.c == mnlVar.c ? 0 : -1));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return a((mnl) obj);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof mnl)) {
                mnl mnlVar = (mnl) obj;
                if (this.c == mnlVar.c && this.a == mnlVar.a && this.b == mnlVar.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.c), Long.valueOf(this.b)});
    }

    public final String toString() {
        pjy e = qdu.e(this);
        e.a("timestamp", this.a);
        e.a("onStartedId", this.c);
        e.a("frameNumber", this.b);
        return e.toString();
    }
}