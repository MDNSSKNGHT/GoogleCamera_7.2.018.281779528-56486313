package defpackage;

/* compiled from: PG */
/* renamed from: pkz  reason: default package */
/* loaded from: classes.dex */
public final class pkz implements pkx {
    private volatile pkx a;
    private volatile boolean b;
    private Object c;

    public pkz(pkx pkxVar) {
        this.a = (pkx) qdu.d(pkxVar);
    }

    @Override // defpackage.pkx
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    Object a = this.a.a();
                    this.c = a;
                    this.b = true;
                    this.a = null;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}