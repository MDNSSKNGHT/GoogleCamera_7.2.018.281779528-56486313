package defpackage;

/* compiled from: PG */
/* renamed from: hol  reason: default package */
/* loaded from: classes.dex */
public final class hol implements rgg {
    private final rhd a;
    private final rhd b;
    private final rhd c;
    private final rhd d;
    private final rhd e;
    private final rhd f;
    private final rhd g;
    private final rhd h;
    private final rhd i;

    private hol(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9) {
        this.a = rhdVar;
        this.b = rhdVar2;
        this.c = rhdVar3;
        this.d = rhdVar4;
        this.e = rhdVar5;
        this.f = rhdVar6;
        this.g = rhdVar7;
        this.h = rhdVar8;
        this.i = rhdVar9;
    }

    public static hol a(rhd rhdVar, rhd rhdVar2, rhd rhdVar3, rhd rhdVar4, rhd rhdVar5, rhd rhdVar6, rhd rhdVar7, rhd rhdVar8, rhd rhdVar9) {
        return new hol(rhdVar, rhdVar2, rhdVar3, rhdVar4, rhdVar5, rhdVar6, rhdVar7, rhdVar8, rhdVar9);
    }

    @Override // defpackage.rhd
    public final /* bridge */ /* synthetic */ Object get() {
        return new hok(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}