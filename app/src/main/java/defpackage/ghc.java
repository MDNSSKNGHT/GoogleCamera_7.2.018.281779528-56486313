package defpackage;

import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: ghc  reason: default package */
/* loaded from: classes.dex */
public final class ghc extends ndx {
    public final Map a;
    public Uri b;

    public ghc(neb nebVar) {
        super(nebVar);
        this.b = Uri.EMPTY;
        this.a = new ConcurrentHashMap();
    }

    public ghc(neb nebVar, qpp qppVar) {
        this(nebVar);
        if (qppVar != null) {
            this.a.put(ghb.a, qppVar);
        }
    }

    public ghc(neb nebVar, Map map) {
        super(nebVar);
        this.b = Uri.EMPTY;
        this.a = new ConcurrentHashMap(map);
    }

    public final void a(gha ghaVar, Object obj) {
        qdu.d(ghaVar);
        qdu.d(obj);
        this.a.put(ghaVar, obj);
    }

    public final Object a(gha ghaVar) {
        Object b = b(ghaVar);
        String valueOf = String.valueOf(ghaVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("No value found for key: ");
        sb.append(valueOf);
        return qdu.c(b, sb.toString());
    }

    public final qpp j() {
        return (qpp) b(ghb.a);
    }

    private final Object b(gha ghaVar) {
        if (this.a.containsKey(ghaVar)) {
            return this.a.get(ghaVar);
        }
        return null;
    }

    public final boolean i() {
        return b() != -1;
    }
}