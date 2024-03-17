package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: qbh  reason: default package */
/* loaded from: classes.dex */
final class qbh extends qaw implements Serializable {
    private final MessageDigest a;
    private final int b;
    private final boolean c;
    private final String d;

    public qbh(String str, int i, String str2) {
        this.d = (String) qdu.d(str2);
        MessageDigest a = a(str);
        this.a = a;
        int digestLength = a.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        qdu.a(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.b = i;
        this.c = a(this.a);
    }

    public final String toString() {
        return this.d;
    }

    public qbh(String str, String str2) {
        MessageDigest a = a(str);
        this.a = a;
        this.b = a.getDigestLength();
        this.d = (String) qdu.d(str2);
        this.c = a(this.a);
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.qbb
    public final qbc a() {
        if (this.c) {
            try {
                return new qbf((MessageDigest) this.a.clone(), this.b);
            } catch (CloneNotSupportedException e) {
            }
        }
        return new qbf(a(this.a.getAlgorithm()), this.b);
    }

    private static boolean a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException e) {
            return false;
        }
    }

    Object writeReplace() {
        return new qbg(this.a.getAlgorithm(), this.b, this.d);
    }
}
