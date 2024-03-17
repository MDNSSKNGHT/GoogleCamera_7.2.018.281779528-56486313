package defpackage;

/* compiled from: PG */
/* renamed from: buv  reason: default package */
/* loaded from: classes.dex */
public final class buv implements but {
    public final rhd a;
    public final rhd b;
    public final rhd c;
    public final rhd d;
    public final rhd e;
    public final rhd f;

    public buv(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6) {
        this.a = a(rhdVar, 1);
        this.b = a(rhdVar2, 2);
        this.c = a(rhdVar3, 3);
        this.d = a(rhdVar4, 4);
        this.e = a(rhdVar5, 5);
        this.f = a(rhdVar6, 6);
    }

    public static <T> T a(T obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: " + i);
    }
}