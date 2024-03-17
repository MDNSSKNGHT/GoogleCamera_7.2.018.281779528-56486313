package defpackage;

/* compiled from: PG */
/* renamed from: hpb  reason: default package */
/* loaded from: classes.dex */
public final class hpb {
    public final rhd a;
    public final rhd b;
    public final rhd c;
    public final rhd d;
    public final rhd e;
    public final rhd f;
    public final rhd g;
    public final rhd h;
    public final rhd i;
    public final rhd j;
    public final rhd k;
    public final rhd l;
    public final rhd m;
    public final rhd n;

    public hpb(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9, rhd rhdVar10, rhd rhdVar11, rhd rhdVar12, rhd rhdVar13, rhd rhdVar14) {
        this.a = (rhd) a(rhdVar, 1);
        this.b = (rhd) a(rhdVar2, 2);
        this.c = (rhd) a(rhdVar3, 3);
        this.d = (rhd) a(rhdVar4, 4);
        this.e = (rhd) a(rhdVar5, 5);
        this.f = (rhd) a(rhdVar6, 6);
        this.g = (rhd) a(rhdVar7, 7);
        this.h = (rhd) a(rhdVar8, 8);
        this.i = (rhd) a(rhdVar9, 9);
        this.j = (rhd) a(rhdVar10, 10);
        this.k = (rhd) a(rhdVar11, 11);
        this.l = (rhd) a(rhdVar12, 12);
        this.m = (rhd) a(rhdVar13, 13);
        this.n = (rhd) a(rhdVar14, 14);
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