package defpackage;

/* compiled from: PG */
/* renamed from: hoa  reason: default package */
/* loaded from: classes.dex */
public final class hoa {
    public final rhd a;
    public final rhd b;
    public final rhd c;
    public final rhd d;
    public final rhd e;
    public final rhd f;
    public final rhd g;

    public hoa(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7) {
        this.a = (rhd) a(rhdVar, 1);
        this.b = (rhd) a(rhdVar2, 2);
        this.c = (rhd) a(rhdVar3, 3);
        this.d = (rhd) a(rhdVar4, 4);
        this.e = (rhd) a(rhdVar5, 5);
        this.f = (rhd) a(rhdVar6, 6);
        this.g = (rhd) a(rhdVar7, 7);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}