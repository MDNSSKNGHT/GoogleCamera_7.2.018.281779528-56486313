package defpackage;

/* compiled from: PG */
/* renamed from: rgf  reason: default package */
/* loaded from: classes2.dex */
public final class rgf implements rhd, rfv {
    private static final Object a = new Object();
    private volatile rhd b;
    private volatile Object c = a;

    private rgf(rhd rhdVar) {
        this.b = rhdVar;
    }

    @Override // defpackage.rhd
    public final Object get() {
        Object obj = this.c;
        if (obj == a) {
            synchronized (this) {
                obj = this.c;
                if (obj == a) {
                    obj = this.b.get();
                    Object obj2 = this.c;
                    if (obj2 != a && !(obj2 instanceof rgj) && obj2 != obj) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.c = obj;
                    this.b = null;
                }
            }
        }
        return obj;
    }

    public static rfv b(rhd rhdVar) {
        return !(rhdVar instanceof rfv) ? new rgf((rhd) rgk.a(rhdVar)) : (rfv) rhdVar;
    }

    public static rhd a(rhd rhdVar) {
        rgk.a(rhdVar);
        return !(rhdVar instanceof rgf) ? new rgf(rhdVar) : rhdVar;
    }
}
