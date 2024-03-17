package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: quj */
/* loaded from: classes2.dex */
public class quj {
    private static volatile quj c;
    private static volatile quj d;
    public final Map a;
    private static volatile boolean b = false;
    private static final quj e = new quj((byte) 0);

    public quj() {
        this.a = new HashMap();
    }

    public quj(byte b2) {
        this.a = Collections.emptyMap();
    }

    public quh a(qwg qwgVar, int i) {
        return (quh) this.a.get(new qui(qwgVar, i));
    }

    public static quj a() {
        quj qujVar = c;
        if (qujVar == null) {
            synchronized (quj.class) {
                qujVar = c;
                if (qujVar == null) {
                    qujVar = e;
                    c = qujVar;
                }
            }
        }
        return qujVar;
    }

    public static quj b() {
        quj qujVar = d;
        if (qujVar == null) {
            synchronized (quj.class) {
                qujVar = d;
                if (qujVar == null) {
                    qujVar = qup.a(quj.class);
                    d = qujVar;
                }
            }
        }
        return qujVar;
    }
}