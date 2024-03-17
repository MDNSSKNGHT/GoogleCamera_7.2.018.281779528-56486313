package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: qbf  reason: default package */
/* loaded from: classes.dex */
final class qbf extends qav {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public /* synthetic */ qbf(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void b() {
        qdu.b(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.qbc
    public final qba a() {
        b();
        this.c = true;
        if (this.b == this.a.getDigestLength()) {
            return qba.a(this.a.digest());
        }
        return qba.a(Arrays.copyOf(this.a.digest(), this.b));
    }

    @Override // defpackage.qav
    protected final void a(byte[] bArr, int i) {
        b();
        this.a.update(bArr, 0, i);
    }
}
