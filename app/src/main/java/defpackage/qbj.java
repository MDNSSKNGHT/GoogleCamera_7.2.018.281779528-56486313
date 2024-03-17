package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: qbj  reason: default package */
/* loaded from: classes.dex */
final class qbj extends qaw implements Serializable {
    public static final long serialVersionUID = 0;
    private final int a;

    static {
        new qbj(0);
        new qbj(qbe.a);
    }

    public qbj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qbj) && this.a == ((qbj) obj).a;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.a;
    }

    @Override // defpackage.qbb
    public final qbc a() {
        return new qbi(this.a);
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
