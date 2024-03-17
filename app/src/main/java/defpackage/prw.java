package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* renamed from: prw  reason: default package */
/* loaded from: classes.dex */
class prw implements Serializable {
    public static final long serialVersionUID = 0;
    private final Object[] a;
    private final Object[] b;

    public prw(prx prxVar) {
        this.a = new Object[prxVar.size()];
        this.b = new Object[prxVar.size()];
        pwx ar = prxVar.i().ar();
        int i = 0;
        while (ar.hasNext()) {
            Map.Entry entry = (Map.Entry) ar.next();
            this.a[i] = entry.getKey();
            this.b[i] = entry.getValue();
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(prt prtVar) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                prtVar.a(objArr[i], this.b[i]);
                i++;
            } else {
                return prtVar.a();
            }
        }
    }

    Object readResolve() {
        return a(new prt(this.a.length));
    }
}