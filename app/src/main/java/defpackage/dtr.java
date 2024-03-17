package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: dtr  reason: default package */
/* loaded from: classes.dex */
final class dtr extends dtm {
    private final long a;
    private final long b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;

    public /* synthetic */ dtr(long j, long j2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = j;
        this.b = j2;
        this.c = bArr;
        this.d = bArr2;
        this.e = bArr3;
    }

    @Override // defpackage.dtm
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dtm
    public final long b() {
        return this.b;
    }

    @Override // defpackage.dtm
    public final byte[] c() {
        return this.c;
    }

    @Override // defpackage.dtm
    public final byte[] d() {
        return this.d;
    }

    @Override // defpackage.dtm
    public final byte[] e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof dtm) {
                dtm dtmVar = (dtm) obj;
                if (this.a == dtmVar.a() && this.b == dtmVar.b()) {
                    boolean z = dtmVar instanceof dtr;
                    if (Arrays.equals(this.c, z ? ((dtr) dtmVar).c : dtmVar.c())) {
                        if (Arrays.equals(this.d, z ? ((dtr) dtmVar).d : dtmVar.d())) {
                            if (Arrays.equals(this.e, z ? ((dtr) dtmVar).e : dtmVar.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return Arrays.hashCode(this.e) ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003);
    }
}