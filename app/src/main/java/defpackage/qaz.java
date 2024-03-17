package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: qaz  reason: default package */
/* loaded from: classes.dex */
final class qaz extends qba implements Serializable {
    public static final long serialVersionUID = 0;
    private final byte[] a;

    public qaz(byte[] bArr) {
        this.a = (byte[]) qdu.d(bArr);
    }

    @Override // defpackage.qba
    public final byte[] d() {
        return this.a;
    }

    @Override // defpackage.qba
    public final int b() {
        int length = this.a.length;
        qdu.b(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.qba
    public final long c() {
        int length = this.a.length;
        qdu.b(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = this.a[0] & 255;
        for (int i = 1; i < Math.min(this.a.length, 8); i++) {
            j |= (this.a[i] & 255) << (i << 3);
        }
        return j;
    }

    @Override // defpackage.qba
    public final int a() {
        return this.a.length << 3;
    }

    @Override // defpackage.qba
    public final boolean a(qba qbaVar) {
        if (this.a.length != qbaVar.d().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == qbaVar.d()[i];
            i++;
        }
    }
}