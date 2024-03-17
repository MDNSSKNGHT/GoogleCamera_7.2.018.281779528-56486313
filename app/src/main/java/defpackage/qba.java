package defpackage;

/* compiled from: PG */
/* renamed from: qba  reason: default package */
/* loaded from: classes.dex */
public abstract class qba {
    private static final char[] a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public abstract boolean a(qba qbaVar);

    public abstract int b();

    public abstract long c();

    public byte[] d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qba) {
            qba qbaVar = (qba) obj;
            if (a() == qbaVar.a() && a(qbaVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static qba a(byte[] bArr) {
        return new qaz(bArr);
    }

    public final int hashCode() {
        if (a() >= 32) {
            return b();
        }
        byte[] d = d();
        int i = d[0] & 255;
        for (int i2 = 1; i2 < d.length; i2++) {
            i |= (d[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        byte[] d = d();
        int length = d.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : d) {
            sb.append(a[(b >> 4) & 15]);
            sb.append(a[b & 15]);
        }
        return sb.toString();
    }
}
