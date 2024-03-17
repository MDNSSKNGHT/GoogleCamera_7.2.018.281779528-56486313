package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: hsy  reason: default package */
/* loaded from: classes.dex */
public final class hsy {
    public static /* synthetic */ int a;
    private static final String b = liu.a("PckResponseMgr");

    public static void a(Collection collection, hsw hswVar, String str) {
        String str2 = b;
        int size = collection.size();
        StringBuilder sb = new StringBuilder(str.length() + 31);
        sb.append("Add ");
        sb.append(size);
        sb.append(" listeners from ");
        sb.append(str);
        sb.toString();
        liu.b(str2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hswVar.a((mrx) it.next());
        }
    }

    public static bmx a(gff gffVar, rhd rhdVar, hsw hswVar) {
        return new hsx(gffVar, hswVar, rhdVar);
    }
}