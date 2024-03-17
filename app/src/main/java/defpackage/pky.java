package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: pky  reason: default package */
/* loaded from: classes.dex */
public final class pky implements Serializable, pkx {
    public static final long serialVersionUID = 0;
    private final pkx a;
    private volatile transient boolean b;
    private transient Object c;

    public pky(pkx pkxVar) {
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
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}