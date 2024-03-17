package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: hqa  reason: default package */
/* loaded from: classes.dex */
public final class hqa {
    private final rhd a;
    private final rhd b;

    public hqa(rhd rhdVar, rhd rhdVar2) {
        this.a = (rhd) a(rhdVar, 1);
        this.b = (rhd) a(rhdVar2, 2);
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final hpz a(Set set, goq goqVar) {
        return new hpz((hne) a((hne) this.a.get(), 1), (hqc) a((hqc) this.b.get(), 2), (Set) a(set, 4), (goq) a(goqVar, 5));
    }
}