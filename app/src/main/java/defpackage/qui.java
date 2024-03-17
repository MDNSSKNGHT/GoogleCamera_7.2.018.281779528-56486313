package defpackage;

/* compiled from: PG */
/* renamed from: qui  reason: default package */
/* loaded from: classes2.dex */
public final class qui {
    private final Object a;
    private final int b;

    public qui(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qui) {
            qui quiVar = (qui) obj;
            if (this.a == quiVar.a && this.b == quiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}